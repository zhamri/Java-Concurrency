//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #123456
//Name: #Ali bin Abu Bakar

package Assignment2_TestFiles;

class MyThread2 extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());
        
//How to start thread
        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}