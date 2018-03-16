package engine;

import javax.swing.JFrame;

public class GraphicsManager 
{
	public static JFrame jFrame;
	
	public static void Initialize(String windowTitle_, int windowWidth_, int windowHeight_)
	{
		jFrame = new JFrame(windowTitle_);
		jFrame.setVisible(true);
		jFrame.setSize(800, 600);
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void Destroy()
	{
		jFrame = null;
	}
}
