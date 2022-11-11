package problems;

public class BitonicPointBinarySearchImpl<T extends Comparable<T>> implements BitonicPointBinarySearch<T> {

	@Override
	public T bitonicPoint(T[] array) {
		if (!isValid(array)) {
			return null;
		}
		return search(array, 0, array.length - 1);
	}

	public T search(T[] array, int left, int right) {

		int middle = (left + right) / 2;
		if (middle == left || middle == right) {
			if (array[left].compareTo(array[right]) >= 0) {
				return array[left];
			} else {
				return array[right];
			}
		} else {
			if ((array[middle].compareTo(array[middle - 1]) > 0) && (array[middle].compareTo(array[middle + 1]) > 0)) {
				return array[middle];
			} else {

				if (array[middle].compareTo(array[middle - 1]) <= 0) {
					return search(array, left, middle - 1);
				} else {
					return search(array, middle + 1, right);
				}
			}
		}

	}

	public boolean isValid(T[] array) {
		return !(array == null) && !(array.length == 0);
	}
}
