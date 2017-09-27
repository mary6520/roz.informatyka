int red, green, blue;

void setup()

{

  size (500, 500);
  frameRate(16);
}//koniec setup

void draw()
{

  background(red, green, blue);

  fill(random (256) );
  ellipse(250, 250, 100, 100);
}//koniec draw

void keyPressed()
{
  if (key == ' ')
  {
    red = (int)random(256);
    green = (int)random (256);
    blue = (int)random (256);
  }
} //koniec keyPressed




//NOTATKI !!!

// void - funkcje, pod programy, bloczki
// setup - zdarzenie strat
//draw - wykonywana funkcja rysowania na klatek na sekunde
// frameRate(i); - funkcja draw jest powtarzana co i klatki na sekunde
//random - losuje z przedziału ()
//funkcje możemy wkładać do funcji i tak jak kolejność działań w matmie, nagłębsze nawiasy najpierw
//void keyPressed() - zdarzenie kliniecia klawiszza
//jeżeli klawisz wynosi spacja to...  if(key == ' ')
// float - liczba rzeczywista
//int - liczba całkowita