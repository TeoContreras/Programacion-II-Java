public class ejercicio4 {
    public static void main(String[] args){
        Producto[] producto ={
                new Producto("Leche", 2000.00),
                new Producto("Huevos", 1500),
                new Producto("Aceite", 1000)};
        for (Producto p: producto){
            p.informacion();}
    }
}
class Producto {
    private String nombre;
    private double PrecioBase;

    public Producto(String nombre, double PrecioBase){
        this.nombre=nombre;
        this.PrecioBase=PrecioBase;}
    public double Descuento(){
        double descuento;
        return descuento=PrecioBase*15/100;}
    public double Recargo(){
        double recargo;
        return recargo=PrecioBase*21/100;}
    public void informacion(){
        System.out.print("----------");
        System.out.println("Producto: "+nombre+"\nPrecio base: "+PrecioBase+"\nDescuento: 15%\nRecargo(IVA): 21%");
        System.out.println("Precio con descuento: "+(PrecioBase-Descuento())+"\nPrecio con recargo: "+(PrecioBase+Recargo())+"\nPrecio final: "+((PrecioBase-Descuento())+Recargo()));}
}
