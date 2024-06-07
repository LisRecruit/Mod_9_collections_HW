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
//        String a = "First string";
//        String b = "Next string is Null";
//        String c = "let's make this null";
//        String d = "This is not a \"c\"";
//        String q = "qq";
//        MyMap<Character, String> checkNull=new MyMap<>();
//
//        checkNull.put('a', a);
//        checkNull.put('b', b);
//        checkNull.put(null, c);
//        checkNull.put('d', d);
//
//        System.out.println(checkNull.size());
//
//        System.out.println(checkNull.get('a'));
//        System.out.println(checkNull.get(null));
//        System.out.println(checkNull.get('c'));
//        System.out.println(checkNull.get('d'));
//
//        checkNull.put('c',null);
//        System.out.println("++++++++++");
//        System.out.println(checkNull.get('c'));
//
//       // checkNull.put('q',q);
//        System.out.println(checkNull.size());
//        Character qq = 'a';
//        Character ww = 'c';
//        System.out.println(qq.hashCode()%7);
//        System.out.println(ww.hashCode()%7);

        MyMap<String, Integer> mm = new MyMap<>();
        System.out.println("0 size "+mm.size()); //0
        mm.put("0", 0);
        System.out.println("size 1 "+mm.size()); //1
        mm.put("1", 1);
        System.out.println("size 2 " +mm.size()); //2
        mm.put("1", 11);
        System.out.println("size 2 " +mm.size()); //2
        mm.put("0", null);
        System.out.println("size 2 " +mm.size()); //2
        mm.put(null, -1111);
        System.out.println("size 3 " +mm.size()); //3
        mm.put(null, -2222);
        System.out.println("size 3 " +mm.size()); //3
        System.out.println("Should be '11': " + mm.get("1"));;
        mm.remove("1");
        System.out.println("Should be 'null': " + mm.get("0"));
        System.out.println(mm.size());
        System.out.println("Should be '-2222': " + mm.get(null));

        System.out.println(mm.size());
        mm.remove(null);
        //System.out.println("should be null " + mm.get(null));
        System.out.println(mm.size());

    }


}
