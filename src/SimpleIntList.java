class SimpleIntList {

    private int[] values;

    void add(int value) {
        if (values == null) { // 1 Punkt
            values = new int[1]; // 1 Punkt
            values[0] = value; // 1 Punkt
            return; // 1 Punkt
        }
        int[] newArray = new int[values.length + 1]; // 1 Punkt
        for (int i = 0; i < values.length; i++) { // 1 Punkt
            newArray[i] = values[i]; // 1 Punkt
        }
        newArray[values.length] = value; // 1 Punkt
        values = newArray; // 1 Punkt
    }

    int get(int index) {
        if (index < 0 || index >= values.length) { // 1 Punkt
            return -1; // 1 Punkt
        }

        return values[index]; // 1 Punkt
    }

    int size() {
        if (values == null) { // 1 Punkt
            return 0; // 1 Punkt
        }
        return values.length; // 1 Punkt
    }

    // 15 Punkte

}
