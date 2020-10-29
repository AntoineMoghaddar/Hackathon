package javamain.objects;

import processing.core.PApplet;
import processing.serial.*;

@SuppressWarnings("SpellCheckingInspection")
public class Playfield extends PApplet {

    Serial myPort;      // Initializing a vairable named 'myPort' for serial communication
    String color;
    int background_color;   // Variable for changing the background color

    public void settings() {
        size(500, 500);     // Size of the serial window, you can increase or decrease as you want
        myPort = new Serial(this, "COM5", 9600); // Set the com port and the baud rate according to the Arduino IDE
        myPort.bufferUntil('\n');   // Receiving the data from the Arduino IDE
    }

    public void draw() {
        if (color != null) {
            System.out.print(color);
            //background_color = Integer.parseInt(color);

            background(150, 50, background_color);   // Initial background color, when we will open the serial window
            if (mousePressed && (mouseButton == LEFT)) { // if the left mouse button is pressed

                myPort.write('1');       // send a '1' to the Arduino IDE

            }

            if (mousePressed && (mouseButton == RIGHT)) {  // if the right mouse button is pressed

                myPort.write('0');
                ;     // Send a '0' to the Arduino IDE
            }


        }
        if (myPort != null) {
            serialEvent(myPort);
        }
    }

    void serialEvent(Serial myPort) {
        if (myPort.available() > 0) {
//            background_color = Character.getNumericValue(myPort.read());

            color = myPort.readStringUntil('\n').replace("\n","");
//            color.replace("\n", "");
//            background_color = Integer.parseInt(myPort.readStringUntil('\n'));  // Changing the background color according to received data
//            System.out.println(background_color);
        }
    }

    public static void main(String[] args) {
        String[] processingArgs = {"Playfield"};
        Playfield mySketch = new Playfield();
        PApplet.runSketch(processingArgs, mySketch);
    }
}
