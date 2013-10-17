package refutils.testclasses;

/**
 * @author bjorn
 * @since 2013-10-01
 */
public class SubClass extends SuperClass {
    private String stringPrivate2;
    private Runnable override;
    private double aDouble;
    private short aShort;
    private byte aByte;
    private char aChar;

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
