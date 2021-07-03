import java.util.Scanner;
public class Média_semestral_v2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
// DECLARANDO O VETOR
		int n = 3;
		double v[] = new double[n];
		int i;
		
		
// DEFININDO O LOOP DE PREENCHIMENTO
		
		for (i=0; i<n; i++) { 
			
		System.out.print("Aluno " + (i+1) + " Digite a nota da sua prova: ");
		double prova = sn.nextDouble() * 5;
		System.out.print("Aluno " + (i+1) + " Digite a nota do seu projeto: ");
		double projeto = sn.nextDouble() * 3;
		System.out.print("Aluno " + (i+1) + " Digite a nota da sua lista de exercícios: ");
		double lista_exs = sn.nextDouble() * 2;
		double media = (prova + projeto + lista_exs)/10;
		v[i] =  media;
		}
		
// DEFININDO A MEDIA GERAL DA SALA, O MAIOR VALOR DE MEDIA E O MENOR VALOR
		
		int aprovado = 0;
		int realizar_AF = 0;
		int reprovado = 0;
		double soma_medias = 0;
		double media_da_sala = 0;
		double menor = v[0];
		double maior = v[0];
		
		for (i=0; i<n; i++) { 
			
			soma_medias = soma_medias + v[i];
			
			media_da_sala = soma_medias / (i+1);
			
			if (v[i] < menor)
				menor = v[i];
						
			if (v[i] > maior)
				maior = v[i];
			
			if (v[i] >= 8)
				aprovado = aprovado + 1;
			else if (v[i] <= 7.9 && v[i] >= 5)
				realizar_AF = realizar_AF + 1;
			else reprovado = reprovado + 1;
				
				
		}
		
		
// RESULTADO FINAL
		System.out.printf("\n");
	
		System.out.println("A média da sala foi de " + media_da_sala);
		System.out.println("A maior media foi de " + maior);
		System.out.println("A menor media foi de " + menor);
		System.out.println("Tivemos " + aprovado + " aluno(s) aprovado(s), " + reprovado + "aluno(s) reprovado(s) e " + realizar_AF + " aluno(s) precisa(m) fazer a avaliacao final" );
		
		
		
		
		

} }  