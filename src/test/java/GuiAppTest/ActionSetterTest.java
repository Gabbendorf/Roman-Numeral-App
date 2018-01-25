package GuiAppTest;

import CommandLineApp.NumberConverter;
import GuiApp.ActionSetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ActionSetterTest {

    @Test
    public void setsActionOnButton() {
        ConvertButtonDouble buttonDouble = new ConvertButtonDouble();
        ActionSetter actionSetter = new ActionSetter(new NumberConverter(), new TextFieldStub(), new AppLabelDouble());

        actionSetter.addClickHandler(buttonDouble);

        assertTrue(buttonDouble.wasCalled);
    }

    @Test
    public void updatesLabelWhenButtonIsPressed() {
        ConvertButtonDouble buttonDouble = new ConvertButtonDouble();
        AppLabelDouble label = new AppLabelDouble();
        TextFieldStub textField = new TextFieldStub();
        ActionSetter actionSetter = new ActionSetter(new NumberConverter(), textField, label);
        textField.setTextToConvert("44");

        actionSetter.addClickHandler(buttonDouble);
        buttonDouble.press();

        assertEquals("XLIV", label.getText());
    }
}
