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
		// size() method ���� ���� > ĸ�����̼����� �ܺο��� ���� ������ �� ������ �ϱ� ���ؼ� 
//		System.out.println(numbers.size()); 
//		System.out.println(numbers.indexOf(50));
		
//Iterator �� ����ؼ� List��ü�� ó���� �� �ִ�. 
// data type�� numbers�� Ŭ������ �����Ѵ�. Listiterator
		ArrayList.ListIterator li = numbers.listIterator(); 
//numbers ArrayList ��ü�̸�
//ListerIterator�� ��ü�� Ÿ�� 
//ArrayList.ListerIterator�� ArrayList�ȿ� ���Ե� ListIterator
//listIterator()�� �޼ҵ���	
//	System.out.println(li.next());
//	System.out.println(li.next());
//	System.out.println(li.next());
//	System.out.println(li.next());
//	System.out.println(li.next());
	//ó��ȣ���ϸ� 10 �״��� 20 ... 
		
	//li.next() �ڵ�ȭ
	//while(����)	
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	
	}

}
