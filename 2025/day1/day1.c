#include <stdio.h>

int main() {
  FILE *f = fopen("input.txt", "r");

  char rotation;
  int distance, password = 0, dial = 50;

  while(fscanf(f, "%c%d\n", &rotation, &distance) == 2) {
    distance = distance - (distance / 100) * 100;
    switch (rotation) {
      case 'L':
        dial = (dial - distance < 0) ? 100 - (distance - dial) : dial - distance;
        break;
      case 'R':
        dial = (dial + distance > 99) ? (dial - 100 + distance) : dial + distance;
        break;
      default:
        printf("error in switch");
        break;
    }
    if (!dial) password++;
  }

  printf("Password: %d\n", password);

  fclose(f);

}
