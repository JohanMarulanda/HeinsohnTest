import java.util.Scanner;

public class point_2 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca el primer numero: ");
        int n1, n2, n3 = 0;
        Scanner entrada = new Scanner(System.in);
        n1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Por favor, introduzca el segundo numero: ");
        n2 = Integer.parseInt(entrada.nextLine());
        System.out.print("Por favor, introduzca el tercer numero: ");
        n3 = Integer.parseInt(entrada.nextLine());


        int resultado =  mayorDeTres(n1, n2, n3);
        System.out.println("Resultado: " + resultado);
    }

    public static int mayorDeTres(int n1, int n2, int n3) {
        if( n1 >= n2 && n1 >= n3) {
            return n1;
        }
        else if (n2 >= n1 && n2 >= n3) {
            return n2;
        }
        else {
            return n3;
        }
    }

}

