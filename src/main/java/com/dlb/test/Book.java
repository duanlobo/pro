package com.dlb.test;

import com.dlb.anno.Info;

import java.util.Date;

@Info
public class Book {
    private Integer id;
    private String name;
    private String code;
    private String writer;
    private String publisher;
    private double price;
    private Date publishDate;
    private String remark;

    public Book() {
    }

    public Book(Integer id, String name, String code, String writer, String publisher, double price, Date publishDate, String remark) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.writer = writer;
        this.publisher = publisher;
        this.price = price;
        this.publishDate = publishDate;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", writer='" + writer + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", publishDate=" + publishDate +
                ", remark='" + remark + '\'' +
                '}';
    }
}
