package com.baicizhan.jerry.test;
import java.util.Scanner; 

public class JerryIpTransfer {
    public static void main(String[] args){
        //Get input string
        Scanner sc = new Scanner(System.in);
        String jerryLetter = sc.nextLine();
        sc.close();
        
        int size = jerryLetter.length();
        int powerNum = 32;
        int totalNum = 0;
        int previous = -1;
        
        long total  = 0L;
        
        for(int index = 0; index < size;index++){
            char currentCharacter = jerryLetter.charAt(index);
            if(currentCharacter == 97){//a
                int currentNum = 1; //two letter adjacent 
                if(index - previous > 1){
                    currentNum  = Integer.parseInt(jerryLetter.substring(previous + 1 , index));
                }
                //System.out.println("a index: " + index + " previous: " + previous + " currentNum: " + currentNum);
                totalNum +=  currentNum;
                if(totalNum > 32){
                    System.out.println("Input error,the number of a and b is more than 32");
                    return;
                }
                powerNum -= currentNum;
                previous = index;
            }else if(currentCharacter == 98){//b
                int currentNum = 1; //two letter adjacent 
                if(index - previous > 1){
                    currentNum  = Integer.parseInt(jerryLetter.substring(previous + 1, index));
                }
                //System.out.println("a index: " + index + " previous: " + previous + " currentNum: " + currentNum);
                totalNum +=  currentNum;
                if(totalNum > 32){
                    System.out.println("Input error,the number of a and b is more than 32");
                    return;
                }
                for(int jndex= 0;jndex < currentNum;jndex++){
                    powerNum--;
                    total += Math.pow(2, powerNum);
                }
                //System.out.println("powerNum is : " + Math.pow(2, powerNum));
                previous = index;
            }else if(!Character.isDigit(currentCharacter)){
                System.out.println("Input error,Input have illegal characters");
                return;
            }
        }
        
        //System.out.println("total is: " + total);
        if(totalNum < 32){
            System.out.println("Input error,the number of a and b is less than 32");
            return;
        }
        
        String result = "";
        int index = 3;
        while(index >=0){
            result += (total / (long)Math.pow(2, 8 * index));
            if(index > 0){
                result += ".";
            }
            total = total %  (long)Math.pow(2, 8 * index);
            index--;
        }
        System.out.println(result);
    }
    
    
}
