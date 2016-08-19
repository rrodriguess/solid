package br.org.renato.solid.ex2;

public class NotaFiscalDao implements AcaoAposGerarNota{

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Salva nf no banco");
    }
}