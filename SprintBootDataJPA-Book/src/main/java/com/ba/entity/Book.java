package com.ba.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookstore")
public class Book {
	
	@Id
	private int bid;
	private String bname;
	private int bprice;
	private String bauthor;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String bname, int bprice, String bauthor) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bprice = bprice;
		this.bauthor = bauthor;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", bprice=" + bprice + ", bauthor=" + bauthor + "]";
	}
	
	

}
