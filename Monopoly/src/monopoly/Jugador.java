package monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Jugador {

    int dinero[] = new int[8], puesto, coordenadas[][] = new int[40][4], 
        dinerot = 0, jugador, compañias = 0, ferrocarriles = 0, sc = 0;
    Tarjeta posicion;
    String color;
    boolean carcel = false;

    public Jugador(Tarjeta posicion, int jugador) {
        this.posicion = posicion;
        this.jugador = jugador;
        try {
            String Archivo = "PosicionesJugador";
            BufferedReader br = new BufferedReader(new FileReader(Archivo + jugador + ".txt"));
            String line = br.readLine();
            int i = 0;
            //Posicionx;Posiciony;Casilla;ficha
            while ((line = br.readLine()) != null) {
                String temp[] = line.split(";");
                this.coordenadas[i][0] = Integer.parseInt(temp[0]);
                this.coordenadas[i][1] = Integer.parseInt(temp[1]);
                this.coordenadas[i][2] = Integer.parseInt(temp[2]);
                this.coordenadas[i][3] = Integer.parseInt(temp[3]);
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public void iniciarD(int dinero[]) {
        for (int i = 0; i <= 7; i += 1) {
            this.dinero[i] = dinero[i];
            switch (i) {
                case 0:
                    this.dinerot = this.dinerot + (dinero[i] * 1);
                    break;
                case 1:
                    this.dinerot = this.dinerot + (dinero[i] * 2);
                    break;
                case 2:
                    this.dinerot = this.dinerot + (dinero[i] * 5);
                    break;
                case 3:
                    this.dinerot = this.dinerot + (dinero[i] * 10);
                    break;
                case 4:
                    this.dinerot = this.dinerot + (dinero[i] * 20);
                    break;
                case 5:
                    this.dinerot = this.dinerot + (dinero[i] * 50);
                    break;
                case 6:
                    this.dinerot = this.dinerot + (dinero[i] * 100);
                    break;
                case 7:
                    this.dinerot = this.dinerot + (dinero[i] * 500);
                    break;
            }
        }
    }

    public int TirarDados() {
        int min = 1;
        int max = 5;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        return value;
    }

    public void Moverse(int num, Tarjeta head) {
        for (int i = 0; i < num; i++) {
            this.posicion = this.posicion.next;
            if (this.posicion == head) {
                this.dinero[6] = this.dinero[6] + 2;
            }
        }
    }

}
