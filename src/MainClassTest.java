import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue("Метод getLocalNumber не возвращает число 14", getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("Метод getClassNumber возвращает число меньше 45", getClassNumber() > 45);
    }

    @Test
    public void testGetClassString()
    {
        Assert.assertTrue(
                "Не возвращает Hello или hello",
                getClassString().contains("Hello") | getClassString().contains("hello")
        );
    }
}
