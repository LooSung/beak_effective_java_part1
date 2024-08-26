package chapter01.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BackQuiz {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2000);
		list.add(32);
		list.add(428);

		Comparator<Integer> cp = (o1, o2) -> o2 - o1;
		list.sort(cp);

		Collections.reverse(list);


		System.out.println(list);
	}
}
