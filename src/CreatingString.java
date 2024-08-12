public class CreatingString{

    public static void CreatingString(int indx,int freq[],ArrayList<String> al,StringBuilder sb,int n){
        if(indx==n){
            al.add(sb.toString());
            return;
        }


        for(int i=0;i<26;i++){
            if(freq[i]>0){
                freq[i]--;
                CreatingString(indx+1,freq,al,sb.append((char)(i+'a')),n);
                sb.setLength(sb.length()-1);
                freq[i]++;
            }
        }
    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();

            int freq[]=new int[26];

            for(int i=0;i<str.length();i++){
                freq[str.charAt(i)-'a']++;

            }
            StringBuilder sb=new StringBuilder("");
            ArrayList<String> al=new ArrayList<>();
            CreatingString(0,freq,al,sb,n);
            System.out.println(al.size());
            System.out.println(al);


        }

    }
}