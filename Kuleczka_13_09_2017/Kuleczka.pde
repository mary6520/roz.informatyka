class Kuleczka
{
  //właściwości (cechy)
  int x, y;
  int r; //promień kuleczki

  //konstruktor (narodziny kuleczki)

  Kuleczka() //musi być taka sama nazwa jak klasy
  {
    //co sie dzieje, gdy kuleczka się rodzi
    x=(int)random(0, width);  //szerokość (od 0 do szerokości okna)
    y=(int)random(0, height);  //wysokość (od 0 do wysokości okna)
    r=(int)random(5, 50); //   <5, 20)
    fill(random (5));
  }
  //metody (umiejętności)
  void draw()
  {
    ellipse(x, y, 2*r, 2*r);
  }
}














//NOTATKI!!!
//class, musi zawierać właściwości(cechy), konstruktor(narodziny kuleczki) oraz metody(umiejętności)
//konstruktor musi być tak samo nazwany jak klasa