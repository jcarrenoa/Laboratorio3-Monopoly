package monopoly;

public class Tarjeta {

    int vcompra, numc, numh, renta, is, dueño, cc, ch, nump;
    String nombrec;
    Tarjeta next, prev;

    public Tarjeta (String nombre, int compra, int numc, int numh, int renta, int op, 
            int cc, int ch, int num) {
        is = op;
        this.nombrec = nombre;
        next = null;
        prev = null;
        this.dueño = 0;
        this.cc = cc;
        this.ch = ch;
        this.nump = 0;
        switch (op) {
            //Es una propiedad
            case 1: {
                this.vcompra = compra;
                this.numc = numc;
                this.numh = numh;
                this.renta = renta;
                this.nump = num;
                break;
            }
            //Es una tarjeta como arca comunal o fortuna
            case 2: {
                vcompra = 0;
                this.numc = 0;
                this.numh = 0;
                this.renta = 0;
                break;
            }
            //Es una propiedad especial como ferrocarril, servicios, etc
            case 3: {
                this.vcompra = compra;
                this.numc = 0;
                this.numh = 0;
                this.renta = renta;
                break;
            } 
            case 4: {
                vcompra = 0;
                this.numc = 0;
                this.numh = 0;
                this.renta = renta;
                break;
            }
        }
    }
}