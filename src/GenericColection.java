public class GenericColection<T> {
    private static final int MIN_CAPACITY = 3;
    private Object []data = null;
    private int numObjects = 0;

    public GenericColection(int inicialCapacity) {
        data = new Object[inicialCapacity];
    }
    public GenericColection(){
        data = new Object[MIN_CAPACITY];
    }

    public void insert(T elemnt, int position){
        if (numObjects == data.length){
            Object []aux = data;
            data = new Object[data.length * 2];
            for (int i = 0; i < numObjects; i++) {
                data[i] = aux[i];
            }
            aux = null;
        }

        for (int i = numObjects - 1; i >= position ; i--) {
            data[i + 1] = data[i];
        }

        data[position] = elemnt;
        numObjects++;
    }

    public void add(T element){
        insert(element, numObjects);
    }

    public T delete(int position){
        Object aux = data[position];

        for (int i = position; i < numObjects - 1; i++) {
            data[i] = data[i + 1];
        }
        data[numObjects - 1] = null;
        numObjects--;
        return (T) aux;
    }

    public T getElemento(int position){
        return (T) data[position];
    }

    public int getNumObject(){
        return numObjects;
    }

    @Override
    public String toString() {
        String out = "-> ";
        for (int i = 0; i < numObjects; i++) {
            out += data[i] + " | ";
        }
        return out;
    }
}
