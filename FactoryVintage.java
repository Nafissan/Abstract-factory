public class FactoryVintage extends FactoryMeuble{

    public Canape AddCanape(){
        return new CanapeVintage();
    }

    public Bibliotheque AddBiblio(){
        return new BibliothequeVintage();
    }

    public Table_a_manger AddTable(){
        return new Table_a_manger_vintage();
    }
}