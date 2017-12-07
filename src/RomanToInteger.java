public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;

        String[] ch = s.split("");

        for (int i = 0; i < ch.length; i++) {
            String current = ch[i];
            String prev = ch[i-1].toUpperCase();

            switch (ch[i].toUpperCase()) {
                case "I": result += 1; break;
                case "V": result += 5; break;
                case "X": result += 10; break;
                case "L": result += 50; break;
                case "C": result += 100; break;
                case "D": result += 500; break;
                case "M": result += 1000; break;
            }

            if (i != 0 ) {
                if ("I".equals(prev) && !"I".equals(current)) result -= 2;
                if ("X".equals(prev) && !"IVX".contains(current)) result -= 20;
                if ("C".equals(prev) && !"IVXLC".contains(current)) result -= 200;
                if ("M".equals(prev) && !"IVXLCDM".contains(current)) result -= 2000;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger ri = new RomanToInteger();

        System.out.println(ri.romanToInt("MMCCCXCIX"));
    }
}
