package by.arsinis.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_book")
public class Book {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String ISBN;
    @Column
    private String name;
    @Column
    private String Author;

    public Book() {
    }

    public Book(String ISBN, String name, String author) {
        this.ISBN = ISBN;
        this.name = name;
        Author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }
}
