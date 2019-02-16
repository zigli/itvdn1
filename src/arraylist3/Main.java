package arraylist3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i< 15; i++){
            arrayList.add(i);
        }

        for (Integer temp: arrayList) {
            System.out.println(temp);
        }
    }
}
