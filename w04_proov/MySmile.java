import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MySmile {
  public static void main(String[] args) throws IOException {
    int width = 100;
    int height = 100;

    BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics g = picture.createGraphics();

    // background
    g.setColor(Color.GREEN);
    g.fillRect(0, 0, width, height);

    // face
    g.setColor(Color.BLACK);
    g.fillArc(0, 0, width, height, 0, 360);

    g.setColor(Color.YELLOW);

    // left eye
    g.drawArc(15, 15, 30, 10, 0, 180);
    g.fillOval(15, 20, 30, 30);

    // right eye
    g.drawArc(55, 15, 30, 10, 0, 180);
    g.fillOval(55, 20, 30, 30);

    // nose
    g.fillOval(40, 50, 20, 20);

    // mouth
    g.drawArc(20, 50, 60, 30, 0, -180);

    ImageIO.write(picture, "png", new File("smile.png"));
  }
}