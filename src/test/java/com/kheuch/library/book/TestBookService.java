package com.kheuch.library.book;

import static org.junit.Assert.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBookService {

	public void saveBookTest(Book book) {
		BookServiceImpl bookService = new BookServiceImpl();
		Book actualBook = new Book();
		bookService.saveBook(actualBook);
		assertEquals(actualBook.getTitle(), bookService);

	}

}
