package com.sunbeaminfo.sh.bookshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeaminfo.sh.bookshop.daos.BookDao;
import com.sunbeaminfo.sh.bookshop.pojos.Book;

@Transactional
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDao bookDao;
	
	public List<String> getSubjects() {
		return bookDao.getSubjects();
	}
	
	public List<Book> getBooksOfSubject(String subject) {
		return bookDao.getBooksOfSubject(subject);
	}
	
	public Book getBook(int id) {
		return bookDao.getBook(id);
	}
	
	public void saveBook(Book b){
		bookDao.addBook(b);
	}	
}















