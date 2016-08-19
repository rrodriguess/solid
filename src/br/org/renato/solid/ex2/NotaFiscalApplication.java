package br.org.renato.solid.ex2;

import java.util.LinkedList;
import java.util.List;

public class NotaFiscalApplication {

    public static void main(String [] args) {
        NotaFiscal nf = new NotaFiscal(new Integer(20), new Double(656.54), new Double(20));
        Fatura fatura = new Fatura(new Double(200), "Ricardo Eletro");

        List<AcaoAposGerarNota> acoes = new LinkedList<>();
        acoes.add(new NotaFiscalDao());
        acoes.add(new EnviadorDeEmail());

        GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(acoes);
        geradorDeNotaFiscal.gera(fatura);

        System.out.println("Saindo programa");
    }
}
