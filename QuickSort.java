package exQuckSort;

public class QuickSort {
	int partition(Student arr[], int low, int high) {
		Student pivot = arr[high];
		int i = (low - 1); 
		for (int j = low; j < high; j++) {
			if (arr[j].getGPA() < pivot.getGPA()) {
				i++;
				Student temp = arr[i];
				arr[i] = arr[j];
				arr[j] = (temp);
			}
		}
		Student temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	void sort(Student arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}
}
