import com.example.bai_tap_ngay_2603.EmailRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailRegistrationTest {
    @Test
    public void checkEmailPass() {
        EmailRegistration emailRegistration = new EmailRegistration();
        Assertions.assertTrue(emailRegistration.registerEmail("thunhph40458@fpt.edu.vn"));
    }

    @Test
    public void checkEmailFail1() {
        EmailRegistration emailRegistration = new EmailRegistration();
        Assertions.assertFalse(emailRegistration.registerEmail(""));
    }

    @Test
    public void checkEmailFail2() {
        EmailRegistration emailRegistration = new EmailRegistration();
        Assertions.assertFalse(emailRegistration.registerEmail("thunh"));
    }

    @Test
    public void checkEmailFail3() {
        EmailRegistration emailRegistration = new EmailRegistration();
        Assertions.assertFalse(emailRegistration.registerEmail("thunhph40458@fpt.edu.vnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn"));
    }
}
