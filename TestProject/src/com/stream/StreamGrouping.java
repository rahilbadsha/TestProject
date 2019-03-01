package com.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGrouping {
	
	static class Person {

        private String name;
        private int age;
        private long salary;

        Person(String name, int age, long salary) {

            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public long getSalary() {
			return salary;
		}

		public void setSalary(long salary) {
			this.salary = salary;
		}

		@Override
        public String toString() {
            return String.format("Person{name='%s', age=%d, salary=%d}", name, age, salary);
        }
    }

	public static void main(String[] args) {
		Stream<Person> people = Stream.of(new Person("Paul", 24, 20000),
                new Person("Mark", 30, 30000),
                new Person("Will", 28, 28000),
                new Person("William", 28, 28000));
		 Map<Integer, List<Person>> peopleByAge;
		//Map<Integer, Map<String, List<Person>>> pp=people.collect(Collectors.groupingBy(Person::getAge,Collectors.groupingBy(Person::getName)));
	//	Set<String>setString=
				people.collect(Collectors.toMap(Person::getName, Person::getAge)).entrySet().forEach(System.out::println);
		//setString.
	}

}
