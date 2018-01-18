package GuiAppTest;

import CommandLineApp.NumberConverter;
import GuiApp.ActionSetter;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ActionSetterTest {

    @Test
    public void setsActionOnButton() {
        ConvertButtonDouble buttonDouble = new ConvertButtonDouble();
        ActionSetter actionSetter = new ActionSetter(new NumberConverter(), new TextFieldDouble(), new AppLabelDouble());

        actionSetter.addClickHandler(buttonDouble);

        assertTrue(buttonDouble.wasCalled);
    }
}
