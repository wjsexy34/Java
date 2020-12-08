
public class Random1 {

	public static void main(String[] args) {
		
		// 곱하는게 개별값 갯수 +,-으로 범위 바꿔주기, 형변환으로 소숫점 아래 잘라주기.
		// 괄호{} 안의 내용을 20번 반복한다.
		// Quiz. 1~10사이의 난수를 20개 출력하시오.
		// 1,2,3,4,5,6,7,8,9,10
		// Quiz. -5~5사이의 난수를 20개 출력하시오.
		// -5,-4,-3,-2,-1,0,1,2,3,4,5 = 11개
		for(int i = 1; i <= 20; i++) {
//			System.out.println((int)(Math.random()*11)); // 0<=x=11, 0~10
			System.out.println((int)(Math.random()*11)-5); // -5<=x<6, -5~5 
		}
	}
}