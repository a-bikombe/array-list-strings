package Test2;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();    // create an ArrayList to store strings
        stringList.add("abcde");    // add strings into the ArrayList
        stringList.add("abc");
        stringList.add("xyz");
        stringList.add("jklm");
        stringList.add("null");

        getShortestString(stringList);  // declares getShortestString method
    }

    public static String getShortestString(ArrayList<String> stringList) {
        
        int i;
        String holder, newTest;
        holder = "h";
        
        for (i = 0; i < stringList.size(); i++) {
            newTest = stringList.get(i);
            if (newTest.length() < holder.length()) {
                holder = newTest;
                System.out.println(holder);
            } else if (newTest.contains("null")) {
                holder = "null";
            }
        }
        
        return holder;
    }
}

// what if -- if i+1 has a larger size than i, return i

// returns shortest string from list of strings
// if 2+ strings have same number of characters, returns first string
// if string is "null" or contains zero strings, method returns "null"