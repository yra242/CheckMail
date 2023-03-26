import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckEmailTest {
    private static CheckEmail checkEmail;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeClass setUpBeforeClass()");
        checkEmail = new CheckEmail();
    }

    @Test
    public void testEmail1() {
        System.out.println("testEmail1");
        Assert.assertTrue(checkEmail.checkEmail("vikaban@gmail.com"));
    }

    @Test
    public void testEmail2() {
        System.out.println("testEmail2");
        Assert.assertTrue(checkEmail.checkEmail("vikaban2@gmail.com"));
    }

    @Test
    public void testEmail3() {
        System.out.println("testEmail3");
        Assert.assertFalse(checkEmail.checkEmail("vikaban.@gmail.com"));
    }

    @Test
    public void testEmail4() {
        System.out.println("testEmail4");
        Assert.assertFalse(checkEmail.checkEmail("vikaban.@g"));
    }

    @Test
    public void testEmail5() {
        System.out.println("testEmail5");
        Assert.assertFalse(checkEmail.checkEmail("vikaban.g"));
    }
}
