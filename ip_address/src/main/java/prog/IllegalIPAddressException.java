package prog;

public class IllegalIPAddressException extends Exception {

        private String exceptionData;

        public IllegalIPAddressException() {
            exceptionData = "Illegal IP Address";
        }

//        public IllegalIPAddressException(String exData) {
//            exceptionData = exData;
//        }

        @Override
        public String toString() {
            return "yy.IllegalIPAddressException [ " + exceptionData + " ]";
        }

}
