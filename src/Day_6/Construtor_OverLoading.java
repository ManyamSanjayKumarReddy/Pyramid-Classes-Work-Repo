package Day_6;

public class Construtor_OverLoading {

    static class student{
        int id;
        String name;
        int age;

        public student(int i, String n) {
            id = i;
            name = n;
        }

        public student(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        void Display(){
            System.out.println(id + " " + name + " " + age);
        }
    }

    public static  void main(String[] args){
        student s1 = new student(1, "sanju", 18);
        student s2 = new student(2, "vinay", 20);
        s1.Display();
        s2.Display();
    }
}
