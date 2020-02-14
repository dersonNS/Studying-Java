public class switch_case{

    public static void main(String[] args){

        int hp = 100;

        switch(hp)
        {
            case 90:
            System.out.println("Personagem ganha movespeed!");
            break;

            case 30:
            System.out.println("Hp: 30!");
            break;

            default:
            System.out.println("Nenhuma condiçao, voce está com 100 de hp!");
            break;

        }

    }
}