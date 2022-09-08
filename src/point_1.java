import java.util.ArrayList;
import java.util.Scanner;

public class point_1 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca el tamaño del arreglo aleatorio: ");
        int tamanio = 0;
        Scanner entrada = new Scanner(System.in);
        tamanio = Integer.parseInt(entrada.nextLine());
        ArrayList<Integer> lista = new ArrayList<Integer>();
        while(tamanio != 0) {
            lista.add(auxiliarGeneraNumero());
            tamanio--;
        }
        System.out.println("");
        System.out.print("Por favor, introduzca el numero de permutaciones a realizar: ");
        int permutaciones = 0;
        permutaciones = Integer.parseInt(entrada.nextLine());
        System.out.println("Arreglo: " + lista);
        System.out.println("Permutaciones: " + permutaciones);

        ArrayList<Integer> resultado = Principal(lista, permutaciones);
        System.out.println("Resultado: " + resultado);

    }

    public static int auxiliarGeneraNumero() {
        return (Math.random() < 0.5) ? 1:0;
    }

    public static ArrayList<Integer> Principal(ArrayList<Integer> arreglo, int permutaciones){
        int contador = permutaciones;
        while(contador != 0){
            ArrayList<Integer> lista = new ArrayList<Integer>();
            for(int i=0;i<arreglo.size();i++) {
                int anterior = 0;
                int posterior = 0;

                if(i>0) {
                    anterior = arreglo.get(i-1);
                }
                if(i<(arreglo.size()-1)) {
                    posterior = arreglo.get(i+1);
                }

                if(anterior==posterior) {
                    lista.add(0);
                }else {
                    lista.add(1);
                }
            }
            arreglo = lista;
            contador--;
        }
        return arreglo;
    }
}