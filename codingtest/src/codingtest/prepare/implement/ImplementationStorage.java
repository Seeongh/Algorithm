package codingtest.prepare.implement;

public class ImplementationStorage {
    public static void main(String[] args) {
        //상하좌우 n*n정사각형에서 lurd 지도를 보고 어디에 위치할지
        int n = 5;
        String[] strRLUD = {"R", "R", "R", "U", "D", "D"};
        int result_ud = 1;
        int result_lr = 1;

        int[] arry= {0,0,-1,1};
        int[] arrx = {-1,1,0,0};
        String[] move_types = {"L","R","U","D"};
        for(String m : strRLUD) {
            for(int i =0 ; i<move_types.length; i++){
                if(m.equals(move_types[i])) {
                    result_lr = (result_lr + arrx[i]) > 0? (result_lr + arrx[i]): result_lr;
                    result_ud = (result_ud + arry[i]) > 0? (result_ud + arry[i]): result_ud;
                }
            }
        }


//
//        for(String p: strRLUD) {
//
//            if(p.equals("R")) {
//                if(result_lr < n) {
//                    result_lr+=1;
//                }
//            }
//            else if(p.equals("L")) {
//                if(result_lr > 1) {
//                    result_lr -= 1;
//                }
//            }
//            else if(p.equals("U")) {
//                if(result_ud > 1) {
//                    result_ud -= 1;
//                }
//            }
//            else if(p.equals("D")) {
//                if(result_ud < n) {
//                    result_ud += 1;
//                }
//            }
//        }
//
        System.out.println( result_ud+ " " + result_lr );
    }
}
