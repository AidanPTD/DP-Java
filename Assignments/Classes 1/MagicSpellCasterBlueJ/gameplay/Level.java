package gameplay;

import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

import engine.GraphicsManager;
import engine.InputManager;

public class Level 
{
	public Hero hero;
	private JLabel onScreenText;
	
	public void Initialize()
	{
		hero = new Hero();
		onScreenText = new JLabel("Press 'Space' to cast a spell");
		onScreenText.setFont(new Font(onScreenText.getName(), Font.PLAIN, 28));
		GraphicsManager.jFrame.add(onScreenText);
	}
	
	public void Update()
	{
		if(InputManager.IsTriggered(KeyEvent.VK_SPACE))
		{
			//Student code goes here
		}
		else if(InputManager.IsTriggered(KeyEvent.VK_N))
		{
			//Student code goes here
		}
	}
	
	public void Destroy()
	{
		hero.Destroy();
		hero = null;
	}
}
