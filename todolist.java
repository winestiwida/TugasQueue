import java.util.Queue;
import java.util.LinkedList;

class todolist {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        int nop = 1;
        
        do{
            System.out.println("\n===Aplikasi Todo List===");
            System.out.println("1.Tambah Todo");
            System.out.println("2.Lihat Todo");
            System.out.println("3.Keluar");
            System.out.print("Pilih menu(1/2/3) = ");
            
            int pilihan = Integer.parseInt(System.console().readLine());
            
            if(pilihan == 1){
                System.out.print("Masukan data todo list = ");
                String tambahTodo = System.console().readLine();
                queue.add(tambahTodo);
                System.out.print("Todo berhasil ditambahkan");
            }
            
            else if(pilihan == 2){
                int no = 0;
                System.out.println("TODO LIST");
                for(String item:queue){
                    no++;
                    System.out.println(no+"."+item);
                }
            }
                
            else{
                break;
            }    
     
        }while(nop != 3);
        
        
    }
}