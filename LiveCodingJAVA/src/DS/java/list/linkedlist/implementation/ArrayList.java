package DS.java.list.linkedlist.implementation;

public class ArrayList {
	//list data structure�� ��� ������ΰ�
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
			///��� ��ȸ�� , �߰�
			if( i<size-1) { 
				str +=",";	
			}
			//��� ��ȸ�� ������ ��ҿ��� �ٷ����
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
		//list �� element �� ��ȸ�ϴ� for loop
		for( int i=0;i<size;i++) {
			// o�� elementData �� i��(�ε�����) ���ٸ�
			if(o.equals(elementData[i])) {
				return i; // index���� ����
			}
		}
		return -1; //������ -1�� return ���ش�
	}

	public ListIterator listIterator() {
		//         ������ ������Ÿ��  �޼ҵ� �̸�  		
		return new ListIterator();
	}

	class ListIterator {
		private int nextIndex =0;
		public Object next() {
			//arraylist�� elementData�� �ִ� �����͸� ���Ϲ޾ƾߵ� 
			// �ε��� ���� �ϴ� ��� nextȣ���Ҷ����� index���� 1�� ������Ŵ
			/*		Object returnData = elementData[nextIndex]; //ó������ nextIndex 0
			nextIndex++; //�ε������� 1 ������Ŵ
			return returnData; // ���� �������� ������
			 */
			return elementData[nextIndex++]; //nextIndex ���� 100�� �����ϸ� ArrayIndex outbound exception�����߻�
		}
		// nextIndex ���� ���ప�� �����ϰ�	
		//hasNext����
		public boolean hasNext() {
			// nextIndex�� ������Ʈ�� ���ں��� ���ٸ� next�� �̿��ؼ� Ž���� ������Ʈ�� �����ϴ� ���̱� ������ true�� �����մϴ�. 
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
