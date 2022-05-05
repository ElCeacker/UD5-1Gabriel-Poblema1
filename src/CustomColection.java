public class CustomColection {
    private Object data[] = null;
    private int length = 0;

    public CustomColection(int initialCapacity) {
        data = new Object[initialCapacity];
    }

    public Object getElement(int i) {
        return data[i];
    }

    public int length() {
        return length;
    }

    public void insert(Object element, int i) {

        if (length == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < length; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        for (int j = length - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }

        data[i] = element;
        length++;
    }

    public int search(Object element) {
        int i = 0;
        for (; i< length && !data[i].equals(element); i++);
        return i < length ? i : -1;
    }

    public void add(Object element) {
        insert(element, length);
    }

    public Object delete(int position) {
        Object aux = data[position];

        for (int j = position; j < length - 1; j++) {
            data[j] = data[j + 1];
        }

        length--;
        return aux;
    }
}
