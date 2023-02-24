package Avalanche;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
public class PlayerClass {
	
	public static double x;
	public static double y;
	public static double xspeed;
	public static double yspeed;
	public boolean jumpPressed, jumpwasPressed;
	public int dbJumps;
	public PlayerClass() {
		x = 100;
		y = 40;
		xspeed = 1;
	}
	
	public void playerLogic() {
		jumpwasPressed = jumpPressed;
		jumpPressed = Keyboard.isKeyDown(Keyboard.KEY_W);
		x += xspeed;
		y += yspeed;
		
		yspeed -= 0.4;
		
		
		if (y <= 40) { // if on floor
			dbJumps = 2;
			yspeed = 0;
			y = 40;
			if(!Keyboard.isKeyDown(Keyboard.KEY_D) && xspeed > 0 ) xspeed = xspeed*0.8;
			if(!Keyboard.isKeyDown(Keyboard.KEY_A) && xspeed < 0 ) xspeed = xspeed*0.8;

		}
		if (jumpPressed && !jumpwasPressed && dbJumps > 0) {
			dbJumps = dbJumps - 1;
			yspeed = 6;
			
		}

		// Movement Management
		
		if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
			xspeed = Math.max(-5, xspeed-1);
		}
		
		if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
			xspeed = Math.min(+5, xspeed+1);
		}
		
		CollisionsHandler.init();

		

	}
	
	public void drawChar() {
		
		playerLogic();
		
		glPushMatrix();
		GL11.glTranslated(x, y, 0);
		
		GL11.glBegin(GL_QUADS);
		
		// BL Corner
		glColor3d(0, 0, 0);
		glVertex2d(-8, 0);
		
		// BR Corner
		glColor3d(0, 0, 0);
		glVertex2d(8, 0);
		
		// TR Corner
		glColor3d(0, 0, 0);
		glVertex2d(8, 32);
		
		// TL Corner
		glColor3d(0, 0, 0);
		glVertex2d(-8, 32);
		
		glEnd();
		
		glPopMatrix();
	}
}
