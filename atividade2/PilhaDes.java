public class PilhaDes
{

    Acao top;
    int size;

    public PilhaDes()
    {
        this.top = null;
        this.size = 0;
    }

    public void push(char valor)
    {
        Acao acao = new Acao(valor);
        acao.proximo = this.top;
        this.top = acao;
        size++;
    }

    public char pop()
    {
        Acao acao = top;
        char ex = acao.valor;
        top = top.proximo;
        size--;
        return ex;
    }

    public int size() {
        return size;
    }

}
