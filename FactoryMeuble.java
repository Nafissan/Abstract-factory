public abstract class FactoryMeuble{

    public abstract Canape AddCanape();
    public abstract Table_a_manger AddTable();
    public abstract Bibliotheque AddBiblio();

    public static FactoryMeuble getFactory(String genre){
        if(genre.equals("vintage")){
            return new FactoryVintage();
        }else if(genre.equals("moderne")){
            return new FactoryModern();
        }else{
            throw new IllegalArgumentException("Unknown type "+genre);
        }
    }
}