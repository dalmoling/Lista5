package YColecoesAtividade.test;

import YColecoesAtividade.dominio.Pais;

public class PaisTest {
    public static void main(String[] args) {
         Pais pais1 = new Pais("Pais1", "01","P1",100, 1000);
        Pais pais2 = new Pais("Pais2", "02","P2",200, 2000);
        Pais pais3 = new Pais("Pais3", "03","P3",300, 3000);
        Pais pais4 = new Pais("Pais4", "04","P4",400, 4000);
        Pais pais5 = new Pais("Pais5", "05","P5",500, 5000);

        pais1.setFronteiras(pais2);
        pais1.setFronteiras(pais3);
        pais4.setFronteiras(pais2);
        pais4.setFronteiras(pais3);

        pais1.getFronteira();

        pais1.RetornarDensidade(pais1);

    }
}
