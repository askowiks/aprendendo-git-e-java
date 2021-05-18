
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// <editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author Welder Askowiks, 17 de mai de 2021, 22:11:42
 * Last update: -
 */// </editor-fold>
public class ExercicioK {
	
	public static void main(String[] args) {
	
		//PASSO 1: CRIAR 2 ARRAYS A e B
		Integer tamanho = 3;
		Integer[] arrayA = new Integer[tamanho];
		Integer[] arrayB = new Integer[tamanho];
		
		
		//PASSO 2: LER VALORES PARA "A" QUE SEJAM POSITIVOS
		for (int indice = 0; indice < arrayA.length; indice++) {
			arrayA[indice] = readPositives("Digite o " + (indice + 1) + "º valor");
			
		//PASSO 3: ATRIBUIR VALORES PARA ARRAY "B" BASEADOS NO "A" DE FORMA QUE SE TORNEM NEGATIVOS
			arrayB[indice] = arrayA[indice] * -1;
		}
		
		//PASSO 4: EXIBIR VALORES DO ARRAY B
		System.out.println("Valores do Array B");
		
		for (int indice = 0; indice < arrayB.length; indice++) {
			System.out.println("[" + indice + "]: " + arrayB[indice]);
		}
		
		
		
		
		
	}
//funções/métodos
//Regra: public static [tipo de retorno - void ou tipo de var] [nome da função] (  [parametros - opcionais]  )
	public static Integer read(String mensagem) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(mensagem);
		Integer valor = scanner.nextInt();
		return valor;
		
	}
	
	public static Integer readPositives(String mensagem) {
		Integer valorLido = -1;
		
		while (valorLido < 0) {
			valorLido = read(mensagem);
			
			if (valorLido < 0) {
				System.out.println("Digite um número positivo");
				
			}
		}
		return valorLido;
	}
	
	
}//class
