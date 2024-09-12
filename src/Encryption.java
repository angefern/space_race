// Space Race - Encryption class 

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Encryption {

	// fields
	private String userWord, midWord, encryptedWord;
	boolean length, space;
	
	// constructor
	public Encryption()	{
		userWord = "";
		midWord = "";
		encryptedWord = "";
		length = false;
		space = false;
	}
	
	// ask for input from user while length is invalid and there are spaces in what they entered
	public String getInput()	{
		while (length == false || space == false)	
		{
			// ask for word
			userWord = (String) JOptionPane.showInputDialog(null, "Enter a word/series of numbers to encrypt (no spaces and 3 characters minimum):\n\n", "Encrypting Program", JOptionPane.PLAIN_MESSAGE, new ImageIcon("images\\rocket joption.png"), null, null);
			
			// end method early if user cancels the JOptionPane
			if (userWord == null)
				return userWord;
			
			// check if word length is at least 3 characters (or if they didn't enter anything)
			if (userWord.length() >= 3)
				length = true;
			else	
			{
				JOptionPane.showMessageDialog(null, "Error: Your word/series of numbers must be at least 3 characters long!\n\n", "Encrypting Program", JOptionPane.WARNING_MESSAGE);
				continue;
			}
			
			// check if there are spaces or not
			for (int i = 0; i < userWord.length(); i++)	{
				// if there is a space, ask for input again
				if (Character.isWhitespace(userWord.charAt(i)))		
				{
					JOptionPane.showMessageDialog(null, "Error: Your word/series of numbers cannot contain spaces!\n\n", "Encrypting Program", JOptionPane.WARNING_MESSAGE);
					break;
				}
				
				// if last character isn't a space, set space to true
				if (!Character.isWhitespace(userWord.charAt(i)) && i == userWord.length() -1)
					space = true;
			}
		}
		return userWord;
	}
	
	public String getEncrypted(String userWord)	{
		// create array of word size
		char wordArray[] = new char[userWord.length()]; 

		// store each character in an array index
		for (int i = 0; i < userWord.length(); i++)		{
			wordArray[i] = userWord.charAt(i);
		}
		
		// make all the characters the next consecutive ASCII character and add them to midWord
		for (int i = 0; i < wordArray.length; i++)		{
			wordArray[i]++;		
			midWord += wordArray[i];
		}

		// swap first and second halves of the word (leave middle character if odd)
		if (wordArray.length % 2 == 0) // if even, add second half then first half to encryptedWord
		{
			encryptedWord += midWord.substring(midWord.length()/2);
			encryptedWord += midWord.substring(0, midWord.length()/2);
		}
		else // if odd add second half, then middle letter, then first half to encryptedWord
		{
			encryptedWord += midWord.substring(midWord.length()/2 + 1);
			encryptedWord += wordArray[(midWord.length()/2)];
			encryptedWord += midWord.substring(0, midWord.length()/2);
		}
		return encryptedWord;
	}
	
	// reset variables
	public void clear()	{
		userWord = "";
		midWord = "";
		encryptedWord = "";
		length = false;
		space = false;
	}
}
