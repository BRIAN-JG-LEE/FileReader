import java.io.*;

import java.util.*;

public class Main {
    public static void main(String[] args)  {
        try {
            File file = new File("C:\\wShop\\Test01.txt");

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<String> list2 = new ArrayList<String>();

            while((line = bufferedReader.readLine()) != null){
//                System.out.println(line);
                String[] spl = line.split(",");
                String num1 = spl[0];
                String num2 = spl[1];
                String num3 = spl[2];
                
                int intNum = Integer.parseInt(num3);

//                System.out.println(num1);
                System.out.println(num2);
                System.out.println(intNum);

                list.add(intNum);
                list2.add(num2);

            }
            System.out.println(list);
            System.out.println(list2);


            System.out.println(list.get(0));
            int max = 0;
            String nation = null;

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)> max) {
                    max = list.get(i);
                    nation = list2.get(i);
                }
            }

            System.out.println("최대값 : "+max+"점을 받은 사람의 국가는 "+nation+" 입니다.");

            double sum = 0;
            double avg;
            for (int i = 0; i < list.size(); i++) {

                sum += list.get(i);

            }
            avg = sum/list.size();

            System.out.println("평균값 : "+avg+"점 입니다.");

        } catch (FileNotFoundException e) {

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}