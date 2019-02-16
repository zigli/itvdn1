package arrayList2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (Integer item: arrayList) {
            System.out.println(item);
        }

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            Integer integer = iterator.next();
            System.out.println(integer);
        }

        ListIterator<Integer> listiterator = arrayList.listIterator();
        while (listiterator.hasNext()){
            //System.out.println(iterator.next());
            Integer integer = listiterator.next();
            System.out.println(integer);
        }
    }
}
