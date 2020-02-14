public class op_math{

    public static void main(String[] args){
        //Operações matematicas
        int hp_torre1 = 0;
        int hp_torre2 = 0;
        int hp_torres = hp_torre1 + hp_torre2;
        int jogadores_vivos = 0;

        System.out.println("Total de hp das torres: "+hp_torres);
        System.out.println("Personagens vivos: "+jogadores_vivos);
        
        // Operadores && e ||

        if(jogadores_vivos > 0 && hp_torres > 0){
            System.out.println("Voce está otimo! Tem jogadores e torres ainda!");

        }
        else if(jogadores_vivos == 0 && hp_torres > 0){
            System.out.println("Vamos lá, o jogo nao acabou ainda! Voce nascera em alguns segundos.");
        }
        else if(jogadores_vivos > 0 && hp_torres == 0){
            System.out.println("Voce está sem torres, se morrer o game acaba!");
        }
        else {
            System.out.println("Voce está sem torres e sem jogadores. Game over!");
        }

    }
}