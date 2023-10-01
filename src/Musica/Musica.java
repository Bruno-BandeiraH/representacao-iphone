package Musica;

public class Musica {
  private String nome;
  private String artista;
  private String duracao;

  public Musica(String nome, String artista, String duracao) {
    this.nome = nome;
    this.artista = artista;
    this.duracao = duracao;
  }

  public String getNome() {
    return nome;
  }

  public String getArtista() {
    return artista;
  }

  public String getDuracao() {
    return duracao;
  }
  
}
