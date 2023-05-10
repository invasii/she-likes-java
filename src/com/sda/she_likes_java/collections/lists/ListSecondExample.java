package com.sda.she_likes_java.collections.lists;





import com.sda.she_likes_java.collections.Person;

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

        System.out.println("Let's play with names");
        List<Person> personList = List.of(
                new Person("Johny", "Black"),
                new Person("Leo", "Black"),
                new Person("Ivan", "Black"),
                new Person("Johny", "White"),
                new Person("Johny", "Green")
        );
        List<Person> foundPersons = findPersonsByName(personList, "Johny"); // finding the names in the list
        System.out.println("Persons with name Johny: " + foundPersons);               // it can be used with grades and other
        foundPersons = findPersonsByName(personList, "John");              // below is the function
        System.out.println("Persons with name John: " + foundPersons);                // 'finding items in the list'
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

    // finding item inside list

    public static List<Person> findPersonsByName(List<Person> persons, String nameToFind) {

        // 1. create empty result
        List<Person> result = new ArrayList<>();

        // 2. iterate the list
        for (Person person : persons) {

            // 3. if person has proper name - add it to the list (to the result)
            if (person.getName().equals(nameToFind)) {
                result.add(person);
            }
        }

        // 4. return result
        return result;
    }
}
