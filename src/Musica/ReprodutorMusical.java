package Musica;

import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
  private List<Musica> listaDeMusicas;

  public ReprodutorMusical() {
    this.listaDeMusicas = new ArrayList<>();
  }

  public void tocarMusica(Musica musica) {
    System.out.println("tocando musica. . .");
  }

  public void pausarMusica(Musica musica) {
    System.out.println("Pausando musica. . .");
  }

  public void selecionarMusica(Musica musica) {
    System.out.println("Selecionando musica");
  }
}
