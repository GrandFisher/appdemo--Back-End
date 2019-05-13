package cn.sjtu.springwebjpa.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Objects;

/**
 * @author xuan
 * @date 2019-05-09 20:33.
 */

@Entity
@Table(name = "book", schema = "weexapp")
public class BookEntity {

    private Integer id;
    private String bookName;
    private String author;
    private String bookClass;
    private int price;
    private String image;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bookname")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "bookclass")
    public String getBookClass() {
        return bookClass;
    }

    public void setBookClass(String bookClass) {
        this.bookClass = bookClass;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return price == that.price &&
                Objects.equals(bookName, that.bookName) &&
                Objects.equals(author, that.author) &&
                Objects.equals(bookClass, that.bookClass) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookName, author, bookClass, price, image);
    }
}
