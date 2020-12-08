/* ArrayList
 * : ArrayList�� [��ü�� ��� ���� Ŭ�����̴�.]   �ش� Ŭ������ java.util��Ű����
 *   �����Ѵ�. �̸� ����ϱ� ���ؼ��� import�� ���� �ش� Ŭ������ �����;� �Ѵ�. */

import java.util.ArrayList;
public class ArrayList_ex {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Evan");
		names.add("Eugene");
		names.add("Adam");
		
		/*  []  --> []      []       [] 
		 * names     ��       ��        ��
		 * 		  "Evan"  "Eugene"  "Adam" */
		
		// ArrayList�� size(��ҵ��� ����) �� ���.
		System.out.printf("names.size(): %d\n", names.size());
		// �ش� �ε��� ��ġ�� ���� ���. -> "Evan"
		System.out.printf("names.get(0): %s\n", names.get(0));
		// �ش� �ε��� ��ġ�� ���� ���  -> "Eugene"
		System.out.printf("names.get(1): %s\n", names.get(1));
		
		// �ش� �ε����� ���� ���� ������ ����.
		names.set(0, "Paul"); 
		/* �ش� �ε��� ��ġ�� ���� �����, ������ �����. (�Ϲ� �迭������ ����� �� ���� ������� �� ������
		 * �̻��� ����ä�� ����.)*/
		names.remove(1);
		
		for(String name : names)
			System.out.println(name);
		
	}
}
