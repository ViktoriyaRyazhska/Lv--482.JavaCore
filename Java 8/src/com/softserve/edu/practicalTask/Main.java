package com.softserve.edu.practicalTask;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("---------------------------");
		System.out.println("-------Random list---------");
		System.out.println("---------------------------");
		random.ints().limit(10).forEach(list::add);
		System.out.println(list);
		
		System.out.println("---------------------------");
		System.out.println("-------Sorted list---------");
		System.out.println("---------------------------");
		//random.ints().limit(10).sorted().forEach(System.out::println);
		list=list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("---------------------------");
		System.out.println("-------Biggest number------");
		System.out.println("---------------------------");
		OptionalInt m =list.stream().mapToInt(x-> x).max();
		System.out.println(m.getAsInt());
		
		System.out.println("---------------------------");
		System.out.println("-------Today is a day------");
		System.out.println("---------------------------");
		LocalDateTime a = LocalDateTime.now();
		
		System.out.println("-----------------------------------");
		System.out.println("-------A date of first monday------");
		System.out.println("-----------------------------------");
		System.out.println("today is:"+a.getDayOfWeek());
		LocalDateTime t = a.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(t);
		
		
		Arrays.sort(persons, (p1, p2) -> Person.compareByName(p1,p2));
        System.out.println(Arrays.toString(persons));
        System.out.println();


	}
	public static int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

}
