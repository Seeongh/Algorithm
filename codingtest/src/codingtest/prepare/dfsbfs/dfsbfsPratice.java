package codingtest.prepare.dfsbfs;

import java.util.*;

//글자 바꾸기
public class dfsbfsPratice {

    static String start = "hit";
    static String target = "cog";
    static int n,m, result;
   static String[] words = {"hot", "dot","dog","lot","log","cog"};
    //static String[] words = {"hot", "dot","dog","lot","log"};

    static String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
    static String smallStr= "" ;
    static boolean[] chk= null;
    static Stack<String> stack = null;
    static String[] answer = null;
    static ArrayList<Stack<String>> arr = new ArrayList<>();

    public static void main(String[] args) {
        //start -> target으로 단어 변경하기
         n = tickets.length;
         m = 2;
        chk = new boolean[n];
        Stack<String> stack = new Stack<>();
        stack.push("ICN");
        dfs3("ICN",stack,0 );


        if(arr.size()> 1) {
            Comparator<Stack<String>> Alphabet = new Comparator<Stack<String>>() {
                @Override
                public int compare(Stack s1, Stack s2) {
                    for(int a = 0 ; a< 3; a++) {
                        if(!s1.get(a).equals(s2.get(a))) {
                            String o1 = (String) s1.get(a);
                            String o2= (String) s2.get(a);
                            System.out.println("s1 a, 알파벳: " + a+", " + s1.get(a));
                            System.out.println("s2 a, 알파벳: " + a+", " + s2.get(a));
                            return o1.compareTo(o2); //음수 반환시 앞에게 뒤에거보다 앞
                        }
                    }

                    return 0;
                }
            };

           Collections.sort(arr, Alphabet);

        }




        // 길이로 정렬하는 Comparator 구현

    }
    public static void dfs3(String city, Stack<String> st, int i){
        //종료 조건
        if(i == n) {
            Stack<String> st2 = new Stack<>();
           for(String s: st) {
               st2.push(s);
           }
            arr.add(st2);
            return ;
        }

        for(int j =0 ;j < n; j ++) {
            if(!chk[j] && city.equals(tickets[j][0])) {

                System.out.println(city+", " + tickets[j][1]+", (" + i+")");
                st.push(tickets[j][1]);
                chk[j] = true;

                dfs3(tickets[j][1], st,i+1);

                chk[j] = false;
                st.pop();

            }
        }


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