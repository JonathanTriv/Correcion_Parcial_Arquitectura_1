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
                    Empleado E1 = new Empleado();
                    System.out.println("Ingrese su cedula: ");
                    E1.setCedula(scanner.next());
                    System.out.println("Ingrese sus horas extras realizadas este mes: ");
                    E1.setHoraExtrasRealizadas(scanner.nextInt());
                    System.out.println("Esta casado: ");
                    System.out.println("1.SI ");
                    System.out.println("2.NO ");
                    int numcasado = scanner.nextInt();
                    while (numcasado != 1 && numcasado != 2 ) {
                        System.out.println("Digita una opcion valida");
                        System.out.println("1.SI ");
                        System.out.println("2.NO ");
                        numcasado = scanner.nextInt();
                    }
                    boolean casado;
                    if (numcasado == 1){
                        casado = true;
                    }else {
                        casado = false;
                    }
                    System.out.println("Digita la cantidad de hijos que tienes: ");
                    int hijos = scanner.nextInt();

                    System.out.println("Selecciona la retencion a la que pertences: ");
                    System.out.println("1.Servicios Generales ");
                    System.out.println("2.Por Emolumentos Eclesiasticos ");
                    System.out.println("3.Servicios De Transporte De Carga ");
                    int retencion = scanner.nextInt();

                    while (retencion != 1 && retencion != 2 && retencion != 3) {
                        System.out.println("Digita una opcion valida");
                        System.out.println("1.Servicios Generales ");
                        System.out.println("2.Por Emolumentos Eclesiasticos ");
                        System.out.println("3.Servicios De Transporte De Carga ");
                        retencion = scanner.nextInt();
                    }

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
                            case 4 -> E1.visualisarInformacion(casado, hijos, retencion);
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
