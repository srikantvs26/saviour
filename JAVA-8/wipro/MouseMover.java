import java.awt.AWTException;
import java.awt.Robot;

public class MouseMover {

	public static void main(String[] args) throws AWTException, InterruptedException {

		int x = 500;
		int y = 500;

		Robot rt = new Robot();
		while (true) {
			rt.mouseMove(x, y);
			x = x + 10;
			y = y + 10;

			Thread.sleep(60000);
		}

	}

}
