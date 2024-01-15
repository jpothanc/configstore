import com.ibit.controllers.ConfigController;
import org.junit.Before;

public class BaseTests {
    @Before
    public void setUp() throws Exception {

        System.setProperty("PASSWORD_ENCRYPTION_KEY", "03D956C2-EF5C-4E4F-B8B0-C3BA10171E29");
    }

    protected ConfigController getConfigController() {
        return new ConfigController();
    }
}
