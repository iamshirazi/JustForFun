// JAPAN FLAG: HARD CODED
void mauritania() {
  
   // SETUP
  rectMode( CENTER );
  
   // FLAG BORDER
  fill( 0, 98, 51 );
  stroke(0);
  rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
  //HALF MOON
  fill(250, 224, 66);
  noStroke();
  ellipse( xFlagCenter, yFlagCenter - 10, FLAG_FACTOR_WIDTH * 50 - 30, FLAG_FACTOR_HEIGHT * 55);
  
  //GREEN ELLIPSE
  fill( 0, 98, 51);
  noStroke();
  ellipse( xFlagCenter, yFlagCenter - 25, FLAG_FACTOR_WIDTH * 50 - 30 , FLAG_FACTOR_HEIGHT * 55 );
  
   // STAR
  fill(250, 224, 66);
  noStroke();
  star( xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.01, yFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.05, 
  FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.12, FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.05, 5 );
}