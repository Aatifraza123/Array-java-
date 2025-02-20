package Strings;
import java.util.*;

public class ArrayListQuery {

    static void reverseList(ArrayList<Integer> list){
        int i = 0,j = list.size() - 1;
        while(i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
         list.add(10);
          list.add(3);
          list.add(5);
          list.add(22);
          list.add(10);
        System.out.println("Original list " + list);
        reverseList(list);
        System.out.println("Reversed list " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

       ArrayList<String> str = new ArrayList<>();
        str.add("My");
        str.add("name");
        str.add("is");
        str.add("aatif");
        str.add("raza");
        System.out.println(str);
        Collections.sort(str);
        System.out.println("Sorted " + str);

    }
}
