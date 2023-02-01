package project.project.service;

import org.springframework.stereotype.Component;

import project.project.entity.Book;

@Component
    public interface BookService {
        public Book saveBook(Book book);
        public Book findByBookId(int bookId);



}
