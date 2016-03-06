import java.util.Arrays;
import java.util.Random;


public class LaunchMe {

	/**
	 * @param args
	 */


	
	//constructeur
	public LaunchMe(){
		
	}
	
	public static void main(String[] args) {
		
		//parametre de confidentialite
		double epsilon=0.0001;
		
		//sensibilite
		int sa=0;
		
		sa=1;
		//tableaux d'entiers
		monTableau T1=new monTableau(10,1000);
		monTableau T2=new monTableau(100,1000);
		monTableau T3=new monTableau(1000,1000);
		
		//la place 
		Laplace L1= new Laplace(1000);
		Laplace L2= new Laplace(1);
		Laplace L3= new Laplace(0.01);
		Laplace L4= new Laplace(0.0001);
		
		//afficher les perturbations generees pour les tableaux declares ci-dessus
		System.out.println (" Tab1 " +T1 + " le tableau à n valeur " +T1.getN() + " sa valeur max est " +T1.getM() );
		//perturbation généree 
		double PG = L1.genNoise(sa, 1000/4);
		//la valeur perturbée
		double VP = T1.getConter()+PG;
		//Affichage des valeurs 
		System.out.println("affichage valeur perturbée:"+VP+ " avec 1000 pour epsilon la perturbation est " +PG);
		
		double PG2 = L2.genNoise(sa, 1/4);
		
		double VP2 = T1.getConter()+PG2;
		//Affichage des valeurs 
		System.out.println("affichage valeur perturbée :"+VP2+ " avec 1 pour epsilon la perturbation est " +PG2);
		
		//perturbation généree 
		double PG3 = L3.genNoise(sa, 0.01/4);
		//la valeur perturbée
		double VP3 = T1.getConter()+PG3;
				//Affichage des valeurs 
		System.out.println("affichage valeur perturbée :"+VP3+ " avec 0.01 pour epsilon la perturbation est " +PG3);
		
		//afficher les perturbations generees pour les tableaux declares ci-dessus
		System.out.println (" Tab2 " +T2 + " le tableau à n valeur " +T2.getN() + " sa valeur max est " +T2.getM() );
		//perturbation généree 
		double PG4 = L1.genNoise(sa, 1000/4);
		//la valeur perturbée
		double VP4 = T2.getConter()+PG4;
		//Affichage des valeurs 
		System.out.println("affichage valeur perturbée:"+VP4+ " avec 1000 pour epsilon la perturbation est " +PG4);
		
		double PG5 = L2.genNoise(sa, 1/4);
		
		double VP5 = T2.getConter()+PG5;
		//Affichage des valeurs 
		System.out.println("affichage valeur perturbée :"+VP5+ " avec 1 pour epsilon la perturbation est " +PG5);
		
		//perturbation généree 
		double PG6 = L3.genNoise(sa, 0.01/4);
		//la valeur perturbée
		double VP6 = T1.getConter()+PG6;
				//Affichage des valeurs 
		System.out.println("affichage valeur perturbée :"+VP6+ " avec 0.01 pour epsilon la perturbation est " +PG6);
		
		//afficher les perturbations generees pour les tableaux declares ci-dessus
		System.out.println (" Tab3 " +T3 + " le tableau à n valeur " +T3.getN() + " sa valeur max est " +T3.getM() );
		//perturbation généree 
		double PG7 = L1.genNoise(sa, 1000/4);
		//la valeur perturbée
		double VP7 = T1.getConter()+PG7;
		//Affichage des valeurs 
		System.out.println("affichage valeur perturbée:"+VP7+ " avec 1000 pour epsilon la perturbation est " +PG7);
		
		double PG8 = L2.genNoise(sa, 1/4);
		
		double VP8 = T1.getConter()+PG8;
		//Affichage des valeurs 
		System.out.println("affichage valeur perturbée :"+VP8+ " avec 1 pour epsilon la perturbation est " +PG8);
		
		//perturbation généree 
		double PG9 = L3.genNoise(sa, 0.01/4);
		//la valeur perturbée
		double VP9 = T1.getConter()+PG9;
				//Affichage des valeurs 
		System.out.println("affichage valeur perturbée :"+VP9+ " avec 0.01 pour epsilon la perturbation est " +PG9);
				
				
				
		
		
		
		/*
		Laplace laplace= new Laplace(epsilon);
		System.out.println("perturbation générée:" +sa);
		
		double valPerturbee=0;
		double somValP=0;
		double moyValP=0;
		double ratioValP=0;
		for(int i=1; i<=50; i++){
			valPerturbee= sa + laplace.genNoise(sa, 1);
			somValP +=valPerturbee;
			moyValP= somValP/i;
			ratioValP=moyValP/sa;
			System.out.println(ratioValP);
			System.out.println(i+"; valeur perturbee: " +valPerturbee+ "; la somme: " +somValP+ "; la moyenne" +moyValP+ "; la ratio:" +ratioValP+";");
			
			
		}
		/** des couters et une sommes des valerus du tableau **/
		/*
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
		
		*/
		
			
	}
	

}
