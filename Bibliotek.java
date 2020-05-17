

public class Bibliotek { // superklass, har tre egenskaper
	
	private String böcker;
	private int sidor;	
	
	public Bibliotek(String böcker, int sidor) // konstruktor som tar emot två parametrar
	{
		this.böcker=böcker;
		this.sidor=sidor;
	}

	public String getBok() 
	{
		return böcker;
		
	}
	public void setBok(String böcker) 
	{
		this.böcker=böcker;
		
	}
	public int getSidor() 
	{
		return sidor;
		
	}
	public void setSidor(int sidor) 
	{
		this.sidor=sidor;
		
	}
	
	public void veckansBokTips() // klassens egna metod
	{
		System.out.println("Veckans bok tips är 1984 av George Orwell.");	
		
	}
	
	public String toString() 
	{
		return "Bok: " + böcker + ", total sidor: " + sidor;
	}
}