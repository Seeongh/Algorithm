package codingtest.prepare.dfsbfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//글자 바꾸기
public class dfsbfsPratice {

    static String start = "hit";
    static String target = "cog";
    static int n;
   static String[] words = {"hot", "dot","dog","lot","log","cog"};
    //static String[] words = {"hot", "dot","dog","lot","log"};

    static String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
    static String smallStr= "" ;
    static boolean[] chk= null;
    public static void main(String[] args) {
        //start -> target으로 단어 변경하기
        int n = tickets.length;
        int m = 2;
        int cnt = 0; int result =0 ;
        String[] answer = new String[n+1];
       chk= new boolean[n];
        String tmp="";

        Queue<String> q = new LinkedList<>();
        q.offer("ICN"); //INC

//        while(!q.isEmpty()){
//            tmp = q.poll();
//            System.out.println("cnt: " + cnt);
//            answer[cnt++] = tmp;
//            for(int i =0 ;i < n; i++) {
//                if(!chk[i] && tmp.equals(tickets[i][0])) {
//
//                    if(dfs3(tickets[i][1],0)){
//                        result = i;
//                    }
//                }
//            }
//
//            q.offer(smallStr);
//            System.out.println(smallStr);
//            chk[result]=true;
//            smallStr = "";
//
//        }

        smallStr = "ICN";
        while(cnt <= n){
            //tmp = q.poll();
            answer[cnt++] = smallStr;

            smallStr = "";

            for(int i =0 ;i < n; i++) {
                if(!chk[i] && tmp.equals(tickets[i][0])) {
                    if(dfs3(tickets[i][1],0)){
                        result = i;
                        smallStr = tickets[i][1];
                        System.out.println(smallStr);
                    }
                }
            }
            // answer[cnt++] = tmp;
            //q.offer(smallStr);
            chk[result]=true;

        }
      //  Arrays.stream(answer)
       //         .forEach(i -> System.out.println(i));
    }
    public static boolean dfs3(String compareStr, int index){
        if(index < 3)  {
            if(smallStr.equals("")|| (smallStr.charAt(index) > compareStr.charAt(index) )){
               
                return true;
            }
            else{
                return dfs3(compareStr, index+1);
            }
        }

        return false;
    }

    // 알파벳 start-> target으로 바꾸기
    public void Solution() {
    n = start.length();
        String tmp ="";
        Queue<nodes> q = new LinkedList<>();
        int[] chk = new int[words.length];
        int result = 0 ;

        q.offer(new nodes(start, 0));
        nodes tmpnode = null;

        while(!q.isEmpty()) {
             tmpnode = q.poll();

            for(int i =0 ; i< words.length; i++) {
                tmp = words[i];

                if(tmpnode.getPstring().equals(target)) {
                    result = chk[tmpnode.getIndex()];
                    q.clear();
                    break;
                }

                if(dfs(tmpnode.getPstring(), tmp, 0 ,0)) { //알파벳이 하나만 달라서 변경이 가능한지 여부

                    if(chk[i] == 0) {
                        q.offer(new nodes(tmp, i));
                        chk[i] = chk[tmpnode.getIndex()] +1;
                    }
                }
            }
        }

        System.out.println(result);


    }

    public static boolean dfs(String qstart, String tmp, int i, int sum) {
        //탈출 조건
        if( i == n) {

            if(sum == 1) { //다른 단어가 딱 하나라 큐에 넣음
                return true;
            }
            else{
                return false;
            }
        }
        //수행 동작
        if(qstart.charAt(i) == tmp.charAt(i)) {
            return dfs(qstart, tmp, i+1, sum);
        }
        else {
            return dfs(qstart,tmp, i+1, sum+1);
        }

    }
}

class nodes{

    String pString;
    int index ;
    boolean chk = false;

    nodes(String str, int i) {
        this.pString = str;
        this.index= i;
    }

    public String getPstring() {
        return this.pString;
    }
    public int getIndex() {
        return this.index;
    }

    public boolean getChk() {
        return this.chk;
    }

    public void setChk( boolean chk) {
         this.chk  =chk;
    }
}