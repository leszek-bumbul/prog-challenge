import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConvertLengthMeasureTest {

    @Test
    public void whenOneMeterProvided_ThenReturnOneTimesInchFactor() throws Exception {
        assertThat(1 / 0.0248, is(closeTo(convertToInches(1.0), .000001)));

    }

    @Test
    public void whenOneMeterProvided_ThenReturnOneTimesHandFactor() throws Exception {
        assertThat(1 / 0.0744, is(closeTo(convertToHands(1.0), .000001)));
    }

    private double convertToHands(double measureInMeters) {
        double handFactor = 1 / 0.0744;
        return handFactor * measureInMeters;
    }

    private double convertToInches(double measureInMeters) {
        double inchFactor = 1 / 0.0248;
        return inchFactor * measureInMeters;
    }


}
