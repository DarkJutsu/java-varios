package clases;

public class Busqueda {
    public int buscar(int[] data, int target) {
        int lower = 0;
        int high = data.length - 1;

        while (lower < high) {
            int middle = (lower + high) / 2;
            if (data[middle] == target) return middle;
            if (data[lower] <= data[middle]) {
                if (target >= data[lower] && target < data[middle]) {
                    high = middle - 1;
                } else {
                    lower = middle + 1;
                }
            }
        }
        return data[lower] == target ? lower : -1;
    }

    public int[] buscarRango(int[] data, int target) {
        int start = Busqueda.firstEqual(data, target);
        if (start == data.length || data[start] != target) return new int[]{-1, -1};
        return new int[]{start, Busqueda.firstEqual(data, target + 1) - 1};
    }

    private static int firstEqual(int[] data, int target) {
        int lower = 0, high = data.length;
        while (lower < high) {
            int middle = lower + ((high - lower) >> 1);
            if (data[middle] < target) {
                lower = middle + 1;
            } else {
                high = middle;
            }
        }
        return lower;
    }

    public int buscarInsert(int[] data, int target) {
        int n = data.length;
        return insert(data, target, 0, n - 1);
    }

    private static int insert(int[] data, int target, int left, int right) {
        if (left > right) return left;
        if (left == right) {
            if (data[left] < target) return left + 1;
            else return left;
        }
        int middle = (left + right) / 2;
        if (target > data[middle]) return insert(data, target, middle + 1, right);
        if (target < data[middle]) return insert(data, target, left, middle - 1);
        else return middle;
    }
}
