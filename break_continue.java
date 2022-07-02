
//The "break" statement can  jump out of a loop.
//Stops the loop when i is equal to 4
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}

//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
//Skips the value of 4:
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
