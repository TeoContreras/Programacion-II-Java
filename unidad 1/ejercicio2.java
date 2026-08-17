public class ejercicio2 {
    public static void main(String[] args){
    Estudiante[] estudiantes= {
            new Estudiante("Teo",1234, 10.0,10.0),
            new Estudiante("Mariano",1000, 9.0,6.0),
            new Estudiante("Sofia",5555, 5.0,3.0)
    };
    int aprobados =0;
    for (Estudiante e: estudiantes){
        e.resumen();
        if (e.aprobo()){aprobados++;
        }
    }
        System.out.println("----------\nTotal de aprobados: "+aprobados);
    }
}

class Estudiante{
    private final String nombre;
    private final int legajo;
    private final double not1, not2;

    public Estudiante(String nombre, int legajo, double not1, double not2){
        this.nombre= nombre;
        this.legajo=legajo;
        this.not1=not1;
        this.not2=not2;
    }
    public double promedio(){
        return (not1+not2) /2;
    }
    public boolean aprobo(){
        return promedio()>=6;
    }
    public void resumen(){
        System.out.println("----------");
        System.out.println("Nombre: " + nombre + "\nLegajo: " + legajo + "\nPromedio: " + promedio());
        System.out.println("Condicion: " + (aprobo() ? "Aprobo" : "Desaprobo"));
    }
}