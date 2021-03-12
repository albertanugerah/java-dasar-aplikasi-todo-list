package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository{

    public Todolist[] data = new Todolist[10];

    @Override
    public Todolist[] getAll() {
        return data;
    }

    public boolean isFull(){
        // cek apakah model penuh
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                //model masiha ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIfFull(){
        //jika penuh kita resize ukuran array 2x lipat
        if (isFull()) {
            //penampung model lama
            var temp = data;
            data = new Todolist[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(Todolist todolist) {
        resizeIfFull();
        //tambahkan ke posisi yang model array nya NULL
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
        }
    }

    @Override
    public void remove(Integer number) {

    }


//    mengelola data array dilakukan oleh repository
//    butuh repository,karena mengubah impementasi dari array jadi collection/database, cukup mengubah logic yang ada di repository
    // memindahkan  dan mereturn data ke repository, dan juga service nya
}
