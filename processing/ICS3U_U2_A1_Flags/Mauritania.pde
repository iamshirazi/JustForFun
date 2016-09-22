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
  ellipse( xFlagCenter, yFlagCenter, FLAG_FACTOR_WIDTH *40, FLAG_FACTOR_HEIGHT *45);
  
  //GREEN ELLIPSE
  fill( 0, 98, 51);
  noStroke();
  ellipse( xFlagCenter, yFlagCenter -15, FLAG_FACTOR_WIDTH *40, FLAG_FACTOR_HEIGHT *45);
  
   // STAR
  fill(250, 224, 66);
  noStroke();
  star( xFlagCenter, yFlagCenter-20, 28, 12, 5 );
}