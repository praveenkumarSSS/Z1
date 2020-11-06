package com.players.mvcflow.model;

import java.util.Date;

public class Todo {

	private int id;
	
	private String user;
	private Date targetDate;
   
    private boolean isDone;
	public Todo(int id, String user, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", isDone=" + isDone + "]";
	}
	
}