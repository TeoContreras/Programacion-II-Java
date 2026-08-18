public class ejercicio3 {
    public static void main(String[] args){
    Vehiculo v1 = new Vehiculo("Fiat", "Cronno 2025", 0);
    int[] Velocidad ={10,20,30,-10,-35,-20, 10, 20, -20};
    for (int v : Velocidad){
        System.out.println("---------");
        v1.Estado(v, v1);
    }
    }
}
class Vehiculo{
    private String marca;
    private String modelo;
    int velocidadActual;
    public Vehiculo(String marca, String modelo, int velocidadActual){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadActual=velocidadActual;
    }
    public double masVel(int Velocidad){
        return this.velocidadActual=velocidadActual+Velocidad;
    }
    public int menosVel(int Velocidad) {
        int cantidadRestar = Math.abs(Velocidad);
        if (velocidadActual < cantidadRestar) {
            System.out.println("Velocidad agregada: "+Velocidad+"\nVelocidad erronea. Velocidad actual: 0");
            this.velocidadActual = 0;
        } else {
            this.velocidadActual -= cantidadRestar;
        }
        return this.velocidadActual;
    }
    public void Estado(int v, Vehiculo v1){
        if (v>0){
            v1.masVel(v);
            System.out.println("Velocidad acelerada: "+v);
        }
        else {
            v1.menosVel(v);
            System.out.println("Velocidad disminuida: "+v);
        }
        System.out.println("\nVelocidad actual: "+velocidadActual);
    }
}