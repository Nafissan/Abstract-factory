public class BibliothequeModern extends Bibliotheque{

    private String[] color=new String[10];
    private int[] nbr_battant=new int[4];

    public BibliothequeModern(){

    }

    void setColor(String t_color,int n){
        this.color[n]=t_color;
    }

    String[] getColor(){
        return this.color;
    }

    void setNbr(int nombre,int n){
        this.nbr_battant[n]=nombre;
    }

    int[] getNbr(){
        return this.nbr_battant;
    }

    public void Initialize(){
        this.color[0]="marron";
        this .color[1]="en verre";
        this.color[2]="blanc casse"; 
        this.nbr_battant[0]=2;
        this.nbr_battant[1] =3;
        this.nbr_battant[2] =4;
    }

    public void Type(){
        Initialize();
        System.out.println("------Voici les bibliotheques modernes disponibles------");
        for (int i=0;i<3;i++){
            System.out.println("Couleur: "+this.color[i]);
            for (int j=0;j<3;j++){
                System.out.println("Nombre tiroir: "+this.nbr_battant[j]);
            }
        }
    }
}