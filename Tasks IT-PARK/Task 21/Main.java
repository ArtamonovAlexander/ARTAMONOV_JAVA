public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoteController pult = new RemoteController();
//      TV tv = new TV("Samsung");
        Program ort = new Program(1, "�����");
        Program ntv = new Program(2, "�������");
        Program tnt = new Program(3, "������ ����");
        Program rbk = new Program(4, "����� �����");

//        tv.addProgram(ort);
//        tv.addProgram(ntv);
//        tv.addProgram(tnt);
//        tv.addProgram(rbk);

        Program program[] = {ort, ntv, tnt, rbk};


        pult.turningOffOn();
        System.out.println("������ �������:");
        System.out.println(ort.getNumberProgram() + " " + ort.getNameChannel());
        System.out.println(ntv.getNumberProgram() + " " + ntv.getNameChannel());
        System.out.println(tnt.getNumberProgram() + " " + tnt.getNameChannel());
        System.out.println(rbk.getNumberProgram() + " " + rbk.getNameChannel());
        System.out.println("��� ���������� ���������� ������� 9");
        pult.turningOffOn();
        pult.turningOffOn();

        System.out.println("������� ����� ������");

        while (true) {
            int x = scanner.nextInt();
            if (x == ort.getNumberProgram()) {
                System.out.println("������� " + ort.getNameChannel());
            }
            else if (x == ntv.getNumberProgram()) {
                System.out.println("������� " + ntv.getNameChannel());
            }
            else if (x == tnt.getNumberProgram()) {
                System.out.println("������� " + tnt.getNameChannel());
            }
            else if (x == rbk.getNumberProgram()) {
                System.out.println("������� " + rbk.getNameChannel());
            }
            else if (x == 9) {
                pult.turningOffOn();
                break;
            } else System.out.println("��������������");
        }
    }
}
