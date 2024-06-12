package com.example.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore.Entity.Book;
@Repository

public interface BookRepositry extends JpaRepository<Book,Integer>{

}
