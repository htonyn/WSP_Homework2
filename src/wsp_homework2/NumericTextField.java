package wsp_homework2;

// Extension of the TextField control to disallow nonnumeric values being
// entered into the textfield

import javafx.scene.control.TextField;

public class NumericTextField extends TextField {
    @Override
    public void replaceText(int start, int end, String text)
    {
        if (validate(text))
        {
            super.replaceText(start, end, text);
        }
    }
    @Override
    public void replaceSelection(String text)
    {
        if (validate(text))
        {
            super.replaceSelection(text);
        }
    }
    private boolean validate(String text)
    {
        return text.matches("[0-9]*");
    }
}
