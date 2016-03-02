import java.util.Arrays;
import java.util.Random;


public class LaunchMe {

	/**
	 * @param args
	 */

	//La taille n du tableau 
	static int n;
	//la valeur maximale m que pourra prendre chaque element du tableau 
	static int m; 
	
	//la valeur minimale que le tableau peut prendre est 0
	static int mmin=0;
	
	//la valeur du paramètre de confidentialité epsilon 
	
	static double epsilon;
	
	static boolean test= true;
	static double epsilonMax;
	
	public static void main(String[] args) {
		//valeur test 
		n=5;
		m=10;
		epsilon=0.1;
		epsilonMax=1;
		
		//créer un tableau d'entier 
		int monTableau[ ] = new int[n];
		Random random = new Random();
		for (int i=0; i<n; i++){
			//pour un entier entre 0 et m
			//ajouter ces elements à ce tableau 
			monTableau[i]= (int)(Math.random() * m);
			//générer les elements du tableau 
			
			//i= mmin + random.nextInt((m-mmin)+1);

			
			
					
		}

		
		System.out.println (Arrays.toString(monTableau ));
		
		int counter =0;
		for (int i=0; i<n; i++){
			if (monTableau[i] > m/2){
				counter ++;
			}
		}
		System.out.print(
		Laplace.genNoise(counter, epsilon));
		System.out.print("\n");

		int counter2 =0;
		for (int i=0; i<n; i++){
			if (monTableau[i] > m/4){
				counter2 ++;
			}
		}
		System.out.print(
				Laplace.genNoise(counter2, epsilon));
		System.out.print("\n");
		int sum =0;
		for (int i=0; i<n; i++){
			if (monTableau[i] > m/4){
				sum  = + monTableau[i];
			}
		}
		System.out.print(
				Laplace.genNoise(sum, epsilon));
		System.out.print("\n");
		
		int counter3 =0;
		for (int i=0; i<n; i++){
			if (monTableau[i] > m/6){
				counter3 ++;
			}
		}
		System.out.print(
				Laplace.genNoise(counter3, epsilon));
		System.out.print("\n");
		
		
		
			
	}
	

}
