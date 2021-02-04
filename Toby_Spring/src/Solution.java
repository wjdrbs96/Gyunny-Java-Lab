class Solution {
    public static String solution(String new_id) {
        new_id = new_id.toLowerCase();  // 1단계 대문자 -> 소문자

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < new_id.length(); ++i) {
            if ((new_id.charAt(i) >= 97 && new_id.charAt(i) <= 122) || (new_id.charAt(i) >= 48 && new_id.charAt(i) <= 57) || new_id.charAt(i) == 46 || new_id.charAt(i) == 45 || new_id.charAt(i) == 95) {
                sb.append(new_id.charAt(i));
            }
        }

        new_id = sb.toString(); // 2단계 -> 문자 제거

        boolean check = true;
        StringBuilder twoSb = new StringBuilder();
        for (int i = 0; i < new_id.length(); ++i) {
            if (new_id.charAt(i) == '.') {
                // .을 한번만 append
                if (check) {
                    twoSb.append(new_id.charAt(i));
                }
                check = false;
            }
            else {
                twoSb.append(new_id.charAt(i));
                check = true;
            }
        }

        new_id = twoSb.toString();

        if (twoSb.length() > 0) {
            if (twoSb.charAt(0) == '.') {
                twoSb.deleteCharAt(0);
            }
        }

        if (twoSb.length() > 0) {
            if (twoSb.charAt(twoSb.length() - 1) == '.') {
                twoSb.deleteCharAt(twoSb.length() - 1);
            }
        }

        new_id = twoSb.toString();

        // 5단계 -> 빈문자열이라면 a 대입
        if (new_id.length() == 0) {
            new_id = "a";
        }

        // 6단계
        StringBuilder six = new StringBuilder();
        if (new_id.length() >= 16) {
            for (int i = 0; i < 15; ++i) {
                six.append(new_id.charAt(i));
            }
            if (six.charAt(0) == '.') {
                six.deleteCharAt(0);
            }
            if (six.charAt(six.length() - 1) == '.') {
                six.deleteCharAt(six.length() - 1);
            }
            new_id = six.toString();
        }

        if (new_id.length() <= 2) {
            for (int i = 0; i < 2; ++i) {
                new_id += String.valueOf(new_id.charAt(new_id.length() - 1));
                if (new_id.length() == 3) break;
            }
        }

        return new_id;
    }

    public static void main(String[] args) {
        //String a = "...!@BaT#*..y.abcdefghijklm";
        //String a = "z-+.^.";
        //String a = "=.=";
        //String a = 	"123_.def";
        String a = "abcdefghijklmn.p";
        System.out.println(solution(a));
    }
}