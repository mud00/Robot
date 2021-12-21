public class NettoyeurDistrait extends RobotNettoyeur{

  public NettoyeurDistrait(Monde m){
    super(m);
  }
  public void parcourir(){
    int findSale = 0;
    for(int i =0;i< m.nbL;i++){
      for(int j=0;j<m.nbC;j++){
        if(i%2==0){
          this.i = i;
          this.j = j;
          if(m.estSale(i,j)){
            if(findSale %2 == 0)nettoyer();
            findSale ++;
          }
        }else{
          this.i = i;
          this.j = m.nbC - j - 1;
          if(m.estSale(i,j)){
            if(findSale %2 == 0)nettoyer();
            findSale ++;
          }
        }
      }
    }
  }
}
