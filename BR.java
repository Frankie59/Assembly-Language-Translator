package prob0719;

public class BR extends ACode{
    private final Mnemon mnemonic;
    private final AArg OperandSpec;
    public BR(Mnemon mn, AArg OpSpec) {
        this.mnemonic = mn;
        this.OperandSpec = OpSpec;
    }
@Override
    public String generateListing() {
        return String.format("%s %s \n", Maps.mnemonStringTable.get(this.mnemonic), this.OperandSpec.generateCode());
    }
@Override
    public String generateCode() {
        switch(this.mnemonic) {
            case M_BR:
                return "";
            case M_BRLT:
                return "";
            case M_BREQ:
                return "";
            case M_BRLE:
                return "";
            case M_BLOCK:
                return "";
            default:
                return "";
        }
    }
}
