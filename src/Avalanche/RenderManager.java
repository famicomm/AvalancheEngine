package Avalanche;
import static org.lwjgl.opengl.GL11.*;

public class RenderManager {
	public RenderManager() {
		render();
	}
	
	public static void render() {
		drawBackground();
		drawGround();
		PlatformsHandler.init();

	}
	
	public static void drawBackground() {
		glBegin(GL_QUADS);
		
		glColor3d(0.6, 0.7, 0.9);
		glVertex2d(0, 0);
		glVertex2d(960, 0);
		
		glColor3d(0.6, 0.7, 0.9);
		glVertex2d(960, 544);
		glVertex2d(0, 544);
		
		glEnd();
	}
	
	public static void drawGround() {
		
		// Dirt
		
		glBegin(GL_QUADS);
		glColor3d(0.6, 0.2, 0.1);
		glVertex2d(0, 0);
		glVertex2d(960, 0);
		
		glVertex2d(960, 32);
		glVertex2d(0, 32);
		
		// Grass
		
		glColor3d(0, 0.8, 0);
		glVertex2d(0, 25);
		glVertex2d(960, 25);
		
		glVertex2d(960, 40);
		glVertex2d(0, 40);
		
		glEnd();
	}
}
