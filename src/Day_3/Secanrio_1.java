package Day_3;

import java.util.Scanner;

/*
Mr M of Ajarbaijan wants to automate his bank details with opening Account balance of 2,00,00
a.	Deposit = Rs 1,00,000
b.	Funds Transfer to S = Rs 25,000
c.	Loan Taken from bank @repaid = Rs 10,000
d.	Interest on the loan 5% for 6 months @ SI
e.	Withdrawal = Rs 20,000
 */
public class Secanrio_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Opening Balance :");
        int Accbal = sc.nextInt();
        System.out.print("Enter the Deposit Amount :");
        int deposit = sc.nextInt();
        int total_bal = Accbal + deposit;

        System.out.print("Fund Transfer :");
        int funds = sc.nextInt();
        total_bal = total_bal - funds;

        System.out.print("Enter the Loan Taken :");
        int loan = sc.nextInt();
        total_bal = total_bal - loan;

        System.out.print("Enter the Rate of interest : ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time Period : ");
        float time = sc.nextFloat();

        float si = (loan * rate * time) / 100;
        float final_balance = (float) total_bal - si;

        System.out.print("Enter the Withdrawal : ");
        int withdrawal = sc.nextInt();
        final_balance = final_balance - withdrawal;

        System.out.println("The Final Amount in His Account will be : " + final_balance);
    }
}
