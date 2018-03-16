package engine;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class InputManager 
{
	private static boolean keyPressed[] = new boolean[256];
	private static boolean keyWasPressed[] = new boolean[256];
	private static KeyEventDispatcher ked;
	
	public static void Initialize()
	{
		ked = new KeyEventDispatcher() 
        {
            public boolean dispatchKeyEvent(KeyEvent ke) 
            {
                switch (ke.getID()) 
                {
                	case KeyEvent.KEY_PRESSED:
                	{
                        keyPressed[ke.getKeyCode()] = true;
                	}
                    break;

                	case KeyEvent.KEY_RELEASED:
                    {
                    	keyPressed[ke.getKeyCode()] = false;
                    }
                    break;
                }
                return false;
            }
        };
		
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(ked);
	}
	
	
	public static void Update()
	{
		for(int i = 0; i < 256; ++i)
		{
			keyWasPressed[i] = keyPressed[i];
		}
	}
	
	public static boolean IsPressed(int keyCode)
	{
		return keyPressed[keyCode];
	}
	
	public static boolean IsTriggered(int keyCode)
	{
		return keyPressed[keyCode] && !keyWasPressed[keyCode];
	}
	
	public static boolean IsReleased(int keyCode)
	{
		return !keyPressed[keyCode] && keyWasPressed[keyCode];
	}
	
	public static void Destroy()
	{
		KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(ked);
		ked = null;
		keyPressed = null;
		keyWasPressed = null;
	}

}