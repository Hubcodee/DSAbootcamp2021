/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.*/
//https://leetcode.com/problems/count-items-matching-a-rule/

package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countitemsrule {
    public static void main(String[] args) {
        ArrayList <List <String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        int index=0,count =0;

        if(ruleKey.equals("color")) index=1;

        else if(ruleKey.equals("name")) index=2;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue))
                count++;
        }
        System.out.println(count);
    }
}
