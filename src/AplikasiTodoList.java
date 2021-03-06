public class AplikasiTodoList {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

//business logic

    /**
     * menampilkan todo list
     */

    public static void showTodoList() {
        System.out.println("To-Do List");
        //tambahkan ke posisi yang model array nya NUll
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            //check model
            if (todo != null) {
                System.out.println(no + ". " + todo);
            }

        }
    }

    public static void testShowTodoList() {
        model[0] = "albert";
        model[1] = "studi kasus java dasar : membuat aplikasi todo list";
        showTodoList();
    }

    /**
     * menambah todo ke list
     */

    private static void addTodoList(String todo) {
        // cek apakah model penuh
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                //model masiha ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh kita resize ukuran array 2x lipat
        if (isFull) {
            //penampung model lama
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang model array nya NULL
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Test add todo list
     */
    public static void testAddTodoList() {

        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh todo ke " + i);
        }

        showTodoList();
    }

    /**
     * menghapus todo dari list
     */

    public static boolean removeTodoList(Integer number) {
        //cek number > panjang model
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {

            for (int i = (number - 1); i < model.length; i++) {
                if(i == (model.length - 1)){
                    model[i] = null;
                }else {
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        //dummy tambah model
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        //coba hapus model ke 20, karena diset 10;
        var result = removeTodoList(20);
        System.out.println(result);

        //coba hapus model ke 4
        result = removeTodoList(7);
        System.out.println(result);

        //coba hapus model ke 2
        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }


    public static String input(String info){
       System.out.print(info + ": ");
       String model =  scanner.nextLine();
       return model;
    }

    public static void testInput(){
        var name = input("Nama ");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }
// view

    /**
     * tampil show todo list
     */
    public static void viewShowTodoList() {
        while (true){
            showTodoList();
            System.out.println("Menu :");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if (input.equals("1")){
                viewAddTodoList();
            }else if (input.equals("2")){
                viewRemoveTodoList();
            }else if (input.equals("x")){
                break;
            }else {
                System.out.println("Pilihan tidak sesuai");
            }
        }

    }

    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        viewShowTodoList();
    }

    /**
     * tampil view todo list
     */
    public static void viewAddTodoList() {
        System.out.println("Menambah ToDo List");

        var todo = input("Todo (x Jika Batal)");

        if(todo.equals("x")){
            //batal
        }else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){

        addTodoList("satu");
        addTodoList("dua");

        viewAddTodoList();

        showTodoList();
    }

    /**
     * view delete todo list
     */

    public static void viewRemoveTodoList() {
        System.out.println("MENGHAPUS TO-DO LIST");

        var number = input("Nomor yang dihapus (x Jika Batal)");

        //check button x
        if(number.equals("x")){
            //batal
        }else{
            //konversi dari String ke integer
          boolean success = removeTodoList(Integer.valueOf(number));
          if (!success){
              System.out.println("Gagal Menghapus todo list : " + number);
          }
        }
    }

    public static void testViewRemoveTodoList(){

        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }


}
