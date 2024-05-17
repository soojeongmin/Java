package chap99_Homework.homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class _02_Middle {

	public static void main(String[] args) {
		// 01
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		Stream<Student> studentStream = studentList.stream().filter(student->student.getScore()>=95);
		studentStream.forEach(student->student.studentInfo());
		
		
		// 02
		studentStream = studentList.stream().filter(student->student.getScore()>=95);
		studentStream.forEach(student->{student.setGrade("A"); student.studentInfo();});
		
		
		// 03
//		Scanner sc = new Scanner(System.in);
//		List<Character> cList = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			System.out.print("문자: ");
//			cList.add(sc.nextLine().charAt(0));
//		}
//		Stream<Character> cStream = cList.stream().map(c -> {if(c.isLowerCase(c)) return c.toUpperCase(c); else return c.toLowerCase(c);});
//		cStream.forEach(c->System.out.print(c+" "));
//		sc.close();
	}

}
