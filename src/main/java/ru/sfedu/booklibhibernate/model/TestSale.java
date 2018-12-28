/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.model;

import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.sfedu.booklibhibernate.util.HibernateUtil;

/**
 *
 * @author sergey
 */
//Many to many test!
public class TestSale {
       
    private static final Logger log = Logger.getLogger(TestSale.class);
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     
    
    public  void testMain() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Customer testCustomer = new Customer();
        testCustomer.setId(56);
        testCustomer.setFirstName("CROJA");
        testCustomer.setLastName("Petryaev");
        testCustomer.setEmail("sp@gmail.com");
        
        Book bookObject1 = new Book();
        bookObject1.setBookId(75);
        bookObject1.setBookTitle("Harry Potter");
        bookObject1.setBookAuthor("Test");
        bookObject1.setBookYear(1997);
        
        Book bookObject2 = new Book();
        bookObject2.setBookId(99);
        bookObject2.setBookTitle("Harry Potter");
        bookObject2.setBookAuthor("Test");
        bookObject2.setBookYear(1997);
        
        Set<Book> books = new HashSet<Book>();
        books.add(bookObject1);
        books.add(bookObject2);
        
        testCustomer.setBooks(books);
        
        session.save(testCustomer);
        
        session.getTransaction().commit();
        
        session.close();
        
        
    }
}
