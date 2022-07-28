package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bookapp.models.Book;


@Service
public class BookServiceImpl implements BookService 
{

	List<Book> list;
	
	public BookServiceImpl()
	{
		list=new ArrayList<Book>();
		Book book1=new Book("Java","Kathy","Tech",10);
		Book book2=new Book("spring","Rod","Tech",11);
		Book book3=new Book("Miracle","Kathy","Fiction",12);
		Book book4=new Book("Ferrari","Robin","Fiction",13);
		Book book5=new Book("Captain","Hal","Comic",14);
		Book book6=new Book("Skull Glow","Kumaran","Horror",15);
		list.add(book6);
		list.add(book5);
		list.add(book4);
		list.add(book3);
		list.add(book2);
		list.add(book1);
		
	}
	
	//This method will return all the book.
	public List<Book> getBookList()
	{
		return list;
	}
	
	//This method will return all the book by id.
	@Override
	public Book getByID(int bookid)
	{
		Book tempBook=null;
		for(Book mainBook:list)
		{
			if(mainBook.getBookid()==bookid)
			{
				tempBook=mainBook;
			}
		}
		return tempBook;
	}

	//This method will return book by author
	@Override
	public List<Book> getBooksByAuthor(String author) 
	{
		Book tempBook=null;
		List<Book> list1=new ArrayList<Book>();
		for(Book mainBook:list)
		{
			if(mainBook.getAuthor().equals(author))
			{
				tempBook=mainBook;
				list1.add(tempBook);
			}
		}
		return list1;
	}
	//This method will return book by category
	@Override
	public List<Book> getBooksByCategory(String category) {
		Book tempBook=null;
		List<Book>list2=new ArrayList<Book>();
		for(Book mainBook:list)
		{
			if(mainBook.getCategory().equalsIgnoreCase(category))
			{
				tempBook=mainBook;
				list2.add(tempBook);
			}
		}
		return list2;
	}
	//This method will add  book to the list and return complete book
	@Override
	public Book updateBook(Book book)
	{
		list.add(book);
		return book;
	}
	//This method returns the complete list of book 

	@Override
	public List<Book> getAllBook()
	{
		//this will return complete set of Book
		return list;
	}

	

}
