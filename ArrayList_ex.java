/* ArrayList
 * : ArrayList는 [객체를 담기 위한 클래스이다.]   해당 클래스는 java.util패키지에
 *   존재한다. 이를 사용하기 위해서는 import를 통해 해당 클래스를 가져와야 한다. */

import java.util.ArrayList;
public class ArrayList_ex {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Evan");
		names.add("Eugene");
		names.add("Adam");
		
		/*  []  --> []      []       [] 
		 * names     ↓       ↓        ↓
		 * 		  "Evan"  "Eugene"  "Adam" */
		
		// ArrayList의 size(요소들의 갯수) 를 출력.
		System.out.printf("names.size(): %d\n", names.size());
		// 해당 인덱스 위치의 값이 출력. -> "Evan"
		System.out.printf("names.get(0): %s\n", names.get(0));
		// 해당 인덱스 위치의 값이 출력  -> "Eugene"
		System.out.printf("names.get(1): %s\n", names.get(1));
		
		// 해당 인덱스의 값이 다음 값으로 변경.
		names.set(0, "Paul"); 
		/* 해당 인덱스 위치의 값을 지우고, 공간이 당겨짐. (일반 배열에서는 지우면 그 값이 사라지고 그 공간이
		 * 이빨이 빠진채로 남음.)*/
		names.remove(1);
		
		for(String name : names)
			System.out.println(name);
		
	}
}
