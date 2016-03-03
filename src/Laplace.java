
public class Laplace {
	//permet de generer une variable aléatoire qui satisfait la confidentialité différentielle 
	
	static double epsilonMax;
	static double epsilon;
	static boolean test= true;
	
	
	//constructeur de la classe Laplace
	public Laplace(double epsilon){
		this.epsilon= epsilon;
		this.epsilon=1;
		this.test=true;
	}

	public Laplace(){
		
	}

	public static double genNoise(int sa, double budget){
		//sa : la sensibilitee de l'agregat a� perturber
		//budget la proportion de budget a� consommer
		// la variable u drawn from the uniform distribution dans l'interval (-0.5, 0.5)
		double variableX =0;
		if(test || epsilonMax >= epsilon + budget){
			if(!test){
				epsilon +=  budget;
			}
		double varU= Math.random()- 0.5;
		//parametre b
		double b = sa/budget;
		//le parametre u est egale 0 ici 
		// la variable générée est variableX 
		variableX = - b* Math.signum(varU)* Math.log(1- (2 * Math.abs(varU)));
		//le epsilon Consomé est le budget 
		
		
		}
		return variableX;
		
	}

}
