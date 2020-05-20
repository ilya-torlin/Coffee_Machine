class Complex {

    double real;
    double image;

    public void add(Complex num) {
        this.image += num.image;
        this.real += num.real;
    }

    public void subtract(Complex num) {
        this.image -= num.image;
        this.real -= num.real;
    }
}