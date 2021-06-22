public class CalculaMinhaIdade {
    public static void main (String[] args) {
        int anoAtual = 2021;
        int anoQueNasci = 1991;
        int idade = anoAtual - anoQueNasci;
        String nome = "Welder";

        System.out.println(
            "         Olá " + nome +"!" +
            "\n Sua idade atual é " + idade + " anos." +
            "\n Já está quase na metade :P"
        );
    }
}