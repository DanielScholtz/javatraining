package collectors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.List;

public class CollectorsTraining {

    public void collectors() {
        List listA = new ArrayList();
        List listB = new LinkedList();
        List listC = new Vector();
        List listD = new Stack();
        List listACopy = new ArrayList();
        Object element = null;

        listA.add("element 1");
        listA.add("element 2");
        listA.add(element);
        listA.add(1, "element 1,5");
        listACopy.addAll(listA);

        String element15 = (String) listA.get(1);
        System.out.println(listA.get(0) + " " + listA.get(1) + " " + listACopy.get(1) + " " + element15);
    }
}
