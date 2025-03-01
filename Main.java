import java.util.Scanner;

class Main{
    public static void main(String[] args){
        CurrencyConvertor obj = new CurrencyConvertor();
        Scanner scan = new Scanner(System.in);
        
        boolean keepRunning = true;
        
        while(keepRunning){

            System.out.println("Welcome to currency convertor\n Convert PKR into\n1.USD\n2.SAR\n3.Exit");
            System.out.println("Enter choice");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
            case 1:
                obj.USD();    
            break;
            case 2:
                obj.SAR();
            break;
            case 2:
                obj.SAR();
            break;
            case 3:
                obj.EURO();
            break;
            case 4
                obj.AED();
            break;
            case 5:
                obj.CAD();
            break;
            case 6:
                obj.CHINAYUAN();
            case 7:
            System.out.println("Thanks for using");
                keepRunning = false;
            break;
            default:
                System.out.println("Wrong choice entered");
                break;
            }
        }
        scan.close();
    }
}