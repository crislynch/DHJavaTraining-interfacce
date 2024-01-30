public class rettangolo implements Forma {

    private int base;

    private int altezza;

    public rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = base * altezza;
        System.out.println("Il rettangolo ha area di: " + area);
    }
}
