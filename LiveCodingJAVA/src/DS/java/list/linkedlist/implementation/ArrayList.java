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

	public int size() {
		return size;
	}

	public int indexOf(Object o) {
		//list 의 element 를 순회하는 for loop
		for( int i=0;i<size;i++) {
			// o와 elementData 의 i값(인덱스가) 같다면
			if(o.equals(elementData[i])) {
				return i; // index값을 리턴
			}
		}
		return -1; //없으면 -1을 return 해준다
	}

	public ListIterator listIterator() {
		//         리턴할 데이터타입  메소드 이름  		
		return new ListIterator();
	}

	class ListIterator {
		private int nextIndex =0;
		public Object next() {
			//arraylist의 elementData에 있는 데이터를 리턴받아야됨 
			// 인덱스 추출 하는 방법 next호출할때마다 index값을 1씩 증가시킴
			/*		Object returnData = elementData[nextIndex]; //처음에는 nextIndex 0
			nextIndex++; //인덱스값을 1 증가시킴
			return returnData; // 값을 증가시켜 리턴함
			 */
			return elementData[nextIndex++]; //nextIndex 값이 100에 도달하면 ArrayIndex outbound exception에러발생
		}
		// nextIndex 값을 실행값을 간단하게	
		//hasNext구현
		public boolean hasNext() {
			// nextIndex가 엘리먼트의 숫자보다 적다면 next를 이용해서 탐색할 엘리먼트가 존재하는 것이기 때문에 true를 리턴합니다. 
			return nextIndex < size();
		}
	
		public Object previous() {
			return elementData[--nextIndex];
		}
		public boolean hasPrevious() {
			return nextIndex > 0;
		}
		//
	}

}
