public class CanapeVintage extends Canape{

    private String[] color=new String[10];
    private int[] nbr_place=new int[8];

    public CanapeVintage(){

    }

    void setColor(String t_color,int n){
        this.color[n]=t_color;
    }

    String[] getColor(){
        return this.color;
    }

    void setNbr(int nombre,int n){
        this.nbr_place[n]=nombre;
    }

    int[] getNbr(){
        return this.nbr_place;
    }

    public void Initialize(){
        this.color[0]="noir";
        this .color[1]="chatain";
        this.color[2]="blanc casse"; 
        this.nbr_place[0]=2;
        this.nbr_place[1] =3;
        this.nbr_place[2] =4;
    }

    public void Type(){
        Initialize();
        System.out.println("------Voici les canapes vintages disponibles------");
        for (int i=0;i<3;i++){
            System.out.println("Couleur: "+this.color[i]);
            for (int j=0;j<3;j++){
                System.out.println("Nombre de place: "+this.nbr_place[j]);
            }
        }
    }
}