package com.sunbeaminfo.sh.bookshop.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunbeaminfo.sh.bookshop.models.SelectedBooks;
import com.sunbeaminfo.sh.bookshop.models.ShoppingCart;
import com.sunbeaminfo.sh.bookshop.models.Subject;
import com.sunbeaminfo.sh.bookshop.pojos.Book;
import com.sunbeaminfo.sh.bookshop.services.BookService;

@Controller
public class BookControllerImpl {
	@Autowired
	private BookService bookService;
	@Autowired
	private ShoppingCart shoppingCart;

	@RequestMapping("/subjects") //req-url
	public String doSubjects(Model model) {
		System.out.println("SHOPPING CART :: " + shoppingCart.getClass().getName());
		
		List<String> subList = bookService.getSubjects();
		model.addAttribute("subList", subList);
		String sub = "";
		if(subList.size() > 0)
			sub = subList.get(0);
		model.addAttribute("command", new Subject(sub));
		return "subjects"; //viewname
	}
	
	@RequestMapping("/books") //req-url
	public String doBooks(Subject subject, Model model) {
		List<Book> bookList = bookService.getBooksOfSubject(subject.getSubject());
		model.addAttribute("bookList", bookList);
		model.addAttribute("command", new SelectedBooks());
		return "books"; //viewname
	}
	
	@RequestMapping("/addcart")
	public String doAddCart(SelectedBooks selectedBooks) {
		for (String bookId : selectedBooks.getBook()) {
			int id = Integer.parseInt(bookId);
			shoppingCart.getCart().add(id);
		}
		return "forward:subjects";
	}
	
	@RequestMapping("/showcart")
	public String doShowCart(Model model) {
		List<Book> bookList = new ArrayList<Book>();
		List<Integer> cart = shoppingCart.getCart();
		for (int id : cart) {
			Book b = bookService.getBook(id);
			bookList.add(b);
		}
		model.addAttribute("bookList", bookList);
		return "cart";
	}
}
