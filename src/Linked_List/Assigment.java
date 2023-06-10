package Linked_List;

import java.util.LinkedList;

public class Assigment {
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            linkedList.add(10); // Add element at the end
            linkedList.add(1, 20); // Insert at position 1
            linkedList.add(2, 30); // Insert at position 2

            System.out.println(linkedList); // Output: [10, 20, 30]

            linkedList.remove(1); // Remove element at position 1

            System.out.println(linkedList); // Output: [10, 30]
        }

}
