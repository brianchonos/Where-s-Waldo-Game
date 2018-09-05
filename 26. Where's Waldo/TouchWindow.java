import objectdraw.*;
import java.awt.*;

public class TouchWindow extends WindowController
{
	int s;
	static int count = 0;
	Text phone;
	Waldo gabriel;
	int a = (int)(Math.random()*450);
	int b = (int)(Math.random()*375);
	boolean bHidden = true;
	
	public void begin()
	
	{
		s=0;
		FilledRect joe;
		joe = new FilledRect(0,0,500,400,canvas);
		Color meMine = new Color(2,163,2);
		joe.setColor(meMine);
		FilledRect kate;
		kate = new FilledRect(0,0,500,200,canvas);
		Color dave = new Color(4, 197, 231);
		kate.setColor(dave);
		FilledOval bob;
		bob = new FilledOval(-20,-20,75,75,canvas);
		bob.setColor(Color.yellow);
		FilledRect rob;
		rob = new FilledRect(200,102,50,100,canvas);
		Color apple = new Color(51, 63, 2);
		rob.setColor(apple);
		FilledOval ron;
		ron = new FilledOval(180,60,50,50,canvas);
		Color kms = new Color(2,120, 0);
		ron.setColor(kms);
		FilledOval brad;
		brad = new FilledOval(220,60,50,50,canvas);
		brad.setColor(kms);
		FilledOval greg;
		greg = new FilledOval(200,80,50,50,canvas);
		greg.setColor(kms);
		FilledOval rem;
		rem = new FilledOval(200,40,50,50,canvas);
		rem.setColor(kms);
		FilledRect reese;
		reese = new FilledRect(290,50,175,100,canvas);
		reese.setColor(Color.blue);
		reese.move(0,-50);
		FilledRect dav;
		dav = new FilledRect(290,50,19,100,canvas);
		dav.setColor(Color.white);
		dav.move(44,-50);
		FilledRect connor;
		connor = new FilledRect(290,50,175,19,canvas);
		connor.setColor(Color.white);
		connor.move(0,-11);
		FilledRect bobby;
		bobby = new FilledRect(290,50,10,100,canvas);
		bobby.setColor(Color.red);
		bobby.move(48,-50);
		FilledRect gav;
		gav = new FilledRect(290,50,175,10,canvas);
		gav.setColor(Color.red);
		gav.move(0,-7);
		FilledRect ted;
		ted = new FilledRect(290,100,20,120,canvas);
		ted.setColor(Color.black);
		FilledRect bo;
		bo = new FilledRect(120,120,30,30,canvas);
		bo.setColor(Color.red);
		FilledRect allen;
		allen = new FilledRect(110,150,50,80,canvas);
		allen.setColor(Color.blue);
		FilledRect gabe;
		gabe = new FilledRect(155,160,15,50,canvas);
		gabe.setColor(Color.black);
		FilledRect brian;
		brian = new FilledRect(155,160,15,50,canvas);
		brian.setColor(Color.black);
		FilledRect bill;
		bill = new FilledRect(99,160,15,50,canvas);
		bill.setColor(Color.black);
		FilledRect bon;
		bon = new FilledRect(140,230,15,50,canvas);
		bon.setColor(Color.black);
		FilledRect shaun;
		shaun = new FilledRect(115,230,15,50,canvas);
		shaun.setColor(Color.black);
		FilledRect jon;
		jon = new FilledRect(0,300,500,50,canvas);
		jon.setColor(Color.green);
		Text barry;
		barry = new Text("This is my flag and person",20,305,canvas);
		barry.setBold();
		barry.setFontSize(30);
		Color boy;
		boy = new Color(51, 204, 204);
		FilledRect ray;
		ray = new FilledRect(0,350,500,40,canvas);
		ray.setColor(boy);
		Color hay;
		hay = new Color(153,0,0);
		phone = new Text("Number of Clicks: ",10,350,canvas);
		phone.setFontSize(25);
		phone.setColor(hay);
		phone.setBold();
		gabriel = new Waldo(a,b,bHidden,canvas);
		
	}
	
	public void onMousePress(Location four)
	{
		if (s==0)
		{
					if (gabriel.contains (four))
		{
			gabriel.show();
			phone.setText("You Win! Score: "+count);
			s=1;
		}
		else if (bHidden = true)
		{
			count = count + 1;
			phone.setText("Number of Clicks: " +count);
		}
		}

	}

}