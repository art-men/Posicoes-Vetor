import java.util.Scanner;

public class InverterNumVet {

    public static void main(String[] args) {

        int n = 8;
        int v[] = new int[n];
        int i;
        int j = 0;
        Scanner leia = new Scanner(System.in);

        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %2dº valor: ", (i + 1), n);
            v[i] = leia.nextInt();
        }

        System.out.println("Os valores invertidos do vetor são: ");
        int extFim  = v.length-1;
        int extIni = 0;
        int temp1,temp2; //uma variavel temporaria para cada extremo do vetor
        while(extFim>extIni){
            temp1 = v[extFim];
            temp2 = v[extIni];
            v[extFim] = temp2; //extremo do fim do vetor passa a ser = a temporária 2
            v[extIni] = temp1; //extremo do inicio do vetor passa a ser = a temporária 1
            extFim--; //o extremo fim passa a decair uma posição
            extIni++; //o extremo inicio passa a acrescentar uma posição
        }

        for(i =0;i<=v.length-1;i++){
            System.out.println(v[i]);
        }
    }
}


