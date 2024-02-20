public class move_x_end {
    public static void moveAllx(String str,int idx,int count,String newString){
        if(idx==str.length()-1){
            for(int i=0;i<=count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return; 
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllx(str,idx+1,count,newString);
        }
        else{
            newString+=currChar;
            moveAllx(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args) {
       String str="asxxlsj";
        moveAllx(str,0,0,"");
    }
    
}
