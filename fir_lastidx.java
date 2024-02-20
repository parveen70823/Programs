public class fir_lastidx {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String a ,int idx,char element){
        if(idx==a.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=a.charAt(idx); 
        if(currChar==element){
            if(first==-1){
                first=idx;
            }
            else{
                last=idx;
            }
        }
        findOccurance(a,idx+1,element);
    }
    public static void main(String[] args) {
        String a="bahdyakgqahskhah";
        findOccurance(a,0,'a');
    }
    
}
