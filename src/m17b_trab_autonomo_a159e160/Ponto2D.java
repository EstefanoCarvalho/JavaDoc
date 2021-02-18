package m17b_trab_autonomo_a159e160;

/** 
 * Classe Ponto2D serve para instanciar pontos
 * @author Estéfano Carvalho
 */
public class Ponto2D {
    private int x;
    private int y;
    
    /** 
    * Construtor sem parâmetros, que inicializa os atributos
    * com valores predefinidos conhecidos.
    */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    /** 
    * Construtor da classe parametrizado com todos os atributos.
    * @param x ponto x
    * @param y ponto y
    */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /** 
    * @param a Ponto 2D
    * @return devolve o valor do calculo da distância
    */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    
    /**
    * @return devolve o valor x.
    */

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    /**
    * @return devolve o valor  y.
    */
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    /**
    * 
    * @return de uma string composta pelos pontos x e y.
    */

    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
