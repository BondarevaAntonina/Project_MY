import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;



/**
 * Created by antoni on 27.11.2017.
 */
public class MaxNumber {
  //  private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Title("i1=10 и i1=20 ")
    @Test
    public void testMaxNumber01 () throws Exception {
        Assert.assertEquals(20,WorkNumber.getMaxNumber(10,20));
    }

    @Title("i1=-10 и i1=-20 ")
    @Test
    public void testMaxNumber02 () throws Exception {
        Assert.assertEquals(-10,WorkNumber.getMaxNumber(-10,-20));
    }

    @Title("i1=20 и i1=215  ")
    @Test
    public void testMaxNumber03 () throws Exception {
        Assert.assertEquals(20,WorkNumber.getMaxNumber(20,215));
    }





}
