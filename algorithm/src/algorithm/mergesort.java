package algorithm;

public class mergesort {

	public static void main(String[] args) {
		int[] A = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 15 };

		// 원본 배열 출력
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();

		MergeSort(A);

		// 정렬 배열 출력
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();
	}
	
	public static void MergeSort(int[] arr) {
		
	}

}
