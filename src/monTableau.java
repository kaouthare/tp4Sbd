
public class monTableau {
	
	//La taille n du tableau
		private int n=1000;
	//la valeur maximale m que pourra prendre chaque element du tableau 
		private int m=1000;
	//Generation tableau 	
		private int[] Tab;
	//count : la somme des valuers >m/2 dans le tableau 
		private int conter;
	// Sum : la somme des valeurs >m/2 dans le tablau 
		private int somme;
		
		public monTableau(){
			
		}
		
		public monTableau(int n, int m){
			this.n=n;
			this.m=m;
			this.Tab= new int [n];
			this.conter=0;
			this.somme=0;
			for (int i=0; i<n; i++){
				//generer automatiquement les valeurs du tableau en utilisant random
				Tab[i]=(int) Math.round(Math.random()*m);
				//conter et la somme
				if(Tab[i]>=m/2){
					conter++;
					somme+=Tab[i];
				}
			}
		}
		
		//Getters et Setters
		public int getN() {
			return n;
		}

		public void setN(int n) {
			this.n = n;
		}

		public int getM() {
			return m;
		}

		public void setM(int m) {
			this.m = m;
		}

		public int[] getTab() {
			return Tab;
		}

		public void setTab(int[] tab) {
			Tab = tab;
		}

		public int getConter() {
			return conter;
		}

		public void setConter(int conter) {
			this.conter = conter;
		}

		public int getSomme() {
			return somme;
		}

		public void setSomme(int somme) {
			this.somme = somme;
		}
		
}
