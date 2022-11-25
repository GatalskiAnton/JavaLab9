package Reader;

import PriorityQueue.PriorityQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import PriorityQueue.*;

public class Reader {
    public static PriorityQueue readElementsFromFile(File file) {
        ArrayList<Pair> elements = new ArrayList<Pair>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                Integer priority = sc.nextInt();
                String element = sc.next();
                Pair<Integer, String> pair = new Pair<>(priority, element);
                elements.add(pair);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        PriorityQueue queue = new PriorityQueue(elements);
        return queue;
    }
}
