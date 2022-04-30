
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instrument i=new Instrument();
		Instrument g=new Guitar();
		g.utilize();
		Guitar g1=new Guitar();
		g1.play();
		g1.tuneStrings();
		g=new ElectronicGuitar();
		ElectronicGuitar eG=new ElectronicGuitar();
		eG.play();
		Violin v=new Violin();
		v.tuneStrings();
		v.play();
		v.utilize();
		Flute f=new Flute();
		f.blow();
	}

}

abstract class Instrument{
	abstract void utilize();
}
abstract class MusicalInstrument extends Instrument{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument{

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("I am Tuning the Strings of Guitar");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("I am playing the Guitar");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Guitar producing music...");
	}
	
}
class ElectronicGuitar extends Guitar{

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		//super.tuneStrings();
		System.out.println("I am tuning the Strings of ElectronicGuitar");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		//super.play();
		System.out.println("I am playing the ElectronicGuitar");
	}
	
}
class Violin extends StringBasedMusicalInstrument{

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("I am Tuning the Strings of Violin");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("I am playing the Violin");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Violin producing music...");
	}
		
}
class Sitar extends StringBasedMusicalInstrument{

	@Override
	void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("I am Tuning the Strings of Sitar");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("I am playing the Sitar");
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		System.out.println("Sitar producing music...");
	}
}

  abstract class AirBasedMusicalInstruments extends MusicalInstrument{
	abstract void blow();

  }
  
  class Flute extends AirBasedMusicalInstruments{

	@Override
	void blow() {
		// TODO Auto-generated method stub
		System.out.println("Blowing Flute");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	  
  }
      