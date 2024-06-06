import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Employees emp1 = new Employees("Mike","Manager");
//        Employees emp2 = new Employees("Carl","Support");
//        Employees emp3 = new Employees("Sancho","Sales");
//        Employees emp4 = new Employees("Dima","Support");
//        Employees emp5 = new Employees("Robert","Manager");
//
//        MyMap <Integer, Employees>newList = new MyMap<>();
//        newList.put(0,emp1);
//        newList.put(1, emp2);
//        newList.put(2, emp3);
//        newList.put(3, emp4);
//        newList.put(4, emp5);
//        newList.put(6846, emp1);
//
////        newList.remove(2);
//        System.out.println(newList.get(0).toString());
//        System.out.println(newList.get(1).toString());
//        System.out.println(newList.get(2).toString());
//        System.out.println(newList.get(3).toString());
//        System.out.println(newList.get(4).toString());
//        System.out.println(newList.get(6846).toString());
//        System.out.println("========");
//
//        newList.put(2, emp3);
//        System.out.println(newList.get(2).toString());



//        Employees emptyEmp=null;
//        newList.put(null,emptyEmp);
//        System.out.println(newList.get(null));
        String a = "First string";
        String b = "Next string is Null";
        String c = "let's make this null";
        String d = "This is not a \"c\"";
        String q = "qq";
        MyMap<Character, String> checkNull=new MyMap<>();

        checkNull.put('a', a);
        checkNull.put('b', b);
        checkNull.put('c', c);
        checkNull.put('d', d);

        System.out.println(checkNull.get('a'));
        System.out.println(checkNull.get('b'));
        System.out.println(checkNull.get('c'));
        System.out.println(checkNull.get('d'));

        checkNull.put('c',null);
        System.out.println("++++++++++");
        System.out.println(checkNull.get('c'));

        checkNull.put('q',q);




    }


}
