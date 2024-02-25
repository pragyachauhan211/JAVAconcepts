package enumPractice;

public enum enumDemo {
	
	getDog("Bhow Bhow"),
	getCat("Meow Meow");
	private String Animal;
	
	enumDemo(String Animal)
	{
		this.Animal=Animal;
	}
	
	public String getAnimal()
	{
		return Animal;
	}
}
