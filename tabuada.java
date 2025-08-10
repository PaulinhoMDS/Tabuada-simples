import java.util.Scanner;
import java.io.PrintStream;

public class tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in);
        System.out.print("escolha o número que deseja fazer a tabuada");
        int tab = scanner.nextInt();
        System.out.print("A tabuada de"+tab+ "é:");

        for (int i =1; i <= 10; i++) {
            int resultado = tab * i;
            System.out.print(" A tabuada de "+ tab + " é:" + resultado);
        }
        
    }
}
