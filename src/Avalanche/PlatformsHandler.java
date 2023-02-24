package Avalanche;

import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glColor3d;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2d;

import org.lwjgl.opengl.GL11;

public class PlatformsHandler {
	
	public PlatformsHandler() {
		init();
	}
	
	public static void init() {
		mainPlatform();
	}
	
	
	
	public static void mainPlatform() {
		
		
		glBegin(GL11.GL_QUAD_STRIP);
		glColor3d(0.6, 0.2, 0.1);
		glVertex2d(405, 40); //TL Corner
		glVertex2d(550, 40); //TR Corner
		glColor3d(0.6, 0.2, 0.1);
		glVertex2d(405, 75); //BL Corner
		glVertex2d(550, 75); //BR Corner
		glEnd();
		
		// Grass
		glBegin(GL11.GL_QUAD_STRIP);
		glColor3d(0, 0.8, 0);
		glVertex2d(405, 75);
		glVertex2d(550, 60);
		
		glVertex2d(405, 75);
		glVertex2d(550, 60);
		
		glEnd();
	}
}
