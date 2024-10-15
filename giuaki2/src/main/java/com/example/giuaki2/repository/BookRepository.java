package com.example.giuaki2.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.giuaki2.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}