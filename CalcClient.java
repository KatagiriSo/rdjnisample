import java.io.*;

class CalcClient {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("In:");
            String numstr = br.readLine();
            System.out.print(numstr+"+:");
            String numstr2 = br.readLine();

            CalcJNI calc = new CalcJNI();
            calc.hello();
            Integer result = calc.add(Integer.parseInt(numstr), Integer.parseInt(numstr2));

            System.out.println("OUT:" + result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}