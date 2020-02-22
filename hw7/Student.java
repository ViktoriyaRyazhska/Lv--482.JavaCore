package hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
	
	private String name;
	private int course;
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
		
	public static void main(String[] args) throws IOException {
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write five students (only name) and number of their course:");
		List<Student> students = new ArrayList();
		for (int i = 0; i < 5; i++) {
			String name = reader.readLine();
			int course = Integer.parseInt(reader.readLine());
			Iterator iterator = students.iterator();
			   while(iterator.hasNext()){
			students.add(new Student(name, course));
		}
		}
		System.out.println(students);
		
		students.sort(new StudentByName());
        for (Student sort1 : students) {
            System.out.println("Sorting by name: " + sort1);
        }
        
        students.sort(new StudentByCourse());
        for (Student sort2 : students) {
            System.out.println("Sorting by course: " + sort2);
        }

	}

}
