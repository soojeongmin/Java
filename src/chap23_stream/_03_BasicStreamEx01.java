package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
		//List<HyundaiCar> avanteList = hCarList.stream().filter(HyundaiCar -> HyundaiCar.getModel().equals("아반떼")).toList();
		
		// mapToInt(): int만 모여있는 스트림으로 변환
		// IntStream priceStream = hCarList.stream().filter(HyundaiCar -> HyundaiCar.getModel().equals("아반떼")).mapToInt(avante->avante.getPrice());
		
		
//		for(int i=0;i<avanteList.size();i++) {
//			System.out.println(avanteList.get(i).toString());
//		}
		
		// avanteList.toString();
		
		//int priceSum = priceStream.sum();
		//System.out.println("총가격:"+priceSum);
		
		// 3.파이프라인으로 구성
		// 파이프라인으로 구성되면 최종단계 메소드의 리턴값이 리턴되기 떄문ㅇ
		// 최종단계 메소드가 리턴하는 타입의 변수로 값을 단아준다.
		// 최종처리 단계가 존재하지 않으면 중간단계들은 의미가 없어지기 때문에
		// 항상 최종처리 단계를 추가한다. 
		int priceSum1 = hCarList.stream()
				.filter(hCar->hCar.getModel().equals("아반떼"))
				.mapToInt(avante->avante.getPrice())
				.sum();
		
		System.out.println(priceSum1);
	}

}
