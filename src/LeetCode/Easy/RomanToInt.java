package LeetCode.Easy;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toConvertToInt ="LVIII";
		System.out.println("Integer Representation of "+toConvertToInt+" is "+romanToInt(toConvertToInt));
	}
	public static int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int num=0;
        int ans=0;
        int prev=0;
        for(int i = ch.length-1; i>=0; i--){
            if(ch[i]=='I'){num = 1;}
            if(ch[i]=='V'){num= 5;}
            if(ch[i]=='X'){num= 10;}
            if(ch[i]=='L'){num= 50;}
            if(ch[i]=='C'){num= 100;}
            if(ch[i]=='D'){num= 500;}
            if(ch[i]=='M'){num= 1000;}
            if(num<prev && prev !=0){ans-=num;}
            else{ans+=num;}
            prev=num;

        }
        return ans;
    }

}
