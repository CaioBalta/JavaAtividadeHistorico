public class Pagina
{

    private String titulo;
    private String url;
    public Pagina proximPagina;

    public Pagina(String titulo, String url)
    {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl()
    {
        return url;
    }

    public String getTitulo()  
    {
        return titulo;
    }

    @Override
    public String toString() {
        return "Pagina [url=" + url + ", titulo=" + titulo + "]";
    }
    
}
