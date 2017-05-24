public class Task1 {

    public static void main (String[] args) {
        boolean isPrime = false;
        int count = 100;
        System.out.println("2 ");
        for (int numb = 2; numb < count; numb++) {
            if (numb % 2 == 0)                   // проверка на четность -- четные числа
                continue;                        // не являются простыми (кроме 2)
            for (int j = 2; j < numb; j++) {
                if (numb % j != 0) 
                    isPrime = true;
                else {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(numb + " ");
        }
    }
}