public class AppDesfaz
{

    public static void main(String[] args) throws Exception
    {
        PilhaDes pilha = new PilhaDes(); // Cria uma nova pilha

        // Adiciona algumas ações à pilha
        pilha.push('A');
        pilha.push('B');
        pilha.push('C');

        // Exibe o tamanho da pilha
        System.out.println("Tamanho da pilha: " + pilha.size());

        // Remove e exibe ações da pilha
        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Removendo: " + pilha.pop());

        // Exibe o tamanho da pilha após remoções
        System.out.println("Tamanho da pilha após remoções: " + pilha.size());

        // Remove o último elemento
        System.out.println("Removendo: " + pilha.pop());

        // Tenta remover de uma pilha vazia
        System.out.println("Removendo da pilha vazia: " + pilha.pop());
        
        // Exibe o estado final da pilha
        System.out.println("Tamanho final da pilha: " + pilha.size());
    }

}
