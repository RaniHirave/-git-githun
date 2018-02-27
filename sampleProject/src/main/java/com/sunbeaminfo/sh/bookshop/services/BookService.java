package com.sunbeaminfo.sh.bookshop.services;

import java.util.List;

import com.sunbeaminfo.sh.bookshop.pojos.Book;

public interface BookService {

	List<String> getSubjects();

	List<Book> getBooksOfSubject(String subject);

	Book getBook(int id);

	void saveBook(Book b);
}