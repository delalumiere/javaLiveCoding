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
			///요소 순회시 , 추가
			if( i<size-1) { 
				str +=",";	
			}
			//요소 순회시 마지막 요소에는 바로출력
		}
		return str + "]";
	}
	
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i=index+1 ; i<=size-1; i++) {
			elementData[i-1]=elementData[i];
		}
		size--;
		elementData[size] =null;
		return removed;
		
	}
	public Object removeFirst() {
		return remove(0);
	}
	
	public Object removeLast() {
		return remove(size-1);
	}
	
	public Object get(int index) {
		return elementData[index];
	}
}
