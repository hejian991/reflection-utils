package refutils.testclasses;

import java.awt.*;

/**
 * @author bjorn
 * @since 2013-10-01
 */
@SuppressWarnings("UnusedDeclaration")
public class SubClass extends SuperClass {
    private String stringPrivate2;
    private Runnable override;
    private double aDouble;
    private short aShort;
    private byte aByte;
    private char aChar;
    private static final Color FINAL_FIELD = Color.BLACK;

    public SubClass() {
        super((byte) 0);
    }

    public String getStringPrivate2() {
        return stringPrivate2;
    }


    public Runnable getOverride() {
        return override;
    }
}
