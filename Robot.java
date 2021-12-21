abstract public class Robot extends Monde
{
  Monde m;
  int i;
  int j;
  public Robot(Monde m)
  {
    this.m = m;
    this.i = 0;
    this.j = 0;
  }
  public Robot(Monde m,int i, int j)
  {
    this.m = m;
    this.i = i;
    this.j = j;
  }

  public abstract void parcourir();
}
