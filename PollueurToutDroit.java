public class PollueurToutDroit extends RobotPollueur
{
  int colDepart;

  public PollueurToutDroit(Monde m,int colDepart)
  {
    super(m,0,colDepart);
    this.colDepart = colDepart;
  }
  public void parcourir()
  {
    for(int i = 0; i<this.m.nbL; i++)
    {
      this.i = i;//on sauvegarde la position
      polluer();
    }
  }
}
