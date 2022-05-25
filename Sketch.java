import processing.core.PApplet;
import processing.core.PImage; //import the PImage library

public class Sketch extends PApplet {

  PImage imgMeteor; // declare a global image variable
  //

  float fltMeteorX = 200;
  float fltMeteorY = 200;

  float fltCirX = width/2;
  float fltCirY = width/2;


  public void settings() {
    size(400, 400);
  
  }

  public void setup() {
    background(0);
    imgMeteor = loadImage("spaceMeteors_003.png"); // load the image into the program
    //resize meteor

    // load rocket
    // resize rocket
  }

  public void draw() {

    // draw Meteor and move
    image(imgMeteor,fltMeteorX,fltMeteorY);

    // draw circle and move

    // draw rocket and move



 
  }
}