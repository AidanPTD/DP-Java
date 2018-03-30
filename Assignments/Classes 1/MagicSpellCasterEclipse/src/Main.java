import engine.GraphicsManager;
import engine.InputManager;
import gameplay.Level;

public class Main
{
	private static Level level;
	private static boolean gameOn;
	private static int fps;
	
	private static void Initialize()
	{
		fps = 60; 
		GraphicsManager.Initialize("Magic Spell Caster", 800, 600);
		InputManager.Initialize();
		level = new Level();
		level.Initialize();
	}
	
	public static void main(String[] args) 
	{
		gameOn = true;
		Initialize();
		
		while(gameOn)
		{
			long time = System.currentTimeMillis();
			level.Update();
			InputManager.Update();
			
			//  make sure the frame rate is capped 
            time = (1000 / fps) - (System.currentTimeMillis() - time); 
            
            if (time > 0) 
            {
            	try 
            	{
            		Thread.sleep(time);
            	} 
                catch(Exception e){} 
            }
		}
		Destroy();
	}
	
	private static void Destroy()
	{
		level.Destroy();
		InputManager.Destroy();
		GraphicsManager.Destroy();
	}
}
