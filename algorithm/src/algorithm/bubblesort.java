package algorithm;

public class bubblesort {

	public static void main(String[] args) {
		int[] A = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 15 };

		// 원본 배열 출력
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();

		BubbleSort(A);

		// 정렬 배열 출력
		for (int a : A)
			System.out.print(a + " ");
		System.out.println();

	}

	// 버블 정렬
	public static void BubbleSort(int[] arr) {

		int max; // 최댓값
		int temp; // swap을 위한 값

		//바꿔가며 이동
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}

		}
	}

}
