//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #898989
//Name: #Lin Dan

package Assignment2_TestFiles;

class MyThread1 extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        MyThread1 t1 = new MyThread1();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("id of t1:" + t1.getId());
        t1.start();
        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}