import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Trabalho {
    int id;
    String nome;
    int paginas;

    Trabalho(int id, String nome, int paginas) {
        this.id = id;
        this.nome = nome;
        this.paginas = paginas;
    }

    public String toString() {
        return id + " - " + nome + " - " + paginas + " páginas";
    }
}

public class FilaImpressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Trabalho> fila = new LinkedList<>();
        int opcao;
        
        do {
            System.out.println("1. Adicionar trabalho  2. Imprimir  3. Exibir fila  4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Páginas: ");
                    int paginas = scanner.nextInt();
                    scanner.nextLine();
                    fila.add(new Trabalho(id, nome, paginas));
                    break;
                case 2:
                    System.out.println(fila.isEmpty() ? "Fila vazia" : "Imprimindo: " + fila.poll());
                    break;
                case 3:
                    System.out.println(fila.isEmpty() ? "Fila vazia" : fila);
                    break;
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
