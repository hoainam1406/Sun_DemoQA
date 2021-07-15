import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/PracticeForm.feature"},
        tags = {" "}

)
public class PracticeFormTest {
    @Theory
    public void isPrime(int candidate) {
        // called with candidate=1, candidate=2, etc etc
    }

    public static @DataPoints
    int[] candidates = {1, 2, 3, 4, 5};
}
