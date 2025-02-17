import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        String[] names = {"Kinder", "Corny", "FitSpo", "Water", "Iced Tea"};
        double[] prices = {2.20, 1.70, 4.80, 1.20, 2.30};
        int[] quantity = {5, 7, 10, 15, 6};
	    System.out.print("Enter '-1' to exit the program.\n\n");
	    
	    displayAvailability(names, prices, quantity);
	    System.out.print("\nEnter code: ");
	    
	    int code=scanner.nextInt();
	    do{
	        if(code>=0 && code<quantity.length){
	            if(quantity[code]==0){
	                System.out.println("We do not have this product!");
	            }else{
	                System.out.print("Please enter money: ");
	                double inserted = scanner.nextDouble();
	                if(inserted>=prices[code]){
	                    System.out.print("Here you go. This is your change:"+ (inserted-prices[code])+"\n\n");
	                    quantity[code]--;
	                }else{
	                    System.out.print("Not enough money!\n\n");
	                }
	            }
	        }else{
	            if(code==-1){
	                System.out.print("arr");
	                break;
	            }
	            System.out.print("Invalid code!\n\n");
	        }
	        System.out.print("Enter code: ");
	        code = scanner.nextInt();
	    }while(code!=-1);
	    
	    
	}
	private static void displayAvailability(String[] names, double[] prices, int[] quantity){
	    for(int i=0; i<quantity.length; i++){
	        if(quantity[i]>0){
	            System.out.println("Code:"+i+"  "+names[i]+" - "+prices[i]+" leva - "+quantity[i]+" times");
	        }
	    }
	    
	} 
}
