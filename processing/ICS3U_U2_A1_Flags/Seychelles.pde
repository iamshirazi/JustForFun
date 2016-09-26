// JAPAN FLAG: HARD CODED
void seychelles() {
  
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
  
  //GREEN TRIANGLE
  fill( 0, 98, 51 );
  noStroke();
  triangle(
    xFlagCenter +150, yFlagCenter +100,
    xFlagCenter+300 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter+90 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.25,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
  //WHITE TRIANGLE
  fill( 255 );
  noStroke();
  triangle(
    xFlagCenter +150, yFlagCenter -30,
    xFlagCenter+300 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter+90 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.25,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
  //RED TRIANGLE
  fill( 230, 0, 0 );
  noStroke();
  triangle(
    xFlagCenter +150, yFlagCenter -30,
    xFlagCenter+250 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter-90 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.25,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
   //LITTLE RED TRIANGLE
  fill( 230, 0, 0 );
  noStroke();
  triangle(
    xFlagCenter +150, yFlagCenter -30,
    xFlagCenter+250 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter-80 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.25,
    xFlagCenter+300 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter-200 + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
   //YELLOW TRIANGLE
  fill( 250, 224, 66 );
  noStroke();
  triangle(
    xFlagCenter -50, yFlagCenter -100,
    xFlagCenter+250 - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter-90 - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.25,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
   //BLUE TRIANGLE
  fill( 0, 0, 230 );
  noStroke();
  triangle(
    xFlagCenter -50, yFlagCenter -100,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
  //WHITE RECTANGLE
  fill( 255 );
  noStroke();
  rect(
    xFlagCenter +50, yFlagCenter -133, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE -500, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
    );
    
}
