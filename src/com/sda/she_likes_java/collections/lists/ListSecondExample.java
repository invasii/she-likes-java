package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListSecondExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // this is our object - the same object (names and stringList) are different references for the same object
        names.add("Karolina");
        names.add("Ramune");
        names.add("Inese");
        names.add("Agnese");
        names.add(3, "Agnese F."); // number 3 - the position of the value (name)
        // we cannot add higher number of index than existent elements
        //in this case the index cannot be 4 and higher
        List<String> anotherList = names; // anotherList is the reference to the same list (object)

        printNames(names);
        System.out.println("-----------------------");
        printOnlySomeNames(names);
        System.out.println("------------------------");
        printNamesWithSemicolon(names);
        System.out.println("Let's add some name to the list");
        addName(names);
        printNames(names);
    }
    public static void printNames(List<String> names) {
        for (String singleName : names ) {
            System.out.println("name is: " + singleName);
        }
    }
    public static void printOnlySomeNames(List<String> names) {
        // starting from position no 1 - second item
        for (int idex = 1; idex < names.size() -1; idex++) {
            System.out.println("name is : " + names.get(idex));
        }
    }

    // name1, name2, name3 order of listing
    public static void printNamesWithSemicolon(List<String> names){
        String result = names.get(0);
        for(int i = 1; i< names.size(); i++){
            result += "; " + names.get(i) ;
        }
        System.out.println(result);
    }

     // add name to the existing list
    public static void addName(List<String> stringList) {
        stringList.add("Kitija");

    }
}
