package basicJava;

public class absC extends absB {

	absC() {
		super.b();
		super.a();
	}

	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}

	public static void main(String[] args) 
	{
		absC obj = new absC();
		obj.a();
		obj.b();
		obj.c();
	}
}
