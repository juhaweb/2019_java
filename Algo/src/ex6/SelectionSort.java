package ex6;

/**
 * ��¥ : 2019/11/01
 * �̸� : ������
 * ���� : �˰��� �ǽ� - �������� 
 * 
 * ���߰���
 * ����) https://www.youtube.com/watch?v=xWBP4lzkoyM
 * 1) �迭�� 1��° ���Ҹ� 2, 3, 4, 5��° ���ҿ� ���ʷ� ��  
 * 2) 1��° ���Һ��� ���� ���Ҹ� ã���� ���� �ڸ� ��ȯ
 * 3) �迭�� 2��° ���Ҹ� 3, 4, 5��° ���ҿ� ���ʷ� ��
 * 4) 2��° ���Һ��� ���� ���Ҹ� ã���� ���� �ڸ� ��ȯ
 * 5) �迭�� 3��° ���Ҹ� 4, 5��° ���ҿ� ���ʷ� ��  
 * 6) 3��° ���Һ��� ���� ���Ҹ� ã���� ���� �ڸ� ��ȯ
 * 7) �̿� ���� ���� ���Ұ� �ϳ� ���� ������ �ݺ� ����
 */

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 1, 5, 3};
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {	// i�� j���� Ŭ���
					int temp = arr[j];
					arr[j] = arr[i]; 				// �ε�����ȣ�� �ٲ����.
					arr[i] = temp;
				}

			}

		}
		
		
		// ���ĵ� �迭 ����ϱ�
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
	}
	
}
