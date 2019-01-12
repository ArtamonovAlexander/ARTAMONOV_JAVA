public class Task16 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(7);
        list.add(2);
        list.add(17);
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(4);
        list.print();

        list.addToBegin(100);
        list.addToBegin(120);
        list.print();

        System.out.println(list.get(3));

        list.insert(4, 2);
        list.print();

        list.revers();
        list.print();

        System.out.println(list.getCount());

        list.sort();
        list.print();

        System.out.println(list.contains(18));

        System.out.println(list.indexOf(0));
    }
}