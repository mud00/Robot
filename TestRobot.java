public class TestRobot
{
  public static void main(String args[])
  {
    Monde m = new Monde(10, 10);
    // m.metPapierGras(5,5);
    // m.prendPapierGras(5,5);
    PollueurSauteur ps = new PollueurSauteur(m,7,0);
    ps.parcourir();
    System.out.println(m.toString());
    NettoyeurDistrait rn = new NettoyeurDistrait(m);
    rn.parcourir();
    System.out.println(m.toString());
  }
}
