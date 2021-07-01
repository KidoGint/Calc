package Tests;

import Calc.Calc;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tests {

    @BeforeClass
    public void BeforeClass() {

    }

    @AfterClass
    public void afterClass() {

    }



    @Test(dataProvider = "testEqualsSum", dataProviderClass = Provider.class)
    public void testEqualsSum(Object res, Object arg1, Object arg2) {
        Assert.assertEquals(res, new Calc().summ(arg1, arg2), "Sum failed!!!");
    }

    @Test(dataProvider = "testEqualsDiv", dataProviderClass = Provider.class)
    public void testEqualsDiv(Object res, Object arg1, Object arg2) {
        Assert.assertEquals(res, new Calc().division(arg1, arg2), "Div failed!!!");
    }

    @Test(dataProvider = "testEqualsSubst", dataProviderClass = Provider.class)
    public void testEqualsSubst(Object res, Object arg1, Object arg2) {
        Assert.assertEquals(res, new Calc().substract(arg1, arg2), "Substract failed!!!");
    }



    @Test(dataProvider = "testEqualsMult", dataProviderClass = Provider.class)
    public void testEqualsMult(Object res, Object arg1, Object arg2) {
        Assert.assertEquals(res, new Calc().mult(arg1, arg2), "Mult failed!!!");
    }
}
