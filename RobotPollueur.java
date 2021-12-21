abstract public class RobotPollueur extends Robot
{
  public void polluer(){
    m.metPapierGras(i,j);
  }
  public RobotPollueur(Monde m,int i,int j){
    super(m,i,j);
  }
  public RobotPollueur(Monde m){
    super(m);
  }
}
