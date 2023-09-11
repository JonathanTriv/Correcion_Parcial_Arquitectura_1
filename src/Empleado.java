public class Empleado {

    private String cedula;
    private double sueldoBase = 1145000;
    private double pagoHoraExtra = 20000;
    private double horaExtrasRealizadas = 0;

    public Empleado() {
    }

    public Empleado(String cedula, double sueldoBase, double pagoHoraExtra, double horaExtrasRealizadas) {
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horaExtrasRealizadas = horaExtrasRealizadas;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public double getHoraExtrasRealizadas() {
        return horaExtrasRealizadas;
    }

    public void setHoraExtrasRealizadas(double horaExtrasRealizadas) {
        this.horaExtrasRealizadas = horaExtrasRealizadas;
    }

    public double horasExtras(){
        double valorHoras = horaExtrasRealizadas * pagoHoraExtra;
        return valorHoras;
    }
    public double salarioBruto(){
        return  sueldoBase + horasExtras();
    }
    public double retenciones(boolean casado,int hijos,int retencion){
        double serviciosGenerales = 0.08;
        double porEmolumentosEclesiasticos =  0.06;
        double serviciosDeTransporteDeCarga = 0.04;
        double retenciones = 0;

        switch (retencion) {
            case 1 -> {
                if (casado) {
                    serviciosGenerales -= 0.02 + (0.01 * hijos);
                } else {
                    serviciosGenerales -= (0.01 * hijos);
                }
                retenciones = salarioBruto() * serviciosGenerales;
            }
            case 2 -> {
                if (casado) {
                    porEmolumentosEclesiasticos -= 0.02 + (0.01 * hijos);
                } else {
                    porEmolumentosEclesiasticos -= (0.01 * hijos);
                }
                retenciones = salarioBruto() * porEmolumentosEclesiasticos;
            }
            case 3 -> {
                if (casado) {
                    serviciosDeTransporteDeCarga -= 0.02 + (0.01 * hijos);
                } else {
                    serviciosDeTransporteDeCarga -= (0.01 * hijos);
                }
                retenciones = salarioBruto() * serviciosDeTransporteDeCarga;
            }
        }
        return retenciones;
    }
    public void visualisarInformacion(boolean casado,int hijos,int retencion) {
        System.out.println("El empleado con la cedula: "+cedula);
        System.out.println("Salario Base es de: "+sueldoBase);
        System.out.println("Pago por hora extra de: "+pagoHoraExtra);
        System.out.println("Horas extras realizadas de: "+horaExtrasRealizadas);
        System.out.println("El valor de la horas realizadas de: "+horasExtras());
        System.out.println("Salario Bruto es de: "+salarioBruto());
        System.out.println("Las retenciones para este mes son de: "+retenciones(casado,hijos,retencion));
        double salarioNeto = salarioBruto() - retenciones(casado, hijos, retencion);
        System.out.println("Salario neto de: "+salarioNeto);
    }
}
