public class Instance3 {
    
int x=20;
        public static void main(String[]args) {
            Instance1 t=new Instance1();
            Instance1 s=new Instance1();
            Instance1 y=new Instance1();
            //x=x+5; we Cannot make a static reference to the non-static field x 
            t.x=s.x+5;
            System.out.println(t.x);
            System.out.println(s.x);
            
        }
    
    }
    

