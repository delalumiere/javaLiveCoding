package DS.java.list.linkedlist.implementation;

public class ArrayList {
	//list data structure를 어떻게 만들것인가
	private Object[] elementData = new Object[100];
	private int size=0;
	public boolean addFirst(Object element) {
		return add(0,element);
	}
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	public boolean add(int index, Object element) {
		for(int i=size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index]=element;
		size++;
		return true;
	}
	public String toString() {
		String str= "[";
		for( int i=0; i<size;i++) {
			str += elementData[i];
			if( i<size-1) {
				str +=",";	
			}
			
		}
		return str + "]";
	}
}
