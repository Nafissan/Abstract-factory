public class Table_a_manger_modern extends Table_a_manger{

    private String[] color=new String[10];
    private int[] nbr_chaise=new int[10];

    public Table_a_manger_modern(){

    }

    void setColor(String t_color,int n){
        this.color[n]=t_color;
    }

    String[] getColor(){
        return this.color;
    }

    void setNbr(int nombre,int n){
        this.nbr_chaise[n]=nombre;
    }

    int[] getNbr(){
        return this.nbr_chaise;
    }

    public void Initialize(){
        this.color[0]="en bois";
        this .color[1]="noir";
        this.color[2]="blanc"; 
        this.nbr_chaise[0]=4;
        this.nbr_chaise[1] =5;
        this.nbr_chaise[2] =6;
    }

    public void Type(){
        Initialize();
        System.out.println("------Voici les tables a manger modernes disponibles------");
        for (int i=0;i<3;i++){
            System.out.println("Couleur: "+this.color[i]);
            for (int j=0;j<3;j++){
                System.out.println("Nombre de chaises: "+this.nbr_chaise[j]);
            }
        }
    }
}