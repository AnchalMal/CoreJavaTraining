package com.java.training;

    /**
     * Created by anchalmal on 2/2/17.
     */
    public class official {
        public int id;
        public String Name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }
    }


     class wait implements Runnable {
        official o = new official();

        wait(official o) {
            this.o = o;
        }

        public void run() {
            try {
                o.wait();
                System.out.println(o.getName());
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted! \" + ie");
            }
        }

        public static class set implements Runnable {
            official o;

            set(official o) {
                this.o = o;
            }

            public void run() {
                try {
                    o.wait(1000);
                    o.setName("Anchal");

                } catch (Exception e) {
                    System.out.println("Exception");
                }
            //Synchronized(o){

                }
            //o.notifyAll();

            }
        //}


        public static void main(String[] args) {
            official o = new official();
            wait w = new wait(o);
            set s = new set(o);
            Thread t1 = new Thread(w);
            Thread t2 = new Thread(s);
            t1.start();
            t2.start();
        }

    }
