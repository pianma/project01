package project3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		//로또 1~45까지 숫자가 있다.
		//6개의 숫자를 뽑는다.
		//당첨 번호는 중복되서 뽑힐 수 없다.
		
		//1~45사이의 6개 숫자를 뽑을 때 중복되지 않게 뽑는다.
		//List 컬랙션 프레임웤만 사용해서 구현하세요.
		
		List<Integer> lotto = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for(int i=0; i<6; i++) {
			//n번째 숫자를 저장
			lotto.add(random.nextInt(45)+ 1);
		
			//0~n -1번째까지 현재 저장한 숫자가 들어있는지 체크
			for(int j=0; j<lotto.size()-1; j++) {
				if(i==j ) break;
				if(lotto.get(j) == lotto.get(i)) {
					lotto.remove(i);
					i = i-1;
					break;
				}//end if
			}//end for j
		
		}//end for i
		
	   	
		
		
//		Set<Integer> lotto = new HashSet<Integer>();
//		
//		Random random = new Random();
//		while(true) {
//			
//			while(true) {
//			lotto.add(random.nextInt(45) +1);
//			
//			if(lotto.size() == 6) {
//				break;
//			}
//		}
			
			System.out.println("당첨 번호는 ~~~~~");
			System.out.println(lotto);
	}
		
		
	
	

}
