package Game;


import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import Avalanche.CameraMovement;
import Avalanche.PlayerClass;
import Avalanche.RenderManager;
public class game {

	public int width, height;
	public String title;
	
	
	public static void main(String[] args) {

		try {
			
			windowCreate(960, 544);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	
	
	public static void windowCreate(int width, int height) throws Exception {
		
		PlayerClass player;
		Display.setDisplayMode(new DisplayMode(width, height));
		Display.create();
		Display.setTitle("Avalanche Engine");
		player = new PlayerClass();
		while (!Display.isCloseRequested())
		{
			
			// Environment Settings
			
			CameraMovement.setCamera();
			RenderManager.render();
			
			// Player drawing
			System.out.println("X: " + PlayerClass.x + " " + "Y: " + PlayerClass.y);
			player.drawChar();
			
			
			// Audio Management

			
			// DO NOT REMOVE
			Display.update();
			Display.sync(60);
		}
		Display.destroy();
		
	}




}
