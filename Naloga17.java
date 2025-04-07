public class Naloga17 {
   public static void main(String[] args) {
        byte[] arr = new byte[100000];
        byte[] arr1 = new byte[100000];
        byte[] arr2 = new byte[100000];
        long startTime;

        arr = fill(arr);
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        System.arraycopy(arr, 0, arr2, 0, arr.length);

        System.out.println("Neurejeni");

        startTime = System.currentTimeMillis();
        urejanjeVstavljanje(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        uredi_z_izbiranjem(arr1);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        bubbleSort(arr2);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");


        //2.DEL
        System.out.println("Ze urejeni:");
        
        startTime = System.currentTimeMillis();
        urejanjeVstavljanje(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        uredi_z_izbiranjem(arr1);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        bubbleSort(arr2);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");


        //3. DEL
        System.out.println("Ze urejeni v reverse");

        startTime = System.currentTimeMillis();
        urejanjeVstavljanjeI(arr);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        uredi_z_izbiranjemI(arr1);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        bubbleSortI(arr2);
        System.out.println("Time: " + (System.currentTimeMillis() - startTime) + "ms");

    }

    public static void urejanjeVstavljanje(byte[] a) {
        int i, j;
        byte x;
        for (i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1])
                continue; // izboljšava
            x = a[i];
            j = i - 1;
            while (j >= 0 && x < (a[j])) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }

    public static void uredi_z_izbiranjem(byte[] a) {
        int j;
        byte t;
        for (int i = 0; i < a.length - 1; i = i + 1) {
            j = i;
            for (int k = i; k < a.length; k = k + 1) {
                if (a[k] < a[j]) {
                    j = k;
                }
            }
            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    public static void bubbleSort(byte[] a) {
        int i, j;
        byte x;
        for (i = 1; i < a.length; ++i)
            for (j = a.length - 1; j >= i; --j)
                if (a[j] > (a[j - 1])) {
                    x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                }
    }

    public static void urejanjeVstavljanjeI(byte[] a) {
        int i, j;
        byte x;
        for (i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1])
                continue; // izboljšava
            x = a[i];
            j = i - 1;
            while (j >= 0 && x > (a[j])) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = x;
        }
    }

    public static void uredi_z_izbiranjemI(byte[] a) {
        int j;
        byte t;
        for (int i = 0; i < a.length - 1; i = i + 1) {
            j = i;
            for (int k = i; k < a.length; k = k + 1) {
                if (a[k] > a[j]) {
                    j = k;
                }
            }
            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    public static void bubbleSortI(byte[] a) {
        int i, j;
        byte x;
        for (i = 1; i < a.length; ++i)
            for (j = a.length - 1; j >= i; --j)
                if (a[j] < (a[j - 1])) {
                    x = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = x;
                }
    }

    public static byte[] fill(byte[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (Math.random() * 200 + 1);
        }

        return arr;
    }

}
