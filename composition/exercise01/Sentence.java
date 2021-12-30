package by.jonline.modul04.composition.exercise01;

public class Sentence {
	
	private String sentence;
	

	public Sentence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	@Override
	public String toString() {
		return  sentence;
	}
	

}
