package com.java.training;

/**
 * Created by anchalmal on 2/2/17.
 */
public class testthread extends Thread{

        public void run(){
            for(int i=1;i<=10;i++){
                try{


                }
                catch(Exception e){
                System.out.println(e);
            }
                System.out.println(i);
            }
        }
        public static void main(String args[]){
            testthread t1=new testthread();
            testthread t2=new testthread();

            t1.start();
            try{
                t1.join(1000);
            }
            catch(Exception e){
                System.out.println(e);}

        }
}
