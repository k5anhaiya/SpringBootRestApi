package com.bookapp.service;

import java.util.List;

import com.bookapp.models.Book;

public interface BookService
{
	public Book getByID(int bookid);
	public List<Book> getBooksByAuthor(String author);
	public List<Book> getBooksByCategory(String category);
	public Book updateBook(Book book);
	public List<Book> getAllBook();

}
