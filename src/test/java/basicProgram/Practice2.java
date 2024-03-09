package basicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Practice2 {
	int base, power;

	public Practice2(int base, int power) {
		this.base = base;
		this.power = power;
	}

	int doSomething() {
		int res = power ^ base;
		System.out.print(res);
		while (res != 0) {
			res = --res;
		}
		return res;
	}

	public static void main(String[] args) {
		new Practice2(2, 3).doSomething();
	}

}
