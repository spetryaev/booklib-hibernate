/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author sergey
 */
@Entity
@Table (name = "customers")
public class Customer implements Serializable {
    
    protected int Id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected Set<Book> books = new HashSet<Book>(0);

   
     @Id
    @Column (name = "id")
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Column (name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column (name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     @Column (name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     @JoinTable(
             name = "sales",
            joinColumns = {
                    @JoinColumn(name = "customer_id", nullable = false) }, 
           inverseJoinColumns = {
                    @JoinColumn(name = "book_id", nullable = false) }
            )
     public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
