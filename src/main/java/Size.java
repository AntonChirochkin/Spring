public enum Size {
    XS (0,10),
    S(11,25),
    M(26,50),
    L(51,80),
    XL(81,120);

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    Size() {
    }
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public String toString() {
        return " от " +
                min +
                ", до " + max;
    }
}
