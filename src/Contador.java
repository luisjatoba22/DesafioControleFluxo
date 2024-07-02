import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primero número: ");
        int numUm = scan.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int numDois = scan.nextInt();

        try{
            contar(numUm, numDois);
        } catch (ParametrosInvalidosException e){
            System.err.println("O segundo parametro deve ser maior que o segundo ");
        }

        scan.close();
    }

    static void contar(int numUm, int numDois) throws ParametrosInvalidosException{
        if (numUm < numDois) {
            for(int i = 1; i <= (numDois-numUm) ; i++){
            System.out.println("Imprimindo número "+i+": "+(numUm+i));
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
