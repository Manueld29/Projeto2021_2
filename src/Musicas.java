public class Musicas {

    protected String formato, titulo, album, compositor, interprete, ano, tamanho, velocidade;

    public Musicas(String formato, String titulo, String album, String compositor, String interprete, String ano, String tamanho, String velocidade) {
        this.formato = formato;
        this.titulo = titulo;
        this.album = album;
        this.compositor = compositor;
        this.interprete = interprete;
        this.ano = ano;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
    }


    public String get(String Atributo) {
        if (Atributo.equalsIgnoreCase("formato")) {
            return formato.toLowerCase();
        } else if (Atributo.equalsIgnoreCase("titulo")) {
            return titulo.toLowerCase();
        } else if (Atributo.equalsIgnoreCase("album")) {
            return album.toLowerCase();
        } else if (Atributo.equalsIgnoreCase("compositor")) {
            return compositor.toLowerCase();
        } else if (Atributo.equalsIgnoreCase("interprete")) {
            return interprete.toLowerCase();
        } else if (Atributo.equalsIgnoreCase("ano")) {
            return ano;
        } else if (Atributo.equalsIgnoreCase("tamanho")) {
            return tamanho;
        } else if (Atributo.equalsIgnoreCase("velocidade")) {
            return velocidade;
        } else {
            return null;
        }
    }

    public String getTamanho() { // utilizado no metodo ordenar
        return tamanho;
    }

    public String toString() {
        return formato + " |" + " Titulo - '" + titulo + '\'' + "| Album - '" + album + '\'' + "| Compositor - '" + compositor + '\'' + "| Interprete - '" +
                interprete + '\'' + "| Ano - " + ano + " | Tamanho (MBytes) - " + tamanho + " | Velocidade (Rpm) - " + velocidade + "\n";
    }
}




