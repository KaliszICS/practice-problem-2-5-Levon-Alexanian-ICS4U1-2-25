public class PracticeProblem {
	//Create a method called insertionSort(char[] characters) that accepts and array of characters and sorts it using the insertion sort algorithm. Do not return anything.
	public static void insertionSort(char[] characters) {
		for (int i = 1; i < characters.length; i++) {
			// compare to all the numbers before
			char key = characters[i];
			int index = i - 1;
			while (index >= 0 && characters[index] > key) { //check for -1 first
				characters[index + 1] = characters[index];
				index--;
			}
			characters[index + 1] = key;
		}
	}
}
