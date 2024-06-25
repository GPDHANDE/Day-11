package org.ContractPod.Day11OopsPrograms;

import java.time.LocalDateTime;
import java.util.ArrayList;

class CompanyShares
{
	private String stockSymbol;
	private int noOfShares;
	private LocalDateTime dateTime;
	
	CompanyShares(String stockSymbol, int noOfShares, LocalDateTime dateTime) 
	{
		this.stockSymbol = stockSymbol;
		this.noOfShares = noOfShares;
		this.dateTime = dateTime;
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
	
}
public class StockAccount 
{
	private String customerName;
	private ArrayList<CompanyShares> companyShareList;
	
	
	StockAccount(String customerName, ArrayList<CompanyShares> companyShareList) 
	{
		this.customerName = customerName;
		this.companyShareList = companyShareList;
	}

	public void Buy(int noOfShares,String stockSymbol)
	{
		addCompanyShares(stockSymbol, noOfShares);
		System.out.println(noOfShares +"shares of "+ stockSymbol  +"bought successfully.");
	}
	
	public void Sell(int noOfShares,String stockSymbol)
	{
		
	}
	
	public void addCompanyShares(String stockSymbol, int numberOfShares)
	{
		
	}
	public void PrintRecord()
	{
		
	}
	public static void main(String[] args) 
	{
		
	}

}
