
public class Model {
	

	public double L;
	public int antal;
	public Particle MyParticle;
	public Particle[] ParticleArray;
	
	public Model(int antalIn){
		int antal = antalIn;
		ParticleArray = new Particle[antalIn];
		for (int i=0; i<antal; i++){
			ParticleArray[i] = new Particle();
												//			System.out.println(i);
												//			MyParticle.setParticle(1,2);    // settern funkar!   
												//			double test = MyParticle.getParticle(); // gettern funkar! 			System.out.println(test);
												//		    System.out.println(ParticleArray[i].x);
		}
		System.out.println(ParticleArray.length);
	
	}
			
	 class Particle {
		public double x;
		public double y;
		
		
		public Particle(double xIn, double yIn) {					// konstruktor med koordinater som argument E1.3 bra f�r att man slipper upprepa sig
			this.x=xIn;
			this.y=yIn;
			
		}
		
		public Particle() {											//argumentl�s konstruktor som skapar en MyParticle med slumpm�ssiga koordinater
			this(Math.random(), Math.random());
		}	

		public void setParticle(double xIn, double yIn) {			//setter: metod som tar tv� tal och s�tter partikelns koordinater till dessa
			this.x = xIn;
			this.y = yIn;
		}
		
		public double getParticle() {								//getter: metod som h�mtar partikelns koordinater
			return this.x + this.y;
		}


}
}