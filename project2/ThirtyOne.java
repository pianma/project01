package project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThirtyOne {

	public static void main(String[] args) {
		// ����ڿ� ��ǻ�Ͱ� ���� ���ڸ� �θ���.
		// ���ڴ� �ѹ��� �ּ� 1������ �ִ� 3������ �θ� �� �ִ�.
		// ���ڴ� 1~31���� �����ϸ鼭 �ҷ����Ѵ�.
		// ������ 31�� �θ� ����� ���ӿ��� ����.
		
		
		//1. ����ڰ� �������� ��ǻ�Ͱ� �������� ����
		//2. ���� �����ϴ� ���� ���ڸ� �θ���.
		//3. ���ڴ� �ѹ��� �Է��ؾ��Ѵ�.
		//�Է� ����) ����: 1 2 3
		
		
		Scanner scanf = new Scanner(System.in);
		
		//turn -> true : ������� ����. / false -> ��ǻ���� ����
		boolean turn = false;
		
		
		while(true) {
		System.out.println("���� ���� ����ұ��?");
		System.out.println("1. �����");
		System.out.println("2. ��ǻ��");
		
		int select = scanf.nextInt();
		if(select==1) {
			//����ڰ� ���� �����ϵ��� ����
			System.out.println("����ڰ� ���� �����մϴ�.");
			turn  = true;
			break;
		}else if(select ==2) {
			//��ǻ�Ͱ� ���� �����ϵ��� ����
			System.out.println("��ǻ�Ͱ� ���� �����մϴ�");
			
			turn = false ;
			break;
		}else {
			System.out.println("�������� �ΰ��� ���Դϴ�.");
		}
		
	}
		
		System.out.println("gaem start!");
		
		scanf.nextLine();
		
		int LastNumber = 0;
		
		
		while(true) {
			if(turn) {
				//����� ����
			System.out.println("����� �����Դϴ�.");
			System.out.println("�ִ� 3���� ���ڸ� �����ּ���!");
				
			String user = scanf.nextLine();
			String[] users = user.split("  ");
			

			if(users.length == 0 || users.length > 3) {
				System.out.println("���ڴ� 3�������� ��ĥ �� �ֽ��ϴ�.");
			}else {
				LastNumber = Integer.parseInt(users[users.length-1]);
				break;
			}
			//end while
			}else {
					//��ǻ�� ����
					System.out.println("��ǻ���� �����Դϴ�!");
					System.out.println("��ǻ�� �����Դϴ�.");
					
					Random random = new Random();
					int roof = random.nextInt(3) + 1;
					
					for(int i =0; i<= roof; i++) {
						LastNumber = LastNumber +1;
						
						if(LastNumber <= 31) {
						System.out.println(LastNumber + " ");
					}
 					System.out.println();
			}
			
			if(LastNumber >= 31) {
				if(turn) {
					System.out.println("����ڰ� �����ϴ�!");
				}else {
					System.out.println("����ڰ� �̰���ϴ�!");
				}
				break;
			}
			
			turn = !turn;
			}
			}
	}
}




