package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertion {
    @Test
    public void testsum(){
        SoftAssert sa=new SoftAssert();
        System.out.println("Running Test -> testsum");
        someclasstotest obj=new someclasstotest();
        int result=obj.addition(1,2);
        sa.assertEquals(result,2);
        System.out.println("\n line after assert 1");
        sa.assertEquals(result,3);
        System.out.println("\n line after assert 2");
        //sa.assertAll();
    }
}
