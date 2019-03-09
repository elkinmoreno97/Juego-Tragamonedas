import java.util.Random;
import java.util.Arrays;
 
public class Maquina {
        private int casillas;
        private double precioJugada;
        private double creditos;
        private Premio[] premios;
        
        public Maquina(int nCasillas, double precio, Premio... premio) {
                precioJugada=precio;
                casillas=nCasillas;
                premios=premio;
        }
        public double getPrecJug() {
                return precioJugada;
        }
        public void setPrecJug(double precio) {
                precioJugada = precio;
        }
        public double getCredito() {
                return creditos;
        }
        public void setCreditos(double credito) {
                creditos = credito;
        }
        public int getnCasillas() {
                return casillas;
        }
        public Premio[] getColeccion() {
                return premios;
        }        
       
        
        public double incrementarCredito(double incremento) {
                return creditos + incremento;
        }
        
        public double cobrar() {
                System.out.println("Retirando "+creditos+" euros de la maquina");
                creditos = 0;
                return creditos;
        }
        
        public Fruta[] jugar() {
                setPrecJug(precioJugada);
                if (getCredito() >= precioJugada) {
                        creditos = creditos - precioJugada;
                        
                        Random generador = new Random();
                        Fruta[] frutas;
                        frutas = new Fruta[casillas]; 
                        Fruta[] frutas_aleatorias=Fruta.values();
                        
                        for (int i = 0;i<casillas; i++){
                                int index = generador.nextInt(5);
                                frutas[i]=frutas_aleatorias[index];
                        }
                        
                        int n = 1; // n = numero de premios
                        for (int i = 0; i <= n; i++) {
                                //comprueba si combinación esta en premios registrados
                                if (Arrays.equals(frutas, premios[i].getCombGanad()) == true){
                                        creditos = creditos + premios[i].getPremio();
                                }       
                        }
                        return frutas;
                }
                return null;
        }
}