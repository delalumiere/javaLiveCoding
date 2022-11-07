package DS.java.ListAPI;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDataStrutureEX {

	public static void main(String[] args) {

		//JAVA는 List를 두개 지원한다.
		// ArrayList 추가삭제 느림 
		// LinkedList
		// index 조회시 느림

		ArrayList<Integer> numbers= new ArrayList<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(값)");
		System.out.println(numbers);
		
		numbers.add(1,50);
		System.out.println("\nadd(인덱스,값)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(인덱스)");
		System.out.println(numbers);
		
		System.out.println("\nget(인덱스)");
		System.out.println(numbers.get(2));
		
		Iterator it=numbers.iterator();
		
		while(it.hasNext()) {
			int value =(Integer)it.next();
			if(value==300) {
				it.remove();
			}
			System.out.println(value);
		}
//		System.out.println("==numbers value==");
//		for(int value:numbers) {
//			System.out.println(value);
//		}
		
	}

}