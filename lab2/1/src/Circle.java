public class Circle
{
   private float radius;
   private float coordx;
   private float coordy;
   private float coordz;

   public Circle(float r, float x, float y, float z)
   {
      radius = r;
      coordx = x;
      coordy = y;
      coordz = z;
   }

   public float getRadius()
   {
      return radius;
   }

   public float getCoordx()
   {
      return coordx;
   }

   public float getCoordy()
   {
      return coordy;
   }

   public float getCoordz()
   {
      return coordz;
   }

   public void setRadius(float r)
   {
      radius = r;
   }

   public void setCoordx(float x)
   {
      coordx = x;
   }

   public void setCoordy(float y)
   {
      coordy = y;
   }

   public void setCoordz(float z)
   {
      coordz = z;
   }
}
