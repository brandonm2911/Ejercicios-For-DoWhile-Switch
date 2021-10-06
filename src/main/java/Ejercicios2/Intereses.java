package Ejercicios2;


public class Intereses {
    
    public static void main(String[] args) {
        double monto;
        double principal = 1000.0;
        double tasa = 0.05;
        
        
        System.out.printf("5%20s\n", "anio", "Monto en deposito");
        
        for (int anio = 1; anio <= 10; anio++) {
            
            monto = principal * Math.pow(1.0 + tasa, anio);
            
            System.out.printf("%4d%, 20.2f\n", anio, monto);
        }
            
    }
}
