public class ArrayList {
    final int MAX_SIZE = 7;

    int value[];

    int coint;

    public ArrayList() {
        this.value = new int[MAX_SIZE];
        this.coint = 0;
    }

    void add(int element){
        this.value[coint] = element;
        coint ++;
    }
    void addToBegin(int element){
        for (int i = value.length - 1; i > 0; i--) {
            this.value[i] = this.value[i - 1];
        }
        this.value[0] = element;
    }
    int get(int index){
        return  this.value[index];
    }
    void insert(int element, int index){
        for (int i = value.length - 1; i > index; i--) {
            this.value[i] = this.value[i - 1];
        }
        this.value[index] = element;
    }
    void revers() {
        for (int i = 0; i < this.value.length/2; i++) {
            int tmp = value[i];
            value[i] = value[value.length - 1 - i];
            value[value.length - 1 - i] = tmp;
        }
    }
    void print() {
        for (int i = 0; i < value.length; i++) {
            System.out.print(this.value[i] + " ");
        }
        System.out.println();
    }
    int getCount() {
        return this.coint;
    }
    void sort() {
        for (int i = 0; i < this.value.length-1; i++) {
            for (int j = 0; j < this.value.length -1; j++) {
                if(value[j] > value [j + 1]){
                    int tmp = value[j];
                    value[j] = value[j+1];
                    value[j+1] = tmp;
                }
            }
        }
    }
    boolean contains(int element) {
        for (int i = 0; i < value.length; i++) {
            if (element == value[i]) return true;
        }
        return false;
    }
    int indexOf(int element){
        for (int i = 0; i < value.length; i++) {
            if (element == value[i]) return i;
        }
        return -1;
    }
}