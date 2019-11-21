import java.awt.*;
import java.awt.event.*;

public class Person {
	int x, y, d;
	int handpos;
	int personpos1, personpos2;
	boolean handup = false;
	String name;

	Person(int x, int y, int d, String name) {
		this.x = x;
		this.y = y;
		this.d = d;
		this.name = name;
		personpos1 = x;
		personpos2 = y;
		handpos = personpos2 + d + d / 2;
	}

	void draw(Graphics a) {
		a.drawOval(personpos1, personpos2, d, d);
		a.drawLine(personpos1 + d / 2, personpos2 + d, personpos1 + d / 2, personpos2 + d + d / 2);// draw body
		a.drawLine(personpos1 + d / 2, personpos2 + d + d / 4, personpos1, handpos);
		a.drawLine(personpos1 + d / 2, personpos2 + d + d / 4, personpos1 + d, handpos);// draw hands
		a.drawLine(personpos1 + d / 2, personpos2 + d + d / 2, personpos1 - d / 4, personpos2 + 2 * d);
		a.drawLine(personpos1 + d / 2, personpos2 + d + d / 2, personpos1 + d / 4 + d, personpos2 + 2 * d);
		a.drawLine(personpos1 - d / 4, personpos2 + 2 * d, personpos1 + d / 4 + d, personpos2 + 2 * d);// draw the skirt
		a.drawLine(personpos1 + d / 4 + d / 8, personpos2 + 2 * d, personpos1 + d / 4 + d / 8,
				personpos2 + 2 * d + d / 2 + d / 8);
		a.drawLine(personpos1 + d / 4 + d / 2 - d / 8, personpos2 + 2 * d, personpos1 + d / 4 + d / 2 - d / 8,
				personpos2 + 2 * d + d / 2 + d / 8);// draw legs
		a.drawString(name, personpos1 + d / 4, personpos2 + 3 * d);// draw name
		a.drawArc(personpos1, personpos2, d / 4, d / 4, 15, 240);
		a.drawArc(personpos1 - d / 8, personpos2 + d / 8, d / 4, d, 90, 130);
	}

	void up() {
		handpos = personpos2 + d;
		handup = true;
	}

	void down() {
		handpos = personpos2 + d + d / 2;
		handup = false;
	}

	void walk() {
		personpos1 = personpos1 + 2 * d;
		personpos2 = personpos2 + 2 * d;
		handpos = personpos2 + d + d / 2;
		if (personpos2 == 800) {
			personpos2 = y;
			handpos = personpos2 + d + d / 2;
		}
	}

}
