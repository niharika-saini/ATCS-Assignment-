package com.ta.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="restTrainee")
public class Trainee {
	
	@Id
	private int  tid;
	private String tname;
	private int tsal;
	private String tcourse;
	private String tadd;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTsal() {
		return tsal;
	}
	public void setTsal(int tsal) {
		this.tsal = tsal;
	}
	public String getTcourse() {
		return tcourse;
	}
	public void setTcourse(String tcourse) {
		this.tcourse = tcourse;
	}
	public String getTadd() {
		return tadd;
	}
	public void setTadd(String tadd) {
		this.tadd = tadd;
	}
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}
	public Trainee(int tid, String tname, int tsal, String tcourse, String tadd) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsal = tsal;
		this.tcourse = tcourse;
		this.tadd = tadd;
	}
	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + ", tsal=" + tsal + ", tcourse=" + tcourse + ", tadd=" + tadd
				+ "]";
	}
	
	
	
	

}
