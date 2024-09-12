/*  
 * ICS3U1 CPT: Space Race
 * Name: Angela Fernando
 * Teacher: Mr. Conway
 * Program Description: Space Race is a multi-level game centered around an impending rocket launch to Mars. A rogue team has stolen a key part of the rocket 
 						because they want to be the first to Mars. The user must locate and return the part in time for the launch. The title page appears for 5 
 						seconds, then advances to a room where the user chooses their name and avatar and is introduced to the game. After this, their chosen 
 						avatar walks out of the room and Level 1 begins. 

						In Level 1, the user must decrypt an email that the rogue team has sent, which contains the address and password to the location of 
						the missing part. The computer will “lock” in 2 minutes so the user must decrypt it within 120 seconds. The computer screen displays 
						the encrypted email. They can type “h” for a hint; they have 3 hints and each one comes with a time penalty of 15 seconds. They can 
						also access the “program” that the rogue team used to encrypt the email by typing “e”, which calls upon the Encryption class. They 
						can enter an unlimited number of strings to be encrypted and try to detect the correlation between the encrypted and original word to
						decrypt the email. There is no time penalty for this. The user can enter their guess (only one word/series of numbers at a time; no 
						spaces) by typing “g”. If they run out of time, they lose and the game will end. If they correctly guess all the words/series of 
						numbers in the email before time runs out they move on to Level 2. The points they gain are equal to the amount of seconds left.

						In Level 2, the rogue team has anticipated the user’s arrival so the location contains 3 parts. Only one of them is the correct one - 
						the rest will explode in 90 seconds. The user must determine which tool is the correct one within 90 seconds. The user must drag the 
						correct one to the briefcase and the explosives to the can. To move, they must click on the part they want to move and then drag it 
						and release it over the can/briefcase. To move a different part, they must first click on the wall, then click on the part they want 
						and continue as normal (not necessary if they just released a part over the can/briefcase). The user can click on the button to see 
						the decrypted email again. If they put an explosive in the briefcase, or throw out the correct part, or run out of time, the game 
						ends. If they correctly sort them within 90 seconds, their points are the amount of seconds left and they can move on to Level 3. 

						In Level 3, the rogue team has been notified that the user got the part and spies are lurking near the base. The spies are generated 
						at random x positions along the room and can move up or down (spy movement and positioning is controlled by the Enemy class). The user 
						has 60 seconds to bring the part back to base (on the other end of the frame) without colliding with any spies. If they do, the spy will 
						steal the part and they lose the game. The user can move up, down, left, and right using the arrow keys. They can also shoot darts in the
						direction they are facing (left or right only) by hitting the spacebar. These will not kill the spies, but will tranquilize them so they 
						cannot walk (they can still steal the part if the user collides with them). If the user runs out of time or collides with a spy they lose 
						and the game ends. If the user collides with the building on the other side without getting hit before time is up, they win the game. The
						points they get are double the amount of seconds they have left. They will be asked if they want to stay for the rocket launch. If they 
						say no, they will be asked to confirm their exit. If they say yes, the game will animate a rocket leaving earth and landing on Mars, then
						close the program.
						
						ANSWER KEY: Level 1 [537, Sunset, Drive, Mars123]    Level 2 [part labeled SDM is correct (because those are the capital letters from 
						the decrypted email), others are explosives]
						
 * Program Details: 	If statements are used in many locations throughout the program. They are useful to control the multiple outcomes that can occur 
 						depending on various factors such as how the user interacts with the program and what random values are generated. In my game I use several
 					 	if statements to control my 4 spy objects. They were used to check which direction they should be moving in (based on a boolean variable 
 						passed in), which way they should face (based on the x position of the player), whether they should move or not (based on whether they’ve 
 						been hit), etc. If statements are also used to check for various collision possibilities in the method lvl2Collision(), and even in the 
 						paint() method to draw the correct elements for each room. For instance, if seconds is below 5, the colour of the timer becomes red. 

						Random numbers are powerful because they add variety and an element of unpredictability to the program. I used random numbers to pick a 
						random	avatar for my player, as well as control the position of the spies. I made my spies be located at a random x position within the 
						range of the frame. They were also located at a random y position above/below the frame, so that they wouldn’t move in unison with each 
						other. This increased difficulty for the user, as they couldn’t predict when/where an enemy would appear. 
						
						Loops are also used a lot in the game. Loops are an efficient way to repeat a task a desired amount of times or until obtaining a desired 
						outcome. I use while loops around code where I ask for typed input from the user so it continues to ask until they enter valid input 
						(which is controlled by boolean variables). I use for loops in my encryption class so the program can perform the same checks/changes to 
						each character of a string	the user has entered. 
						
						String class methods are useful to manipulate strings, especially strings that are entered by a user. They allow the program to make 
						changes to the string for various purposes, such as to match a specific format or isolate specific sections. In my game, they were 
						used in Level 1 to encrypt the user’s word. The substring method was used to switch the first and second halves of the word. This is 
						key to the game, since the entire first	level revolves around encryption of an email. 
						
						Try-catch methods are very helpful in that they prevent the program from crashing due to minor issues. If the user types invalid input, 
						a try-catch	can catch that error and deal with it while it is still running instead of making the program crash. As well, try-catches 
						were used around Thread.sleep(int) methods in my program, as they can sometimes throw an error. Thus, the program can run more smoothly. 
						
						Arrays are helpful in storing multiple values of the same datatype. This way, one does not need to create several different variables, 
						which can get confusing, but keep them all in one place. In my program, an array was used to store each character of the word the user
						wanted to encrypt.	This way, changes could be made to each individual character without needing to create several variables for them. 
						Arrays were also used to store various strings for JOptionPane buttons, as well as different ImageIcons for different avatars. 
						
						Classes can be extremely useful to clean up code in the main class, as well as in animation of multiple of the same thing. For instance, 
						I used a class for encryption because it made it much easier to read the code in the main class. I can simply type getEncrypted without 
						seeing the 100 lines behind it and store the encrypted word in a variable. The getEncrypted class gets input from the user, then 
						manipulates the string using arrays and	string methods to produce an encrypted word. I also used a class for the spies in the game since 
						I needed to have 4 of them. It was efficient to	create a class because I could create multiple objects with the same properties (ex. same 
						boundary checking, movement, positioning, images, etc.)	without having to retype the code for that 4 times. 
						
						Animation is a useful tool in programming as it allows the program to feel more interactive - one can visualize what is happening and it 
						opens a whole new world of possibilities beyond console-based games. I use animation (and as a result, timers) for the entirety of the 
						game - for example, I animate the movement of the spies (via timers) and player (via keyPressed events) by increasing/decreasing their x 
						and y positions, the movement of the parts as the user drags them, etc. I even animated a decreasing line clock by multiplying the 
						percentage of timer left by the width of the room every 1 second so the user can have a visual representation of how much time is left. 
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.*;
import java.util.Random;

public class SpaceRaceMain extends JPanel implements KeyListener, ActionListener, MouseMotionListener, MouseListener{
	
	// FIELDS
	private static  String encryptedWord, userWord, guess;
	private static Encryption encrypt;
	private static int width, height, avatarChoice, seconds1, seconds2, seconds3 = 60, score, roomNum, hintNum = 3, partCorX = 170, partCorY = 400, partFal_1X = 350, partFal_1Y = 400, partFal_2X = 530, partFal_2Y = 400, playerX = 0, playerY = 300, dartX, dartY, rocketY = 300, girlY = 500, boyY = 500, dir = 1, lineWidth = width;
	private static JFrame frame;
	private static ImageIcon avatar, rocket = new ImageIcon("images\\rocket.png"), bkg, partCor, partFal_1, partFal_2, can, briefcase, building, dart, explosion = new ImageIcon("images\\explosion.gif"), hand = new ImageIcon("images\\hand.png"), emailButton = new ImageIcon("images\\email button.png");
	private static boolean guess1 = false, guess2 = false, guess3 = false, guess4 = false, dragCor = false, dragFal_1 = false, dragFal_2 = false, fal1Moved = false, fal2Moved = false, corMoved = false, isFired = false, hitUp1 = false, hitUp2 = false, hitDown1 = false, hitDown2 = false, explode = false;
	private static Timer tLvl1, tRooms, tLvl2, tSpy, tLvl3, tDart, tRocket1, tRocket2, tIntro;
	private static Rectangle2D corMask, fal_1Mask, fal_2Mask, canMask, briefMask, playerMask, spyUp1Mask, spyUp2Mask, spyDown1Mask, spyDown2Mask, buildingMask, dartMask, emailButtonMask;
	private static ImageIcon[] avatarsArray;
	private static Random rnd = new Random(); 
	private static String name;
	private static String[] buttons = {"Yes, of course!", "No, my work here is done"};
	private static Enemy spyUp1 = new Enemy(true), spyUp2 = new Enemy(true), spyDown1 = new Enemy(false), spyDown2 = new Enemy(false);
	private Cursor handCursor;
	
	// CONSTRUCTOR
	public SpaceRaceMain()	{
		// initialize variables and images
		encrypt = new Encryption();
		width = 800;
		height = 700;
		seconds1 = 120;
		seconds2 = 90;
		score = 0;
		roomNum = 0;
		partCor = new ImageIcon("images\\rocket CORRECT.png");
		partFal_1 = new ImageIcon("images\\rocket FALSE1.png");
		partFal_2 = new ImageIcon("images\\rocket FALSE2.png");
		can = new ImageIcon("images\\can.png");
		briefcase = new ImageIcon("images\\briefcase.png");
		avatarsArray = new ImageIcon[] {new ImageIcon("images\\girl detective.png"), new ImageIcon("images\\boy detective.png")};
		building = new ImageIcon("images\\building.png");
		dart = new ImageIcon("images\\dart.png");

		// initialize cursor
		handCursor = Toolkit.getDefaultToolkit().createCustomCursor(hand.getImage(), new Point (16,16), "");
		                
		// initialize masks
		canMask = new Rectangle2D.Double(30, 515, can.getIconWidth(), can.getIconHeight());
		briefMask = new Rectangle2D.Double(605, 540, briefcase.getIconWidth(), briefcase.getIconHeight());
		corMask = new Rectangle2D.Double(partCorX, partCorY, partCor.getIconWidth(), partCor.getIconHeight());
		fal_1Mask = new Rectangle2D.Double(partFal_1X, partFal_1Y, partFal_1.getIconWidth(), partFal_1.getIconHeight());
		fal_2Mask = new Rectangle2D.Double(partFal_2X, partFal_2Y, partFal_2.getIconWidth(), partFal_2.getIconHeight());
		spyUp1Mask = new Rectangle2D.Double(spyUp1.getX(), spyUp1.getX(), spyUp1.getWidth(), spyUp1.getHeight());
		spyUp2Mask = new Rectangle2D.Double(spyUp2.getX(), spyUp2.getX(), spyUp2.getWidth(), spyUp2.getHeight());
		spyDown1Mask = new Rectangle2D.Double(spyDown1.getX(), spyDown1.getX(), spyDown1.getWidth(), spyDown1.getHeight());
		spyDown2Mask = new Rectangle2D.Double(spyDown2.getX(), spyDown2.getX(), spyDown2.getWidth(), spyDown2.getHeight());
		buildingMask = new Rectangle2D.Double(970, height/2 - building.getIconHeight(), building.getIconWidth(), building.getIconHeight());
		dartMask = new Rectangle2D.Double(dartX, dartY, dart.getIconWidth(), dart.getIconHeight());
		emailButtonMask = new Rectangle2D.Double(250, 200, emailButton.getIconWidth(), emailButton.getIconHeight());

		// set properties of JPanel
  		setLayout(null);
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
		addMouseMotionListener(this);
		addMouseListener(this);
		
		// initialize JFrame
		frame = new JFrame();
		frame.setContentPane(this);
		frame.setTitle("Space Race");
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	frame.setVisible(true);
		
		// initialize/start timers
		tLvl1 = new Timer(1000, this);
		tRooms = new Timer(1000,this);
		tLvl2 = new Timer(1000, this);
		tRooms.start();
		tSpy = new Timer(10, this);
		tLvl3 = new Timer(1000, this);
		tDart = new Timer (10, this);
		tRocket1 = new Timer(10, this);
		tRocket2 = new Timer(10, this);
		tIntro = new Timer(10, this);
	}
	
	// MAIN METHOD
	public static void main(String[] args) {
	
		new SpaceRaceMain();
		
		// go to story intro room after 5 seconds
		try	{
			Thread.sleep(5000);
		}
		catch (InterruptedException i)	{}
		roomNum = -1;
		
		// prompt for name until they enter a name
		while (name == null)
		{
			name = (String) JOptionPane.showInputDialog(null, "Enter your name:\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"), null, null);
			
			if (name == null)
				JOptionPane.showMessageDialog(null, "Error: You must enter a name!\n\n", "Space Race", JOptionPane.WARNING_MESSAGE);
		}
		
		// get avatar choice by calling on getAvatar() method
		avatar = getAvatar();	
		
		// greet user
		JOptionPane.showMessageDialog(null, "Greetings Investigator " + name + ", thank you for agreeing to help us here at NASA.\n\nA rocket is currently preparing for liftoff to Mars.\nUnfortunately, a rogue team has stolen a key part of the rocket because they want to be the first to Mars!\n\nWe need you to help us locate the part and bring it back in time for liftoff.\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
		
		// start timer to animate chosen avatar walking out of room
		tIntro.start();		
	}
	
	// TIMER METHOD
	public void actionPerformed (ActionEvent e)	{
		// timer for intro animation
		if (e.getSource() == tIntro)
		{
			// make the chosen avatar move forward
			if (avatarChoice == 0)
				girlY += 2;
			else if (avatarChoice == 1)
				boyY += 2;
			
			// start level 1 when the avatar exits the room
			if (girlY > height || boyY > height) {
				tIntro.stop();
				roomNum = 1;
				repaint();
				JOptionPane.showMessageDialog(null, "Welcome to Level 1. We've got our hands on an email the rogue team has sent, which contains the address and password to the location of the missing part... but it's encrypted!\n\nThe computer will lock in 2 minutes and we will lose access to the email. Luckily, we snagged the program they used to encrypt the email.\nWe can use this to try and figure out what the original message was. You can also type 'H' for a hint, but you will lose 15 seconds on the clock.\n\nWe need you, Investigator " + name + ", to try to decrypt the email before the computer locks!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
				tLvl1.start();	
			}	
		}
			
		// timer for level 1 clock
		if (e.getSource() == tLvl1)
		{
			// decrease seconds variable by 1 and calculate width of line timer (call on timerWidth method)
			seconds1--;
			lineWidth = timerWidth(seconds1, 120.0);

			
			// end the game if user runs out of time
			if (seconds1 < 0) {
				tLvl1.stop();
				JOptionPane.showMessageDialog(null, "The computer locked! Now we'll never figure out the location of the missing piece!\n\nGAME OVER\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
				System.exit(0);
			}
		}
		
		// timer for level 2 clock
		if (e.getSource() == tLvl2)
		{
			// decrease seconds variable by 1 and calculate width of line timer (call on timerWidth method)
			seconds2--;
			lineWidth = timerWidth(seconds2, 90.0);

			
			// end the game if the user runs out of time
			if (seconds2 < 0) {
				tLvl2.stop();
				JOptionPane.showMessageDialog(null, "You ran out of time! The fake parts are now exploding! \n\nGAME OVER!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
				System.exit(0);
			}
		}
		
		// timer for enemies in level 3
		if (e.getSource() == tSpy)
		{
			// make spies move if they have not been hit yet
			if (hitUp1 == false)
				spyUp1.moveUp(playerX);
			
			if (hitUp2 == false)
				spyUp2.moveUp(playerX);
			
			if (hitDown1 == false)
				spyDown1.moveDown(playerX);
			
			if (hitDown2 == false)
				spyDown2.moveDown(playerX);
			
			// update spy masks
		 	spyUp1Mask = new Rectangle2D.Double(spyUp1.getX(), spyUp1.getY(), spyUp1.getWidth(), spyUp1.getHeight());
			spyUp2Mask = new Rectangle2D.Double(spyUp2.getX(), spyUp2.getY(), spyUp2.getWidth(), spyUp2.getHeight());
			spyDown1Mask = new Rectangle2D.Double(spyDown1.getX(), spyDown1.getY(), spyDown1.getWidth(), spyDown1.getHeight());
			spyDown2Mask = new Rectangle2D.Double(spyDown2.getX(), spyDown2.getY(), spyDown2.getWidth(), spyDown2.getHeight());
			
			// if user collides with any spies end the game
			if (playerMask.intersects(spyUp1Mask) || playerMask.intersects(spyUp2Mask) || playerMask.intersects(spyDown1Mask) || playerMask.intersects(spyDown2Mask)) 
			{
				tSpy.stop();
				tLvl3.stop();
				JOptionPane.showMessageDialog(null, "The rogue team stole the part!\n\nGAME OVER!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
				System.exit(0);
			}
		}
		
		 // timer for level 3 clock
		if (e.getSource() == tLvl3)
		{
			// decrease seconds variable by 1 and calculate width of line timer (call on timerWidth method)
			seconds3--;
			lineWidth = timerWidth(seconds3, 60.0);
			
			// end the game if user runs out of time
			if (seconds3 < 0)
			{
				tLvl3.stop();
				tSpy.stop();
				JOptionPane.showMessageDialog(null, "You did not get the part back to base in time. GAME OVER!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
				System.exit(0);
			}
		}
		
		// timer for dart animation
		if (e.getSource() == tDart)
		{
			// move dart in the direction player is facing and assign corresponding picture
			if (dir == 1)
			{
				dart = new ImageIcon("images\\dart.png");
				dartX += 10;
			}
			else if (dir == -1)
			{
				dart = new ImageIcon("images\\dart LEFT.png");
				dartX -= 10;
			}

			// stop dart when it's outside of frame
			if (dartX > width || dartX + dart.getIconWidth() < 0) {
				tDart.stop();
				isFired = false;
			}
			
			// redraw dart mask
			dartMask = new Rectangle2D.Double(dartX, dartY, dart.getIconWidth(), dart.getIconHeight());
			
			// if dart collides with the spies move dart out of frame and change hit variable to true
			if (dartMask.intersects(spyUp1Mask))
			{
				dartX = width+50;
				hitUp1 = true;
			}
			if (dartMask.intersects(spyUp2Mask))
			{
				dartX = width+50;
				hitUp2 = true;
			}			
			if (dartMask.intersects(spyDown1Mask))
			{
				dartX = width+50;
				hitDown1 = true;
			}			
			if (dartMask.intersects(spyDown2Mask))
			{
				dartX = width+50;
				hitDown2 = true;
			}
		}
		
		// rocket liftoff animation timer
		if (e.getSource() == tRocket1)
		{
			// if rocket is within the frame, move it up
			if (rocketY + rocket.getIconHeight() > 0)
				rocketY -= 3;
			
			// if rocket exits the frame, animate landing (not liftoff)
			else {
				roomNum = 5;
				tRocket1.stop();
				tRocket2.start();
			}
		}
		
		// rocket landing animation timer
		if (e.getSource() == tRocket2)
		{
			// move rocket down until 400 on y-axis, wait 2 and a half seconds, then exit the program
			if (rocketY < 400)
				rocketY += 3;
			else 
			{
				tRocket2.stop();
				
				try	{
					Thread.sleep(2500);
				}
				catch (InterruptedException i)	{}
				
				System.exit(0); 
			}
		}
		
		repaint();		
	}
	
	// MOUSE METHODS
	public void mouseClicked (MouseEvent e)	{
		// allow user to drag the part they click on in level 2; if mouse coordinates are within bounds of a part, allow them to drag it
		if (e.getX() >= partCorX && e.getX() <= partCorX + partCor.getIconWidth() && e.getY() >= partCorY && e.getY() <= partCorY + partCor.getIconHeight())
			dragCor = true;
		
		else if (e.getX() >= partFal_1X && e.getX() <= partFal_1X + partFal_1.getIconWidth() && e.getY() >= partFal_1Y && e.getY() <= partFal_1Y + partFal_1.getIconHeight())
			dragFal_1 = true;
		
		else if (e.getX() >= partFal_2X && e.getX() <= partFal_2X + partFal_2.getIconWidth() && e.getY() >= partFal_2Y && e.getY() <= partFal_2Y + partFal_2.getIconHeight())
			dragFal_2 = true;
		
		// if user doesn't click on a part, don't let them drag anything
		else 
		{
			dragCor = false;
			dragFal_1 = false;
			dragFal_2 = false;
		}
		
		// display decrypted email if user clicks on email button
		if (roomNum == 2)
		{
			if (emailButtonMask.contains(e.getX(), e.getY()))
				JOptionPane.showMessageDialog(null, "ADDRESS: 537 Sunset Drive\n\nPASSWORD: Mars123\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\email.png"));
		}
			
		repaint();
	}
	public void mousePressed (MouseEvent e) {}
	public void mouseReleased (MouseEvent e) 	{
		// check rocket part collisions with can or briefcase when mouse is released
		if (roomNum == 2)
			lvl2Collision();
	}
	public void mouseEntered (MouseEvent e) {}
	public void mouseExited (MouseEvent e) {}
	
	public void mouseDragged (MouseEvent e)	{
		// assign mouse coordinates to whichever image the mouse clicked on (so they move with the mouse) and update their masks
		if (dragCor == true)
		{
			partCorX = e.getX();
			partCorY = e.getY();
			corMask = new Rectangle2D.Double(partCorX, partCorY, partCor.getIconWidth(), partCor.getIconHeight());
		}
		else if (dragFal_1 == true)
		{
			partFal_1X = e.getX();
			partFal_1Y = e.getY();
			fal_1Mask = new Rectangle2D.Double(partFal_1X, partFal_1Y, partFal_1.getIconWidth(), partFal_1.getIconHeight());
		}
		else if (dragFal_2 == true)
		{
			partFal_2X = e.getX();
			partFal_2Y = e.getY();
			fal_2Mask = new Rectangle2D.Double(partFal_2X, partFal_2Y, partFal_2.getIconWidth(), partFal_2.getIconHeight());
		}
		repaint();
	}
	public void mouseMoved(MouseEvent e) {}
	
	// KEY METHODS 
	public void keyTyped(KeyEvent e) 
	{
		if (roomNum == 1)
		{
			// user wants to test encrypting something 
			if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
			{
				// get input from user from encryption class
				userWord = encrypt.getInput();
				
				// continue with encryption if user enters in a word and display encrypted word
				if (userWord != null) {
					encryptedWord = encrypt.getEncrypted(userWord);
					JOptionPane.showMessageDialog(null, userWord + " = " + encryptedWord + "\n\n", "Encrypting Program", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
				}
				
				// reset variables in encryption class
				encrypt.clear();
			}
			
			// user wants to guess a word/number 
			if (e.getKeyChar() == 'G' || e.getKeyChar() == 'g')
			{
				// get input from user
				guess = JOptionPane.showInputDialog(null, "Enter your guess (one word/series of numbers at a time):\n\nNOTE: This is case and space sensitive!\n\n", "Space Race", JOptionPane.QUESTION_MESSAGE);
			
				// if guess is correct, tell user what it corresponds with in the email and set guess variable to true
				if (guess != null)
				{
					if (guess.equals("537")) {
						guess1 = true;
						JOptionPane.showMessageDialog(null, "Correct!\n\n846 = 537\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\correct.png"));
					}
					else if (guess.equals("Sunset")) {
						guess2 = true;
						JOptionPane.showMessageDialog(null, "Correct!\n\ntfuTvo = Sunset\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\correct.png"));
					}
					else if (guess.equals("Drive"))	{
						guess3 = true;				
						JOptionPane.showMessageDialog(null, "Correct!\n\nwfjEs = Drive\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\correct.png"));
					}
					else if (guess.equals("Mars123")) {
						guess4 = true;
						JOptionPane.showMessageDialog(null, "Correct!\n\n234tNbs = Mars123\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\correct.png"));
					}
					// tell user they guessed incorrectly if their input doesn't match 
					else 			
						JOptionPane.showMessageDialog(null, "Incorrect", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\incorrect.png"));
					
					// check if all guesses are correct
					if (guess1 == true && guess2 == true && guess3 == true && guess4 == true) 
					{
						// display decrypted email and stop seconds from increasing
						tLvl1.stop();
						repaint();
						
						// delay 2 seconds before continuing
						try	{
							Thread.sleep(2000);
						}
						catch (InterruptedException i)	{}		
						
						// calculate points
						score += seconds1;
						
						//output messages, change roomNum, start level 2 timer
						JOptionPane.showMessageDialog(null, "Congratulations, you decrypted the email with " + seconds1 + " seconds to spare. To 537 Sunset Drive it is!\n\n+" + seconds1 + " point(s)\n\nSCORE: " + score, "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
						roomNum = 2;
						lineWidth = width;
						JOptionPane.showMessageDialog(null, "Welcome to Level 2! The rogue group has anticipated your arrival...\n\nOnly one of these parts is the correct one - the rest are set to explode in 90 seconds!\nDiscard of the explosives and put the correct one in your briefcase before they explode!\n\nHINT: Pay attention to the email you decrypted earlier... it may help with figuring out the correct one!\n\nCONTROLS: Click on a part and then drag to move it. To move a different tool, click the wall and then click on (then drag!) the tool you want.", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
						tLvl2.start();
					}
				}
			}
			
			// user wants a hint
			if (e.getKeyChar() == 'H' || e.getKeyChar() == 'h')
			{
				// display according hint, decrease hint counter, remove 15 seconds from clock
				if (hintNum == 3) {
					seconds1 -= 15;
					hintNum--;
					JOptionPane.showMessageDialog(null, "HINT 1: To be encrypted, each letter has become the next ASCII character.\n\nEx. A = B, c = d, 3 = 4, etc.\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\hint.png"));
				}
				else if (hintNum == 2) {
					seconds1 -= 15;
					hintNum--;
					JOptionPane.showMessageDialog(null, "HINT 2: To be encrypted, the first and second halves of the words/series of numbers have been switched. (If odd # of letters, middle letter stays in the same place).\n\nEx. cat = tac, dice = cedi, etc.\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\hint.png"));
				}
				else if (hintNum == 1) {
					seconds1 -= 15;
					hintNum--;
					JOptionPane.showMessageDialog(null, "HINT 3: The beginning of the decrypted word starts at the capital letter in the encrypted word.\n\nThis is your last hint, Investigator " + name + "!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\hint.png"));
				}
				
				// tell user they have no hints left if hintNum = 0
				else 
					JOptionPane.showMessageDialog(null, "You ran out of hints, Investigator " + name + "!\n\n", "Space Race", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		if (roomNum == 2) {
			// display decrypted email if user types "e"
			if (e.getKeyChar() == 'E' || e.getKeyChar() == 'e')
				JOptionPane.showMessageDialog(null, "ADDRESS: 537 Sunset Drive\n\nPASSWORD: Mars123\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\hint.png"));
		}
		repaint();
	}
	public void keyPressed(KeyEvent e)	{
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// display right picture 
			avatar = avatarsArray[avatarChoice];
			
			// change direction to right number if a bullet isn't in the room
			if (isFired == false)
				dir = 1;
			
			// move player right if within bounds
			if (playerX + avatar.getIconWidth() + 30 < width) 
				playerX += 13;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			// display left picture 
			if (avatarChoice == 0)
				avatar = new ImageIcon("images\\girl LEFT.png");
			else if (avatarChoice == 1)
				avatar = new ImageIcon("images\\boy LEFT.png");
	
			// change direction to left number if a bullet isn't in the room
			if (isFired == false)
				dir = -1;
			
			// move player left if within bounds
			if (playerX - 15 > 0)
				playerX -= 13;
		}
		
		// move player up if within bounds
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			if (playerY - 7 > 0)
				playerY -= 13;
		}
		
		// move player down if within bounds
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			if (playerY + avatar.getIconHeight() + 40 < height)
				playerY += 13;
		}
		
		// create dart at user's location when user hits space and start dart timer
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			if (isFired == false)	{
				dartX = playerX;
				dartY = playerY + 30;
				isFired = true;
				tDart.start();
			}
		}
		
		// update mask 
		playerMask = new Rectangle2D.Double(playerX, playerY, avatar.getIconWidth(), avatar.getIconHeight());
		
		// check if player reached building
		if (playerMask.intersects(buildingMask)) 
		{
			// stop timers and add points
			tLvl3.stop();
			tSpy.stop();
			score += seconds3*2;
			
			while (true)
			{
				// ask user what they want to do at the end
				int endChoice = JOptionPane.showOptionDialog(null, "You successfully brought back the part just in time for liftoff! Thank you for your service Investigator " + name + ".\nAll of us here at NASA are eternally grateful... because of you, we will be the first to Mars!\n\n+" + seconds3*2 + " point(s)\n\nFINAL SCORE: " + score + "\n\nWould you like to stay to watch the liftoff?\n\n", "Space Race", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"), buttons, buttons[0]);
				
				// start timer and set up roomNum for animation of liftoff if user says they want to watch liftoff
				if (endChoice == 0)	{
					roomNum = 4;
					tRocket1.start();
					break;
				}
				
				// confirm that they want to quit if user says they want to leave
				if (endChoice == 1)	{
					int exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to leave, Investigator " + name + "?", "Space Race", JOptionPane.YES_NO_OPTION);
					
					if (exit == 1) // show previous message again if they say no
						continue;
					else if (exit == 0) // quit if they click yes
					{
						JOptionPane.showMessageDialog(null, "Thanks again for your service, Investigator " + name + ". Goodbye!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
						System.exit(0);
					}
				}
			}
		}
		repaint();
	}
	public void keyReleased(KeyEvent e) {}
	
	// OTHER METHODS
	public void lvl2Collision()
	{
		// if the fake tools are thrown out stop mouse from dragging them, move them out of the room, and set the moved variable to true
		if (fal_1Mask.intersects(canMask))	{
			partFal_1Y = 900;
			fal1Moved = true;
			dragFal_1 = false;
		}
		if (fal_2Mask.intersects(canMask))	{
			partFal_2Y = 900;
			fal2Moved = true;
			dragFal_2 = false;
		}
		
		// if correct tool is thrown out move it out of the room and end game
		if (corMask.intersects(canMask))	{
			partCorY = 900;
			JOptionPane.showMessageDialog(null, "You threw away the correct part!\n\nGAME OVER!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
			System.exit(0);
		}
		
		// if fake tools collide with briefcase move it out of the room, animate explosion, and end the game
		if (fal_1Mask.intersects(briefMask))	{
			partFal_1Y = 900;
			explode = true;
			JOptionPane.showMessageDialog(null, "You kept an explosive!\n\nGAME OVER!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
			System.exit(0);
		}
		if (fal_2Mask.intersects(briefMask))	{
			partFal_2Y = 900;
			explode = true;
			JOptionPane.showMessageDialog(null, "You kept an explosive!\n\nGAME OVER!\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
			System.exit(0);
		}
		
		// if correct tool is saved move it out of the room, stop mouse from dragging it, change moved variable to true
		if (corMask.intersects(briefMask))		{
			partCorY = 900;
			corMoved = true;
			dragCor = false;
		}
		
		// if all have been successfully sorted
		if (corMoved == true && fal1Moved == true && fal2Moved == true)		{
			// stop timer, calculate points and display message
			tLvl2.stop();
			score += seconds2;
			JOptionPane.showMessageDialog(null, "Congratulations, you've discarded of the explosives and secured the correct part! Now let's go bring it back to base.\n\n+" + seconds2 + " point(s)\n\nSCORE: " + score, "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"));
			
			// set frame for level 3
			roomNum = 3;
			width = 1100;
			frame.setSize(width, height);
			frame.setLocationRelativeTo(null);
			
			// display message, start timers, initialize player mask
			JOptionPane.showMessageDialog(null, "Welcome to Level 3, Investigator " + name + ". The rogue team has been notified that you have the part and spies are lurking near the NASA base.\n\nYou must get the part to base without colliding with a spy - if you do they will steal the part.\nLuckily, we've equipped you with some tranquilizer darts. If a spy is hit by one, they can't move anymore (but they could still steal the part if you collide with them!).\nUse these wisely and good luck!\n\nCONTROLS: Use arrow keys to move up, down, left, and right. Hit space to shoot a dart in the direction you are facing (left and right only).\n\n", "Space Race", JOptionPane.INFORMATION_MESSAGE);
			playerMask = new Rectangle2D.Double(playerX, playerY, avatar.getIconWidth(), avatar.getIconHeight());
			lineWidth = width;
			tSpy.start();
			tLvl3.start();
		}
	}

	public static ImageIcon getAvatar()	{
		while (true)	{
			try		{
				// get choice from user
				avatarChoice = Integer.parseInt( (String) JOptionPane.showInputDialog(null, "1. Girl detective\n2. Boy detective\n3. Random\n\nEnter your choice of avatar (type a number).\n\n", "Space Race", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"), null, null));
				
				// if they choose 1 or 2, subtract one so variable saves the index they chose
				if (avatarChoice == 1 || avatarChoice == 2)	{			
					avatarChoice--; 
					return avatarsArray[avatarChoice];
				}
				
				// if they choose a random avatar, override with random number so variable saves the index that was randomly generated 
				else if (avatarChoice == 3)	{
					avatarChoice = rnd.nextInt(2);
					return avatarsArray[avatarChoice];
				}
				
				// display error message if user enters invalid input
				else	{
					JOptionPane.showMessageDialog(null, "Error: You must enter a number between 1 and 3!\n\n", "Space Race", JOptionPane.WARNING_MESSAGE);
					continue;
				}
			}
			catch (Exception e)	{
				// display error message if user enters invalid input
				JOptionPane.showMessageDialog(null, "Error: You must enter a number!\n\n", "Space Race", JOptionPane.WARNING_MESSAGE);
			}
		}		
	}
	
	public int timerWidth(int secLeft, double secTotal)
	{
		// calculate percentage of time left and multiply by width of room to get width of timer
		int timerWidth = (int) ((secLeft / secTotal) * width);
		return timerWidth;
	}
	
	// PAINT METHOD
	public void paint(Graphics g)	{
		// refresh frame and initialize graphics2d object
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		// draw title page
		if (roomNum == 0)	{
			bkg = new ImageIcon("images\\space race title.png");
			g2.drawImage(bkg.getImage(), 0, 0, this);
		}
		
		// draw avatar locker/story intro elements
		if (roomNum == -1)	{
			bkg = new ImageIcon("images\\nasa base.jpg");
			g2.drawImage(bkg.getImage(), 0, 0, this);
			g2.drawImage(avatarsArray[0].getImage(), 290, girlY, this);
			g2.drawImage(avatarsArray[1].getImage(), 390, boyY, this);
		}
		
		// draw level 1 elements
		if (roomNum == 1)	{
			// draw decrypted email if user has decrypted it
			if (guess1 == true && guess2 == true && guess3 == true && guess4 == true) 
				bkg = new ImageIcon("images\\email decrypted.png");
			
			// draw encrypted email if user has not decrypted it
			else
				bkg = new ImageIcon("images\\email background.png");
			
			g2.drawImage(bkg.getImage(), 0, 0, this);
			
			// draw text and timer
			g2.setFont(new Font("Arial", Font.BOLD, 20));
			g2.setColor(Color.BLACK);
			g2.drawString(new String("Hints Left: " + hintNum), 660, 30);

			// if there 5 or less seconds, change timer colour to red
			if (seconds1 <= 5)
				g2.setColor(Color.RED);
			g2.drawString(new String("Time Left: " + seconds1), 5, 30);
			g2.fill(new Rectangle2D.Double(0, 0, lineWidth, 7));
		}
		
		// draw level 2 elements
		if (roomNum == 2)		{
			// set background and cursor
			bkg = new ImageIcon("images\\level 2 background.jpg");
			setCursor(handCursor);
		
			// draw images
			g2.drawImage(bkg.getImage(), 0, 0, this);
			g2.drawImage(can.getImage(), 30, 515, this);
			g2.drawImage(briefcase.getImage(), 605, 540, this);
			g2.drawImage(partCor.getImage(), partCorX, partCorY, this);
			g2.drawImage(partFal_1.getImage(), partFal_1X, partFal_1Y, this);
			g2.drawImage(partFal_2.getImage(), partFal_2X, partFal_2Y, this);	
			g2.drawImage(emailButton.getImage(), 250, 200, this);	
						
			// draw timer (set colour to red if 5 seconds or less)
			g2.setFont(new Font("Arial", Font.BOLD, 20));
			
			if (seconds2 > 5)
				g2.setColor(Color.WHITE);
			else 
				g2.setColor(Color.RED);
			
			g2.drawString(new String("Time Left: " + seconds2), 5, 30);  
			g2.fill(new Rectangle2D.Double(0, 0, lineWidth, 7));
			
			// draw explosion if user kept an explosive
			if (explode == true)
				g2.drawImage(explosion.getImage(), 250, 250, this);
		}
		
		// draw level 3 elements
		if (roomNum == 3)	{
			// set background and cursor
			bkg = new ImageIcon("images\\grass.jpg");
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			g2.drawImage(bkg.getImage(), 0, 0, this);
			
			// draw images
			g2.drawImage(building.getImage(), 970, height/2 - building.getIconHeight(), this);
			g2.drawImage(avatar.getImage(), playerX, playerY, this);
			g2.drawImage(spyUp1.getImage().getImage(), spyUp1.getX(), spyUp1.getY(), this);
			g2.drawImage(spyUp2.getImage().getImage(), spyUp2.getX(), spyUp2.getY(), this);
			g2.drawImage(spyDown1.getImage().getImage(), spyDown1.getX(), spyDown1.getY(), this);
			g2.drawImage(spyDown2.getImage().getImage(), spyDown2.getX(), spyDown2.getY(), this);
			
			// draw timer (change colour to red if less than 5 seconds)
			g2.setFont(new Font("Arial", Font.BOLD, 20));
			
			if (seconds3 > 5)
				g2.setColor(Color.BLACK);
			else 
				g2.setColor(Color.RED);
			
			g2.drawString(new String("Time Left: " + seconds3), 5, 30);  
			g2.fill(new Rectangle2D.Double(0, 0, lineWidth, 7));

			// draw dart if isFired is true
			if (isFired == true)
				g2.drawImage(dart.getImage(), dartX, dartY, this);

		}
		
		// draw rocket liftoff elements
		if (roomNum == 4)	{
			bkg = new ImageIcon("images\\liftoff.jpg");
			g2.drawImage(bkg.getImage(), 0, 0, this);
			g2.drawImage(rocket.getImage(), width/2, rocketY, this);
		}
		
		// draw landing elements
		if (roomNum == 5)	{
			bkg = new ImageIcon("images\\mars.jpg");
			g2.drawImage(bkg.getImage(), 0, 0, this);
			g2.drawImage(rocket.getImage(), width/2, rocketY, this);		
		}
	}
}

