package com.nest.LibraryApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "issuebooks")
public class IssueModel {
    @Id
    @GeneratedValue()
    private int id;
    private int bookId;
    private int userId;
    private String date;
    private String userEmail;
    private String userName;
    private String bookName;
    private String bookImage;
    private String bookPrice;

    public IssueModel() {
    }

    public IssueModel(int id, int bookId, int userId, String date, String userEmail, String userName, String bookName, String bookImage, String bookPrice) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.date = date;
        this.userEmail = userEmail;
        this.userName = userName;
        this.bookName = bookName;
        this.bookImage = bookImage;
        this.bookPrice = bookPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }
}
