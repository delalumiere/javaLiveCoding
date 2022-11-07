package DS.java.list.linkedlist.implementation;

public class ArrayList {
//list data structure를 어떻게 만들것인가
	private Object[] elementData = new Object[100];
	private int size=0;
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
}
