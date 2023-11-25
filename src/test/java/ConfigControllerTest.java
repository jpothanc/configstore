import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigControllerTest extends BaseTests {

    @Test
    public void Health_Check_Should_Return_Healthy() {
        assertEquals("healthy", getConfigController().healthCheck().getBody());
    }


//    @ParameterizedTest
//    @ValueSource(strings = {"admin", "user"})
//    public void Password_Encrypt_Decrypt_Should_Succeed(String password) {
//        //System.setProperty("PASSWORD_ENCRYPTION_KEY", "03D956C2-EF5C-4E4F-B8B0-C3BA10171E29");
//        var encryptedPassword = getConfigController().encrypt(password).getBody();
//        assertNotEquals(encryptedPassword, password);
//        var decryptedPassword = getConfigController().decrypt(encryptedPassword).getBody();
//        assertEquals(decryptedPassword, password);
//    }

//    @ParameterizedTest
//    @ValueSource(strings = {"admin", "user"})
//    public void Password_Encrypt_Decrypt_Should_Fail_When_Encryption_Key_Not_Set(String password) {
//        System.setProperty("PASSWORD_ENCRYPTION_KEY", "");
//        assertThrows(RuntimeException.class, () -> getConfigController().encrypt(password).getBody());
//        assertThrows(RuntimeException.class, () -> getConfigController().decrypt(password).getBody());
//    }

}
