public class Instance1 {
     int x=20;
        public static void main(String[]args) {
            Instance1 t=new Instance1();
            Instance1 s=new Instance1();
            Instance1 v=new Instance1();
            s.x=t.x+5;
            System.out.println(s.x);
            
        }
    
    }

