package GuiAppTest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NumberTextFieldTest {

    @Test
    public void returnsSomeTextAsString() {
        TextFieldDouble textField = new TextFieldDouble();

        String text = textField.getText();

        assertTrue(text.equals("44"));
    }
}
