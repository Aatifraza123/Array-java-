package Strings;
import java.util.*;
import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
       l.add(2);
       l.add(5);
       l.add(8);
       l.add(45);
//       System.out.println(l.get(3));

//       for (int i = 0; i < l.size();i++){
//           System.out.println(l.get(i));
//       }
        System.out.println(l);
//        l.remove(1);
        l.add(3,2);

        System.out.println(l);
        boolean abs = l.contains(Integer.valueOf(2));
        System.out.println(abs);
    }
}
