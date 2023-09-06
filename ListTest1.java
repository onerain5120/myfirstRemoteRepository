package collection1;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		
		// 자료의 갯수를 고정하지 않은 상태에서 저장하는 자료구조는 List (인터페이스)
		
		// List 인터페이스를 구현한 ArrayList 가 된다.
		// ArrayList 객체를 만들어보겠습니다.
		
		
		// generic 포괄적인 <>쓰시고, 기본형을 객체로 감싼 타입인 wrapper 클래스인 Integer, Double
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
//		System.out.println(arraylist);
		arraylist.add(30);
		
//		System.out.println(arraylist);
		
		arraylist.add(40);
		
//		System.out.println(arraylist);
		
		arraylist.add(50);
		
//		System.out.println(arraylist);
		
		arraylist.add(60);
		
//		System.out.println(arraylist);
		
		arraylist.add(70);
		
//		System.out.println(arraylist);
		
		
		
		
		int tot = 0;
		int avg;
//		// 1) 인덱싱으로 값 가져와서 누적은 좀 더 배운 후
//		for ( int i = 0 ; i < arraylist.size() ; i++ ) {
//			int value = arraylist.get(i);
//			tot += value;
//		}
		
		// 2) 향상된 for문을 한 번 사용해보자...
		for( int value : arraylist) {
			tot += value;
		}
		
		avg = tot / arraylist.size();
		System.out.println(tot);
		System.out.println(avg);
	}

}
