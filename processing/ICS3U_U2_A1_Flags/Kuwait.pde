// JAPAN FLAG: HARD CODED
void kuwait() {
  
  // SETUP
  rectMode( CENTER );
  
    // FLAG BORDER
  fill( 0, 120, 51 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // WHITE PART OF FLAG
  fill( 255, 255, 255 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.33
  );
  
  
}