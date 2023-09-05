
import java.util.List;
import java.util.Scanner;
class Generic<T> {
}

public class Test {
    public static void main(String[] args) throws Exception {
        Generic<Integer>[] generics = (Generic<Integer>[]) new Generic[10];
        System.out.println(generics[0] = new Generic<Integer>());
    }
}

