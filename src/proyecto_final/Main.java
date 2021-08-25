
package proyecto_final;

public class Main {
    public static void main(String[] args) {
        //Clientes
        Cliente cliente1 = new Cliente("Yariela");
        Cliente cliente2 = new Cliente("Andrew");
        
        //Productos, dos por categoria
        Producto lavadora = new Producto("Electronicos",2, 2000, (15.75 * 100), "Lavadora");
        Producto plancha = new Producto("Electronicos" ,2, 2000, (15.75 * 100), "Plancha");        
        Producto vestido = new Producto("Ropa",2, 2000, (32.25 * 100), "Vestido");
        Producto pantalon = new Producto("Ropa" ,2, 2000, (32.25 * 100), "Pantalon");        
        Producto arroz = new Producto("Alimentos",2, 2000, (28.75 * 100), "Arroz");
        Producto frijoles = new Producto("Alimentos" ,2, 2000, (28.75 * 100), "Frijoles");        
        Producto muneca = new Producto("Juguetes",2, 2000, (29.50 * 100), "Muñeca");
        Producto carro = new Producto("Juguetes" ,2, 2000, (29.50 * 100), "Carro");        
        Producto acondicionador = new Producto("Belleza",2, 2000, (25.75 * 100), "Acondicionador");
        Producto cepillo = new Producto("Belleza" ,2, 2000, (25.75 * 100), "Cepillo");        
        Producto guantes = new Producto("Deporte",2, 2000, (15.50 * 100), "Guantes");
        Producto bola = new Producto("Deporte" ,2, 2000, (15.50 * 100), "Bola");        
        Producto novela = new Producto("Libros",2, 2000, (1.75 * 100), "Novela");
        Producto matematica = new Producto("Libros" ,2, 2000, (1.75 * 100), "Libro de matematica");
        
        //Items para la orden
        Item i1 = new Item(2, novela);
        
        //Orden
        Orden orden1 = new Orden(cliente1);
        
        //Agregar Items a la orden
        orden1.agregarItem(i1);
        
        //Imprimir Orden
        System.out.println(orden1);
                
    }
}
