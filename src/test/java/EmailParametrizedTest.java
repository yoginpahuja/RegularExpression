import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;


import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailParametrizedTest {

    private String email;
    private boolean expectedValidation;

    public EmailParametrizedTest(String email, boolean expectedValidation) {
        this.email = email;
        this.expectedValidation = expectedValidation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",	true},
                {"abc-100@yahoo.com",	true},
                {"abc.100@yahoo.com",	true},
                {"abc111@abc.com"	,true},
                {"abc-100@abc.net"	,true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com"	,true},
                {"abc@gmail.com.com",	true},
                {"abc+100@gmail.com",	true},
                {"abc"	,false},
                {"abc@.com.my"	,false},
                {"abc123@gmail.a"	,false},
                {"abc123@.com"	,false},
                {"abc123@.com.com"	,false},
                {".abc@abc.com"	,false},
                {"abc()*@gmail.com"	,false},
                { "abc@%*.com"	,false},
                { "abc..2002@gmail.com"	,false},
                {"abc.@gmail.com"	,false},
                {"abc@abc@gmail.com"	,false},
                {"abc@gmail.com.1a"	,false},
                {"abc@gmail.com.aa.au"	,false}
        });
    }

    @Test
    public void testEmailValidation() {
        assertEquals(expectedValidation, UserRegistration.validateEmail(email));
    }
}
