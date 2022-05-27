
package monopoly;

public class ListaJugadores {
    
    J head = null;
    J tail = null;

    public void addJugadorL(Jugador add) {
        J p = new J(add);
        if (head == null) {
            head = p;
            tail = p;
        } else {
            tail.next = p;
            tail = p;
            tail.next = head;
        }
    }
    
    class J {
        
        J next;
        Jugador jugador;
        
        public J(Jugador este) {
            this.next = null;
            this.jugador = este;
        }
    }
}
