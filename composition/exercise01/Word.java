package by.jonline.modul04.composition.exercise01;



public class Word {
	
	private String word;
	
	

	public Word(String word) {
		super();
		this.word = word;
	}
	

	@Override
	public String toString() {
		return  word;
	}


	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}	
}
