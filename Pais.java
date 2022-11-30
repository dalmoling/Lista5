package YColecoesAtividade.dominio;

import java.util.ArrayList;

public class Pais {
    private String Nome;
    private String codigo;
    private String NomeReduzido;
    private int Populacao;
    private ArrayList<String> fronteira = new ArrayList<>();

    private int Dimensao;



    public Pais(String nome, String codigo, String nomeReduzido, int populacao, int dimensao){
        this.Nome = nome;
        this.codigo = codigo;
        this.NomeReduzido = nomeReduzido;
        this.Populacao = populacao;
        this.Dimensao = dimensao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeReduzido() {
        return NomeReduzido;
    }

    public void setNomeReduzido(String nomeReduzido) {
        NomeReduzido = nomeReduzido;
    }

    public int getPopulacao() {
        return Populacao;
    }

    public void setPopulacao(int populacao) {
        Populacao = populacao;
    }

    public ArrayList<String> getFronteira() {
        return fronteira;
    }

    public void setFronteira(ArrayList<String> fronteira) {
        this.fronteira = fronteira;
    }

    public int getDimensao(){
        return Dimensao;
    }

    public void setDimensao(int dimensao){
        this.Dimensao = dimensao;
    }

    public void AdicionarPais(Pais p){
        fronteira.add(String.valueOf(p));
    }

    public Double RetornarDensidade(Pais p){
        Double Densidade;
        Densidade = Double.valueOf(p.Dimensao / p.Populacao);
        System.out.println(Densidade);
        return Densidade;
    }


    public void setFronteiras(Pais pais) {
        if(!fronteira.contains(pais) && this.fronteira.size() < 10) {
            fronteira.add(String.valueOf(pais));
            pais.setFronteira(this.getFronteira());
        }
    }

    public ArrayList<String> FronteirasEmComum(Pais pais){
        ArrayList<String> fronteirasComum = new ArrayList<>();

        for(String pais1: pais.getFronteira()) {
            if(this.fronteira.contains(pais1)) {
                fronteirasComum.add(pais1);
                System.out.println(fronteirasComum);
            }
        }
        return fronteirasComum;
    }
}


