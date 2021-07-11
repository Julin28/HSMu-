import java.util.Scanner;
public class Média_bolsa_v1 {
	static final int LINHAS = 2;	
	static final int COLUNAS = 3;
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
		// DECLARANDO AS MATRIZES PARA CONTER OS VALORES DAS AÇOES
	
		double[][] acao_1 = new double[LINHAS][COLUNAS];
		int day = 1;
		
	    for(int linha = 0; linha < LINHAS; linha++) {
	    	for(int coluna = 0; coluna < COLUNAS; coluna++) {
	    		System.out.println("Digite o valor da acao do dia " + day++ + ": " ); 
	    		acao_1[linha][coluna] = sn.nextDouble();
	        }
	    }
		
	    // CALCULANDO AS MEDIAS SEMANAIS
	      
	    double medias_semanas[] = new double[LINHAS];
	    double soma;
	    
	    for(int i = 0; i < LINHAS; i++) {
	    	soma = 0;
	    	for(int dia = 0; dia < COLUNAS; dia++) {
	    		soma += acao_1[i][dia];
	    	}
	    	medias_semanas[i] = soma / COLUNAS;
	    }  
	   
	    //CALCULANDO MEDIAS TOTAIS
	    
	    double media_total = 0;
	    
	    for (int i = 0; i < LINHAS; i++) {
	    	media_total += medias_semanas[i] / LINHAS;
	    }
	    
	    // CALCULANDO MENOR E MAIOR MEDIA
	    
	    double menor_media = medias_semanas[0];
	    double maior_media = medias_semanas[0];
	    
	    for (int i = 0; i < LINHAS; i++) {
	    	if (medias_semanas[i] < menor_media) {
	    		menor_media = medias_semanas[i];
	    	}
	    	if ( medias_semanas[i] > maior_media) {
	    		maior_media = medias_semanas[i];
	    	}
	    }
	    System.out.println(maior_media);
	    System.out.println(menor_media);
	    System.out.println(media_total);
	    
   	}
		
} 
