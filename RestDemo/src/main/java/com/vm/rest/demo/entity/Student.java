package com.vm.rest.demo.entity;
/**
 * this is a pojo class
 * @author shashi
 *
 */
public class Student {
	/**
	 * student id
	 */
	private int id;
	private String name;
	private int sem;
	private int avg;
	public Student(int id, String name, int sem, int avg) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.avg = avg;
	}
	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
}
