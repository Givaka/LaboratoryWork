package lab3;

public class Formula {

    public static void main(String[] args) {

//	Объявление переменных
        double a,b,c,d,r,t,k,A,T1,T2,L;	//Входные переменные
        double f1,f2,q;		//Функций

//	Присвоение входным переменным случайных вещественных чисел из отрезка [0;10]
        a    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        b    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        c    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        r    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        t    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        d    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        k    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        A    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        T1   = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        T2   = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;
        L    = Math.ceil((Math.random() * (10 + 1)) * 100) / 100;

//	Объявление функции
        f1  = Math.ceil(4/(3*(r + 34)) - 9*(a + b*c) + (3 + d*(2 + a))/(a + b*d) * 100) / 100;
        f2  = Math.ceil(5.5*Math.pow((r + 2.5),(2.5 + t)) * 100) / 100;
        q   = Math.ceil((k*A*(T1 - T2))/L * 100) / 100;

//	Вывод результатов присвоения случайных чисел
        System.out.println("Значение переменных:\t a  = " + a + ";\t b  = " + b + ";\t c = " + c + ";\t d = " + d +";" +
                                                "\t r  = " + r + ";\t t  = " + t + ";\t k = " + k + ";\t A = " + A +
                                                ";\t T1 = " + T1 + ";\t T2 = " + T2 + ";\t L = " + L + ";");

//        Вывод результата по все трем функциям
        System.out.println("При данных значениях:\tf1 = "+f1+";\n\t\t\t\t\t\tf2 = "+f2+";\n\t\t\t\t\t\tq  = "+q+";");
    }
}
