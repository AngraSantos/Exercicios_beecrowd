import java.util.Scanner;

    public class Main_1004 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int A = input.nextInt();
            int B = input.nextInt();

            int resultadoFinal = A * B;

            System.out.println("PROD = " + resultadoFinal);

            input.close();
        }
    }