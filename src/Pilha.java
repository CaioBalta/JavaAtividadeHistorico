public class Pilha
{

    Pagina top;
    int size;

    public Pilha()
    {
        top = null;
        size = 0;
    }

    public void push(Pagina pag)//adiciona ao topo
    {
        Pagina p = new Pagina(pag.getTitulo(), pag.getUrl());
        p.proximPagina = top;
        top = p;
        size++;
    }

    public Pagina pop()//remove do topo
    {
        if (isEmpty())
        {
            System.out.println("Pilha vazia");
            return null;
        }
        Pagina p = top;
        top = top.proximPagina;
        size--;
        return p;
    }

    public boolean isEmpty()//verifica se a pilha esta vazia
    {
        return size == 0;
    }

    public int size()//retorna o tamanho da pilha
    {
        return size;
    }

    public Pagina getTop()//retorna o topo da pilha
    {
        return top;
    }

}
