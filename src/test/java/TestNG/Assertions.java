package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assertions {
    @Test
    public void teststring(){
        System.out.println("\nRunning Test ->teststring");
        String expectedstring="Hello World";
        someclasstotest obj=new someclasstotest();
        String result=obj.addstrings("Hello","World");
        Assert.assertEquals(result,expectedstring);
        System.out.println(result);
    }
    @Test
    public void testarray(){
        System.out.println("\nRunning Test ->testarray");
        int[] expectedarray={2,3,4};
        someclasstotest obj=new someclasstotest();
        int[] result= obj.getarray();
        Assert.assertEquals(result,expectedarray);
        System.out.println(result);
    }
    @Test
    public void testsum(){
        System.out.println("\nRunning Test ->testsum");
        someclasstotest obj=new someclasstotest();
        int result=obj.addition(3,2);
        Assert.assertEquals(result,4,"actual result "+result+" is not equal to expected");
        System.out.println(result);
    }
   // public void verify

}
