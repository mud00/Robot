public class RobotNettoyeur extends Robot
{
  public void nettoyer(){
    m.prendPapierGras(i,j);
  }


   public RobotNettoyeur(Monde m)
   {
     super(m);
   }

   public void parcourir(){
     for(int i =0;i< m.nbL;i++){
       for(int j=0;j<m.nbC;j++){
         if(i%2==0){
           this.i = i;
           this.j = j;
           nettoyer();
         }else{
           this.i = i;
           this.j = m.nbC - j - 1;
           nettoyer();
         }
       }
     }
   }
}
