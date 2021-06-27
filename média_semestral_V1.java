import java.util.Scanner;
public class média_semestral_V1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Digite a nota da sua prova: ");
		double prova = sn.nextDouble() * 3;
		System.out.print("Digite a nota do seu projeto: ");
		double projeto = sn.nextDouble() * 3;
		System.out.print("Digite a nota da sua lista de exercícios: ");
		double exercicios = sn.nextDouble() * 2;
		System.out.print("Digite a nota da sua contribuiçao em projetos: ");
		double contrib = sn.nextDouble() * 3;
		double media_semestral = (prova + projeto + exercicios + contrib)/11;
		boolean aprovacao = media_semestral >= 8;
		if (aprovacao == true) {
			System.out.println("Voce foi aprovado com a média de: " + media_semestral + ". Parabéns!" );
		}  else {
			System.out.println("Voce foi reprovado. Para se recuperar, voce precisa tirar: " + (10 - media_semestral) + " na sua prova final");
		}
		sn.close();
				
		
	
				
		

	}

}
