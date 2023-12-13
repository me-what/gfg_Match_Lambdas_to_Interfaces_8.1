@FunctionalInterface
interface display {
    void show(String msg);

    default int doSum(int a, int b) {
        return a + b;
    }
}