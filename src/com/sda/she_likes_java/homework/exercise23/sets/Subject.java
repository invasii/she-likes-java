package com.sda.she_likes_java.homework.exercise23.sets;

import java.util.Objects;

public class Subject {
    private String subject;
    private int grade;

    public Subject(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject1 = (Subject) o;
        return grade == subject1.grade && Objects.equals(subject, subject1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, grade);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                ", grade=" + grade +
                '}';
    }
}
