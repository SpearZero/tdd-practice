public class User extends Participant{

    public User() {
        super();
    }

    public User(RCPConverter rcpConverter) {
        super(rcpConverter);
    }

    @Override
    public RCP putRCP() {
        int random = (int)(Math.random() * 3 + 1) ;
        return rcpConverter.convert(random);
    }

    @Override
    public RCP putRCP(int input) {
        return rcpConverter.convert(input);
    }
}
