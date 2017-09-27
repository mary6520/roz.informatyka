int rozmiar;
int x, y;

void setup()
{
  
  size (1208, 720);
  rozmiar = 15; //rozmiar kreski
  x = 0; //przesunbięcie w osi x
  y = 0; //przesunięcie w osi y
  //układ współrzędnych
} //koniec setup

void draw()
{
  int los = (int)random(0, 101);
  if (los >= 50)
  {
    line(x, y, x + rozmiar, y + rozmiar);
  } else
  {
    line(x, y + rozmiar, x + rozmiar, y);
  }
  x = x + rozmiar;
  if (x >= width)
  {
    x = 0;
    y = y + rozmiar;
  } 
} //koniec draw