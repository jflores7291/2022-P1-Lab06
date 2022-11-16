// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);


        // Draw Random Lines

        for (int x = 0; x < 100; x++) {
            Random rand = new Random();
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));
            int x1 = rand.nextInt(390) + 10;
            int x2 = rand.nextInt(390) + 10;
            int y1 = rand.nextInt(280) + 10;
            int y2 = rand.nextInt(280) + 10;

            g.drawLine(x1, y1, x2, y2);

        }


        // Draw Random Squares
        for (int x = 0; x <= 100; x++) {
            Random rand = new Random();
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));
            int x1 = rand.nextInt(340) + 400;
            int y1 = rand.nextInt(242) + 10;
            int width = 50;
            int height = 50;


            g.fillRect(x1, y1, width, height);
        }


        // Draw Random Circles
        for (int x = 0; x <= 100; x++) {
            Random rand = new Random();
            int blue = rand.nextInt(255);
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));

            int diamter = rand.nextInt(200);
            int x1 = rand.nextInt(390 - diamter) + 10;
            int y2 = rand.nextInt(290 - diamter) + 300;


            g.drawOval(x1, y2, diamter, diamter);
        }


        // Draw 3-D Box
        {
            Random rand = new Random();
            Polygon penta = new Polygon();
            int blue = rand.nextInt(255);
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            penta.addPoint(500, 500);
            penta.addPoint(550, 500);
            penta.addPoint(550, 550);
            penta.addPoint(500, 550);
            g.fillPolygon(penta);
            g.setColor(new Color(red, green, blue));
        }

        {
            Random rand = new Random();
            Polygon penta2 = new Polygon();
            penta2.addPoint(500, 500);
            penta2.addPoint(500, 550);
            penta2.addPoint(475, 525);
            penta2.addPoint(475, 475);

            g.fillPolygon(penta2);
            int blue = rand.nextInt(255);
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));
        }
        {
            Random rand = new Random();
            Polygon penta3 = new Polygon();
            penta3.addPoint(500, 500);
            penta3.addPoint(475, 475);
            penta3.addPoint(525, 475);
            penta3.addPoint(525, 500);

            g.fillPolygon(penta3);
            int blue = rand.nextInt(255);
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));
        }
        {
            Random rand = new Random();
            Polygon penta4 = new Polygon();
            penta4.addPoint(550, 500);
            penta4.addPoint(525, 500);
            penta4.addPoint(525, 475);

            g.fillPolygon(penta4);
            int blue = rand.nextInt(255);
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));
        }
    }
}



















    
 