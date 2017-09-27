Kuleczka kuleczka1;
Kuleczka kuleczka2;
Kuleczka kuleczka3;
 
 void setup(){
   size(640, 480);
   
   kuleczka1= new Kuleczka( 100, 150, 10, #B77397);
   kuleczka2 = new Kuleczka( 200, 150, 50, #503443);
   kuleczka3 = new Kuleczka( 100, 250, 100, #DBBCE0);
 }
 
 void draw() {
 
 kuleczka1.narysuj();
 kuleczka1.ruszaj();
 kuleczka2.narysuj();
 kuleczka2.ruszaj();
 kuleczka3.narysuj();
 kuleczka3.ruszaj();
 }
   
void mousePressed(){
int r = kuleczka1.getRozmiar();
r=r+10;
kuleczka1.setRozmiar(r);
}