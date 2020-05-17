
public class Författare extends Bibliotek { // författare är subklass som ärver från superklassen Bibliotek
	
	private String namn;
	private String efternamn;
	
	
	public Författare(String böcker, int sidor, String namn, String efternamn) // konstruktor som tar emot två parametrar
	{
		super(böcker,sidor); // supermetoden anropar Bibliotek konstruktorn
		this.namn=namn;
		this.efternamn=efternamn;
		
	}
	
	public String getFörfattareNamn() 
	{
		return namn;
		
	}
	public void setFörfattareNamn(String namn) 
	{
		this.namn=namn;
		
	}
	
	public String getEfterNamn() 
	{
		return efternamn;
		
	}
	public void setEfterNamn(String efternamn) 
	{
		this.efternamn=efternamn;
		
	}
	// metod överskruggning, denna metod finns i superklassen också, har samma signatur
	public String toString() 
	{ // super ordet används för att anropa metoder eller variablar från Biblliotek klassen
		return "Författarens namn: " + namn + ", efternamn: " + efternamn + ", " + super.toString();
	}

	

}
