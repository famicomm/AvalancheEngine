package Avalanche;
import org.lwjgl.input.Keyboard;

public class CollisionsHandler {
	public CollisionsHandler() {
		init();
		
	}
	
	public static void init() {
		// Collisions
		
		if (Keyboard.isKeyDown(Keyboard.KEY_D) && PlayerClass.x >= 395 && PlayerClass.x <=549.0 && PlayerClass.y == 40) {
			PlayerClass.xspeed = 0;
			PlayerClass.x = PlayerClass.x - 4;
		} 
		if (Keyboard.isKeyDown(Keyboard.KEY_A) && PlayerClass.x >= 398.0 && PlayerClass.x <= 558.0 &&  PlayerClass.y == 40) {
			PlayerClass.xspeed = 0;

			PlayerClass.x = PlayerClass.x + 4;
		}
		
		// Slide functionality
		
		if (PlayerClass.x >= 398.0 && PlayerClass.x <= 556.0 && PlayerClass.y <= 74 && PlayerClass.y <= 75) {
			PlayerClass.yspeed = 0;
			PlayerClass.xspeed = PlayerClass.xspeed*0.8; // Normal Movement

			// This is the slide function: PlayerClass.xspeed = Math.min(+5, PlayerClass.xspeed+3);
		}
		
		if (PlayerClass.x >= 398.0 && PlayerClass.x <= 556.0 && PlayerClass.y <= 74 && PlayerClass.y <= 75 && PlayerClass.jumpPressed) {
			PlayerClass.yspeed = 6;

			// This is the slide function: PlayerClass.xspeed = Math.min(+5, PlayerClass.xspeed+3);
		}
		
		if (PlayerClass.x >= 398.0 && PlayerClass.x <= 556.0 && PlayerClass.y <= 73 && PlayerClass.y >= 40) {
			PlayerClass.y = PlayerClass.y + 10;
		}
		if (PlayerClass.xspeed <= -1 && PlayerClass.x >= 398.0 && PlayerClass.x <= 556.0 && PlayerClass.y <= 74 && PlayerClass.y <= 75) {
			PlayerClass.yspeed = 0;
			// PlayerClass.xspeed = Math.min(-5, PlayerClass.xspeed+3);
			

		} else if (PlayerClass.x <= 75) {
			
		}
		
		// Border Collisions
		
		if (PlayerClass.x <= 10) {
			PlayerClass.xspeed = 0;
			PlayerClass.x = PlayerClass.x + 5;
		} else if (PlayerClass.x >= 950) {
			PlayerClass.xspeed = 0;
			PlayerClass.x = PlayerClass.x - 5;
		}

	}
}
