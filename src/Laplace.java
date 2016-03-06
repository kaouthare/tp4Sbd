
public class Laplace {
	//permet de generer une variable aléatoire qui satisfait la confidentialité différentielle 
	
	private static double epsilonBudget;
	private static double epsilon;
	private static boolean test;
	
	
	//constructeur de la classe Laplace
	public Laplace(double epsilon){
		this.epsilon= epsilon;
		this.epsilonBudget=epsilon;
		this.test=true;
	}

	public static double getEpsilonBudget() {
		return epsilonBudget;
	}

	public static void setEpsilonBudget(double epsilonBudget) {
		Laplace.epsilonBudget = epsilonBudget;
	}

	public static double getEpsilon() {
		return epsilon;
	}

	public static void setEpsilon(double epsilon) {
		Laplace.epsilon = epsilon;
	}

	public static boolean isTest() {
		return test;
	}

	public static void setTest(boolean test) {
		Laplace.test = test;
	}

	public Laplace(){
		
	}

	public static double genNoise(int sa, double budget){
		//sa : la sensibilitee de l'agregat a� perturber
		//budget la proportion de budget a� consommer
		// la variable u drawn from the uniform distribution dans l'interval (-0.5, 0.5) ..le bruit 
		double variableX =0;
		if(test || epsilonBudget- budget >= 0){
			if(!test){
				epsilonBudget -=  budget;
			}
		// definir une variable u tir�e selon la loi uniforme continue dans l'interval -1/2, 1/2
		double varU= Math.random()- 0.5;
		//parametre b
		double b = sa/budget;
		//le parametre u est egale 0 ici 
		// la variable générée est variableX X=mu - b sgn(U)ln(1 - 2|U|)
		variableX =0 - b* Math.signum(varU)* Math.log(1- (2 * Math.abs(varU)));
		//le epsilon Consomé est le budget 
		
		
		}
		return variableX;
		
	}

}
