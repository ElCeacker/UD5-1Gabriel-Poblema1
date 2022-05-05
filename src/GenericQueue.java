public class GenericQueue<T> {
    private static final int CAPACIDAD_INICIAL = 5;

    private CustomColection flotantes = new CustomColection(CAPACIDAD_INICIAL);

    public void enqueue(Float numeros) {
        flotantes.insert(numeros, 0);
    }

    public void dequeue() {flotantes.delete(0);}

    @Override
    public String toString() {
        String salida = "";

        for (int i = 0; i < flotantes.length(); i++) {
            salida += flotantes.getElement(i).toString();
            salida +=" ";
        }

        return salida;

    }
}

