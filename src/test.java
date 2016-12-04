import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String name;
		Boolean isEntry=true;
		
		
		while (isEntry){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter the name of the Customer. (\"Exit\" to abort)");
			name = scanner.nextLine();
			
			if (name.equalsIgnoreCase("EXIT")) {
				isEntry=false;
				break;
			}
			
			System.out.println("Please enter the amount of the sale.");
			Store.addSale(name, scanner.nextDouble());
		}
		System.out.println("The best customer of the day is " + Store.nameOfBestCustomer() + ".");
	}

}
