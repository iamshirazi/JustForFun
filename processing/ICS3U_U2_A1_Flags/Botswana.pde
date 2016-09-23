// JAPAN FLAG: HARD CODED
void botswana() {
  
  // SETUP
  rectMode( CENTER );
  
  // BLUE PART OF FLAG
  fill( 119, 169, 218 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // WHITE PART OF FLAG
  fill( 255, 255, 255 );
  noStroke();
  rect( 
    xFlagCenter+1, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE -1, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.3
  );
  
  // BLACK PART OF FLAG
  fill( 0, 0, 0 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.18
  );
  
}
