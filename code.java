import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String[] names = {"Kinder", "Corny", "FitSpo", "Water", "Iced Tea"};
        double[] prices = {2.20, 1.70, 4.80, 1.20, 2.30};
        int[] quantity = {5, 7, 10, 15, 6};
	    System.out.print("Enter'exit' to exit the program.\n\n");
	    
	    displayAvailability(names, prices, quantity);
	    
	    do{
	        int code = scanner.nextInt();
	        if(code>=0 && code<quantity.length){
	            if(quantity[code]==0){
	                System.out.println("We do not have this product!");
	                break;
	            }
	            System.out.print("Please enter "+prices[ code] +" leva: ");
	            double inserted = scanner.nextDouble();
	            if(inserted>=prices[code]){
	                System.out.print("Here you go. This is your change:"+ (inserted-prices[code])+"\n\n");
	                quantity[code]--;
	            }else{
	                System.out.print("Not enough money!\n\n");
	            }
	        }else{
	            System.out.print("Invalid code!\n\n");
	        }
	    }while(scanner.nextLine()!="exit");
	    
	    System.out.print("Enter code: ");
	}
	private static void displayAvailability(String[] names, double[] prices, int[] quantity){
	    for(int i=0; i<quantity.length; i++){
	        if(quantity[i]>0){
	            System.out.println("Code:"+i+"  "+names[i]+" - "+prices[i]+" leva - "+quantity[i]+" times");
	        }
	    }
	    
	} 
}
