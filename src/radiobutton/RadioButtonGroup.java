package radiobutton;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 *
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 */
public class RadioButtonGroup {

    public class Button{
        int buttonNumber;
        boolean selected;

        public Button(boolean selected, int buttonNumber)
        {
            this.selected = selected;
            this.buttonNumber = buttonNumber;
        }

        public int getButtonNumber()
        {
            return buttonNumber;
        }

        public boolean isSelected()
        {
            return selected;
        }

        public void setSelected(boolean selected)
        {
            this.selected = selected;
        }
    }

    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons
     *   The number of buttons in the group.
     * @param initial
     *   The button number that is initially selected.
     * @raise RuntimeException
     *   The initial button number is invalid.
     */
    List<Button> buttonList;
    int num=0;

    public RadioButtonGroup(int numButtons, int initial) {
        buttonList= new ArrayList<Button>();

        while(num<numButtons){
            if(num!=initial)
            {
                buttonList.add(new Button(false, num));
            } else{
                buttonList.add(new Button(true, num));}
            num++;
      }
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     * @param button
     *   The button number to select.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public void select(int button) {
        if(button>=buttonList.size()){
            throw new RuntimeException("The Button Number Is Invalid");
        }
        for(Button cButton: buttonList){
            if(cButton.getButtonNumber()==button){
                cButton.setSelected(true);
            } else{
                if(cButton.isSelected()){
                    cButton.setSelected(false);
                }
            }
        }
    }

    /**
     * Returns whether a given button is selected.
     * @param button
     *   The button number to check.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public boolean isSelected(int button) {

        if(button>=buttonList.size()){
            throw new RuntimeException("Button Does Not Exist");
        }
        for(Button button1: buttonList){
            if(button1.getButtonNumber()==button && button1.isSelected()){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        RadioButtonGroup radioButtonGroup= new RadioButtonGroup(5,3);
        System.out.println(radioButtonGroup.isSelected(3));
        System.out.println(radioButtonGroup.isSelected(2));
        radioButtonGroup.select(4);
        System.out.println(radioButtonGroup.isSelected(2));
        System.out.println(radioButtonGroup.isSelected(3));
        System.out.println(radioButtonGroup.isSelected(4));

    }

}
