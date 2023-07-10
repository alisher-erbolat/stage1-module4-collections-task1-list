package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {

        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer q = Integer.parseInt(a);
        int w = Integer.parseInt(b);
        if (Math.abs(q)==Math.abs(w)){
            return q.compareTo(w);
        }else{
            q = Math.abs(q);
            w = Math.abs(w);
            return q.compareTo(w);
        }
    }
}
