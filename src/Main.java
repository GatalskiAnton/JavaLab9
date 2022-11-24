import PriorityQueue.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(0,"Pair1");
        Pair<Integer, String> p2 = new Pair<Integer, String>(1,"Pair2");
        Pair<Integer, String> p3 = new Pair<Integer, String>(2,"Pair3");

        ArrayList<Pair<Integer,String>> ps = new ArrayList<Pair<Integer, String>>() ;
        ps.add(p3);
        ps.add(p1);
        ps.add(p2);

        PriorityQueue<Integer, String> queue = new PriorityQueue<Integer, String>(ps);

    }
}
