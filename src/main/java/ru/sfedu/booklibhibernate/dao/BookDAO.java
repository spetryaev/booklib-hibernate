/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.dao;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.sfedu.booklibhibernate.model.Book;
import ru.sfedu.booklibhibernate.util.HibernateUtil;
/**
 *
 * @author sergey
 */
//Data Access Object

public class BookDAO {
    
    private static final Logger log = Logger.getLogger(BookDAO.class);
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
   Session session;
    
    public Book getBookById (int bookId) {
       try  {
                     session = sessionFactory.openSession();
                    Book bookObject = session.get(Book.class, bookId);
                    session.close();
                    return bookObject;
                }
       catch (HibernateException e){
                    log.error(e);
                    return null;
                }
        }
    
    public boolean addBook(Book bookObject){
        try {
                    session = sessionFactory.openSession();
                    Transaction transaction = session.beginTransaction();
                    session.saveOrUpdate(bookObject);
                    transaction.commit();
                    session.close();
                    return true;
                }
        catch (HibernateException e) {
                    log.error(e);
                    return false;
                    }
            }
    
    public boolean updateBook (Book bookObject) {
            try {
                        session = sessionFactory.openSession();
                        Transaction transaction = session.beginTransaction();
                        session.update(bookObject);
                        transaction.commit();
                        session.close();
                        return true;
                      }
            catch (HibernateException e){
                        log.error(e);
                        return false;
                        }
            }
            
            public boolean deleteBook (Book bookObject) {
            try {
                        session = sessionFactory.openSession();
                        Transaction transaction = session.beginTransaction();
                        session.delete(bookObject);
                        transaction.commit();
                        session.close();
                        return true;
                      }
            catch (HibernateException e){
                        log.error(e);
                        return false;
                         }
            }
            
            public List<Book> getBookList() {
                    try{
                            session = sessionFactory.openSession();
                            List<Book> bookList = (List<Book>) session.createQuery("From Book").list(); //Book - class, not table!
                            //there was an error: "books is not mapped". Of course! I mapped a class, not a table in postgres!
                            session.close();
                            return bookList;
                        }
                    catch (HibernateException e) {
                        log.error(e);
                        return null;
                        }
                    }
    
    
    
}
