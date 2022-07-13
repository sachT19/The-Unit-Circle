public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        // /In this program we are going to practice using the 
        //Math class by computing some important values on the 
        //unit circle. Using the angles 0, PI/2, and PI, print 
        //out the angle, the cosine of the angle, and the sine 
        //of the angle.

      
        System.out.print("0.0: ");
        System.out.print(Math.cos(0) + ", ");
        System.out.println(Math.sin(0));
        
        
        System.out.print((Math.PI / 2) + ": ");
        double cosValue = Math.cos(Math.PI/2);
        cosValue = cosValue * 100;
        cosValue = Math.round(cosValue);
        System.out.print(cosValue + ", ");
        double sinValue = Math.sin(Math.PI/2);
        sinValue = Math.round(sinValue);
        System.out.println(sinValue);
        
        
        System.out.print((Math.PI) + ": ");
        cosValue = Math.cos(Math.PI);
        cosValue = Math.round(cosValue);
        System.out.print(cosValue + ", ");
        sinValue = Math.sin(Math.PI);
        sinValue = Math.round(sinValue);
        System.out.print(sinValue);

    }
}
