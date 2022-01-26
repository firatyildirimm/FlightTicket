/*
@author Firat YİLDİRİM
@since 27.01.2022
 */
import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance(km): ");
        int distance = input.nextInt();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your trip type\n1-One direction" +
                "\n2-Round Trip");
        int tripType = input.nextInt();

        double total = (distance*0.10);

        double discountRate=0;
        double extraDiscount=0;

        if(age<=12){
            discountRate = 0.5;
        }
        else if(age<=24){
            discountRate=0.1;
        }
        else if(age>=65){
            discountRate=0.3;
        }

        total=total-(total*discountRate);

        if (tripType==2){
            total = 2*total;
            extraDiscount=0.2;
            total=total-(total*extraDiscount);
        }

        if(age<0 || distance<0 || (tripType !=1 && tripType!=2)){
            System.out.println("You entered a wrong value!");
        }
        else {
            System.out.println("Total Amount: " + total);
        }



    }
}
