package streamdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(20);
        al.add(10);
        al.add(11);
        al.add(15);
        al.add(7);
        al.add(13);
        al.add(6);
        System.out.println(showSumOfArray(al));
        System.out.println(sumOfArrayLambda(al));

    }

    public static int showSumOfArray(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()) {
            int num = it.next();
            if(num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    private static int sumOfArrayLambda(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }
}
