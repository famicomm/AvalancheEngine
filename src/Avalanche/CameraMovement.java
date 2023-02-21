package Avalanche;
import static org.lwjgl.opengl.GL11.*;


public class CameraMovement {
	
	public CameraMovement() {
		setCamera();
	}
	
	public static void setCamera() {
		
		
		// Clear Screen
		glClear(GL_COLOR_BUFFER_BIT);
		// Modify Projection Matrix
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 960, 0, 544, -1, 1);
		// Modify ModelView Matrix
		glMatrixMode(GL_MODELVIEW);
		glLoadIdentity();
	}
}
