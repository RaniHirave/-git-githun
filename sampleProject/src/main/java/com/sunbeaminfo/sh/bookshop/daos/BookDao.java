package com.sunbeaminfo.sh.bookshop.daos;

import java.util.List;

import com.sunbeaminfo.sh.bookshop.pojos.Book;

public interface BookDao {

	List<String> getSubjects();

	List<Book> getBooksOfSubject(String subject);

	Book getBook(int id);

	int addBook(Book b);

}