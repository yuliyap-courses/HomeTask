package HomeTask.HomeTask.DAY1;

public class Day1HomeTask_1 {

    /*Это инкремент, который может записываться префиксально (++i) или постфиксально (i++).  В целом они выполняют одно
    и то же, но разница заключается в том, что  ++i увеличит значение и вернет его, а i++ увеличит значение,
    но вернет исходное
     */
        public static void main (String [] args){
            int a, e = 7;
            a = ++e; //префиксальный
            System.out.println("a = " + a);

            int b, c = 7;
            b = c++; //постфиксальный
            System.out.println("b = " + b + "\nc = "+c);
        }

}
