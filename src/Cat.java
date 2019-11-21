import java.awt.*;
import java.awt.event.*;

public class Cat {
	int x, y, d;
	int beardpos1, beardpos2, beardpos3;
	int catpos1, catpos2;
	boolean beardup = false;
	String name;

	Cat(int x, int y, int d, String name) {
		this.x = x;
		this.y = y;
		this.d = d;
		this.name = name;
		catpos1 = x;
		catpos2 = y;
		beardpos1 = catpos2 + d / 2 + d / 8;
		beardpos2 = catpos2 + d / 2 + d / 4;
		beardpos3 = catpos2 + d / 2 + d / 4 + d / 8;
	}

	void draw(Graphics a) {
		a.drawOval(catpos1, catpos2, 2 * d, d);
		a.drawOval(catpos1 + d / 2, catpos2 + d / 4, d / 4, d / 4);
		a.drawOval(catpos1 + d + d / 4, catpos2 + d / 4, d / 4, d / 4);// drawing eyes
		a.drawOval(catpos1 + d / 2 + d / 4 + d / 8, catpos2 + d / 2 + d / 8, d / 4, d / 8);// draw mouth
		a.drawLine(catpos1 + d / 4, catpos2 + d / 2, catpos1 - d / 4, beardpos1);
		a.drawLine(catpos1 + d / 4, catpos2 + d / 2 + d / 8, catpos1 - d / 4, beardpos2);
		a.drawLine(catpos1 + d / 4, catpos2 + d / 2 + d / 4, catpos1 - d / 4, beardpos3);
		a.drawLine(catpos1 + d + d / 2 + d / 4, catpos2 + d / 2, catpos1 + 2 * d + d / 4, beardpos1);
		a.drawLine(catpos1 + d + d / 2 + d / 4, catpos2 + d / 2 + d / 8, catpos1 + 2 * d + d / 4, beardpos2);
		a.drawLine(catpos1 + d + d / 2 + d / 4, catpos2 + d / 2 + d / 4, catpos1 + 2 * d + d / 4, beardpos3);// draw
																												// beard
		a.drawArc(catpos1 + d / 2, catpos2 - d / 8, d / 4, d / 4, 0, 200);
		a.drawArc(catpos1 + d + d / 4, catpos2 - d / 8, d / 4, d / 4, -20, 190);// draw ears
		a.drawString(name, catpos1 + d - d / 4, catpos2 + d + d / 4);
	}

	void beardup() {
		beardpos1 = catpos2 + d / 2 - d / 8;
		beardpos2 = catpos2 + d / 2;
		beardpos3 = catpos2 + d / 2 + d / 8;
		beardup = true;
	}

	void bearddown() {
		beardpos1 = catpos2 + d / 2 + d / 8;
		beardpos2 = catpos2 + d / 2 + d / 4;
		beardpos3 = catpos2 + d / 2 + d / 4 + d / 8;
		beardup = false;
	}

	void walk() {
		catpos1 = catpos1 + 2 * d;
		catpos2 = catpos2 + 2 * d;
		beardpos1 = catpos2 + d / 2 + d / 8;
		beardpos2 = catpos2 + d / 2 + d / 4;
		beardpos3 = catpos2 + d / 2 + d / 4 + d / 8;
		if (catpos2 == 800) {
			catpos2 = y;
			beardpos1 = catpos2 + d / 2 + d / 8;
			beardpos2 = catpos2 + d / 2 + d / 4;
			beardpos3 = catpos2 + d / 2 + d / 4 + d / 8;
		}

	}
}
