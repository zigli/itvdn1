package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("you");
        arrayList.add("tesst");
        System.out.println(arrayList);

        arrayList.add(0,"teacher");

        arrayList.remove(2);
        arrayList.remove("tesst");

        System.out.println(arrayList);
    }
}
