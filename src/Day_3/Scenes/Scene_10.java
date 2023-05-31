package Day_3.Scenes;

import java.util.Scanner;

public class Scene_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Tree Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the Number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the Number of Columns : ");
        int cols = sc.nextInt();

        if (n > rows && n <= rows * 2){
            System.out.println("Mango Tree Present");
        } else if (n > (rows * (rows - 2)) && n <= (rows * rows-1)) {
            System.out.println("Mango Tree Present");
        }
        else {
            System.out.println("Mango Tree is Not Present");
        }
    }
}
