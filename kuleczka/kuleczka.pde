class Kuleczka {
  
int x, y; //położenie na okienku 
int rozmiar;
int kolor;

//konstruktor
Kuleczka (int x, int y, int rozmiar, int kolor ) {
  this.x = x;
  this.y = y;
  this.rozmiar = rozmiar;
  this.kolor = kolor;
}
void narysuj () {
  fill( kolor );
ellipse(this.x, this.y, this.rozmiar, this.rozmiar);

}

void ruszaj() {
  int krokX = (int)random(-2,2); // (-2,2)  -1, 0, 1
  int krokY = (int)random(-2,2); // (-2,2)  -1, 0, 1
  this.x = this.x + krokX;
  this.y = this.y + krokY;
  
}
}