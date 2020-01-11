package com.generic.part2;

import java.util.Arrays;

public class ArrayProblem {

  public static void main(String[] args) {

    Person bob = new Person("Bob", 23);
    Person john = new Person("John", 35);

    Person[] persons = {bob, john};
    System.out.println(Arrays.toString(persons));

    Person maria = new Person("Maria", 18);

    // persons[2]=maria;
    // System.out.println(Arrays.toString(persons));
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2

    // implement add() method for adding new element to array
    persons = add(maria, persons);

    System.out.println(Arrays.toString(persons));

  }

  private static Person[] add(final Person maria, Person[] persons) {
    final int length = persons.length;
    persons = Arrays.copyOf(persons, length + 1);
    persons[length] = maria;
    return persons;
  }

}
