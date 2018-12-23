/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import ru.sfedu.booklibhibernate.model.Book;
import ru.sfedu.booklibhibernate.util.HibernateUtil;
/**
 *
 * @author sergey
 */
//Data Access Object

public class BookDAO {
    
    private static final Logger log = Logger.getLogger(BookDAO.class);
    
    
    public Book getBookById (int bookId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Book bookObject = session.get(Book.class, bookId);
        return bookObject;
    }
}
