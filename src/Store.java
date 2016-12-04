import java.util.ArrayList;

public class Store {
	private String name;
	private double amount;
	private static ArrayList<Store> saleList = new ArrayList<>();
	
	
	public Store(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}
	public static void addSale (String customerName, double amount){
		Store nextCustomer = new Store(customerName, amount);
		saleList.add(nextCustomer);
	}
	
	public static String nameOfBestCustomer(){
		Store customer = saleList.get(0);
		String maxName = customer.name;
		double maxSale = customer.amount;
		
		for(int j = 1; j < saleList.size(); j++){
			Store checkCustomer = saleList.get(j);
			double checkSale = checkCustomer.amount;
			
			if (checkSale > maxSale) {
				maxSale = checkSale;
				maxName = checkCustomer.name;
			}
		}
		return maxName;
	}

}
