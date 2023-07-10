package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> nums = new LinkedList<>();
        for (Integer num: sourceList){
            if (num%2==0){
                nums.add(num);
            }else nums.add(0, num);
        }
        return nums;
    }
}
