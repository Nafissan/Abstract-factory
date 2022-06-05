import java.util.*;

public class GetMeuble{
    
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("----Bienvenu sur notre site de vente----");
        System.out.println("Quel genre de meuble souhaitez-vous?");
        String genre=sc.nextLine();
		FactoryMeuble meuble = FactoryMeuble.getFactory(genre);
		Bibliotheque biblio = meuble.AddBiblio();
		Canape canape = meuble.AddCanape();
        Table_a_manger table=meuble.AddTable();
        biblio.Type();
        canape.Type();
        table.Type();

	}
}