public class AplikasiTodoList {

    public static String[] data = new String[10];

    public static void main(String[] args) {
        testAddTodoList();


    }

//business logic

    /**
     * menampilkan todo list
     */

    public static void showTodoList() {
        //tambahkan ke posisi yang data array nya NUll
        for (int i = 0; i < data.length; i++) {
            var todo = data[i];
            var no = i + 1;

            //check data
            if (todo != null) {
                System.out.println(no + ". " + todo);
            }

        }
    }

    public static void testShowTodoList() {
        data[0] = "albert";
        data[1] = "studi kasus java dasar : membuat aplikasi todo list";
        showTodoList();
    }

    /**
     * menambah todo ke list
     */

    private static void addTodoList(String todo) {
        var isFull = true;
        // cek apakah data penuh
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                //model masiha ada yang kosong
                isFull = false;
                break;
            }
        }

        //jika penuh kita resize ukuran array 2x lipat
        if (isFull) {
            //penampung data lama
            var temp = data;
            data = new String[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data array nya NULL
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todo;
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
        //cek number > panjang data
        if ((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            data[number - 1] = null;
            return true;
        }
    }

// view

    /**
     * tampil show todo list
     */
    public static void viewShowTodoList() {

    }

    /**
     * tampil view todo list
     */
    public static void viewAddTodoList() {

    }

    /**
     * view delete todo list
     */

    public static void viewRemoveTodoList() {


    }


}
