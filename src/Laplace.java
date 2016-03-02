
public class Laplace {
	//permet de generer une variable aléatoire qui satisfait la confidentialité différentielle 
	
	static double epsilonMax;
	static double epsilon;
	static boolean test= true;
	
	
	

	public Laplace() {
		super();
		/*
		this.epsilonMax = epsilonMax;
		this.epsilon = epsilon;
		*/
	}




	public static double genNoise(int sa, double budget){
		//sa : la sensibilité de l'agrégat à perturber
		//budget la proportion de budget à consommer
		// la variable u drawn from the uniform distribution dans l'interval (-0.5, 0.5)
		if(test || epsilonMax >= epsilon + budget){
			if(!test){
				epsilon +=  budget;
			}
		double varU= Math.random()* - 0.5;
		//parametre b
		double b = sa/budget;
		//le parametre u est egale 0 ici 
		// la variable générée est variableX 
		double variableX = - b* Math.signum(varU)* Math.log(1- (2 * Math.abs(varU)));
		//le epsilon Consomé est le budget 
		
		return variableX;
		}
		return 0;
		
	}

}
