package hw_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	public static class StudentByCourse implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
	public static class StudentByName implements Comparator<Student> {
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	private int course;
	private String name;

	public Student(int course, String name) {
		this.course = course;
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "course=" + course + " name=" + name;
	}
}

public class ApplSort {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add( new Student(1, "Ivan"));
		list.add( new Student(2, "Petro"));
		list.add( new Student(1, "Anna"));
		list.add( new Student(3, "Oleh"));
		list.add( new Student(2, "Ira"));
		
		
		System.out.println("Original List: " + list);
		Collections.sort(list, new Student.StudentByCourse());
		System.out.println("Sorted List (by course) : " + list);
		Collections.sort(list, new Student.StudentByName());
		System.out.println("Sorted List (by name) : " + list);
	}

}
