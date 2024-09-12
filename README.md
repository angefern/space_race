 Program Description: Space Race is a multi-level game centered around an impending rocket launch to Mars. A rogue team has stolen a key part of the rocket 
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
