// JAPAN FLAG: HARD CODED
void mauritania() {
  
   // FLAG BORDER
  fill( 0, 98, 51 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  // STAR
  fill(250, 224, 66);
  stroke(0);
  star( xFlagCenter, yFlagCenter-40, 28, 12, 5 );
  
  
}