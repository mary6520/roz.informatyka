size (1000, 1000);
background (#8520A5);

for (int i=0; i<20; i++)    //i od 0 do 20

{

  fill(i*255/20);
  {
    rect (10+20*i, 170, i+1, i+1);
    rect (10+20*i, 190, i+1, i+1);
    rect (10+20*i, 210, i+1, i+1);

    rect (10+20*i, 170, 20-i, 20-i);
    rect (10+20*i, 190, 20-i, 20-i);
    rect (10+20*i, 210, 20-i, 20-i);
//podwójne
    fill(255-i*255/20);
    
    rect (10+20*i, 250, i+1, i+1);
    rect (10+20*i, 270, i+1, i+1);
    rect (10+20*i, 290, i+1, i+1);

    rect (10+20*i, 330, 20-i, 20-i);
    rect (10+20*i, 350, 20-i, 20-i);
    rect (10+20*i, 370, 20-i, 20-i);

    fill(255-i*255/20);
    
    rect (10+20*i, 410, i+1, i+1);
    rect (10+20*i, 430, i+1, i+1);
    rect (10+20*i, 450, i+1, i+1);

//podwójne
    rect (10+20*i, 490, i+1, i+1);
    rect (10+20*i, 510, i+1, i+1);
    rect (10+20*i, 530, i+1, i+1);

    rect (10+20*i, 490, 20-i, 20-i);
    rect (10+20*i, 510, 20-i, 20-i);
    rect (10+20*i, 530, 20-i, 20-i);
  }

  rect (10+20*i, 100, 20, 20);
  if (i%3 == 0) fill(#FF0000);
  else fill(i*255/20);
  ellipse(10+20*i+10, 120-10, i+1, i+1);

  fill(255-i*255/20);
  rect (10+20*i, 120, 20, 20);
  if (i%3 == 0) fill(#FF0000);
  else fill(i*255/20);
  ellipse(10+20*i+10, 140-10, 20-i, 20-i);

  fill(i*255/20);
  rect (10+20*i, 140, 20, 20);

  if (i%3 == 0) 
  {
    fill(#FF0000);
  } else 
  {
    fill(i*255/20);
  }
  ellipse(10+20*i+10, 160-10, i+1, i+1);
}




//if składa się z dwuch części
// {} - grupuje rzeczy