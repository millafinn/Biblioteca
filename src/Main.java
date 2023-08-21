import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        Livro book[] = new Livro[999];
       String retorno = inp.next();


        do{
            System.out.println("Digite 1, para cadastrar um livro: ");
            System.out.println("Digite 2, procurar livro: ");
            System.out.println("Digite 3, listar um livro: ");
            System.out.println("Digite 4, quantidade cadastrada de livro: ");
            System.out.println("Digite 5, excluir ultimo livro da lista: ");
            System.out.println("Digite 6, ordenar livros cadastrados: ");
            System.out.println("Digite 7, encerrar programa");
            retorno = inp.next();


        }while (!retorno.equals("7"));
    }
}