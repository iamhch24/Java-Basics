package arrayList;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열의 회전
		int[][] matrixA = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		int[][] matrixB = new int[5][5];
		
//		index1 = j
//		index2 = 4-i
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				matrixB[j][4-i]= matrixA[i][j];
			}
		}
		
		for(int i=0;i<matrixB.length;i++) {
			for(int j=0;j<matrixB[i].length;j++) {
				System.out.print(matrixB[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
