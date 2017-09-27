int przesunPoziom = 0;
int przesunPion = 0;

void setup ()

{
  //wykonuje się jeden raz, po uruchomieniu
  size(640, 800);
}

void draw ()

{
  //wykonuje się wiele razy w kółko, w kółko...
  //ilość klatek na sekunde
  background (#251F81);
  rect (100+przesunPoziom, 100+przesunPion, 50, 50);
  fill (#25D4D8);
  stroke (#251F81);
}

void keyPressed ()
{

  if (key == 'w')
  przesunPion--;
  if (key == 's')
  przesunPion++;
  if (key == 'd')
  przesunPoziom++;
  if (key == 'a')
  przesunPoziom--;
  
  if (key == 'i')
  przesunPion -= 10;
  if (key == 'k')
  przesunPion += 10;
  if (key == 'l')
  przesunPoziom += 10;
  if (key == 'j')
  przesunPoziom -= 10;
  
  
}


//if (warunek)
//co jeżeli prawda
//else
//co jeżeli fałsz

if (key == 'w')
{
przesunPion--; //grupowane
}