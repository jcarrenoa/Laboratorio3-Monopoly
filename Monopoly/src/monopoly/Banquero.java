package monopoly;

public class Banquero {

    public int Pagar(Jugador jugador, int cant) {
        while (cant > 0) {
            boolean aux = true;
            while (cant - 500 >= 0 && jugador.dinero[7] > 0) {
                cant = cant - 500;
                jugador.dinero[7]--;
                jugador.dinerot -= 500;
                aux = false;
            }
            while (cant - 100 >= 0 && jugador.dinero[6] > 0) {
                cant = cant - 100;
                jugador.dinero[6]--;
                jugador.dinerot -= 100;
                aux = false;
            }
            while (cant - 50 >= 0 && jugador.dinero[5] > 0) {
                cant = cant - 50;
                jugador.dinero[5]--;
                jugador.dinerot -= 50;
                aux = false;
            }
            while (cant - 20 >= 0 && jugador.dinero[4] > 0) {
                cant = cant - 20;
                jugador.dinero[4]--;
                jugador.dinerot -= 20;
                aux = false;
            }
            while (cant - 10 >= 0 && jugador.dinero[3] > 0) {
                cant = cant - 10;
                jugador.dinero[3]--;
                jugador.dinerot -= 10;
                aux = false;
            }
            while (cant - 5 >= 0 && jugador.dinero[2] > 0) {
                cant = cant - 5;
                jugador.dinero[2]--;
                jugador.dinerot -= 5;
                aux = false;
            }
            while (cant - 2 >= 0 && jugador.dinero[1] > 0) {
                cant = cant - 2;
                jugador.dinero[1]--;
                jugador.dinerot -= 2;
                aux = false;
            }
            while (cant - 1 >= 0 && jugador.dinero[0] > 0) {
                cant = cant - 1;
                jugador.dinero[0]--;
                jugador.dinerot -= 1;
                aux = false;
            }
            if (cant > 0 && aux) {
                if (cant - 500 < 0 && jugador.dinero[7] > 0) {
                    cant = cant - 500;
                    jugador.dinero[7]--;
                    jugador.dinerot -= 500;
                    return cant;
                }
                if (cant - 100 < 0 && jugador.dinero[6] > 0) {
                    cant = cant - 100;
                    jugador.dinero[6]--;
                    jugador.dinerot -= 100;
                    return cant;
                }
                if (cant - 50 < 0 && jugador.dinero[5] > 0) {
                    cant = cant - 50;
                    jugador.dinero[5]--;
                    jugador.dinerot -= 50;
                    return cant;
                }
                if (cant - 20 < 0 && jugador.dinero[4] > 0) {
                    cant = cant - 20;
                    jugador.dinero[4]--;
                    jugador.dinerot -= 20;
                    return cant;
                }
                if (cant - 10 < 0 && jugador.dinero[3] > 0) {
                    cant = cant - 10;
                    jugador.dinero[3]--;
                    jugador.dinerot -= 10;
                    return cant;
                }
                if (cant - 5 < 0 && jugador.dinero[2] > 0) {
                    cant = cant - 5;
                    jugador.dinero[2]--;
                    jugador.dinerot -= 5;
                    return cant;
                }
                if (cant - 2 < 0 && jugador.dinero[1] > 0) {
                    cant = cant - 2;
                    jugador.dinero[1]--;
                    jugador.dinerot -= 2;
                    return cant;
                }
                while (cant - 1 < 0 && jugador.dinero[0] > 0) {
                    cant = cant - 1;
                    jugador.dinero[0]--;
                    jugador.dinerot -= 1;
                    return cant;
                }
            }
        }
        return cant;
    }

    public void Devolver(Jugador jugador, int cant) {
        cant = cant * -1;
        while (cant > 0) {
            while (cant - 500 >= 0) {
                cant = cant - 500;
                jugador.dinero[7]++;
                jugador.dinerot += 500;
            }
            while (cant - 100 >= 0) {
                cant = cant - 100;
                jugador.dinero[6]++;
                jugador.dinerot += 100;
            }
            while (cant - 50 >= 0) {
                cant = cant - 50;
                jugador.dinero[5]++;
                jugador.dinerot += 50;
            }
            while (cant - 20 >= 0) {
                cant = cant - 20;
                jugador.dinero[4]++;
                jugador.dinerot += 20;
            }
            while (cant - 10 >= 0) {
                cant = cant - 10;
                jugador.dinero[3]++;
                jugador.dinerot += 10;
            }
            while (cant - 5 >= 0) {
                cant = cant - 5;
                jugador.dinero[2]++;
                jugador.dinerot += 5;
            }
            while (cant - 2 >= 0) {
                cant = cant - 2;
                jugador.dinero[1]++;
                jugador.dinerot += 2;
            }
            while (cant - 1 >= 0) {
                cant = cant - 1;
                jugador.dinero[0]++;
                jugador.dinerot += 1;
            }
        }
    }

    //Falta Hacer que le devuelva
    public void renta(int dinero1[], int cantidadt1, int dinero2[], int cantidadt2, int cant, Jugador j1, Jugador j2) {
        Banquero temp = new Banquero();
        while (cant > 0) {
            boolean aux = true;
            while (cant - 500 >= 0 && dinero2[7] > 0) {
                cant = cant - 500;
                dinero1[7]++;
                cantidadt1 += 500;
                dinero2[7]--;
                cantidadt2 -= 500;
                aux = false;
            }
            while (cant - 100 >= 0 && dinero2[6] > 0) {
                cant = cant - 100;
                dinero1[6]++;
                cantidadt1 += 100;
                dinero2[6]--;
                cantidadt2 -= 100;
                aux = false;
            }
            while (cant - 50 >= 0 && dinero2[5] > 0) {
                cant = cant - 50;
                dinero1[5]++;
                cantidadt1 += 50;
                dinero2[5]--;
                cantidadt2 -= 50;
                aux = false;
            }
            while (cant - 20 >= 0 && dinero2[4] > 0) {
                cant = cant - 20;
                dinero1[4]++;
                cantidadt1 += 20;
                dinero2[4]--;
                cantidadt2 -= 20;
                aux = false;
            }
            while (cant - 10 >= 0 && dinero2[3] > 0) {
                cant = cant - 10;
                dinero1[3]++;
                cantidadt1 += 10;
                dinero2[3]--;
                cantidadt2 -= 10;
                aux = false;
            }
            while (cant - 5 >= 0 && dinero2[2] > 0) {
                cant = cant - 5;
                dinero1[2]++;
                cantidadt1 += 5;
                dinero2[2]--;
                cantidadt2 -= 5;
                aux = false;
            }
            while (cant - 2 >= 0 && dinero2[1] > 0) {
                cant = cant - 2;
                dinero1[1]++;
                cantidadt1 += 2;
                dinero2[1]--;
                cantidadt2 -= 2;
                aux = false;
            }
            while (cant - 1 >= 0 && dinero2[0] > 0) {
                cant = cant - 1;
                dinero1[0]++;
                cantidadt1 += 1;
                dinero2[0]--;
                cantidadt2 -= 1;
                aux = false;
            }
            if (cant > 0 && aux) {
                temp.Devolver(j1, -1 * cant);
                if (cant - 500 < 0 && dinero2[7] > 0) {
                    cant = cant - 500;
                    dinero2[7]--;
                    cantidadt2 -= 500;
                } else if (cant - 100 < 0 && dinero2[6] > 0) {
                    cant = cant - 100;
                    dinero2[6]--;
                    cantidadt2 -= 100;
                } else if (cant - 50 < 0 && dinero2[5] > 0) {
                    cant = cant - 50;
                    dinero2[5]--;
                    cantidadt2 -= 50;
                } else if (cant - 20 < 0 && dinero2[4] > 0) {
                    cant = cant - 20;
                    dinero2[4]--;
                    cantidadt2 -= 20;
                } else if (cant - 10 < 0 && dinero2[3] > 0) {
                    cant = cant - 10;
                    dinero2[3]--;
                    cantidadt2 -= 10;
                } else if (cant - 5 < 0 && dinero2[2] > 0) {
                    cant = cant - 5;
                    dinero2[2]--;
                    cantidadt2 -= 5;
                } else if (cant - 2 < 0 && dinero2[1] > 0) {
                    cant = cant - 2;
                    dinero2[1]--;
                    cantidadt2 -= 2;
                } else if (cant - 1 < 0 && dinero2[0] > 0) {
                    cant = cant - 1;
                    dinero2[0]--;
                    cantidadt2 -= 1;
                }
            }
        }
        temp.Devolver(j2, cant);
    }
}
