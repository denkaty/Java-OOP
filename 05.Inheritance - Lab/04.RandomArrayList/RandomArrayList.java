package RandomArrayList_04;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<E> extends ArrayList<E> {

    public E getRandomElement(){
        Random random = new Random();
        int index = random.nextInt(this.size());
        return this.remove(index);

    }

}
