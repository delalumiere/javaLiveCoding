package DS.java.list.linkedlist.implementation;


public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
//		System.out.println(numbers);
// 		numbers.removeLast();
//		numbers.remove(1);
//		System.out.println(numbers.remove(1));
//		System.out.println(numbers.get(0));
//		System.out.println(numbers.get(1));
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.get(3));
		// size() method 구현 이유 > 캡슐레이션으로 외부에서 값을 변경할 수 없도록 하기 위해서 
//		System.out.println(numbers.size()); 
//		System.out.println(numbers.indexOf(50));
		
//Iterator 를 사용해서 List객체를 처리할 수 있다. 
// data type은 numbers의 클래스를 지정한다. Listiterator
		ArrayList.ListIterator li = numbers.listIterator(); 
//numbers ArrayList 객체이름
//ListerIterator는 객체의 타입 
//ArrayList.ListerIterator는 ArrayList안에 포함될 ListIterator
//listIterator()는 메소드임	
//	System.out.println(li.next());
//	System.out.println(li.next());
//	System.out.println(li.next());
//	System.out.println(li.next());
//	System.out.println(li.next());
	//처음호출하면 10 그다음 20 ... 
		
	//li.next() 자동화
	//while(조건)	
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
	}

}
