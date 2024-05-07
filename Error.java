package prob0719;

public class Error extends ACode{
    private final String errorMessage;

    public Error(String errMessage) {

        this.errorMessage = errMessage;
    }
    @Override
    public String generateListing() {

        return "ERROR: " + this.errorMessage + "\n";
    }
    @Override
    public String generateCode() {

        return "";
    }
}
