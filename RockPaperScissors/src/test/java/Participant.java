abstract public class Participant {
    protected RCPConverter rcpConverter;

    public Participant() {}

    public Participant(RCPConverter rcpConverter) {
        this.rcpConverter = rcpConverter;
    }

    abstract public RCP putRCP();

    abstract public RCP putRCP(int input);
}
