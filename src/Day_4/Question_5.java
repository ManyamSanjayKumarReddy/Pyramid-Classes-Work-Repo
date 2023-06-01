package Day_4;

import java.util.Map;
import java.util.Scanner;

/*
Mr M is a pharmacist working in a Vaccination Company
    From the Below Details write a code in Java to Obtain the economic quantity:
        1. Annual Amount of Vaccination to be produced in a year : 20000
        2. Cost of Making the Vaccine : Rs 10
        3. Cost of Storing the vaccine : Rs 5
 */
public class Question_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount of Expenditure of Vaccines : ");
        float ann_ammount = sc.nextInt();
        System.out.print("Enter the Cost of Vaccine : ");
        float cost_vaccine = sc.nextInt();
        System.out.print("Enter the Cost for Storing the Vaccine : ");
        float cost_storing = sc.nextInt();

        float EOQ = (2 * ann_ammount * cost_vaccine) / cost_storing;
        int eoq = (int) Math.sqrt(EOQ);

        System.out.println("The Amount of Vaccines are made are : " + eoq);


    }
}
