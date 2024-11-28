package d5increment_decrement_if;

public class IncrementDecrement {

    public static void main(String[] args) {

        //----- Increment



        int a= 5;
        a =a +2;
        System.out.println(a);
        a +=2;  //a = a + 2; nin aynisidi
        System.out.println(a);

        //------Decrement
        int c = 10;
        c = c - 3; //c iki defa yazilmis. Tekrardan kurtulabiliriz
        System.out.println(c); //7
        c -= 4; // c = c - 4; un aynisidir
        System.out.println(c); //3

        //-------carpma
        int d = 6;
        d *=2;
        System.out.println(d);

        //------bolme
        int e = 24;
        e = e / 2;
        System.out.println(e); //12
        e /= 2;
        System.out.println(e); //6

        //------------1 ile increment
        int f = 13;
        f = f + 1;
        f += 1;
        f++;
        System.out.println(f); //16

        //-----------1 ile decrement

        //-----------1 ile decrement
        int h = 15;
        h = h - 1;
        h -= 1;
        h--;
        System.out.println(h); //12



        //-------Post Increment (i++), Pre Increment(++i)

        int i = 10;
        int k = i++;
        System.out.println(k);//10  ıncrement
        System.out.println(i);//11  variable

        int m = 15;
        int n = ++m;
        System.out.println(n);//16
        System.out.println(m);//16


        int p = 17;
        int r = p--;
        System.out.println(r);
        System.out.println(p);


        int s = 20;
        int t = --s;

        System.out.println(t);
        System.out.println(s);










    }
}
