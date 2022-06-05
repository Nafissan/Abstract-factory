public class FactoryModern extends FactoryMeuble{

    public Canape AddCanape(){
        return new CanapeModern();
    }

    public Bibliotheque AddBiblio(){
        return new BibliothequeModern();
    }

    public Table_a_manger AddTable(){
        return new Table_a_manger_modern();
    }
}