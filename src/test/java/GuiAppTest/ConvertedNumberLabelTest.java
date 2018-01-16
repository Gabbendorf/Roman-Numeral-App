package GuiAppTest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConvertedNumberLabelTest {

    @Test
    public void setsAText() {
        AppLabelDouble label = new AppLabelDouble();

        label.setText("3");

        assertTrue(label.text.equals("3"));
    }
}
