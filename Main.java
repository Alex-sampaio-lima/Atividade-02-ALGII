/*
Entrega a Atividade 2 - Algoritmos e Programação II

Nós,

Alexsander Sampaio Lima 
Ana Julia Ferreira Lima 
Sthephany Viana da Silva 

declaramos que

todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou prejudicar outros.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner read = new Scanner(System.in);

        String[] palavras = new String[1000];

        File arquivo = new File("teste.txt");

        System.out.println(arquivo);

        Scanner leitorArquivo = new Scanner(arquivo);

        String linha;
        while (leitorArquivo.hasNext()) {
            linha = leitorArquivo.nextLine();
            System.out.println(linha);
        }
        leitorArquivo.close();

    }
}