package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap23_stream.car.HyundaiCar;

public class _03_BasicStreamEx01 {

	public static void main(String[] args) {
		List<HyundaiCar> hCarList = new ArrayList<>();
		hCarList.add(new HyundaiCar("아반떼", 3000));
		hCarList.add(new HyundaiCar("아반떼", 4500));
		hCarList.add(new HyundaiCar("아반떼", 2500));
		hCarList.add(new HyundaiCar("소나타", 4000));
		hCarList.add(new HyundaiCar("그랜저", 4500));
		hCarList.add(new HyundaiCar("제네시스", 5000));
		
		// 스트림을 이용해서 hCarList에 있는 아반떼만 모여있는 리스트 새로 만들기
		List<HyundaiCar> avanteList = hCarList.stream().filter(HyundaiCar -> HyundaiCar.getModel().equals("아반떼")).toList();

		for(int i=0;i<avanteList.size();i++) {
			System.out.println(avanteList.get(i).getModel() + ", " + avanteList.get(i).getPrice());
		}
	}

}
