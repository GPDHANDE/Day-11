package org.ContractPod.Day11OopsPrograms;

import java.util.ArrayList;
import java.util.Scanner;

class Stock
{
	private String name;
	private int numberOfShares;
    private double sharePrice;
    
    

	Stock(String stockName, int numberOfShares, double sharePrice) 
	{
		this.name = stockName;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}

	

	public String getStockName() {
		return name;
	}



	public void setStockName(String stockName) {
		this.name = stockName;
	}



	public int getNumberOfShares() {
		return numberOfShares;
	}



	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}



	public double getSharePrice() {
		return sharePrice;
	}



	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double calculateStockValue() {
        return numberOfShares * sharePrice;
    }
	
}
class StockPortfolio
{
	private ArrayList<Stock> a;
	public StockPortfolio() 
	{
		a = new ArrayList<>();
    }

	 
	 
	 public void addStock(Stock stock) 
	 {
		 a.add(stock);
	 }

	 public void printStockReport() 
	 {
	        double totalPortfolioValue = 0.0;

	        System.out.println("Stock Report:");
	        System.out.printf("%-15s %-20s %-15s %-15s\n", "Stock Name", "Number of Shares", "Share Price", "Stock Value");
	        System.out.println("------------------------------------------------------------");
	        
	        for (Stock stock : a) 
	        {
	            double stockValue = stock.calculateStockValue();
	            totalPortfolioValue += stockValue;

	            System.out.printf("%-15s %-20d %-15.2f %-15.2f\n", stock.getStockName(), stock.getNumberOfShares(),
	                    stock.getSharePrice(), stockValue);
	        }

	        System.out.println("------------------------------------------------------------");
	        System.out.printf("Total Portfolio Value: %.2f\n", totalPortfolioValue);
	    
	}
}
public class StockManagement
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
	
		StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter the number of stocks: ");
        int numberOfStocks = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfStocks; i++) 
        {
            System.out.println("\nEnter Stock " + (i + 1) + " details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Share Price: ");
            double sharePrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline after double input

            Stock stock = new Stock(name, numberOfShares, sharePrice);
            portfolio.addStock(stock);
        }

        // Print the stock report
        portfolio.printStockReport();
            
	}

}
