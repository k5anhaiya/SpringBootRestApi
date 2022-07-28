package com.bookapp.controllers;

import java.util.List;
import com.bookapp.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.service.BookService;

@RestController
@RequestMapping("book-restapi")
public class BookController 
{
	@Autowired
	BookService bookService;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Welcome to REST API";
	}
	//localhost:8080/book-restapi/books-by-id/10
	@GetMapping("books-by-id/{id}") 
	public Book getBookId(@PathVariable("id") int bookId)
	{
		return bookService.getByID(bookId);
	}
	//localhost:8080/book-restapi/books-update/
	@PostMapping("/books-update")
	public Book updateBook(@RequestBody Book book)
	{
		return bookService.updateBook(book);
	}
	//localhost:8080/book-restapi/books-by-author/Kathy
	@GetMapping("books-by-author/{author}")
	public List<Book> getBookByAuthor(@PathVariable String author)
	{
		return bookService.getBooksByAuthor(author);
	}
	//list:8080/book-restapi/books-by-category/Fiction
	@GetMapping("books-by-category/{category}")
	public List<Book> getBookByCatergory(@PathVariable String category)
	{
		return bookService.getBooksByCategory(category);
	}
	//localhost:8080/book-restapi/get-all-books
	@GetMapping("get-all-books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBook();
	}
}
