import java.util.Scanner;

public class Questao {
  String pergunta = "";
  String opcaoA = "";
  String opcaoB = "";
  String opcaoC = "";
  String opcaoD = "";
  String opcaoE = "";
  String correta = "";


  public boolean isCorreta(String resposta) {
    if (resposta.equalsIgnoreCase(this.correta)) {
      System.out.println("Parabéns, resposta Correta! - Letra: " + this.correta);
      System.out.println("");
      return true;
    } else {
      System.out.println("Resposta Errada!");
      System.out.println("A opção correta é a letra: " + this.correta);
      System.out.println("");
      return false;
    }
  }


  public String leiaResposta(Scanner scanner) {
    String resp;
    do {
      System.out.println("Digite a resposta (A, B, C, D, ou E): ");
      resp = scanner.next();
    } while (!respostaValida(resp));
    return resp;
  }


  private boolean respostaValida(String resp) {
    if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
            resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
      return true;
    }
    System.out.println("Resposta inválida! Digite uma opção válida: A, B, C, D ou E.");
    System.out.println("");
    return false;
  }


  public void escrevaQuestao() {
    System.out.println(this.pergunta);
    System.out.println();
    System.out.println("A) " + this.opcaoA);
    System.out.println("B) " + this.opcaoB);
    System.out.println("C) " + this.opcaoC);
    System.out.println("D) " + this.opcaoD);
    System.out.println("E) " + this.opcaoE);
    System.out.println();
  }
}