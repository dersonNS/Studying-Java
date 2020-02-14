public class condicoes{

    public static void main(String[] args) {
        //Condições
        int vida = 100;
            vida+=100;
        if(vida == 100){
            System.out.println("Vida igual a 100!");
        }else{
            System.out.println("vida nao e igual a 100!");
        }
        
        String name_perso = "x";
        if(name_perso == "Maxel"){
            System.out.println("O nome do personagem é "+name_perso);
        }
        else{
            System.out.println("Nome do personagem alterado");
        }
    }
}