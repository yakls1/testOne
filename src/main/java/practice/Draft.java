package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Draft {

	public int sleepIn(int you, int date) {
		if(you<3 || date<3) {
			return 0;
		}

	
		return 1;

	}

	public static void main(String[] args) {

		Draft draft = new Draft();

		int[] arrayP = { 1, 7, 3, 1, 5 };

		System.out.println(draft.sleepIn(2, 7)); // CCoCodCode

	}

}
