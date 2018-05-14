package test;

import java.util.HashMap;


public class Test03
{
    public static void main(String[] args)
    {
        new RoundGlyph(5);
        
        HashMap<String, String> map = new HashMap<String,String>();
        map.put(null, null);
        map.put(null, "1");
        map.put("1", null);
        map.put("2", null);
        System.out.println(map);
    }
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    };
    Glyph(){
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph().radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.RoundGlyph().radius ="+ radius);
    }
}



class A{

    interface B{
        void f();
//        private interface I{};
    }
    public class BImp implements B{
        public void f(){}
    }
    private class BImp2 implements B{
        public void f(){}
    }
    public interface C{
        void f();
    }
    public class WH implements B ,C{
        public void f(){}
    }
    class CImp implements C{
        public void f(){}
    }
    private class CImp2 implements C{
        public void f(){}
    }

    interface E{
        interface G{
            void f();
        }
        public interface H{
            void f();
        }
    }
}



