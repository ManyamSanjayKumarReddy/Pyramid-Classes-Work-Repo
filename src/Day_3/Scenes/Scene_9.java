package Day_3.Scenes;

import java.util.Objects;
import java.util.Scanner;

public class Scene_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of Student : ");
        String student = sc.next();
        System.out.print("Enter the Tution Fee : ");
        int tution = sc.nextInt();
        System.out.print("Enter the Bus Fee : ");
        int bus = sc.nextInt();
        System.out.print("Enter the Hostel Fee : ");
        int hostel = sc.nextInt();

        if (Objects.equals(student, "MSH")){
            int fee = tution + hostel;
            System.out.println("Total Fee is " + fee);
        } else if (Objects.equals(student, "MSDS")) {
            int fee = tution + bus;
            System.out.println("Total Fee is " + fee);
        }
        else if (Objects.equals(student, "MGSDS")) {
            float fee = (float) (tution * 1.5 + bus);
            System.out.println("Total Fee is " + fee);
        }
        else if (Objects.equals(student, "MGSH")) {
            float fee = (float) (tution * 1.5 + hostel);
            System.out.println("Total Fee is " + fee);
        }

    }
}
