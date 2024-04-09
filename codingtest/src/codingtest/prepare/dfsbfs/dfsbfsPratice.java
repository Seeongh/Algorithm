package codingtest.prepare.dfsbfs;

//글자 바꾸기
public class dfsbfsPratice {

    static String start = "hit";
    static String target = "cog";
    static int n;
    static String[] words = {"hot", "dot","dog","lot","log","cog"};

    public static void main(String[] args) {
        //start -> target으로 단어 변경하기

        n = start.length();
        for(int i =0 ; i < n ; i++) {
            if(start.charAt(i) != target.charAt(i)) {
                dfs(i);
            }
        }

    }

    public static void dfs(int i) {

        for(int j = 0 ; j < words.length; j++) {
            if(words[i].charAt(i) )
        }
    }
}