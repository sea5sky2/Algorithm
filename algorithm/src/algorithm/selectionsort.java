package algorithm;

public class selectionsort {

	public static void main(String[] args) {
		int[] A = { 8, 31, 48, 73, 3, 65, 20, 29, 11, 15};
		
		//원본 배열 출력
		for(int a: A)
			System.out.print(a + " ");
		System.out.println();
	
		SelectionSort(A);
		
		//정렬 배열 출력
		for(int a: A)
			System.out.print(a + " ");
		System.out.println();
	}

	//선택 정렬
		public static void SelectionSort(int[] arr) {
			
			int min; //최솟값
			int temp; // swap을 위한 값
			
			for(int i = 0; i < arr.length ; i++) {
				min = i;
				for(int j = i + 1; j < arr.length; j++) {
					
					if(arr[min] > arr[j]) {
						min = j;
						
					}
				}
				//한번 도는 게 끝나면 최솟값찾아서 자리 바꾸기
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
}
