public class arrays {
	
	public static void main(String[] args){
		
		String[] nome = new String[5];
		nome[0] = "Anderson";
		nome[1] = "Bruno";
		nome[2] = "Sousa";
		nome[3] = "Joao";
		nome[4] = "Helo";
		
		System.out.println("O segundo nome da lista � "+nome[1]);
		
		//Strings MultDimen
		
		String[][] tabela = new String[5][5];
		tabela[0][0] = "Esta � a Linha 1 coluna 1";
		tabela[0][1] = "Esta � a Linha 1 coluna 2";
		tabela[0][2] = "Esta � a Linha 1 coluna 3";
		tabela[0][3] = "Esta � a Linha 1 coluna 4";
		tabela[0][4] = "Esta � a Linha 1 coluna 5";
		
		System.out.println("Imprimir linha 1 coluna 5 \n"+tabela[0][4]);
		
 		
	}
}
