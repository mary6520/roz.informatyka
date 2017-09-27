size (720, 500);
background (#8520A5);

for (int i=0; i<20; i++)    //i od 0 do 20

{
  fill(i*255/20);
  
  rect (10+20*i, 100, 20, 20);
  fill(255 -i*255/20);
  ellipse(10+20*i+10, 120-10, i+1, i+1);
  fill(255 -i*255/20);
  ellipse(10+20*i, 120, 20-i, 20-i);
  rect (10+20*i, 120, 20, 20);
  fill(i*255/20);
  ellipse(10+20*i+10, 120-10, i+1, i+1);
  
}







//NOTATKI!!

//for - pętla, składa sie z trzech części  
// 1. Budowa pętli  -  for( start    ;    warunek;         i++)
//int = intiger - liczba całkowite
//int i=0 - startowe i
// i<20 - warunek pętli (to co jest w klamrach)
// i++ - zwiększ i o jeden
//fill - ma wiele zastosowań
//fill(i*255/20); - od czarnego do białego, funkcja fill jest w stanie w pętli zmieniać kolor
//fill(255i*255/20); - od białego do czarnego (czysta matematyka)
//rect - kwadrat
//ellipse
//jeżeli reszta z dzielenia i wynosi 0 to fill na czerwony, a w przeciwnym przypadku fill(i* 255/20)     if