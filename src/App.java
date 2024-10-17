public class App
{

    public static void main(String[] args) throws Exception
    {
        Pilha historico = new Pilha(); // Cria uma nova pilha para o histórico

        // Adiciona algumas páginas ao histórico
        historico.push(new Pagina("Exemplo 1", "https://www.exemplo1.com"));
        historico.push(new Pagina("Exemplo 2", "https://www.exemplo2.com"));
        historico.push(new Pagina("Exemplo 3", "https://www.exemplo3.com"));

        System.out.println("Página atual: " + historico.getTop());
        historico.pop();
        System.out.println("Voltando para: " + historico.getTop());
        historico.push(new Pagina("Exemplo 4", "https://www.exemplo4.com"));
        System.out.println("Página atual: " + historico.getTop());
        System.out.println("Tamanho do histórico: " + historico.size());
        historico.pop();
        historico.pop();
        System.out.println("Página atual após voltar: " + (historico.isEmpty() ? "Nenhuma página" : historico.getTop()));

        // Limpa o histórico
        while (!historico.isEmpty()) {
            historico.pop();
        }
        System.out.println("O histórico está vazio? " + (historico.isEmpty() ? "Sim" : "Não"));
    
    }
}
