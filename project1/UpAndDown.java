package project1;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		//��ǻ�Ͱ� 1~100 ���� �� �� �ϳ��� ���� �����Ѵ�.
		//����ڴ� ��ǻ�Ͱ� ������ ���� ����� �Ѵ�.
		//��ȸ�� 5��
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �� ���� ũ�ٸ� 
		//��ǻ�ʹ� "���� ���ڸ� �Է����ּ���!"��� ����ϰ�
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ ������ �۴ٸ�
		//��ǻ�ʹ� "ū ���ڸ� �Է����ּ���!" ��� ����ϼ���
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �����
		//��ǻ�ʹ� "�����Դϴ�!"��� ����ϼ���.
		
		System.out.println("���ڸ� ���� �־��");
		
		
		//2000�и����ʸ�ŭ ������ ����
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
		//��ǻ�Ͱ� �������� ���� ������. 
		Random random = new Random();
		
		//0~99������ ������ ���� �������
		int pick =random.nextInt(100);
	
		System.out.println("���ڸ� ������..");
		System.out.println("���纸����.");
		
		boolean correct  = false;
		Scanner scanf = new Scanner(System.in);
	
		for(int i = 1 ; i<= 5; i++) {
			System.out.println("���� : ");
			
			int user = scanf.nextInt();
		if(user>pick) {
			System.out.println("���� ���ڸ� �Է����ּ���!");
		}else if(pick - 5 <user && user< pick + 5) {
			System.out.println("���� ������ ���ڿ� �����ؿ�!");
		}
		else if(user<pick) {
			System.out.println("ū ���ڸ� �Է����ּ���!");
		}else {
			System.out.println("�����Դϴ�!");
		}
	}
		if(!correct) {
			System.out.println("���� ������ ���ڴ�~~~" + pick + "�Դϴ�.");
			System.out.println("������ �ٽ� �������ּ���!");
		}
	}
}
