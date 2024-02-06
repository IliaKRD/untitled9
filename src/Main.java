import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<HeavyBox>();
        boxes.add(new HeavyBox(250));
        boxes.add(new HeavyBox(350));
        boxes.add(new HeavyBox(240));
        boxes.add(new HeavyBox(140));
        boxes.add(new HeavyBox(380));

        List<HeavyBox> heavyBoxes = new ArrayList<HeavyBox>();

        Iterator<HeavyBox> iterator = boxes.iterator();
        while (iterator.hasNext())
            {
                HeavyBox box = iterator.next();
                if (box.getWeight() > 300) {
                    heavyBoxes.add(box);
                    iterator.remove();
                }
            }

            for (HeavyBox box : boxes) {
                System.out.println(box);
            }

            System.out.println("Коробки с весом больше 300 гр:");
            for (HeavyBox box : heavyBoxes) {
                System.out.println(box);
            }
        }
    }
