
public class Problem1 {
	
//	����� �������� ����� 6�5 �� ���������� �����, ����� ��������� ��
//	�������� �������������.
//	�� �� ������� ��������, ���� ����� �� �������� ���������� �� ������
//	� ���-������� � ���-�������� ��������.
	
	public static void main(String[] args) {
		int[][] array= {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}};
		
		int smallest= array[0][0];
		int biggest =array[0][0];
		
		for (int row= 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col]+" ");
				if(biggest<array[row][col]){
					biggest=array[row][col];
				}
			
				if(smallest>array[row][col]){
					smallest=array[row][col];
				}
			}System.out.println();
		}
		System.out.println("���-������� ������� �� ������ �: "+smallest);
		System.out.println("���-�������� ������� �� ������ �: "+biggest);
	}

}
