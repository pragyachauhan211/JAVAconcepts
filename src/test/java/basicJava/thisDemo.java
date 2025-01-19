package basicJava;

class thisDemo {
	int a, b, c;

	thisDemo(int a) {
		this(1, 2);
	}

	thisDemo(int a, int b) {
		this(1, 2, 3);
	}

	thisDemo(int a, int b, int c){
		        System.out.print(a+b+c);
		    }

	public static void main(String[] args) throws InterruptedException {
		new thisDemo(5);

	}
}
