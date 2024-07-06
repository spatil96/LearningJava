package LeetCode.Easy;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String toConvertToInt ="LVIII";
		String toConvertToInt ="MCMXCIV";//1994
		System.out.println("Integer Representation of "+toConvertToInt+" is "+romanToIntNew(toConvertToInt));
	}
    public static int romanToIntNew(String s) {
        int sum =0;
        char []  ch1 = s.toCharArray();
        int temp = 0;
        int prev = 0;
        for(char ch : ch1){
            if(ch == 'I'){temp=1;}
            if(ch == 'V'){temp=5;}
            if(ch == 'X'){temp=10;}
            if(ch == 'L'){temp=50;}
            if(ch == 'C'){temp=100;}
            if(ch == 'D'){temp=500;}
            if(ch == 'M'){temp=1000;}
            if(prev < temp && prev !=0) {
                sum=(sum+ temp) - (2*prev);
            }else{
                sum+=temp;
            }
            prev = temp;
        }
        return sum;
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
