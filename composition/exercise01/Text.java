package by.jonline.modul04.composition.exercise01;

import java.util.ArrayList;

/*Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

public class Text {
	private Word heading;
	private ArrayList<Sentence> content;

	public Text(String heading) {
		this.heading = new Word(heading);
		this.content = new ArrayList<Sentence>();
	}

	
	
	public Text(String heading, String sentence) {
		super();
		this.heading = new Word(heading);
		this.content = new ArrayList<Sentence>();
		add(sentence);
	}



	public Text(Word heading, ArrayList<Sentence> content) {
		super();
		this.heading = heading;
		this.content = content;
	}



	public void printAll() {
		System.out.println("\t\t\t"+heading);
		for (Sentence temp:content) {
			System.out.println(temp.toString() );
		}
	}
	public void add (String message) {
		this.content.add(new Sentence(message));
	}

	public Word getHeading() {
		return heading;
	}

	public void setHeading(Word heading) {
		this.heading = heading;
	}

	public ArrayList<Sentence> getContent() {
		return content;
	}

	public void setContent(ArrayList<Sentence> text) {
		this.content = text;
	}

}
