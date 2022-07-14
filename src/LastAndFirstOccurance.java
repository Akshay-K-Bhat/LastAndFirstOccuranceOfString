public class LastAndFirstOccurance {
    public static int first= -1;
    public static int last=-1;

    public static void lastAndFirstOccurance(String str,char ele,int idx){

        if (idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar==ele){
            if (first==-1){
                first=idx;
            }
            else {
                last=idx;
            }
        }
        lastAndFirstOccurance(str,ele,idx+1);

    }
    public static void main(String[] args) {
        String str = "akshay";
        lastAndFirstOccurance(str,'a',0);

    }
}
