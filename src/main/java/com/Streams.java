package com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		list.add("vijay");
		list.add("Avinash");
		list.add("Ganga");
		
		//creating a stream instead of creating it from list
		Stream.of("Ravee","Manasa","gagana");
		
		//steps 1. creating stream 2.applying intermediate opertaions 3.applying Terminal Operation
		//if intermediate operation return false then no execution in external operation
		//if predicate condition is longer than one line then could be returned in braces{}
		
		//counting the names which starts from alphabatic A
		long count = list.stream().filter(names->
		{
			names.startsWith("A");
			return false;
		}).count();
		
		System.out.println(count);
		
		//Print all the names in list 
		System.out.println(list.stream().count());
		
		//print the names wnere the length of th string is greater than 4
		
		list.stream().filter(names->names.length()>4).forEach(names->System.out.println(names));
		
		//how to sort alphabatically
		
		list.stream().sorted().forEach(s->System.out.println(s));
		
		//convert names to upppercase and sort the result
		list.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//if find any match with given string then it returns true
		boolean flag = list.stream().anyMatch(s->s.equalsIgnoreCase("Ganga"));
		Assert.assertTrue(flag);
		
		//merging two array
		
		Stream<String> stream1 = Arrays.asList("Manu","Dhaanu","Sonu").stream();
		Stream<String> stream2 = Arrays.asList("Viji").stream();
		//Stream.concat(stream1, stream2).forEach(s->System.out.print(s));
		
		
		//stream collect
		List<String> ls = stream1.sorted().limit(1).collect(Collectors.toList());
		System.out.println(ls);
		
		//print unique number from this array
		//sort the array
		List<Integer> listInteger = Arrays.asList(3,2,2,7,5,1,9,7);
		System.out.println("printing the unique and sorted array");
		//one way to use distinct()
		listInteger.stream().distinct().sorted().forEach(s->System.out.println(s));
		//Another way to use set
		System.out.println(listInteger.stream().sorted().collect(Collectors.toSet()));
	}

	
}
