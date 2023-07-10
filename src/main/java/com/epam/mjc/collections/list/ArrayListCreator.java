package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> duplicates = new ArrayList<>();
        for (int i = 1; i <= sourceList.size(); i++) {
            if (i%3==0){
                duplicates.add(sourceList.get(i-1));
                duplicates.add(sourceList.get(i-1));
            }
        }return duplicates;
    }
}
