package Day_6;

/*
        Inheritance Problems
 */
public class animal {

    static class Animal {
        void eat(){
            System.out.println("Eating....");
        }
    }

    static class Dog extends Animal{
        void bark(){
            System.out.println("Barking....");
        }
    }

    public static void main(String[] args){

        Dog dogs = new Dog(); // New is used to allocate address or memory dynamically
        dogs.eat();
        dogs.bark();

    }
}

/*

    -- I Created a Base class Animal
    -- Void int is a Method inside a class Animal
    -- Dog is derived class from animal
    -- It has its own method called Bark
    -- Then I Created Main Class which contains Main Function
    -- Then i used main function inside that class
    -- From the class dog I am creating an object dogs
    -- Iam attaching method to the Bark --> dogs.bark()

 */
