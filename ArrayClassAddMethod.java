public class ArrayClassAddMethod {
    
    String[] list = null;
    int pointer = 0;

    public ArrayClassAddMethod() {
        list = new String[10];// Must specify size of array
    }

    public ArrayClassAddMethod(int size) {
        list = new String[size];
    }

    public void add(String element) {
        if (pointer <= list.length-1) {
            list[pointer] = element;
            ++pointer;
        } else {
            String[] newList = new String[list.length + 20];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i<list.length; i++) {
            if (list[i] == null) {
                return size;
            } else {
                size++;
            }
        }
        return size;
    }

    public String get(int index) {
        return list[index];
    }
}
