package Day_9;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args){
        Stack<Integer> stk = new Stack<>();

        boolean result = stk.empty();
        System.out.println("Is stack empty ? " + result);

        stk.push(104);
        stk.push(1366);
        stk.push(466);
        stk.push(1102);
        stk.push(659);
        stk.push(3658);

        result = stk.empty();
        System.out.println("Elements in the Stack : " + stk);
        System.out.println("Peek of the stack is : " + stk.peek());
        stk.pop();
        System.out.println("After Poping the elements in the stack are : " + stk);
        System.out.println("Is stack empty ? " + result);
        System.out.println("Position of the Element in the Stack 104 : " + stk.search(104));

        System.out.println("Size of the Stack is : " + stk.size());

        // Iteration over the stack

        Iterator iterator = stk.iterator();
        System.out.print("Using Iterator : ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Foreach method
        System.out.print("Using For Each Method : ");
        stk.forEach(n ->
        {
            System.out.print(n + " ");
        });

        System.out.println();

        // Using ListIterator method
        ListIterator<Integer> listIterator = stk.listIterator(stk.size());
        System.out.print("using ListIterator Method from top to bottom : ");

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
    }
}
