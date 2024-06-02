import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employees emp1 = new Employees("Mike","Manager");
        Employees emp2 = new Employees("Carl","Support");
        Employees emp3 = new Employees("Sancho","Sales");
        Employees emp4 = new Employees("Dima","Support");
        Employees emp5 = new Employees("Robert","Manager");

        MyMap <Integer, Employees>newList = new MyMap<>();
        newList.put(0,emp1);
        newList.put(1, emp2);
        newList.put(2, emp3);
        newList.put(3, emp4);
        newList.put(4, emp5);

        newList.remove(2);
        System.out.println(newList.get(0).toString());
        System.out.println(newList.get(1).toString());
        System.out.println(newList.get(2).toString());
        System.out.println(newList.get(3).toString());
        System.out.println(newList.get(4).toString());

    }


}
