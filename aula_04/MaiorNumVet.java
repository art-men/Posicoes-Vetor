import java.util.Scanner;

public class MaiorNumVet {

    public static void main(String[] args) {
        int maiorNum = 0;
        int n = 10;
        int v[] = new int[n];
        int i;
        Scanner leia = new Scanner(System.in);

        for (i=0; i<n; i++) {
            System.out.printf("Informe o %2dº valor: ", (i+1), n);
            v[i] = leia.nextInt();
        }
        for (i=0;i<n;i++){
            if(maiorNum < v[i]){
                maiorNum = v[i];

            } else{
                maiorNum = maiorNum;
            }
        }

        System.out.println("O maior número é: "+maiorNum);

    }

}
