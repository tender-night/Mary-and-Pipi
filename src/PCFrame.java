import java.awt.*;
import java.awt.event.*;

class PCFrame extends Frame implements ActionListener {
	Cat c1;
	Person p1;
	Cat c2;
	Person p2;
	Button btn11 = new Button("move1");
	Button btn12 = new Button("dance1");
	Button btn21 = new Button("move2");
	Button btn22 = new Button("dance2");

	public PCFrame() {
		this.setLayout(new FlowLayout());
		add(btn11);
		add(btn12);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		add(btn21);
		add(btn22);
		btn21.addActionListener(this);
		btn22.addActionListener(this);
		this.setVisible(true);
		this.setSize(1280, 800);

		p1 = new Person(40, 80, 40, "Mary");
		c1 = new Cat(95, 80, 40, "pipi");

		p2 = new Person(240, 80, 40, "Linda");
		c2 = new Cat(295, 80, 40, "dudu");
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("move1")) {
			c1.walk();
			p1.walk();
		}

		if (s.equals("dance1")) {
			if (c1.beardup) {
				c1.bearddown();
				p1.down();
			} else {
				c1.beardup();
				p1.up();
			}
		}

		if (s.equals("move2")) {
			c2.walk();
			p2.walk();
		}

		if (s.equals("dance2")) {
			if (c2.beardup) {
				c2.bearddown();
				p2.down();
			} else {
				c2.beardup();
				p2.up();
			}
		}

		repaint();
	}

	public void paint(Graphics g) {
		c1.draw(g);
		p1.draw(g);
		c2.draw(g);
		p2.draw(g);
	}
}
