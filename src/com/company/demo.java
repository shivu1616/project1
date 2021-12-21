package com.company;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class demo
{
    public static void main(String[] args) throws IOException
    {
       String txtfile = args[0];
       String wordsearch = args[1];
        System.out.println("processing......");
        File fileinput = new File(txtfile);
        String[] words=null;
        FileReader fr = new FileReader(fileinput);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String input="data";
        int count=0;
        while((s=br.readLine())!=null)
        {
            words=s.split(" ");
            for (String word : words)
            {
                if (word.equals(input))
                {
                    count++;
                }
            }
        }
         if(count!=0)
         {
            System.out.println("The given word is present for "+count+ " times in the file");
         }
          else
          {
            System.out.println("The given word is not present in the file");
          }

        fr.close();
    }
}