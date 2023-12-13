import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main implements display {
    @Override
    public void show(String msg)
    {
        System.out.println(msg);
    }
// 1
    public static void main(String[] args) {
        Main object = new Main();
        object.show("Hello World!");
        System.out.println(object.doSum(2, 3));


// 2
        Cab cab = new Cab() {
            @Override public void bookCab()
            {
                System.out.println(
                        "\nBooking Successful!! Arriving Soon!!");
                // «Бронирование успешно!! Скоро прибытие!!»
            }
        };
        cab.bookCab();


//  3
        List<Integer> list = Arrays.asList(
                234, 780, 451, 639, 456, 98, 75, 43);
        System.out.println("\nBefore Sorting");

        for (int i : list)
            System.out.print(i + " ");
        System.out.println();

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a1, Integer a2)
            {
                return a1 % 10 > a2 % 10 ? 1 : -1;
            }
        });

        System.out.println("\nAfter Sorting");

        for (int i : list)
            System.out.print(i + " ");
        System.out.println();


        // 4
        interface Display{
            void show();
        }

        Display display= ()->System.out.println("\nWelcome");
        display.show();

        List<Integer> list_2
                = Arrays.asList(24, 346, 78, 90, 21, 765);

        System.out.println("\nBefore sorting.");

        for (int i : list_2)
            System.out.print(i + " ");
        System.out.println();

        Collections.sort(list_2, (a1, a2) -> {
            return a1 % 10 > a2 % 10 ? 1 : -1;
        });

        System.out.println("After sorting.");

        for (int i : list_2)
            System.out.print(i + " ");
        System.out.println();
    }
}