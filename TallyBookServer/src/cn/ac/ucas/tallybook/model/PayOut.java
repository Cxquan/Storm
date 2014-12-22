package cn.ac.ucas.tallybook.model;

import java.util.Date;

public class PayOut {

	private int payOutID;
	
	private String tenantID;
	
	private int categoryID;
	
	private Date expenseTime;
	
	private double money;
	
	private String note;

	public int getPayOutID() {
		return payOutID;
	}

	public void setPayOutID(int payOutID) {
		this.payOutID = payOutID;
	}

	public String getTenantID() {
		return tenantID;
	}

	public void setTenantID(String tenantID) {
		this.tenantID = tenantID;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public Date getExpenseTime() {
		return expenseTime;
	}

	public void setExpenseTime(Date expenseTime) {
		this.expenseTime = expenseTime;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
