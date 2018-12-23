/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.dao;

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
    @Test
    public void testGetBookById() {
        System.out.println("getBookById");
        int bookId = 1;
        BookDAO instance = new BookDAO();
        Book expResult = null;
        Book result = instance.getBookById(bookId);
        String s = result.getBookTitle();
        System.out.println(s);
        
    }
    
}
