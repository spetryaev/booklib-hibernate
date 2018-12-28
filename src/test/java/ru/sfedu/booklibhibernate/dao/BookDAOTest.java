/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.sfedu.booklibhibernate.model.Book;

/**
 *
 * @author sergey
 */
public class BookDAOTest {
    
    public BookDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBookById method, of class BookDAO.
     */
    //@Test
    public void testGetBookById() {
        System.out.println("getBookById");
        int bookId = 2;
        BookDAO instance = new BookDAO();
        Book expResult = null;
        Book result = instance.getBookById(bookId);
        String s = result.getBookTitle();
        System.out.println(s);
        
    }

    /**
     * Test of addBook method, of class BookDAO.
     */
  // @Test
    public void testAddBook() {
        System.out.println("addBook");
        Book bookObject = new Book();
        bookObject.setBookId(47);
        bookObject.setBookTitle("Harry Potter");
        bookObject.setBookAuthor("Test");
        bookObject.setBookYear(1997);
        BookDAO instance = new BookDAO();
        boolean expResult = true;
        boolean result = instance.addBook(bookObject);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of updateBook method, of class BookDAO.
     */
    //@Test
    public void testUpdateBook() {
        System.out.println("updateBook");
        Book bookObject = new Book();
        bookObject.setBookId(4);
        bookObject.setBookTitle("With");
        bookObject.setBookAuthor("TestTEst");
        bookObject.setBookYear(1467);
        BookDAO instance = new BookDAO();
        boolean expResult = true;
        boolean result = instance.updateBook(bookObject);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteBook method, of class BookDAO.
     */
  // @Test
    public void testDeleteBook() {
        System.out.println("deleteBook");
        Book bookObject = new Book();
        bookObject.setBookId(47);
        bookObject.setBookTitle("Harry Potter");
        bookObject.setBookAuthor("Fantasy");
        bookObject.setBookYear(1997);
        BookDAO instance = new BookDAO();
        boolean expResult = true;
        boolean result = instance.deleteBook(bookObject);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBookList method, of class BookDAO.
     */
    @Test
    public void testGetBookList() {
        System.out.println("getBookList");
        BookDAO instance = new BookDAO();
        List<Book> expResult = null;
        List<Book> result = instance.getBookList();
        
        for(int i = 0; i <  result.size(); i++) {
            System.out.println(result.get(i).getBookId() +" | " + result.get(i).getBookTitle() + " | " + result.get(i).getBookAuthor() +" | " + result.get(i).getBookYear());
        }
    }
    
}
