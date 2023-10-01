package Telefone;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonico {
  private List<Contato> listaDeContatos;
  private List<Contato> listaMensagemVoz;

  public AparelhoTelefonico() {
    this.listaDeContatos = new ArrayList<>();
  }

  public void ligar(Contato contato) {
    // ligar para contato.getNumero();
    System.out.println("Ligando para " + contato.getNome() + " . . .");
  }

  public void atender() {
    System.out.println("Atendendo ligação.");
    // se não atender, colocar chamada na caixa postal
    // caso uma mensagem seja gravada, adicionar a lista de mensagens de voz
  }

  public void iniciarCorreioVoz(List<Contato> listaMensagemVoz) {
    System.out.println("Abrindo correio de voz. . .");
    System.out.println("Retornando lista de mensagens de voz");
    System.out.println(listaMensagemVoz);
  }
}
