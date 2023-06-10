package org.example;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxWordsInSurname;

    public PersonComparator(int maxWordsInSurname) {
        this.maxWordsInSurname = maxWordsInSurname;
    }

    @Override
    public int compare(Person p1, Person p2) {
        int person1SurnameWords = getWordsCount(p1.getSurname());
        person1SurnameWords = Math.min(person1SurnameWords, maxWordsInSurname);

        int person2SurnameWords = getWordsCount(p2.getSurname());
        person2SurnameWords = Math.min(person2SurnameWords, maxWordsInSurname);

        if (person1SurnameWords > person2SurnameWords) {
            return 1;
        }
        if (person1SurnameWords < person2SurnameWords) {
            return -1;
        }

        if (p1.getAge() > p2.getAge())
            return 1;
        if (p1.getAge() < p2.getAge())
            return -1;

        return 0;
    }

    private int getWordsCount(String str) {
        return str.split("[\\s-]").length;
    }
}
