package proyecto_final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertirPeso {

    public ConvertirPeso() {
    }

    public static void main(String[] args) throws IOException {

        double kilogramo, libra;
        double kilogramo2, libra2;
            
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Kilogramos: ");
            kilogramo = Float.parseFloat(br.readLine());
            
            libra = kilogramo * 2.205;
         
            //libras = prom(kilogramos, resultado);
            System.out.println("son " + libra + " libras aproximadamente \n\n");
            
            System.out.println("Libras: ");
            libra2 = Float.parseFloat(br.readLine());
            
            kilogramo2 = libra / 2.205;
            System.out.println("son " + kilogramo2 + " kilos aproximadamente \n\n");
    }
    //public static int prom(int libras, int w){
      //  return (libras*w);
    }
        
        
        /*
        System.out.println("Precio del dolar?");
        tasa = Float.parseFloat(br.readLine());
        
        System.out.println("Cantidad de dolares?");
        monedaorigen = Float.parseFloat(br.readLine());

        monedadestino = monedaorigen * tasa;
        System.out.println(monedaorigen + " dolares equivalen a " + monedadestino + " colones");

        //monedadestino = monedaorigen / tasa;
        //System.out.println(monedaorigen + " pesos chilenos equivalen a " + monedadestino + " dolares");
*/
    

/*

*/