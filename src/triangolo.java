public class triangolo implements Forma {

    private int base;

    private int altezza;

    public triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = (base * altezza) / 2;
        System.out.println("Il triangolo ha area di: " + area);
    }
}