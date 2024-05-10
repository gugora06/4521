public class main {
    public static void main(String[] args) {
        // завдання 1
//        for (int i = 500; i <= 650; i += 10){
//            System.out.println(i);
//        }
//
//        int a = 500;
//        while (a <= 650){
//            System.out.println(a);
//            a += 10;
//        }
//
//        int b = 500;
//        do{
//            System.out.println(b);
//            b += 10;
//        } while (b <= 650);
        //завдання 2
//        for(int i = 2 ;i <= 5000 ;i = (2*i-1)) {
//            System.out.println(i);
//        }
//        завдання 3
//        int number=10;
//        for(int i = 1;i <= number; i++){
//            if(number % i == 0){
//                System.out.println(i);
//            }
//        }
//        //завдання 4
//        int number = 10;
//        int result = 1;
//        for (int i = 1; i <= number; i++) {
//            result *= i;
//        }
//        System.out.println(result);
//        while (result <= number) {
//            result *= result;
//            result++;
//        }
//        System.out.println(result);
        //завдання 5
        int match = 0;
        for (int i = 0; i < 24; i++){
            for(int j = 0; j < 60; j++){
                if(i / 10 == j % 10 && j / 10 == i % 10){
                    match++;
                }
            }
        }
        System.out.println(match);
    }
}

