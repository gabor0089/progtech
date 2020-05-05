package progtech_szalloda;

abstract class SzobaDecorator implements ISzoba {
    protected ISzoba ures;
    public SzobaDecorator(ISzoba ures) {
        this.ures = ures;
    }
}
