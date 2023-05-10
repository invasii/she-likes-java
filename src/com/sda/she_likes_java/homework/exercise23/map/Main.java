package com.sda.she_likes_java.homework.exercise23.map;

import com.sda.she_likes_java.homework.exercise23.sets.Pupil;
import com.sda.she_likes_java.homework.exercise23.sets.Subject;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("The school journal with pupil names and grades of subjects");
        Map<Pupil, Subject> schoolJournal = new HashMap<>();
        schoolJournal.put(new Pupil("Olive", "Yew"), new Subject("Literature", 7));
        schoolJournal.put(new Pupil("Aida", "Bug"), new Subject("Literature", 9));
        schoolJournal.put(new Pupil("Mike", "Olucky"), new Subject("Literature", 5));
        schoolJournal.put(new Pupil("Teri", "Dacys"), new Subject("Literature", 8));
        schoolJournal.put(new Pupil("Peggy", "Kaytlins"), new Subject("Literature", 8));
        schoolJournal.put(new Pupil("Eduardo", "Chan"), new Subject("Literature", 9));
        schoolJournal.put(new Pupil("Forest", "Cherry"), new Subject("Literature", 10));
        schoolJournal.put(new Pupil("Lon", "Rich"), new Subject("Literature", 9));
        schoolJournal.put(new Pupil("Pat", "McKay"), new Subject("Literature", 7));
        schoolJournal.put(new Pupil("Sam", "Crowford"), new Subject("Literature", 8));
        printSchoolJournal(schoolJournal);
    }

    private static void printSchoolJournal(Map<Pupil, Subject> schoolJournal) {
        System.out.println("Printing school journal information about pupils results in Literature together with their names");
        for (Map.Entry<Pupil, Subject> item : schoolJournal.entrySet()) {
            System.out.println(" " + item.getKey());
            System.out.println(" " + item.getValue());

        }
    }
}
