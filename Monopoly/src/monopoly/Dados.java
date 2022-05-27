package monopoly;

import java.util.Random;

public class Dados {
    
    public int TirarDados() {
        int min = 1;
        int max = 5;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        return value;
    }
    
}
