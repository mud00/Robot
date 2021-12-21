public class Monde
{
  int nbL;
  int nbC;
  boolean[][]mat;

  public Monde(int nbL, int nbC)
  {
    this.nbL = nbL;
    this.nbC = nbC;
    mat = new boolean[nbC][nbL];
  }

  public Monde()
  {
    this.nbL = 10;
    this.nbC = 10;
    mat = new boolean[10][10];
  }

  public String toString()
  {
    String tmp = "";
    for(int i = 0; i<mat.length; i++)
    {
      for(int j = 0; j<mat.length; j++)
      {
        if(mat[i][j]){
          tmp += " o ";
        }else{
          tmp += " . ";
        }
      }
      tmp += "\n";
    }
    return tmp;
  }

  public void metPapierGras(int i, int j)
  {
    this. mat[i][j] = true;
  }

  public void prendPapierGras(int i, int j)
  {
    this.mat[i][j] = false;
  }

  public boolean estSale(int i, int j)
  {
    return mat[i][j];
  }

  public int nbPapiersGras()
  {
    int cpt =0;

    for(int i = 0; i<mat.length; i++)
    {
      for(int j = 0; j<mat.length; j++)
      {
        if(mat[i][j])
        {
          cpt++;
        }
      }
    }
    return cpt;
  }
}
