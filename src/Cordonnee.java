public class Cordonnee {
  private int x, y, z;
  public Cordonnee()
  {
    x=0;
    y=0;
    z=0;
  }
  public Cordonnee(int mx, int my, int mz)
  {
    x=mx;
    y=my;
    z=mz;
  }
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public int getZ()
  {
    return z;
  }
  public void setX(int val)
  {
    x=val;
  }
  public void setY(int val)
  {
    y=val;
  }
  public void setZ(int val)
  {
    z=val;
  }
  public void  afficher()
  {
    System.out.println("x="+x+"y="+y+"z="+z);
  }
  public int somme()
  {
    int s=x+y+z;
    return s;
  }

}
