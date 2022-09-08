import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class point_3 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca el tamaño del arreglo aleatorio: ");
        int tamanio = 0;
        Scanner entrada = new Scanner(System.in);
        tamanio = Integer.parseInt(entrada.nextLine());
        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.println("Ahora procederemos a llenar el arreglo.");
        while(tamanio != 0) {
            System.out.print("Introduzca un valor perteneciente al arreglo: ");
            int dato =  Integer.parseInt(entrada.nextLine());
            lista.add(dato);
            tamanio--;
        }

        System.out.println("Su arreglo es: " + lista);
        ArrayList<Integer> listaImpares = Principal(lista);
        System.out.println("RESULTADO: " + listaImpares);
    }

    public static ArrayList<Integer> Principal(ArrayList<Integer> vector) {
        ArrayList<Integer> temporalPares = new ArrayList<Integer>();
        ArrayList<Integer> temporalImpares = new ArrayList<Integer>();
        ArrayList<Integer> resultList = new ArrayList<Integer>();

        //Separamos en arreglos distintos los pares y los impares
        for(int i=0;i<vector.size();i++) {
            if(vector.get(i)%2==0) {
                temporalPares.add(vector.get(i));
            } else {
                temporalImpares.add(vector.get(i));
            }
        }

        //Ordenamos los arreglos pares e impares de menor a mayor
        Collections.sort(temporalPares);
        Collections.sort(temporalImpares);

        //Concatenamos ambos arreglos para retornarlos en la respuesta
        resultList.addAll(temporalPares);
        resultList.addAll(temporalImpares);

        return resultList;
    }
}
