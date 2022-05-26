import processing.core.PApplet;
import processing.core.PImage; //import the PImage library

public class Sketch extends PApplet {

  PImage imgMeteor; // declare a global image variable
  //

  float fltMeteorX = 200;
  float fltMeteorY = 200;
  

  PImage space_spritesheet;
  PImage imgMeteor1;

  PImage mario_spritesheet;
  PImage mario_walkingsheet;
  PImage[] mario_frames;
  int intMario_frames = 12;
  int intMario_frameWidth = 36;

  int intMarioX = 20;
  int intMarioY = 20;


  PImage sonic_spritesheet;
  PImage sonic_runningsheet;
  PImage[] sonic_frames;
  int intSonic_frames = 8;
  int intSonic_frameWidth = 40;
  int intSonic_frameHeight = 40;
  int intSonicX = 20;
  int intSonicY = 80;


  public void settings() {
    size(400, 400);
  
  }

  public void setup() {
    

    // load the spritesheet image
    space_spritesheet = loadImage("spaceshooter/Spritesheet/spaceShooter2_spritesheet.png");

    // get the image from the spritesheet
    imgMeteor1 = space_spritesheet.get(0, 621, 215, 211);
    imgMeteor1.resize(imgMeteor1.width/4,imgMeteor1.height/4);

    // load mario spritesheet
    mario_spritesheet = loadImage("mario_spritesheet.png");
    mario_walkingsheet = mario_spritesheet.get(19,192,intMario_frameWidth*intMario_frames,58);


    // sonic
    sonic_spritesheet = loadImage("Sonicsheet.png");
    sonic_runningsheet = sonic_spritesheet.get(2,267, intSonic_frameWidth*intSonic_frames, intSonic_frameHeight );



    //load the frames from the walking sheet
    mario_frames = new PImage[intMario_frames];
    for(int frameNum = 0; frameNum < mario_frames.length; frameNum++ ){
      System.out.println("load frames");
      mario_frames[frameNum] = mario_walkingsheet.get(intMario_frameWidth*frameNum, 0, intMario_frameWidth, mario_walkingsheet.height );
    }

    // load the sonic frames
    sonic_frames = new PImage[intSonic_frames];
    for(int frameNum = 0; frameNum < intSonic_frames; frameNum++ ){
      System.out.println("load frames");
      sonic_frames[frameNum] = sonic_runningsheet.get(intSonic_frameWidth*frameNum, 0, intSonic_frameWidth, intSonic_frameHeight );
    }

  }


  public void draw() {
    background(0);

    // draw Meteor and move
    image(imgMeteor1,fltMeteorX,fltMeteorY);
    fltMeteorX++;
    fltMeteorY++;

    // draw mario
    image(mario_frames[(frameCount/3)%intMario_frames], intMarioX, intMarioY);
    intMarioX++;

    // draw sonic
    image(sonic_frames[(frameCount/3)%intSonic_frames], intSonicX, intSonicY);
    intSonicX += 2;
    
  }
}