package samples.ui;

import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/**
 * This class implements user interface chat message display class.
 */
public class ChatBox extends Component {
    private Vector messageList;
    private Vector colorList;
    private Vector cookedMessageList;
    private Vector cookedColorList;
    private Vector tmpList;
    private int cursor;
    private int history;
    private int numLines;
    private int widthOffset;

    /**
     * Create a new ChatBox instance.
     */
    ChatBox() {
        widthOffset = 2;
        focusable = true;
        messageList = new Vector();
        colorList = new Vector();
        cookedMessageList = new Vector();
        cookedColorList = new Vector();
        tmpList = new Vector();
    }

    /**
     * Create a new ChatBox instance with the provided history buffer size.
     *
     * @param history The history buffer size.
     */
    public ChatBox(int history) {
        this();
	callMyFun();
        this.history = history;
    }

    /**
     * Set the width offset (left/right margin) of this instance.
     *
     * @param widthOffset The width offset (left/right margin) of this instance.
     */
    public void setWidthOffset(int widthOffset) {
        this.widthOffset = widthOffset;
        breakLines();
    }
}