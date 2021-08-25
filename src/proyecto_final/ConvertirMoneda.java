package proyecto_final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertirMoneda {

    public ConvertirMoneda() {
    }

    public static void main(String[] args) throws IOException {

        float tasa = 0;
        float monedaorigen = 0;
        float monedadestino = 0;
        
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Precio del dolar?");
        tasa = Float.parseFloat(br.readLine());
        
        System.out.println("Cantidad de dolares?");
        monedaorigen = Float.parseFloat(br.readLine());

        monedadestino = monedaorigen * tasa;
        System.out.println(monedaorigen + " dolares equivalen a " + monedadestino + " colones");

        monedadestino = monedaorigen / tasa;
        System.out.println(monedaorigen + " colones equivalen a " + monedadestino + " dolares");

    }
}
