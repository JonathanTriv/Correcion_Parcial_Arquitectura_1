import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println("Menu");
            System.out.println("1.Cafetera");
            System.out.println("2.Empleado");
            System.out.println("3.Salir");
            opc = scanner.nextInt();
            switch (opc){
                case  1->{
                    Cafetera C1 = new Cafetera();
                    do {
                        System.out.println("1.Llenar Cafetera");
                        System.out.println("2.Servir taza");
                        System.out.println("3.Vaciar Cafetera");
                        System.out.println("4.Agregar Cafe");
                        System.out.println("5.Salir");
                        opc = scanner.nextInt();

                        switch (opc){
                            case 1-> C1.llenarCafetera();
                            case 2-> {
                                System.out.println("Ingrese la capacidad de la taza a servir: ");
                                double tazas = scanner.nextDouble();
                                C1.servirTaza(tazas);
                            }
                            case 3-> C1.vaciarCafetera();
                            case 4-> {
                                System.out.println("Ingresa la cantidad de cafe a agregar a la cafetera: ");
                                double cafe = scanner.nextDouble();
                                C1.agregarCafe(cafe);
                            }
                            default-> {
                                System.out.println("Saliendo...");
                            }
                        }
                    }while (opc != 5);
                }
                case 2->{
                    Empleado E1 = new Empleado("1003023891",1145000.0,20000.0,20);
                    do {
                        System.out.println("Empleado");
                        System.out.println("1.Horas Extras");
                        System.out.println("2.Sueldo Bruto");
                        System.out.println("3.Retenciones");
                        System.out.println("4.Informacion");
                        System.out.println("5.Salir");
                        opc = scanner.nextInt();

                        switch (opc) {
                            case 1 -> System.out.println("Las horas extras ralizadas este mes suman la catidad de: "+E1.horasExtras());
                            case 2 -> System.out.println("El sueldo bruto de este mas es: "+E1.salarioBruto());
                            case 3 -> System.out.println("Las retenciones para este mes son de: "+E1.retenciones(true,2,1));
                            case 4 -> E1.visualisarInformacion(true, 2, 1);
                            default -> {
                                System.out.println("Saliendo...");
                            }
                        }

                    }while (opc != 5);
                }
                default -> {
                    System.out.println("Saliendo...");
                }
            }

        }while (opc != 3);
    }
}
