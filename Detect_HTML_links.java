import java.util.*;
import java.util.regex.*;

public class Detect_HTML_links {
    public static int count(String a, List<String> b) {
        int result = 0;
        String regex = a.substring(0,a.length()-2)+"[sz]e";
        for(int i=0;i<b.size();i++)
            if(b.get(i).matches(regex))
                result++;
        return result;
    }
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        List<String> words = new ArrayList<>();
        for(int i=0;i<a;i++) {
            String line = s.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            while(st.hasMoreTokens())
                words.add(st.nextToken());
        }
        int b = s.nextInt();
        Deque<String> query = new ArrayDeque<>();
        for(int i=0;i<b;i++)
            query.offer(s.next());
        while(!query.isEmpty())
            System.out.println(count(query.poll(),words));
    }
}