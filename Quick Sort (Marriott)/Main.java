import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] array = {7, 2, 1, 13, 20, 6, 9, 33, 40, 3};
		List<Integer> charList = new ArrayList<>();
		
		for (int x : array) 
			charList.add(x);
		
		int listEnd = charList.size() - 1;
		
		quickSort(charList, 0, listEnd);
		

	}
	
	private static void quickSort(List<Integer> list, int start, int finish) {
		
		if (start < finish) {
			boolean swapped = false;
			int pivotpos = start;
			System.out.println("Pivot: " + list.get(pivotpos));
			
			for (int i = start; i < finish + 1; i++) {
				if (list.get(i) < list.get(start)) {
					swap(list, ++pivotpos, i);
					swapped = true;
				}
			}
			
			swap(list, start, pivotpos);
			
			if (swapped)
				System.out.println(list.toString());
			
			quickSort(list, start, pivotpos);
			quickSort(list, pivotpos+1, finish);
			
		}
		
	}
	
	private static void swap(List<Integer> list, int a, int b) {
		int temp = list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}

}
