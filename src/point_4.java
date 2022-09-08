import java.util.Scanner;

/* NOTA: Este punto se hace, suponiendo que las letras están juntas, si no la solucion sería buscar el index of de las
*  letras por separado. */
public class point_4 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca el nombre de la empresa: ");
        Scanner entrada = new Scanner(System.in);
        StringBuilder nombreEmpresa = new StringBuilder(entrada.nextLine());
        int index = nombreEmpresa.indexOf("soh");
        System.out.println("INDEX: " + index);
        if(index > -1) {
            nombreEmpresa.deleteCharAt(index);
            nombreEmpresa.deleteCharAt(index);
            nombreEmpresa.deleteCharAt(index);
            System.out.print("Respuesta: " + nombreEmpresa);

        } else{
            System.out.print("El nombre de la empresa ingresada no contiene las letras soh ");
        }
    }
}
