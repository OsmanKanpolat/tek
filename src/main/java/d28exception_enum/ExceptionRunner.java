package d28exception_enum;

public class ExceptionRunner {

    public static void main(String[] args) {





    }

    public static void studendGrade(int not){

        //System.out.println(not);

        if (not < 0 || not > 100) {

            try {
                throw new InvalidStudentGradeException("ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace(); //hatanin ayrintilarini gosterir
            }

        } else {
            System.out.println(not);
        }

    }
}
