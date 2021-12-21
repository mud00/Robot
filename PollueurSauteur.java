public class PollueurSauteur extends RobotPollueur
{
  int deltaX;
  int colDepart;

  public PollueurSauteur(Monde m,int deltaX, int colDepart)
  {
    super(m,0,colDepart);
    this.deltaX = deltaX;
    this.colDepart = colDepart;
  }

  public void parcourir()
  {
    for(int i = 0; i<m.nbL; i++)
    {
      int tmp = (i %2 != 0)?(colDepart + deltaX) : colDepart;
      if(this.j + tmp >= m.nbC)
      {
        this.i = i;//on sauvegarde la position
        this.j = tmp % nbC;
        polluer();
      }
      else
      {
        this.i = i;
        this.j = tmp;
        polluer();
      }
    }
  }
}
