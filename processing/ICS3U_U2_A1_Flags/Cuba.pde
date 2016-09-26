// JAPAN FLAG: HARD CODED
void cuba() {
  
    // SETUP
    rectMode( CENTER );
  
    // FLAG BORDER
    fill( 0, 0, 200 );
    stroke(0);
    rect( 
    xFlagCenter, yFlagCenter, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    FLAG_FACTOR_HEIGHT * FLAG_SIZE 
  );
  
    // WHITE PART OF FLAG 1
    fill( 255, 255, 255 );
    noStroke();
    rect( 
    xFlagCenter, yFlagCenter-40, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.2
  );
  
    //WHITE PART OF FLAG 2
    noStroke();
    rect( 
    xFlagCenter, yFlagCenter+40, 
    FLAG_FACTOR_WIDTH * FLAG_SIZE, 
    (FLAG_FACTOR_HEIGHT * FLAG_SIZE) * 0.2
  );
  
  // TRIANGLE PART OF FLAG
  fill( 255, 0, 0 );
  noStroke();
  triangle(
    xFlagCenter, yFlagCenter,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter - FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5,
    xFlagCenter - FLAG_FACTOR_WIDTH * FLAG_SIZE * 0.5, yFlagCenter + FLAG_FACTOR_HEIGHT * FLAG_SIZE * 0.5
  );
  
  // STAR
  fill(255);
  noStroke();
  star( xFlagCenter-95, yFlagCenter, 28, 12, 5 );
  
  
}
