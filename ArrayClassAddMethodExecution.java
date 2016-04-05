
public class ArrayClassAddMethodExecution {
    public static void main(String[] args) {
        ArrayClassAddMethod obj = new ArrayClassAddMethod();
        obj.add("Item 1");
        obj.add("Item 2");
        obj.add("Item 3");
        obj.add("Item 4");
        obj.add("Item 5");
        obj.add("Item 6");
        obj.add("Item 7");
        obj.add("Item 8");
        obj.add("Item 9");
        obj.add("Item 10");
        obj.add("Item 11");
        obj.add("Item 12");
        for (int i=0; i<obj.size(); i++) {
            System.out.println(obj.get(i));
        }

    }
}
