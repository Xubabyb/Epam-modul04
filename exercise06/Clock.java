
/*
 * Составьте описание класса для представления времени. Предусмотрте возможности 
 * установки времени и изменения его отдельных полей (час, минута, секунда) с 
 * проверкой допустимости вводимых значений. В случае недопустимых значений полей 
 * поле устанавливается в значение 0. Создать методы изменения времени назаданное
 *  количество часов, минут и секунд.
 */



package by.jonline.modul04.exercise06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {

	private Date date;
	private SimpleDateFormat format;

	public Clock() throws ParseException {

		format = new SimpleDateFormat("HH:mm:ss");
		date = new Date();
		date = format.parse("00:00:00");

	}
	public void ChangeTime(int h, int m, int s) {
		setHours(getHours()+h);
		setMinutes(getMinutes()+m);
		setSeconds(getSeconds()+s);
		
	}

	@SuppressWarnings("deprecation")
	public int getHours() {
		return date.getHours();
	}

	@SuppressWarnings("deprecation")
	public void setHours(int n) {
		date.setHours(n);
	}

	@SuppressWarnings("deprecation")
	public int getMinutes() {
		return date.getMinutes();
	}

	@SuppressWarnings("deprecation")
	public int getSeconds() {
		return date.getSeconds();
	}

	@SuppressWarnings("deprecation")
	public void setMinutes(int n) {
		date.setMinutes(n);
	}

	@SuppressWarnings("deprecation")
	public void setSeconds(int n) {
		date.setSeconds(n);
	}

	public SimpleDateFormat getFormat() {
		return format;
	}

	public void setFormat(SimpleDateFormat format) {
		this.format = format;
	}

	public String getDate() {
		return format.format(date);
	}

	public void setDate(String s) throws ParseException {
		date = format.parse(s);
	}

}
