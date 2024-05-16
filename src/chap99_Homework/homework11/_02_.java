package chap99_Homework.homework11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _02_ {

	public static void main(String[] args) {

		/*
		 * // --------------------배열--------------------
		 * 
		 * // 01
		 * 
		 * int[] arr = new int[10]; for (int i = 0; i < arr.length; i++) { arr[i] = i +
		 * 1; System.out.print(arr[i] + " "); }
		 * 
		 * // 02
		 * 
		 * Scanner sc = new Scanner(System.in); int index = 0; String str; int[] arr =
		 * new int[100]; while (true) { System.out.print("값: "); str = sc.nextLine(); if
		 * (str.equals("a")) break; else { arr[index++] = Integer.parseInt(str); } } for
		 * (int i = 0; i < index; i++) { System.out.print(arr[i] + " "); } sc.close();
		 * 
		 * // 03
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[10]; int sum = 0;
		 * for (int i = 0; i < arr.length; i++) { System.out.print("값: "); arr[i] =
		 * sc.nextInt(); sum += arr[i]; } System.out.println("배열의 평균: " + (sum /
		 * arr.length)); sc.close();
		 * 
		 * // 04
		 * 
		 * int[] arr = new int[50]; int index = 0, sum = 0; for (int i = 1; i <= 100;
		 * i++) { if (i % 2 == 0) arr[index++] = i; } for (int i = 0; i < 50; i++) { sum
		 * += arr[i]; } System.out.println("배열의 합: " + sum);
		 * 
		 * // 05
		 * 
		 * Scanner sc = new Scanner(System.in); int[] arr = new int[10]; for (int i = 0;
		 * i < arr.length; i++) { System.out.print("값: "); arr[i] = sc.nextInt(); }
		 * Arrays.sort(arr); System.out.println("최소값: " + arr[0] + ", 최대값: " + arr[9]);
		 * sc.close();
		 * 
		 * // 06
		 * 
		 * Scanner sc = new Scanner(System.in); String[] arr = new String[5]; int min =
		 * arr[0].length(); int max = arr[0].length(); String str = "", str1 = "", str2
		 * = ""; for (int i = 0; i < 5; i++) { System.out.print("문자열: "); arr[i] =
		 * sc.nextLine(); } for (int i = 0; i < 5; i++) { if (arr[i].length() > max) {
		 * max = arr[i].length(); str1 = arr[i]; } if (arr[i].length() < min) { min =
		 * arr[i].length(); str2 = arr[i]; } } System.out.println("길이가 긴 문자열: " + str1 +
		 * ", 길이가 작은 문자열: " + str2); sc.close();
		 * 
		 * // 07
		 * 
		 * int[] arr1 = new int[4]; int[] arr2 = new int[3]; int[] result = new int[7];
		 * Random rnd = new Random(); for (int i = 0; i < arr1.length; i++) { arr1[i] =
		 * rnd.nextInt(100) + 1; } for (int i = 0; i < arr2.length; i++) { arr2[i] =
		 * rnd.nextInt(100) + 1; } for (int i = 0; i < arr1.length; i++) { result[i] =
		 * arr1[i]; } for (int i = 0; i < arr2.length; i++) { result[i + arr1.length] =
		 * arr2[i]; } for (int i = 0; i < result.length; i++) {
		 * System.out.print(result[i] + " "); }
		 * 
		 * // 08
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.print("문자열: "); String[] arr
		 * = sc.nextLine().split("-"); int max = 0, index = 0; for (int i = 0; i <
		 * arr.length; i++) { if (arr[i].length() > max) { max = arr[i].length(); index
		 * = i; } } System.out.println("인덱스: " + index + ", 문자열: " + arr[index]);
		 * sc.close();
		 * 
		 * // --------------------클래스--------------------
		 * 
		 * // 01
		 * 
		 * Student s = new Student(); s.setStudentInfo("민수정", 20201944, "컴퓨터학부");
		 * s.printStudentInfo();
		 * 
		 * // 02
		 * 
		 * Book b = new Book(); b.setBookInfo("안드로이드는 전기양의 꿈을 꾸는가?", "필립 K. 딕", "폴라북스",
		 * 18000); b.printBookInfo();
		 * 
		 * // 03 System.out.println(concat("abc", "def"));
		 * 
		 * // 04 System.out.println(mul(5, 3.14159265));
		 * 
		 * // 05
		 * 
		 * Circle c = new Circle(10); System.out.println("넓이: " + c.getArea() + ", 둘레: "
		 * + c.getCircumference());
		 * 
		 * // 06
		 * 
		 * BankAccount ba = new BankAccount(10000L); ba.balanceInquiry();
		 * ba.deposit(50000L); ba.balanceInquiry(); ba.withdraw(5000L);
		 * ba.balanceInquiry();
		 * 
		 * // 07
		 * 
		 * Add a = new Add(); System.out.println(a.add(3, 5));
		 * System.out.println(a.add(1, 2, 3));
		 * 
		 * // --------------------상속--------------------
		 * 
		 * // 01
		 * 
		 * // 02
		 * 
		 * Arbeit a = new Arbeit(5, 9860); a.work(); Arbeit b = new Cashier(5, 8800);
		 * b.work(); Arbeit c = new Coupangman(5, 10030); c.work();
		 * 
		 * // 03
		 * 
		 * CivilServant c = new CivilServant(); c.goToWork(); c.work(); c.backToHome();
		 * Developer d = new Developer(); d.goToWork(); d.work(); d.backToHome();
		 * 
		 * // 04
		 * 
		 * FreeBoard f = new FreeBoard(); f.save(); f.edit(); f.delete(); f.view();
		 * 
		 * NoticeBoard n = new NoticeBoard(); n.save(); n.edit(); n.delete(); n.view();
		 * 
		 * // --------------------컬렉션--------------------
		 * 
		 * // 01
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * Map<String, String> voca = new HashMap<>(); voca.put("book", "책");
		 * voca.put("pencil", "연필"); voca.put("eraser", "지우개"); voca.put("ruler", "자");
		 * voca.put("laptop", "노트북");
		 * 
		 * System.out.print("문자열: "); String str = sc.nextLine();
		 * 
		 * if (voca.containsKey(str)) System.out.println(str + " : " + voca.get(str));
		 * sc.close();
		 * 
		 * // 02
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * Map<String, Integer> menu = new HashMap<>(); menu.put("딤섬", 6000);
		 * menu.put("볶음밥", 7000); menu.put("떡볶이", 3000); menu.put("카레", 8000);
		 * menu.put("샐러드", 5000);
		 * 
		 * System.out.print("문자열: "); String str = sc.nextLine();
		 * System.out.print("값: "); int num = sc.nextInt();
		 * 
		 * if (menu.containsKey(str)) System.out.println("최종금액 : " + (menu.get(str) *
		 * num) + "원"); sc.close();
		 * 
		 * // 03
		 * 
		 * Map<String, Integer> student = new HashMap<>(); student.put("김상희", 90);
		 * student.put("민수정", 70); student.put("민경선", 100); student.put("민성원", 50);
		 * 
		 * Set<Entry<String, Integer>> entrySet = student.entrySet();
		 * Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		 * 
		 * while (iterator.hasNext()) { Entry<String, Integer> entry = iterator.next();
		 * if (entry.getValue() >= 90) { System.out.println(entry.getKey()); } }
		 * 
		 * // 04
		 * 
		 * Map<String, Integer> student = new HashMap<>(); student.put("김상희", 80);
		 * student.put("민수정", 70); student.put("민경선", 100); student.put("민성원", 50);
		 * 
		 * Set<Entry<String, Integer>> entrySet = student.entrySet();
		 * Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		 * 
		 * int max = 0; String name = "";
		 * 
		 * while (iterator.hasNext()) { Entry<String, Integer> entry = iterator.next();
		 * if (entry.getValue() > max) { name = entry.getKey(); max = entry.getValue();
		 * } }
		 * 
		 * System.out.println(name + " : " + max);
		 * 
		 * // 05
		 * 
		 * Scanner sc = new Scanner(System.in); List<String> list = new ArrayList<>();
		 * list.add("java"); list.add("python"); list.add("c++");
		 * System.out.print("문자열: "); String str = sc.nextLine();
		 * System.out.println("인덱스: " + list.indexOf(str)); sc.close();
		 * 
		 * // 06
		 * 
		 * List<Integer> list = new ArrayList<>(); list.add(1); list.add(2);
		 * list.add(3); list.add(3); list.add(3); list.add(6); list.add(7); list.add(8);
		 * list.add(9); list.add(9);
		 * 
		 * Set<Integer> set = new HashSet<>(list); for (Integer i : set) {
		 * System.out.print(i + " "); }
		 * 
		 * // 07
		 * 
		 * Map<String, Integer> hyundai = new HashMap<>(); hyundai.put("아반떼", 5000);
		 * hyundai.put("소나타", 10000); hyundai.put("그랜저", 3000);
		 * 
		 * Map<String, Integer> kia = new HashMap<>(); kia.put("k5", 5000);
		 * kia.put("k7", 4000); kia.put("k9", 6000);
		 * 
		 * List<Map.Entry<String, Integer>> list = new ArrayList<>();
		 * 
		 * Map.Entry<String, Integer> hMap = null; for (Map.Entry<String, Integer> entry
		 * : hyundai.entrySet()) { if (hMap == null || entry.getValue() >
		 * hMap.getValue()) { hMap = entry; } } list.add(hMap);
		 * 
		 * Map.Entry<String, Integer> kMap = null; for (Map.Entry<String, Integer> entry
		 * : kia.entrySet()) { if (kMap == null || entry.getValue() > kMap.getValue()) {
		 * kMap = entry; } } list.add(kMap);
		 * 
		 * for (Map.Entry<String, Integer> entry : list)
		 * System.out.println(entry.getKey() + " : " + entry.getValue());
		 */

	}

	public static String concat(String str1, String str2) {
		return "" + str1 + str2;
	}

	public static double mul(int num1, double num2) {
		return Math.round(num1 * num2 * 100) / 100.0;
	}

}
