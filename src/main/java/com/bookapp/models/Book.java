package com.bookapp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class Book
{
	private String title;
	private String author;
	private String category;
	private int bookid;
	
	
}
