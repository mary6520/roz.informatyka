//utwórz spis kuleczek
ArrayList<Kuleczka> kuleczki = new ArrayList<Kuleczka>();
void setup()
{
  size (1280, 720);
  for (int i=0; i<200; i++)
  {
    kuleczki.add(new Kuleczka() ); //kuleczki, dodaj
  } //koniec for
}// koniec setup

void draw()
{
  background (#341355);
  for (int i=0; i<200; i++)
  {
    Kuleczka k = kuleczki.get(i);
    k.draw();
  }
}





//Kuleczka k1, k2; - rezerwacja dwuch miejsc wie że będzie tam klasu kuleczka
//ArrayList - lista, zestawienie
//ArrayList<Kuleczka> kuleczki = new ArrayList<Kuleczka>(); to bedzie zbiur kuleczek ponumerowany i tworzy tabele "rodzeń"



//git - program na linuksa do łączenia komputerów 