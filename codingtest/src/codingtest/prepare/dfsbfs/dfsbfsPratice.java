package codingtest.prepare.dfsbfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//글자 바꾸기
public class dfsbfsPratice {

    static String start = "hit";
    static String target = "cog";
    static int n,m, result;
   static String[] words = {"hot", "dot","dog","lot","log","cog"};
    //static String[] words = {"hot", "dot","dog","lot","log"};

    static String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
    static String smallStr= "" ;
    static boolean[][] chk= null;
    static Stack<realnodes> stack = null;
    static String[] answer = null;

    public static void main(String[] args) {
        //start -> target으로 단어 변경하기
         n = tickets.length;
         m = 2;
        chk = new boolean[n][n+1];
        stack= new Stack<>();
        answer = new String[n+1];

        stack.push(new realnodes("ICN", -1));
        for(int a =0 ; a < n ; a++) {
            dfs3( "ICN" ,a,0);
        }

        while(!stack.empty()){
            System.out.println(stack.pop().city);
        }
    }
    public static boolean dfs3(String city,int check, int i){
        //종료 조건
       if(stack.size() / n+1 == 0) {
           return true;
       }
        if( i == n ) { //다 돌았는데 못찾음: 경로가 아님 || stack 이 다 찬경우
            return false ;
        }

        if(!chk[check][i] && city.equals(tickets[i][0])) {
            stack.push(new realnodes(tickets[i][1], i));
            city = tickets[i][1];
            chk[check][i] = true;
            System.out.println("stack push city: " + city +", " + i);
            return dfs3(city, check,0);
        }
        return  dfs3(city, check,i + 1);

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
class realnodes {
    String city;
    int order;

    public realnodes(String city, int order) {
        this.city = city;
        this.order = order;
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