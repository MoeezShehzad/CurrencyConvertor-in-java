import java.util.Scanner;

public class CurrencyConvertor {

    Scanner input = new Scanner(System.in);
    public void USD(){
        System.out.println("Enter PKR: ");
        double pkr = input.nextDouble();
        double amount = pkr*279.75;
        System.out.println("PKR to USD: " + amount);
    }

    public void SAR(){
        System.out.println("Enter PKR: ");
        double pkr = input.nextDouble();
        double amount = pkr*74.59;
        System.out.println("PKR to SAR: " + amount);
    }
    public void EURO(){
        System.out.println("Enter PKR: ");
        double pkr = input.nextDouble();
        double amount = pkr*293.25;
        System.out.println("PKR to EURO: " + amount);
    }
    public void AED(){
        System.out.println("Enter PKR: ");
        double pkr = input.nextDouble();
        double amount = pkr*76.00;
        System.out.println("PKR to AED: " + amount);
    }
    public void CAD(){
        System.out.println("Enter PKR: ");
        double pkr = input.nextDouble();
        double amount = pkr*195.10;
        System.out.println("PKR to CAD: " + amount);
    }
    public void CHINAYUAN(){
        System.out.println("Enter PKR: ");
        double pkr = input.nextDouble();
        double amount = pkr*37.59;
        System.out.println("PKR to YUAN: " + amount);
    }
    
}
