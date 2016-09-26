// JAPAN FLAG: HARD CODED
void kuwait() {
  
  // SETUP
  rectMode( CENTER );
  
    // GREEN FLAG BORDER
  fill( 0, 120, 51 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
    // RED PART OF FLAG
  fill( 230, 0, 0 );
  noStroke();
  rect( 
    xFlagCenter, yFlagCenter +66.5, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
  );
  
     // BLACK PART OF FLAG
  fill( 0 );
  noStroke();
  triangle(
    xFlagCenter, yFlagCenter,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
  //WHITE RECTANGLE
  fill( 255 );
  noStroke();
  rect(
    xFlagCenter +50, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE -500, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
    );
    
}
