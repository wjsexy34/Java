
public class Random1 {

	public static void main(String[] args) {
		
		// ���ϴ°� ������ ���� +,-���� ���� �ٲ��ֱ�, ����ȯ���� �Ҽ��� �Ʒ� �߶��ֱ�.
		// ��ȣ{} ���� ������ 20�� �ݺ��Ѵ�.
		// Quiz. 1~10������ ������ 20�� ����Ͻÿ�.
		// 1,2,3,4,5,6,7,8,9,10
		// Quiz. -5~5������ ������ 20�� ����Ͻÿ�.
		// -5,-4,-3,-2,-1,0,1,2,3,4,5 = 11��
		for(int i = 1; i <= 20; i++) {
//			System.out.println((int)(Math.random()*11)); // 0<=x=11, 0~10
			System.out.println((int)(Math.random()*11)-5); // -5<=x<6, -5~5 
		}
	}
}