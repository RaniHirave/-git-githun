package com.sunbeaminfo.sh.bookshop.models;

import java.util.Arrays;

public class SelectedBooks {
	private String[] book;
	public SelectedBooks() {
		this(new String[0]);
	}
	public SelectedBooks(String[] book) {
		this.book = book;
	}
	public String[] getBook() {
		return book;
	}
	public void setBook(String[] book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return String.format("SelectedBooks [book=%s]", Arrays.toString(book));
	}
}
