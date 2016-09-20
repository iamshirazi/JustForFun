// JAPAN FLAG: HARD CODED
void bahamas() {
  
  // SETUP
  rectMode( CENTER );
  
    // BLUE PART OF FLAG
  fill( 0, 135, 153 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
    // YELLOW PART OF FLAG
  fill( 250, 224, 66 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.2
  );
  
  // TRIANGLE PART OF FLAG
  fill(0);
  stroke( 0 );
  triangle(
  xFlagCenter, yFlagCenter,
  xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
  xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
}