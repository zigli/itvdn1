package arraylist1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("name");
        arrayList.add("surname");
        System.out.println(arrayList.size());
        arrayList.ensureCapacity(30);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.indexOf("name"));
        System.out.println(arrayList.lastIndexOf("name"));

    }
}
