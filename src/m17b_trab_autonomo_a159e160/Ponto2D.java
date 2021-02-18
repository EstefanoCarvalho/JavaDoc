package m17b_trab_autonomo_a159e160;

public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
