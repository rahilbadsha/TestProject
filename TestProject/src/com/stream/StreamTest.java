package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.pojo.Person;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1= new Person("Rahil", "Badsha", 234545);
		Person p2= new Person("Amol", "Mishra",45435);
		Person p3= new Person("Sujoy", "Jain",23234);
		Person p4= new Person("Kollal","Sen", 5646);
		
		List<Person> listOfPerson= Arrays.asList(p1,p2,p3,p4);
		
		Map<Integer, List<Person>> map=listOfPerson.stream().collect(Collectors.groupingBy((Person p)-> p.getId()));
		
		map.entrySet().stream().forEach(entry-> {
			
			System.out.println("Key of Map is "+entry.getKey());
			System.out.println("Value is "+entry.getValue());
		});
		
	}
}
