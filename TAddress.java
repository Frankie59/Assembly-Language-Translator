package prob0719;

public class TAddress extends AToken {
    private final String addressing;
    public TAddress(StringBuffer stringBuffer) {
        addressing = new String(stringBuffer);
    }
    @Override
    public String getDescription() {
        return String.format("Addressing Mode = %s", addressing);
    }
    public String getStringValue() {
        return addressing;
    }
}
