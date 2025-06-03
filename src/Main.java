import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        cabecalho.exibirInformacoes();


        ArrayList<Questao> questoes = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);


        Questao q1 = new Questao();
        q1.pergunta = "Qual é a capital da França?";
        q1.opcaoA = "A) Berlim";
        q1.opcaoB = "B) Madri";
        q1.opcaoC = "C) Paris";
        q1.opcaoD = "D) Roma";
        q1.opcaoE = "E) Lisboa";
        q1.correta = "C";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "Quantos planetas existem no sistema solar?";
        q2.opcaoA = "A) 7";
        q2.opcaoB = "B) 8";
        q2.opcaoC = "C) 9";
        q2.opcaoD = "D) 10";
        q2.opcaoE = "E) 6";
        q2.correta = "B";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "Quantos lados tem um triângulo?";
        q3.opcaoA = "A) 2";
        q3.opcaoB = "B) 3";
        q3.opcaoC = "C) 4";
        q3.opcaoD = "D) 5";
        q3.opcaoE = "E) 6";
        q3.correta = "B";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "Qual é o maior planeta do Sistema Solar?";
        q4.opcaoA = "A) Terra";
        q4.opcaoB = "B) Marte";
        q4.opcaoC = "C) Júpiter";
        q4.opcaoD = "D) Saturno";
        q4.opcaoE = "E) Netuno";
        q4.correta = "C";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "Quem escreveu 'Dom Quixote'?";
        q5.opcaoA = "A) William Shakespeare";
        q5.opcaoB = "B) Machado de Assis";
        q5.opcaoC = "C) Miguel de Cervantes";
        q5.opcaoD = "D) Monteiro Lobato";
        q5.opcaoE = "E) José Saramago";
        q5.correta = "C";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "Qual o metal líquido em temperatura ambiente?";
        q6.opcaoA = "A) Ouro";
        q6.opcaoB = "B) Ferro";
        q6.opcaoC = "C) Mercúrio";
        q6.opcaoD = "D) Prata";
        q6.opcaoE = "E) Alumínio";
        q6.correta = "C";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "Quantos dias tem um ano bissexto?";
        q7.opcaoA = "A) 365";
        q7.opcaoB = "B) 366";
        q7.opcaoC = "C) 364";
        q7.opcaoD = "D) 360";
        q7.opcaoE = "E) 368";
        q7.correta = "B";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "Quem pintou a Mona Lisa?";
        q8.opcaoA = "A) Leonardo da Vinci";
        q8.opcaoB = "B) Pablo Picasso";
        q8.opcaoC = "C) Vincent van Gogh";
        q8.opcaoD = "D) Michelangelo";
        q8.opcaoE = "E) Salvador Dalí";
        q8.correta = "A";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "Qual o resultado de 8 × 7?";
        q9.opcaoA = "A) 49";
        q9.opcaoB = "B) 56";
        q9.opcaoC = "C) 64";
        q9.opcaoD = "D) 72";
        q9.opcaoE = "E) 84";
        q9.correta = "B";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "Qual é o país do tango?";
        q10.opcaoA = "A) Brasil";
        q10.opcaoB = "B) Espanha";
        q10.opcaoC = "C) Argentina";
        q10.opcaoD = "D) México";
        q10.opcaoE = "E) Portugal";
        q10.correta = "C";
        questoes.add(q10);


        Questao q11 = new Questao();
        q11.pergunta = "Quem descobriu o Brasil?";
        q11.opcaoA = "A) Cristóvão Colombo";
        q11.opcaoB = "B) Pedro Álvares Cabral";
        q11.opcaoC = "C) Dom Pedro I";
        q11.opcaoD = "D) Vasco da Gama";
        q11.opcaoE = "E) Fernão de Magalhães";
        q11.correta = "B";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "Qual é o gás essencial para a respiração humana?";
        q12.opcaoA = "A) Nitrogênio";
        q12.opcaoB = "B) Oxigênio";
        q12.opcaoC = "C) Hidrogênio";
        q12.opcaoD = "D) Dióxido de Carbono";
        q12.opcaoE = "E) Hélio";
        q12.correta = "B";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Qual é a cor da esmeralda?";
        q13.opcaoA = "A) Azul";
        q13.opcaoB = "B) Verde";
        q13.opcaoC = "C) Vermelho";
        q13.opcaoD = "D) Amarelo";
        q13.opcaoE = "E) Roxo";
        q13.correta = "B";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Qual o nome do famoso cientista que formulou a teoria da relatividade?";
        q14.opcaoA = "A) Isaac Newton";
        q14.opcaoB = "B) Albert Einstein";
        q14.opcaoC = "C) Nikola Tesla";
        q14.opcaoD = "D) Charles Darwin";
        q14.opcaoE = "E) Galileu Galilei";
        q14.correta = "B";
        questoes.add(q14);



        Questao q15 = new Questao();
        q15.pergunta = "Qual é o maior oceano do mundo?";
        q15.opcaoA = "A) Oceano Atlântico";
        q15.opcaoB = "B) Oceano Pacífico";
        q15.opcaoC = "C) Oceano Índico";
        q15.opcaoD = "D) Oceano Ártico";
        q15.opcaoE = "E) Oceano Antártico";
        q15.correta = "B";
        questoes.add(q15);



        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta(scanner);
            questao.isCorreta(resposta);
        }


        scanner.close();
    }
}