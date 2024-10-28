package com.springguru.h2db.bootstrap;

import com.springguru.h2db.domain.Author;
import com.springguru.h2db.domain.Book;
import com.springguru.h2db.domain.Publisher;
import com.springguru.h2db.repo.AuthorRepo;
import com.springguru.h2db.repo.BookRepo;
import com.springguru.h2db.repo.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    public BootstrapData(PublisherRepo publisherRepo, AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.publisherRepo = publisherRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author1 = new Author("fname1", "lname1");
        Book book1 = new Book("Book1", "12345");
        Author savedAuthor1 = authorRepo.save(author1);
        Book savedBook1 = bookRepo.save(book1);

        Author author2 = new Author("fname2", "lname2");
        Book book2 = new Book("Book2", "12346");
        Author savedAuthor2 = authorRepo.save(author2);
        Book savedBook2 = bookRepo.save(book2);

        savedAuthor1.getBooks().add(savedBook1);
        savedAuthor2.getBooks().add(savedBook2);
        savedBook1.getAuthors().add(savedAuthor1);
        savedBook2.getAuthors().add(savedAuthor2);

        Publisher publisher1 = new Publisher("publisher1", "address1", "city1", "state1", "12345678");
        Publisher savedPublisher1 = publisherRepo.save(publisher1);

        savedBook1.setPublisher(savedPublisher1);
        savedBook2.setPublisher(savedPublisher1);

        authorRepo.save(savedAuthor1);
        authorRepo.save(savedAuthor2);
        bookRepo.save(savedBook1);
        bookRepo.save(savedBook2);


        System.out.println("In Bootstrap Data");
        System.out.println("Author Count = " + authorRepo.count());
        System.out.println("Book Count = " + bookRepo.count());
        System.out.println("Publisher Count = " + publisherRepo.count());
    }

}
