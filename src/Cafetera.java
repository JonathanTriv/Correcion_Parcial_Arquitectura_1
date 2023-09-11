public class Cafetera {

    private double capacidadMaxima = 1000;
    private double cantidadActual = 0;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
        System.out.println("La cantidad actual de la cafetera es: "+cantidadActual+ " ml");
    }
    public void servirTaza(double servir){
        if (servir <= cantidadActual){
            cantidadActual -= servir;
            System.out.println("La taza de " +servir+ " ml se servio con exito, el cafe en la cafetera es de "+cantidadActual+ " ml");
        }else{
            double falto = servir - cantidadActual;
            System.out.println("La cantidad de cafe no se suficiente para servir toda la taza pero se sirvio "+cantidadActual+" ml lo que falto fue "+falto+ " ml");
            cantidadActual = 0.0;
        }
    }
    public void vaciarCafetera(){
        cantidadActual = 0.0;
        System.out.println("La cafetera ahora esta vacia su contenido es de "+cantidadActual+ " ml");
    }
    public void agregarCafe(double cafe){
        if (cantidadActual + cafe <= capacidadMaxima){
            cantidadActual += cafe;
            System.out.println("Se agrego cafe a la cafetera exitosamente ahora la cafereta tiene "+cantidadActual+" ml");
        }else{
            System.out.println("La cantidad de cafe a agregar es superior a la capacidad maxima de la cafetera que es de "+capacidadMaxima+ " ml");
        }
    }

}
