package chap99_Homework.homework04;

import java.util.Scanner;

public class UseOfEmployee {
	public static Employee generateEmployee(Scanner sc, int menuSelect) {
		System.out.print("사번을 입력하세요: ");
		int eno = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("급여를 입력하세요: ");
		int pay = sc.nextInt();
		
		if(menuSelect==1) {
			System.out.print("보너스를 입력하세요: ");
			int bonus = sc.nextInt();
			return new Permanent(eno, name, pay, menuSelect, bonus);
		} 
		else if(menuSelect==2) {
			System.out.print("근무년수를 입력하세요: ");
			int hireYear = sc.nextInt();
			return new Temporary(eno, name, pay, menuSelect, hireYear); 
		}
		else {
			System.out.print("근무일수를 입력하세요: ");
			int workDay = sc.nextInt();
			return new Contract(eno, name, pay, menuSelect, workDay); 
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empArr = new Employee[100];
		Scanner sc = new Scanner(System.in);
		int eno;
		String name;
		int pay;
		int bonus;
		int hireYear;
		int workDay;
		int index = 0;
		
		int menuSelect;
		
		while(true) {
			System.out.println("*** 메뉴 선택 ***");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 사원 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			System.out.print("선택: ");
			menuSelect = sc.nextInt();
			if(menuSelect==1 || menuSelect==2 || menuSelect==3) {
				empArr[index++] = generateEmployee(sc, menuSelect);
				System.out.println("저장되었습니다.");
			}
			else if(menuSelect==4) {
				for(int i=0;i<index;i++) {
					empArr[i].showEmployeeInfo();
					System.out.println();
				}
			}
			else if(menuSelect==5) {
				System.out.print("검색할 사원의 사번을 입력하세요: ");
				eno = sc.nextInt();
				for(int i=0;i<index;i++) {
					if(empArr[i].getEno()==eno)
						empArr[i].showEmployeeInfo();
						System.out.println();
				}
			}
			else if(menuSelect==6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
