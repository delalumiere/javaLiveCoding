package DS.java.ArrayAPI;

public class DS_api {

	public static void main(String [] args) {
		int [] numbers1= {10,20,30,40};
		int [] numbers2 = {10,20,30,40};
		int [] numbers3= new int [] {10,20,30,40};
		
		//배열의 반복 > Iteration 으로 처리 
		System.out.println(numbers1.length);
		
		//while 
		int i=0;
		
		while(numbers1.length>i) {
			System.out.println(numbers1[i]);
			i++;
		}
		System.out.println();
		for( i=0; numbers1.length>i ; i++ ) {
			System.out.println(numbers1[i]);
		}
	}
}
