//TC: O(N Square)
//SC: O(N) using an array to store the characters from the String;
//This is how you separate the string in java

class Solution {
    public int maxPower(String s) {
    char chrArr[]=s.toCharArray();
        int count=1;
        int max=1;
        
        for(int i=0;i<chrArr.length-1;i++){
            if(chrArr[i]==chrArr[i+1]){
                count++;
                max=Math.max(count,max);
            }else{      //Make count==1 when the comparison breaks;
                count=1;
            }
        }
        return max;
    }
}


class Solution {
    public int maxPower(String s) {
        
        char chArr[]=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            chArr[i]=s.charAt(i);
        }
        
        int counter=1;
        int maxCount=1;
        
        for(int i=0;i<chArr.length-1;i++){
            counter=1;
            for(int j=i+1;j<chArr.length;j++){
                //Comparison Loop Iterator;
                if(chArr[j]==chArr[i]){
                    counter++;             
                }else{
                    break;
                }
            }    
            
            if(maxCount<counter){
                maxCount=counter;
            }
        }
       return maxCount; 
        
    }
}
