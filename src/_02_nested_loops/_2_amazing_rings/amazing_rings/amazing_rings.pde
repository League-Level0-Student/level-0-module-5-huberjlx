int x1 = 375;
int x2 = 1000;
void setup() {
  size(1500,1000);
 
}
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
void draw() {
  
  background(211,211,211);
  
  for (int i = 30; i < 430; i += 10) {
    
  noFill();
  ellipse(x1, 500, i, i);
  ellipse(x2,500,i, i);
  
  }
 
x1=x1+1;
x2=x2-1;
if (x1 == 1500) {
  x1 = x1-1;
}
if (x2 == 0) {
  x2 = x2 +1;
}
}
