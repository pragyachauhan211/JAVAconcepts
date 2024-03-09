package enumPractice;

public class EnumCall {

	public static void main(String[] args) 
	{
		enumDemo enumObj1 = enumDemo.valueOf("getCat");
		enumDemo enumObj2 = enumDemo.valueOf("getDog");
		System.out.println(enumObj1.getAnimal()); // Print Meow Meow
		System.out.println(enumObj2.getAnimal()); // Print Bhow Bhow
	}

}
