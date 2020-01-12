package com.generic.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {

    Person bob = new Person("Bob", 23);
    Person john = new Person("John", 35);

    List<Person> persons = new ArrayList<>();
    persons.add(bob);
    persons.add(john);
    System.out.println(persons);

    Person maria = new Person("Maria", 18);
    persons.add(maria);
    System.out.println(persons);

    /* For Loop */
    System.out.println("*****************");

    for (int i = 0; i < persons.size(); i++) {
      final Person person = persons.get(i);
      System.out.println(person);
    }

    /* Iterator */
    System.out.println("*****************");

    final Iterator<Person> iterator = persons.iterator();

    while (iterator.hasNext()) {
      final Person person = iterator.next();
      System.out.println(person);
    }

    /* Java 5 */
    System.out.println("*****************");

    for (Person person : persons) {
      System.out.println(person);
    }
  }



}
