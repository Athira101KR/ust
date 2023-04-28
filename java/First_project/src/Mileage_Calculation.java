import java.util.Scanner;

public class Mileage_Calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double petrolPrice=sc.nextDouble();
		double distanceCoveredKM=sc.nextDouble();
		int amount=sc.nextInt();
		
		double litres=(double) amount/petrolPrice;
		double mileage= distanceCoveredKM/litres;
		
		System.out.format("%.2f",mileage);
		

	}

}
