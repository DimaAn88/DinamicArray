class DynamicArray<T> {
    T [] elements;
    int size;

    public DynamicArray() {
        elements = (T[]) new Object[10];
        size = 0;
    }



    public void add(T el) {
        T[] tempArray = null;
        tempArray  = (T[])new Object [size+1];
        System.arraycopy(elements, 0, tempArray, 0, size);
        elements = tempArray;
        elements[size] = el;
        size++;
    }
    public void remove(int index) {
        if ( index<size ) {
            elements[size - 1] = null;
            size--;
        }
        else throw new ArrayIndexOutOfBoundsException();


    }

    public T get (int index) {
        if ( index>=size ) {throw new ArrayIndexOutOfBoundsException();}
        T a = elements[index];
        return a;
    }
}

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamicArrayTest = new DynamicArray<Integer>();

        dynamicArrayTest.add(10);
        dynamicArrayTest.add(20);
        dynamicArrayTest.add(30);
        dynamicArrayTest.add(40);
        dynamicArrayTest.add(50);

        System.out.print("items of intArray:");

        for (int i = 0; i < dynamicArrayTest.size; i++) {
            System.out.print(dynamicArrayTest.elements[i] + " ");
        }
        System.out.println(); int u = 4;
        int r = (int) dynamicArrayTest.get(u);
        System.out.println("элемент по индексу "+u+ " равен  "+r);

        System.out.println("Size of the intArray: " + dynamicArrayTest.size);

        dynamicArrayTest.remove(4);

        System.out.println("\nItems after removing the last element");

        for (int i = 0; i < dynamicArrayTest.size; i++) {
            System.out.print(dynamicArrayTest.elements[i] + " ");
        }

        System.out.println("Size of the intArray: " + dynamicArrayTest.size);
    }
}