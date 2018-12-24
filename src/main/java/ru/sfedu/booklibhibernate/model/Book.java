/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.model;

import java.io.Serializable;
import javafx.scene.chart.PieChart.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
    
    @Id  //primary key
    @Column(name = "bookid", nullable = false)
    protected int bookId;
    
    @Column (name = "booktitle", nullable = false)
    protected String bookTitle;

    @Column (name = "bookgenre", nullable = false)
    protected String bookGenre;
    
    @Column (name = "bookdate", nullable = false)
    protected String bookDate;
            
   
    
    
    public long getBookId() {
        return bookId;
    }

    public void setBookId(int  bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
   
    
    
    
    
}
