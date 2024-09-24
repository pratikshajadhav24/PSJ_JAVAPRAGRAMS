public class Instance2 {
   
        int x=20;
        public static void main(String[]args) {
            Instance1 t=new Instance1();
            Instance1 s=new Instance1();
            Instance1 y=new Instance1();
            s.x=t.x+5;
            t.x=s.x+5;
            System.out.println(t.x);
            System.out.println(s.x);
            
        }

}
