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
				
		//***********question 6**********//
		
		System.out.println("***********************************");
		//tableau pour la question 6 avec n =1000 et m =1000 
		monTableau T6= new monTableau (1000,1000);
		
		Laplace L6= new Laplace(epsilon);
		//valeur perturbée 
		double valPert =0;
		//la somme des valeurs perturbées
		double sumValPert =0;
		//la moyenne des valeurs perturbees
		double moyValPert=0;
		//le ratio des valeurs perturbees
		double ratio=0;
		
		//le nombre de valeurs perturbees
		int nbValPert=0;
		//le nombre des ratio qui sont entre 0.9 et 1.1
		int nbRatio=0;
		while(nbRatio<5 && L6.getEpsilonBudget()>=0){
			valPert=T6.getConter()+L6.genNoise(sa, epsilon/4);
			nbValPert++;
			sumValPert+=valPert;
			moyValPert=sumValPert/nbValPert;
			ratio=moyValPert/T6.getConter();
			
			if(Math.abs(ratio-1)<=0.1){
				nbRatio++;
			}else{
				nbRatio=0;
			}
			System.out.println(ratio);
		}
		
		if(nbRatio==5){
			System.out.println("la somme est " +T6.getConter()+ ".");
			System.out.println("on obtient " +nbValPert+ " Perturbation");
			
		}else {
			System.out.println("autres ");
		}
		
		
		//*******************************Q7***********//
		
		System.out.println("*********************Q7***********");
		
		//tableau avec n=1000, m=1000, epsilon =0.0001
		monTableau T7= new monTableau (1000,1000);
		sa= 1000;
		//activer le mode test
		Laplace.setTest(true);
		
		double erreur=0;
		double moyErreur=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreur+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreur= erreur/i;
		}
		
		System.out.println("la taille du tableau  : " +T7.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("la somme agregats : " +T7.getSomme() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreur );
		
		//******Question 10*******//
		
		System.out.println("*******************Question10**********");
		
		// tableaux de taille differentes
		System.out.println("le tableau t10***" );
		monTableau T10= new monTableau(100, 1000);
		sa=T10.getM();
		Laplace.setTest(true);
		
		double erreurT10=0;
		double moyErreurT10=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT10+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT10= erreurT10/i;
		}
		
		double ratioT10= moyErreurT10/T10.getSomme();
		System.out.println("la taille du tableau  : " +T10.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("la somme agregats : " +T10.getSomme() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT10 );
		System.out.println("le ratio  : " +ratioT10 );
		
		System.out.println("le tableau t11***" );
		monTableau T11= new monTableau(1000, 1000);
		
		sa=T11.getM();
		Laplace.setTest(true);
		
		double erreurT11=0;
		double moyErreurT11=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT11+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT11= erreurT11/i;
		}
		
		double ratioT11= moyErreurT11/T11.getSomme();
		System.out.println("la taille du tableau  : " +T11.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("la somme agregats : " +T11.getSomme() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT11 );
		System.out.println("le ratio  : " +ratioT11 );
		
		System.out.println("le tableau t12***" );
		monTableau T12= new monTableau(10000, 1000);
		sa=T12.getM();
		Laplace.setTest(true);
		
		double erreurT12=0;
		double moyErreurT12=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT12+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT10= erreurT12/i;
		}
		
		double ratioT12= moyErreurT12/T12.getSomme();
		System.out.println("la taille du tableau  : " +T12.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("la somme agregats : " +T12.getSomme() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT12 );
		System.out.println("le ratio  : " +ratioT12 );
		
		System.out.println("le tableau t13***" );
		monTableau T13= new monTableau(100000, 1000);
		
		sa=T13.getM();
		Laplace.setTest(true);
		
		double erreurT13=0;
		double moyErreurT13=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT13+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT13= erreurT13/i;
		}
		
		double ratioT13= moyErreurT13/T13.getSomme();
		System.out.println("la taille du tableau  : " +T13.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("la somme agregats : " +T13.getSomme() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT13 );
		System.out.println("le ratio  : " +ratioT13 );
		
		System.out.println("le tableau t14***" );
		monTableau T14= new monTableau(1000000, 1000);
		
		sa=T14.getM();
		Laplace.setTest(true);
		
		double erreurT14=0;
		double moyErreurT14=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT14+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT14= erreurT14/i;
		}
		
		double ratioT14= moyErreurT14/T14.getSomme();
		System.out.println("la taille du tableau  : " +T14.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("la somme agregats : " +T14.getSomme() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT14 );
		System.out.println("le ratio  : " +ratioT14 );
		
		
		
		
System.out.println("*******************Question10 Counter**********");
		
		// tableaux de taille differentes
		System.out.println("le tableau t10***" );
		monTableau T10C= new monTableau(100, 1000);
		sa=1;
		Laplace.setTest(true);
		
		double erreurT10C=0;
		double moyErreurT10C=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT10C+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT10C= erreurT10C/i;
		}
		
		double ratioT10C= moyErreurT10C/T10C.getConter();
		System.out.println("la taille du tableau  : " +T10C.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("le conter agregats : " +T10C.getConter() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT10C );
		System.out.println("le ratio  : " +ratioT10C );
		
		System.out.println("le tableau t11***" );
		monTableau T11C= new monTableau(1000, 1000);
		
		sa=1;
		Laplace.setTest(true);
		
		double erreurT11C=0;
		double moyErreurT11C=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT11C+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT11C= erreurT11C/i;
		}
		
		double ratioT11C= moyErreurT11C/T11C.getConter();
		System.out.println("la taille du tableau  : " +T11C.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("le conter agregats : " +T11C.getConter() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT11C );
		System.out.println("le ratio  : " +ratioT11C );
		
		System.out.println("le tableau t12***" );
		monTableau T12C= new monTableau(10000, 1000);
		sa=1;
		Laplace.setTest(true);
		
		double erreurT12C=0;
		double moyErreurT12C=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT12C+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT12C= erreurT12C/i;
		}
		
		double ratioT12C= moyErreurT12C/T12C.getConter();
		System.out.println("la taille du tableau  : " +T12C.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("le conter agregats : " +T12C.getConter() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT12C );
		System.out.println("le ratio  : " +ratioT12C );
		
		System.out.println("le tableau t13***" );
		monTableau T13C= new monTableau(100000, 1000);
		
		sa=1;
		Laplace.setTest(true);
		
		double erreurT13C=0;
		double moyErreurT13C=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT13C+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT13C= erreurT13C/i;
		}
		
		double ratioT13C= moyErreurT13C/T13C.getConter();
		System.out.println("la taille du tableau  : " +T13C.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("le conter agregats : " +T13C.getConter() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT13C );
		System.out.println("le ratio  : " +ratioT13C );
		
		System.out.println("le tableau t14***" );
		monTableau T14C= new monTableau(1000000, 1000);
		
		sa=1;
		Laplace.setTest(true);
		
		double erreurT14C=0;
		double moyErreurT14C=0;
		for(int i=1; i<=1000; i++){
			//lerreur de perturbation est la valeur absolue de la perturbation
			erreurT14C+=Math.abs(Laplace.genNoise(sa, epsilon/4));
			moyErreurT14C= erreurT14C/i;
		}
		
		double ratioT14C= moyErreurT14C/T14C.getConter();
		System.out.println("la taille du tableau  : " +T14C.getN() );
		System.out.println("Sensibilité : " +sa );
		System.out.println("le conter agregats : " +T14C.getConter() );
		System.out.println("moyenne d'erreur pour un agregat : " +moyErreurT14C );
		System.out.println("le ratio  : " +ratioT14C );
				
				
		
		
		
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
