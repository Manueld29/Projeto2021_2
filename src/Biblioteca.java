import java.util.*;

public class Biblioteca {
    ArrayList<Musicas> ListaOriginal = new ArrayList<>();

    public void Add(String formato, String titulo, String album, String compositor, String interprete, String ano, String tamanho, String velocidade) {
        ListaOriginal.add(new Musicas(formato, titulo, album, compositor, interprete, ano, tamanho, velocidade));
    }

    public void MostrarOriginal() {
        System.out.println("Lista Original:\n" + ListaOriginal);

    }
    public void iniciar() {
        int opcao=10; // opcao =10 para não fazer confusao nas opcoes do menu
        try {
            Scanner Opcao = new Scanner(System.in);
            System.out.println("Quer criar uma nova biblioteca ou utilar uma existente?\n Opção:\n (1) - Existente\n (2) - Biblioteca nova");
            opcao = Opcao.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Opção invlida!");
            iniciar();
        }
        if (opcao==1) { //Biblioteca Existente
            Add("CD", "She Sells Sanctuary", "Love", "The Cult", "The Cult", "1985", "NULL", "NULL");
            Add("CD", "White Wedding", "Rebel Yell", "Billy Idol", "Billy Idol", "1983", "NULL", "NULL");
            Add("CD", "Losing my Religion", "Out of Time", "R.E.M", "R.E.M", "1991", "NULL", "NULL");
            Add("MP3", "Dior", "Meet the Woo", "Pop Smoke", "Pop Smoke", "2019", "4,3", "NULL");
            Add("MP3", "Welcome to the Party", "Meet the Woo", "Pop Smoke", "Pop Smoke", "2019", "4,6", "NULL");
            Add("MP3", "Every Breath You Take", "Synchronicity", "The Police", "The Police", "1983", "4,8", "NULL");
            Add("MP3", "Party Rock", "Party Rock", "LMFAO", "LMFAO", "2010", "3,7", "NULL");
            Add("LP", "Bohemian Rhapsody", "A Night at the Opera", "Freddie Mercury", "Queen", "1975", "NULL", "33");
            Add("LP", "Smells Like A Teen Spirit", "NeverMind", "Nirvana", "Nirvana", "1991", "NULL", "33");
            Add("LP", "Dear Mama", "Me against the World", "Tupac", "Tupac", "1994", "NULL", "45");
        }else if(opcao==2){ //Biblioteca Nova
            CriarLista();
        } else {
            System.out.println("Opção Invalida!");
            iniciar();
        }
    }

    public void CriarLista() {
        String Formato, Titulo, Album, Compositor, Interprete, Tamanho, Velocidade;
        Formato = Tamanho = Velocidade = "NULL"; // definar variaveis dentro de if
        int TamanhoLista = 0;
        try {
            Scanner tamanhoLista = new Scanner(System.in);
            System.out.println("Tamanho da nova lista?");
            TamanhoLista = tamanhoLista.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Opção Invalida!");
            CriarLista();
        }

        for (int contador = 0; contador < TamanhoLista; contador++) {
            int opcao = 0, Ano = 0;

            while (opcao < 1 || opcao > 3) {
                try {
                    Scanner Opcao = new Scanner(System.in);
                    System.out.println("Formato da musica " + (contador + 1) + " :\n(1) - CD\n(2) - MP3\n(3) - LP\n");
                    opcao = Opcao.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Opção Invalida!");
                }
            }

            Scanner titulo = new Scanner(System.in);
            System.out.println("Titulo:");
            Titulo = titulo.next();
            Scanner album = new Scanner(System.in);
            System.out.println("Album:");
            Album = album.next();
            Scanner compositor = new Scanner(System.in);
            System.out.println("Compositor:");
            Compositor = compositor.next();
            Scanner interprete = new Scanner(System.in);
            System.out.println("Interprete");
            Interprete = interprete.next();

            while (Ano < 999 || Ano > 10000) {
                try {
                    Scanner ano = new Scanner(System.in);
                    System.out.println("Ano:");
                    Ano = ano.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ano Invalido!");
                }
            }
            if (opcao == 1) { //CD
                Formato = "CD";
                Tamanho = "NULL";
                Velocidade = "NULL";
            } else if (opcao == 2) {//MP3
                Formato = "MP3";
                Velocidade = "NULL";
                Scanner tamanho = new Scanner(System.in);
                System.out.println("Tamanho (MBytes):");
                Tamanho = tamanho.next();
            } else if (opcao == 3) { //LP
                Formato = "LP";
                Tamanho = "NULL";
                Scanner velocidade = new Scanner(System.in);
                System.out.println("Velocidade (RPM):");
                Velocidade = velocidade.next();
            }
            Add(Formato, Titulo, Album, Compositor, Interprete, String.valueOf(Ano), Tamanho, Velocidade);
        }

    }
    public void navegar(){
        boolean sair=false;
        while (!sair){
            int opcao=10;
            try {
                Scanner x = new Scanner(System.in);
                System.out.println("O que quer fazer?\n(1) - Procurar\n(2) - Ordenar MP3 por Tamanho\n(3) - Mostrar Lista\n(0)- Sair");
                opcao = x.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Opção Invalida!");
            }
            if (opcao==0){  //Sair
                System.out.println("A sair...");
                sair=true;
            }else if (opcao==1){ //Procurar
                int opcao2=10;
                try {
                    Scanner Opcao2 = new Scanner(System.in);
                    System.out.println("O que quer procurar?\n(1) - Formato\n(2) - Titulo\n(3) - Album\n(4) - Compositor\n(5) - Interprete\n(6) - Ano\n(7) - Tamanho\n(8) - Velocidade");
                    opcao2 = Opcao2.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Opcao Invalida!");
                }
                if (opcao2 == 6) {//Procurar Ano
                    int AnoInicio, AnoFim;
                    try {
                        Scanner n1 = new Scanner(System.in);
                        System.out.println("Ano de inicio:");
                        AnoInicio = n1.nextInt();
                        Scanner n2 = new Scanner(System.in);
                        System.out.println("Ano de fim");
                        AnoFim = n2.nextInt();
                        procurar("Ano", AnoInicio, AnoFim);
                    }catch (InputMismatchException e){
                        System.out.println("Opção Invalida");
                    }
                } else if (opcao2 > 0 && opcao2 < 9) {
                    Scanner pesq = new Scanner(System.in);
                    System.out.println("Pesquisa:");
                    String pesquisa = pesq.next();
                    if (opcao2 == 1) {//Formato
                        procurar("Formato", pesquisa);
                    }
                    if (opcao2 == 2) {//Titulo
                        procurar("Titulo", pesquisa);
                    }
                    if (opcao2 == 3) {//Album
                        procurar("Album", pesquisa);
                    }
                    if (opcao2 == 4) {//Compositor
                        procurar("Compositor", pesquisa);
                    }
                    if (opcao2 == 5) {//Interprete
                        procurar("Interprete", pesquisa);
                    }
                    if (opcao2 == 7) {//Tamanho
                        procurar("Tamanho", pesquisa);
                    }
                    if (opcao2 == 8) { //Velocidade
                        procurar("Velocidade", pesquisa);
                    }
                }
            }else if (opcao==2){ //Ordenar
                Ordenar();
            }else if (opcao==3) {  //Mostrar
                MostrarOriginal();
            }
        }
    }

    public void procurar(String Atributo, int AnoI, int AnoF) {
        Iterator<Musicas> ListaPesquisa = ListaOriginal.iterator();
        System.out.println("Resuldado de pesquisa de musicas do ano '" + AnoI + "' até '" + AnoF + "' foi:");
        boolean Resultados = false;
        while (ListaPesquisa.hasNext()) {
            Musicas MusicaAtual = ListaPesquisa.next();
            int AnoMusica = Integer.parseInt(MusicaAtual.get(Atributo));
            if (AnoI <= AnoMusica && AnoF >= AnoMusica) {
                System.out.println(MusicaAtual);
                Resultados = true;
            }
        }
        if (!Resultados) {
            System.out.println("0 Resultados encontrados");
        }
    }

    public void  procurar(String Atributo, String pesquisa) {
        ListIterator<Musicas> ListaPesquisa = ListaOriginal.listIterator();
        System.out.println("Resuldado de pesquisa de '" + pesquisa + "' em " + Atributo + " da musica foi:");
        pesquisa = pesquisa.toLowerCase();
        boolean Resultados = false;
        while (ListaPesquisa.hasNext()) {
            Musicas MusicaAtual = ListaPesquisa.next();
            if ((MusicaAtual.get(Atributo)).equalsIgnoreCase(pesquisa)) {
                System.out.println(MusicaAtual);
                Resultados = true;
            }
        }
        if (!Resultados) {
            System.out.println("0 Resultados encontrados");
            System.out.println("Resultados da pesquisa que contenham '" + pesquisa + "' em " + Atributo + " da musica foi:");
            while (ListaPesquisa.hasPrevious()) {         // quando nao encontra um resultado igual verifica se algum parametro contem a pesquisa
                Musicas MusicaAtual = ListaPesquisa.previous();
                if ((MusicaAtual.get(Atributo)).contains(pesquisa)) {
                    System.out.println(MusicaAtual);
                }
            }
        }
    }

    public void Ordenar() {
        Iterator<Musicas> ListaMp3 = ListaOriginal.iterator();
        List<Musicas> ListaMp3Ordenada = new ArrayList<>();
        System.out.println("Ordem de musicas que ocupam mais espaço:");
        while (ListaMp3.hasNext()) {
            Musicas MusicaAtual = ListaMp3.next();
            if ((MusicaAtual.formato).equalsIgnoreCase("MP3")) {
                ListaMp3Ordenada.add(MusicaAtual);
            }
        }
        ListaMp3Ordenada.sort(Comparator.comparing(Musicas::getTamanho).reversed());
        System.out.println(ListaMp3Ordenada);
    }
}

