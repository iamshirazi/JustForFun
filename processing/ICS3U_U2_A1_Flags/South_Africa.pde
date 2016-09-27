  // JAPAN FLAG: HARD CODED
void southafrica() {
   
   // SETUP
    rectMode( CENTER );
    
    // FLAG BORDER
   fill( 255 );
    stroke(0);
    rect( 
      xFlagCenter, yFlagCenter, 
      FLAG_FACTOR_WIDTH * FLAG_SIZE, 
      FLAG_FACTOR_HEIGHT * FLAG_SIZE 
    );
    
  
    // GREEN PART OF FLAG
   fill( 0, 91, 51 );
   noStroke();
   rect( 
     xFlagCenter, yFlagCenter, 
     FLAG_FACTOR_WIDTH * FLAG_SIZE, 
     (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.225
   );
   
    // BLUE PART OF FLAG
   fill( 0, 0, 180 );
   noStroke();
   rect( 
     xFlagCenter, yFlagCenter +66.5, 
     FLAG_FACTOR_WIDTH * FLAG_SIZE, 
     (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
   );
   
      // RED PART OF FLAG
   fill( 200, 0, 0 );
   noStroke();
   rect( 
     xFlagCenter, yFlagCenter -66.5, 
     FLAG_FACTOR_WIDTH * FLAG_SIZE, 
     (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
   );
   
   // WHITE PART OF FLAG (HIDDEN)
   fill( 255 );
   noStroke();
   rect( 
     xFlagCenter-125, yFlagCenter, 
     FLAG_FACTOR_WIDTH * FLAG_SIZE-250, 
     (FLAG_FACTOR_HEIGHT * FLAG_SIZE+199) * 0.5
   );
   
    // GREEN PART OF FLAG (HIDDEN)
   fill( 0, 91, 51 );
   noStroke();
   rect( 
     xFlagCenter-135, yFlagCenter, 
     FLAG_FACTOR_WIDTH * FLAG_SIZE-270, 
     (FLAG_FACTOR_HEIGHT * FLAG_SIZE+200) * 0.5
   );
   
    // WHITE TRIANGLE
   fill( 255 );
   noStroke();
   triangle(
   xFlagCenter+50, yFlagCenter,
   xFlagCenter+50 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
   xFlagCenter+50 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
   );
   
    // GREEN PART OF FLAG
   fill( 0, 91, 51 );
   noStroke();
   rect( 
     xFlagCenter, yFlagCenter, 
     FLAG_FACTOR_WIDTH * FLAG_SIZE, 
     (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.225
   );
   
    // GREEN TRIANGLE
   fill( 0, 91, 51 );
   noStroke();
   triangle(
   xFlagCenter+30, yFlagCenter,
   xFlagCenter+30 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
   xFlagCenter+30 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
   );
  
  // YELLOW TRIANGLE
   fill( 250, 224, 66 );
   noStroke();
   triangle(
   xFlagCenter-30, yFlagCenter,
   xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter+30 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
   xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter-30 + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
   ); 
  
   // BLACK TRIANGLE
   fill( 0 );
   noStroke();
   triangle(
   xFlagCenter-50, yFlagCenter,
   xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter+44 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
   xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter-44 + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
   ); 
  
 }