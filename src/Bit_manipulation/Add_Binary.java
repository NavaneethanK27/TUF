package Bit_manipulation;

public class Add_Binary {
    static String convertDtoB(int n){
        StringBuilder res= new StringBuilder();
        while(n>0){
            int digit=n%2;
            res.append(digit);
            n/=2;
        }
        return res.reverse().toString();
    }
    static int convertBtoD(String s1){
        int decimalValue=0;
        int power=0;

        for(int i=s1.length()-1;i>=0;i--){
            char digitchar=s1.charAt(i);
            if(digitchar=='1'){
                int poweroftwo=1;
                for(int j=0;j<power;j++){
                    poweroftwo*=2;
                }
                decimalValue+=poweroftwo;
            }
            power++;
        }
        return decimalValue;
    }
    public static void main(String[] args) {
        String s1="11";
        String s2="1";
        int digit=convertBtoD(s1)+convertBtoD(s2);
        System.out.println(convertDtoB(digit));
    }
}
