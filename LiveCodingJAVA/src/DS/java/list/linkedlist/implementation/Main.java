package DS.java.list.linkedlist.implementation;



public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		System.out.println(numbers);
// 		numbers.removeLast();
//		numbers.remove(1);
//		System.out.println(numbers.remove(1));
//		System.out.println(numbers.get(0));
//		System.out.println(numbers.get(1));
//		System.out.println(numbers.get(2));
//		System.out.println(numbers.get(3));
		// size() method 구현 이유 > 캡슐레이션으로 외부에서 값을 변경할 수 없도록 하기 위해서 
//		System.out.println(numbers.size()); 
		System.out.println(numbers.indexOf(50));
		
	}

}
