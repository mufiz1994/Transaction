package com.test;

public class Request {
	
	private String httpMethod;
	
	private int transaction_id;
	
	private float transaction_requested_amount;
	
	private float transaction_Approved_amount;
	
	private float tax_amount;
	
	private int terminal_id;
	
	private int store_id;
	
	private int merchant_id;
	
	private ApprovedTransactions atransaction;
	
	public String getHttpmethod()
	{
		return httpMethod;
	}
	
	public void sethttpmethod(String httpMethod)
	{
		this.httpMethod=httpMethod;
	}
	
	public int gettransaction_id()
	{
		return transaction_id;
	}
	
	public void settransaction_id(int transaction_id)
	{
		this.transaction_id=transaction_id;
	}
	
	public ApprovedTransactions getatransaction()
	{
		return atransaction;
	}
	
	public void setatransaction(ApprovedTransactions atTransactions)
	{
		this.atransaction=atTransactions;
	}
	
	public float gettransaction_requested_amount() 
	{
		return transaction_requested_amount;
	}
	
	public void settransaction_requested_amount(float transaction_requested_amount)
	{
		this.transaction_requested_amount=transaction_requested_amount;
	}
	
	public float gettransaction_Approved_amount() 
	{
		return transaction_Approved_amount;
	}
	
	public void settransaction_Approved_amount(float transaction_Approved_amount)
	{
		this.transaction_Approved_amount=transaction_Approved_amount;
	}
	
	public float gettax_amount()
	{
		return tax_amount;
	}
	
	public void settax_amount(float tax_amount)
	{
		this.tax_amount=tax_amount;
	}

	public int getterminal_id()
	{
		return terminal_id;
	}
	
	public void setterminal_id(int terminal_id)
	{
		this.terminal_id=terminal_id;
	}
	
	public int getstore_id()
	{
		return store_id;
	}
	
	public void setstore_id(int store_id)
	{
		this.store_id=store_id;
	}
	
	public int getmerchant_id()
	{
		return merchant_id;
	}
	
	public void setmerchant_id(int merchant_id)
	{
		this.merchant_id=merchant_id;
	}
	
}
