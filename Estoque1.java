package Gabriel;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op��o;
		
		Scanner leia = new Scanner (System.in);

		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("(\"\\n(1)adicionar produtos\\n\"\r\n(2)Deseja remover um produto?\n(3)Atualizar\n(4)Mostrar todos os produtos do estoque\"\r\n\n(0) Encerrar o programa\");\r\n"
					+ "");
			System.out.println("\n-----------------------------------------");
			System.out.println("\n\t\tDigite sua op��o: ");
			System.out.println("\n-----------------------------------------");
			op��o = leia.nextInt();
			
			switch(op��o)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nProduto n�o existe no estoque...");
				}
				System.out.println(estoque);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrar� no lugar de "+verifica+" : ");
				
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
					
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto n�o existente...");
				}
				
				System.out.println(estoque);
				break;
			case 4:
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nFinalizou o programa... Volte sempre...");
				
			}
			
		}
		while(op��o!=0);
	}




			
		

		
		
	
		
	}


