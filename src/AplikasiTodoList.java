public class AplikasiTodoList {

    public static String[] data = new String[10];

    public static void main(String[] args) {


    }

//business logic

    /**
     * menampilkan todo list
     */

    public static void showTodoList(){
        //tambahkan ke posisi yang data array nya NUll
        for (int i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i +1;

            //check data
            if(todo != null){
                System.out.println(no + ". " + todo);
            }

        }
    }

    /**
     * menambah todo ke list
     */

    private static void addTodoList(){

    }

    /**
     * menghapus todo dari list
     */

    public static void removeTodoList(){

    }

// view

    /**
     * tampil show todo list
     */
    public static void viewShowTodoList(){

    }

    /**
     * tampil view todo list
     */
    public static void viewAddTodoList(){

    }

    /**
     * view delete todo list
     */

    public static void viewRemoveTodoList(){


    }



}
