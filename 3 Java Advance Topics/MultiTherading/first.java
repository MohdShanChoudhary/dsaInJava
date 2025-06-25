// 🧱 Ways to Create a Thread
// 1. Extending the Thread class

// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread running...");
//     }

//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start();  // starts the thread
//     }
// }
// 2. Implementing the Runnable interface

// class MyRunnable implements Runnable {
//     public void run() {
//         System.out.println("Runnable thread running...");
//     }

//     public static void main(String[] args) {
//         Thread t1 = new Thread(new MyRunnable());
//         t1.start();  // starts the thread
//     }
// }


// ✅ Example with Two Threads:
// java
// Copy
// Edit
// class A extends Thread {
//     public void run() {
//         for(int i = 1; i <= 5; i++) {
//             System.out.println("A: " + i);
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for(int i = 1; i <= 5; i++) {
//             System.out.println("B: " + i);
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         A a = new A();
//         B b = new B();
//         a.start();
//         b.start();
//     }
// }