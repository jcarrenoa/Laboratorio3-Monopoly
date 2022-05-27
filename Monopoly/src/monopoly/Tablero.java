package monopoly;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  Tablero {
  Tarjeta head = null;
  Tarjeta tail = null;
    
    public void addCasilla(String nombre, int compra, int numc, int numh, int renta, int op, int cc, int ch, int num) {
        Tarjeta P = new Tarjeta(nombre, compra, numc, numh, renta, op, cc, ch, num);
        if (head == null) {
            head = P;
            tail = P;
            head.prev = tail;
            tail.next = head;
        } else {
            tail.next = P;
            P.prev = tail;
            tail = P;
            head.prev = tail;
            tail.next = head;
        }
    }
    
    public void listaTablero() {
        try {
            String Archivo = "Archivo_prueba";
            BufferedReader br = new BufferedReader(new FileReader(Archivo + ".txt"));
            String line = br.readLine();
            int i = 1;
            //nombre;compra;cc;ch;alquiler;op
            while ((line = br.readLine()) != null) {
                String temp[] = line.split(";");
                String nombre = temp[0];
                int compra = Integer.parseInt(temp[1]);
                int cc = Integer.parseInt(temp[2]);
                int ch = Integer.parseInt(temp[3]);
                int renta = Integer.parseInt(temp[4]);
                int op = Integer.parseInt(temp[5]);
                if (op == 1) {
                    addCasilla(nombre, compra, 0, 0, renta, op, cc, ch, i);
                    i += 1;
                } else {
                    addCasilla(nombre, compra, 0, 0, renta, op, cc, ch, 0);
                }
            }
            br.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public void inicializarTarjetas(String ArcaComunal[][], String Fortuna[][]) {
        try {
            String Archivo = "ArcaComunal";
            BufferedReader br = new BufferedReader(new FileReader(Archivo + ".txt"));
            String line = br.readLine();
            int i = 0;
            while ((line = br.readLine()) != null) {
                String temp[] = line.split(";");
                ArcaComunal[i][0] = temp[0];
                ArcaComunal[i][1] = temp[1];
                ArcaComunal[i][2] = temp[2];
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
        try {
            String Archivo = "Fortuna";
            BufferedReader br = new BufferedReader(new FileReader(Archivo + ".txt"));
            String line = br.readLine();
            int i = 0;
            while ((line = br.readLine()) != null) {
                String temp[] = line.split(";");
                Fortuna[i][0] = temp[0];
                Fortuna[i][1] = temp[1];
                Fortuna[i][2] = temp[2];
                i++;
            }
            br.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    
    public void display(){
        Tarjeta current = head;
        if(current == null){
            System.out.println("The list is empty");
            return;
        }
        System.out.println("The nodes of the singly linked list are: ");
        System.out.print("null <- ");
        do{
            if (current.next != null){
              System.out.print(current.nombrec +" <-> ");
            }else{
              System.out.print(current.nombrec +" -> ");
            }
            current = current.next;
        } while (current != head);
        if(current == head)
            System.out.print("null\n");
    }
}
