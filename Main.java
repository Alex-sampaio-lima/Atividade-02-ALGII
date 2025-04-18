import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String[] dicionario = new String[1000];
        File arquivo = new File("teste.txt");
        Scanner leitorArquivo = new Scanner(arquivo);
        String palavra = "";
        int count = 0;
        int i = 0;
        String linha = "";
        boolean palavraExistente = false;

        while (leitorArquivo.hasNext()) {
            linha = leitorArquivo.next().toLowerCase();

            count++;

            palavraExistente = false;
            for (int j = 0; j < i; j++) {
                if (dicionario[j].equals(linha)) {
                    palavraExistente = true;
                    break;
                }
            }

            if (!palavraExistente) {
                dicionario[i] = linha;
                i++;

                for (int j = 0; j < i - 1; j++) {
                    for (int k = 0; k < i - 1 - j; k++) {
                        if (dicionario[k].compareTo(dicionario[k + 1]) > 0) {
                            String temp = dicionario[k];
                            dicionario[k] = dicionario[k + 1];
                            dicionario[k + 1] = temp;
                        }
                    }
                }
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.println(dicionario[j]);
        }
        System.out.println("Total de palavras diferentes no dicionarios = " + i);
        leitorArquivo.close();
    }
}