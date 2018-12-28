/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.chart.PieChart.Data;
import javax.persistence.*;

/**
 *
 * @author sergey
 */


//My POJO 

@Entity
@Table (name = "books")
public class Book implements Serializable {
        
    public Book() {
    }
   
    protected int bookId;
    protected String bookTitle;
    protected String bookAuthor;
    protected int bookYear;
   protected Set<Customer> customers = new HashSet<Customer>(0);

    
    @Id  //primary key
    @Column(name = "id", nullable = false)
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Column (name = "title", nullable = false)
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Column (name = "author", nullable = false)
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

     @Column (name = "year", nullable = false)
    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
            
   
    
    
    
    
    
}
