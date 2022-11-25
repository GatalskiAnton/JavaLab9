import PriorityQueue.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(0, "Pair1");
        Pair<Integer, String> p2 = new Pair<Integer, String>(1, "Pair2");
        Pair<Integer, String> p3 = new Pair<Integer, String>(2, "Pair3");

        ArrayList<Pair<Integer, String>> ps = new ArrayList<Pair<Integer, String>>();
        ps.add(p3);
        ps.add(p1);
        ps.add(p2);

        PriorityQueue<Integer, String> queue = new PriorityQueue<Integer, String>(ps);

        Pair<Integer, String> p4 = new Pair<Integer, String>(3, "Pair4");
        Pair<Integer, String> p5 = new Pair<Integer, String>(6, "Pair5");
        Pair<Integer, String> p6 = new Pair<Integer, String>(9, "Pair6");

        ArrayList<Pair<Integer, String>> ps2 = new ArrayList<Pair<Integer, String>>();
        ps2.add(p5);
        ps2.add(p4);

        queue.insertAll(ps2);
        queue.insert(p6);

        DefaultListModel model = queue.toListModel();

        System.out.println(queue);

        while (!queue.getIterator().isDone())
            System.out.println(queue.getIterator().next());
    }
}
