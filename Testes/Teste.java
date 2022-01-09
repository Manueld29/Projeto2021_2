import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Teste {
    Biblioteca Teste = new Biblioteca();

    {
        Teste.Add("CD", "SHE SELLS SANCTUARY", "LOVE", "The Cult", "The Cult", "1985", "NULL", "NULL");
        Teste.Add("CD", "White Wedding", "Rebel Yell", "Billy Idol", "Billy Idol", "1983", "NULL", "NULL");
        Teste.Add("CD", "Losing my Religion", "Out of Time", "R.E.M", "R.E.M", "1991", "NULL", "NULL");
        Teste.Add("MP3", "Dior", "Meet the Woo", "Pop Smoke", "Pop Smoke", "2019", "4,3", "NULL");
        Teste.Add("MP3", "Welcome to the Party", "Meet the Woo", "Pop Smoke", "Pop Smoke", "2019", "4.6", "NULL");
        Teste.Add("MP3", "Every Breath You Take", "Synchronicity", "The Police", "The Police", "1983", "4,8", "NULL");
        Teste.Add("MP3", "PARTY ROCK", "PARTY ROCK", "LMFAO", "LMFAO", "2010", "3,7", "NULL");
        Teste.Add("LP", "Bohemian Rhapsody", "A Night at the Opera", "Freddie Mercury", "Queen", "1975", "NULL", "33");
        Teste.Add("LP", "Smells like a teen spirit", "NEVERMIND", "NIRVANA", "NIRVANA", "1991", "NULL", "33");
        Teste.Add("LP", "DEAR MAMA", "ME AGAINST THE WORLD", "TUPAC", "TUPAC", "1994", "NULL", "45");
    }

    @Test
    public void TesteFormato() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("Formato", "MP3");
        String OutputEsperado1 = "Resuldado de pesquisa de 'MP3' em Formato da musica foi:" +
                "MP3 | Titulo - 'Dior'| Album - 'Meet the Woo'| Compositor - 'Pop Smoke'| Interprete - 'Pop Smoke'| Ano - 2019 | Tamanho (MBytes) - 4,3 | Velocidade (Rpm) - NULL" +
                "MP3 | Titulo - 'Welcome to the Party'| Album - 'Meet the Woo'| Compositor - 'Pop Smoke'| Interprete - 'Pop Smoke'| Ano - 2019 | Tamanho (MBytes) - 4.6 | Velocidade (Rpm) - NULL" +
                "MP3 | Titulo - 'Every Breath You Take'| Album - 'Synchronicity'| Compositor - 'The Police'| Interprete - 'The Police'| Ano - 1983 | Tamanho (MBytes) - 4,8 | Velocidade (Rpm) - NULL" +
                "MP3 | Titulo - 'PARTY ROCK'| Album - 'PARTY ROCK'| Compositor - 'LMFAO'| Interprete - 'LMFAO'| Ano - 2010 | Tamanho (MBytes) - 3,7 | Velocidade (Rpm) - NULL";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteTitulo() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("titulo", "Smells like a teen spirit");
        String OutputEsperado1 = "Resuldado de pesquisa de 'Smells like a teen spirit' em titulo da musica foi:" +
                "LP | Titulo - 'Smells like a teen spirit'| Album - 'NEVERMIND'| Compositor - 'NIRVANA'| Interprete - 'NIRVANA'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteAlbum() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("Album", "Me against the world");
        String OutputEsperado1 = "Resuldado de pesquisa de 'Me against the world' em Album da musica foi:" +
                "LP | Titulo - 'DEAR MAMA'| Album - 'ME AGAINST THE WORLD'| Compositor - 'TUPAC'| Interprete - 'TUPAC'| Ano - 1994 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 45";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteCompositor() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("compositor", "the");
        String OutputEsperado1 = "Resuldado de pesquisa de 'the' em compositor da musica foi:" +
                "0 Resultados encontrados" +
                "Resultados da pesquisa que contenham 'the' em compositor da musica foi:" +
                "MP3 | Titulo - 'Every Breath You Take'| Album - 'Synchronicity'| Compositor - 'The Police'| Interprete - 'The Police'| Ano - 1983 | Tamanho (MBytes) - 4,8 | Velocidade (Rpm) - NULL" +
                "CD | Titulo - 'SHE SELLS SANCTUARY'| Album - 'LOVE'| Compositor - 'The Cult'| Interprete - 'The Cult'| Ano - 1985 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteInterprete() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("interprete", "R.E.M");
        String OutputEsperado1 = "Resuldado de pesquisa de 'R.E.M' em interprete da musica foi:" +
                "CD | Titulo - 'Losing my Religion'| Album - 'Out of Time'| Compositor - 'R.E.M'| Interprete - 'R.E.M'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteAno() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("Ano", 1975, 1985);
        String OutputEsperado1 = "Resuldado de pesquisa de musicas do ano '1975' até '1985' foi:" +
                "CD | Titulo - 'SHE SELLS SANCTUARY'| Album - 'LOVE'| Compositor - 'The Cult'| Interprete - 'The Cult'| Ano - 1985 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                "CD | Titulo - 'White Wedding'| Album - 'Rebel Yell'| Compositor - 'Billy Idol'| Interprete - 'Billy Idol'| Ano - 1983 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                "MP3 | Titulo - 'Every Breath You Take'| Album - 'Synchronicity'| Compositor - 'The Police'| Interprete - 'The Police'| Ano - 1983 | Tamanho (MBytes) - 4,8 | Velocidade (Rpm) - NULL" +
                "LP | Titulo - 'Bohemian Rhapsody'| Album - 'A Night at the Opera'| Compositor - 'Freddie Mercury'| Interprete - 'Queen'| Ano - 1975 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteTamanho() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("tamanho", "NULL");
        String OutputEsperado1 = "Resuldado de pesquisa de 'NULL' em tamanho da musica foi:" +
                "CD | Titulo - 'SHE SELLS SANCTUARY'| Album - 'LOVE'| Compositor - 'The Cult'| Interprete - 'The Cult'| Ano - 1985 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                "CD | Titulo - 'White Wedding'| Album - 'Rebel Yell'| Compositor - 'Billy Idol'| Interprete - 'Billy Idol'| Ano - 1983 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                "CD | Titulo - 'Losing my Religion'| Album - 'Out of Time'| Compositor - 'R.E.M'| Interprete - 'R.E.M'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                "LP | Titulo - 'Bohemian Rhapsody'| Album - 'A Night at the Opera'| Compositor - 'Freddie Mercury'| Interprete - 'Queen'| Ano - 1975 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33" +
                "LP | Titulo - 'Smells like a teen spirit'| Album - 'NEVERMIND'| Compositor - 'NIRVANA'| Interprete - 'NIRVANA'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33" +
                "LP | Titulo - 'DEAR MAMA'| Album - 'ME AGAINST THE WORLD'| Compositor - 'TUPAC'| Interprete - 'TUPAC'| Ano - 1994 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 45";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteVelocidade() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.procurar("velocidade", "33");
        String OutputEsperado1 = "Resuldado de pesquisa de '33' em velocidade da musica foi:" +
                "LP | Titulo - 'Bohemian Rhapsody'| Album - 'A Night at the Opera'| Compositor - 'Freddie Mercury'| Interprete - 'Queen'| Ano - 1975 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33" +
                "LP | Titulo - 'Smells like a teen spirit'| Album - 'NEVERMIND'| Compositor - 'NIRVANA'| Interprete - 'NIRVANA'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteOrdenar() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.Ordenar();
        String OutputEsperado1 = "Ordem de musicas que ocupam mais espaço:" +
                "[MP3 | Titulo - 'Welcome to the Party'| Album - 'Meet the Woo'| Compositor - 'Pop Smoke'| Interprete - 'Pop Smoke'| Ano - 2019 | Tamanho (MBytes) - 4.6 | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'Every Breath You Take'| Album - 'Synchronicity'| Compositor - 'The Police'| Interprete - 'The Police'| Ano - 1983 | Tamanho (MBytes) - 4,8 | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'Dior'| Album - 'Meet the Woo'| Compositor - 'Pop Smoke'| Interprete - 'Pop Smoke'| Ano - 2019 | Tamanho (MBytes) - 4,3 | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'PARTY ROCK'| Album - 'PARTY ROCK'| Compositor - 'LMFAO'| Interprete - 'LMFAO'| Ano - 2010 | Tamanho (MBytes) - 3,7 | Velocidade (Rpm) - NULL]";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
    @Test
    public void TesteMostrar() {
        ByteArrayOutputStream OutputEcran1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OutputEcran1));
        Teste.MostrarOriginal();
        String OutputEsperado1 = "Lista Original:" +
                "[CD | Titulo - 'SHE SELLS SANCTUARY'| Album - 'LOVE'| Compositor - 'The Cult'| Interprete - 'The Cult'| Ano - 1985 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                ", CD | Titulo - 'White Wedding'| Album - 'Rebel Yell'| Compositor - 'Billy Idol'| Interprete - 'Billy Idol'| Ano - 1983 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                ", CD | Titulo - 'Losing my Religion'| Album - 'Out of Time'| Compositor - 'R.E.M'| Interprete - 'R.E.M'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'Dior'| Album - 'Meet the Woo'| Compositor - 'Pop Smoke'| Interprete - 'Pop Smoke'| Ano - 2019 | Tamanho (MBytes) - 4,3 | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'Welcome to the Party'| Album - 'Meet the Woo'| Compositor - 'Pop Smoke'| Interprete - 'Pop Smoke'| Ano - 2019 | Tamanho (MBytes) - 4.6 | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'Every Breath You Take'| Album - 'Synchronicity'| Compositor - 'The Police'| Interprete - 'The Police'| Ano - 1983 | Tamanho (MBytes) - 4,8 | Velocidade (Rpm) - NULL" +
                ", MP3 | Titulo - 'PARTY ROCK'| Album - 'PARTY ROCK'| Compositor - 'LMFAO'| Interprete - 'LMFAO'| Ano - 2010 | Tamanho (MBytes) - 3,7 | Velocidade (Rpm) - NULL" +
                ", LP | Titulo - 'Bohemian Rhapsody'| Album - 'A Night at the Opera'| Compositor - 'Freddie Mercury'| Interprete - 'Queen'| Ano - 1975 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33" +
                ", LP | Titulo - 'Smells like a teen spirit'| Album - 'NEVERMIND'| Compositor - 'NIRVANA'| Interprete - 'NIRVANA'| Ano - 1991 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 33" +
                ", LP | Titulo - 'DEAR MAMA'| Album - 'ME AGAINST THE WORLD'| Compositor - 'TUPAC'| Interprete - 'TUPAC'| Ano - 1994 | Tamanho (MBytes) - NULL | Velocidade (Rpm) - 45]";
        Assertions.assertEquals(OutputEsperado1.replaceAll("\n", "").replaceAll("\r", ""), OutputEcran1.toString().replaceAll("\r", "").replaceAll("\n", ""));
    }
}