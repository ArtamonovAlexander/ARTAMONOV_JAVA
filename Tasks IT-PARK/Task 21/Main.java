public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoteController pult = new RemoteController();
//      TV tv = new TV("Samsung");
        Program ort = new Program(1, "Вести");
        Program ntv = new Program(2, "Намедни");
        Program tnt = new Program(3, "Камеди Клаб");
        Program rbk = new Program(4, "Курсы валют");

//        tv.addProgram(ort);
//        tv.addProgram(ntv);
//        tv.addProgram(tnt);
//        tv.addProgram(rbk);

        Program program[] = {ort, ntv, tnt, rbk};


        pult.turningOffOn();
        System.out.println("Список передач:");
        System.out.println(ort.getNumberProgram() + " " + ort.getNameChannel());
        System.out.println(ntv.getNumberProgram() + " " + ntv.getNameChannel());
        System.out.println(tnt.getNumberProgram() + " " + tnt.getNameChannel());
        System.out.println(rbk.getNumberProgram() + " " + rbk.getNameChannel());
        System.out.println("Для выключения телевизора нажмите 9");
        pult.turningOffOn();
        pult.turningOffOn();

        System.out.println("Введите номер канала");

        while (true) {
            int x = scanner.nextInt();
            if (x == ort.getNumberProgram()) {
                System.out.println("Смотрим " + ort.getNameChannel());
            }
            else if (x == ntv.getNumberProgram()) {
                System.out.println("Смотрим " + ntv.getNameChannel());
            }
            else if (x == tnt.getNumberProgram()) {
                System.out.println("Смотрим " + tnt.getNameChannel());
            }
            else if (x == rbk.getNumberProgram()) {
                System.out.println("Смотрим " + rbk.getNameChannel());
            }
            else if (x == 9) {
                pult.turningOffOn();
                break;
            } else System.out.println("Пыыыыыыышшщщщь");
        }
    }
}
