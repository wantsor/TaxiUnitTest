package kata.taxi;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void distance_1_then_6_yuan() {
        Assert.assertEquals(6, Taxi.calculate(1), 0);
    }
    @Test
    public void distance_2_then_6_yuan() {
        Assert.assertEquals(6, Taxi.calculate(2), 0);
    }
    @Test
    public void distance_3_then_68_yuan() {
        Assert.assertEquals(6.8, Taxi.calculate(3,0), 0);
    }
    @Test
    public void distance_8_then_108_yuan() {
        Assert.assertEquals(10.8, Taxi.calculate(8,0), 0);
    }
    @Test
    public void distance_9_then_12_yuan() {
        Assert.assertEquals(12, Taxi.calculate(9,0), 0);
    }
    @Test
    public void distance_1_wait_1_then_625_yuan() {
        Assert.assertEquals(6.25, Taxi.calculate(1,1), 0);
    }
    @Test
    public void calculate_四舍五入_舍() {
        Assert.assertEquals(6, Driver.charge(Taxi.calculate(1,1)));
    }
    @Test
    public void calculate_四舍五入_入() {
        Assert.assertEquals(12, Driver.charge(Taxi.calculate(8,3)));
    }
}
