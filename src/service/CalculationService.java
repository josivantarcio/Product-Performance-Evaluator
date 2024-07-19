package service;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable<? super T>> T max(List<T> lista) {

		if (lista.isEmpty()) {
			throw new IllegalStateException("Can not list empty");
		}
		T bigPrice = lista.get(0);
		for (T item : lista) {
			if (item.compareTo(bigPrice) > 0) {
				bigPrice = item;
			}
		}
		return bigPrice;
	}

}
