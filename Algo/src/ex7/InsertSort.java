package ex7;

/**
 * ��¥ : ��¥ : 2019/11/01
 * �̸� : ������
 * ���� : �˰��� �ǽ� - �������� 
 * 
 * ���߰���
 * ����) https://www.youtube.com/watch?v=OGzPmgsI-pQ
 * 1) �迭�� 2��° ���Ҹ� 1��° ���ҿ� ���Ͽ� ������ 1��° ���ҿ� �ڸ� ��ȯ
 * 2) �迭�� 3��° ���Ҹ� 2��° ���ҿ� ���Ͽ� ������ 2��° ���ҿ� �ڸ� ��ȯ �׸��� �ٽ� 1��° ���ҿ� ���Ͽ� ������ 1��° ���ҿ� �ڸ� ��ȯ 
 * 3) ���� ���� ������ �ݺ� ����
 */
public class InsertSort {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 1, 5, 3};
		
		
		for(int j=1; j<arr.length; j++) {
			
			int k=arr[j];
			int i = j-1;
			
			while(i>=0 && arr[i] > k ) {
				arr[i+1]= arr[i];		// �ٲ�� !
				i -= 1;
			}
			
			arr[i+1] = k;
		
		
		// ���ĵ� �迭 ����ϱ�
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println("\n");
		}
	}		
}



// ������ ���������̳� �������� ����.
