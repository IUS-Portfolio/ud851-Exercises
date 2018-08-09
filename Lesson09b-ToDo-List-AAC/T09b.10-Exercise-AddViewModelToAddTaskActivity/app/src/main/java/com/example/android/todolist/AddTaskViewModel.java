package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> task;
    public static final String TAG = AddTaskViewModel.class.getSimpleName();

    public AddTaskViewModel(AppDatabase database, int taskId) {
        Log.d(TAG, "Actively retrieving a specific task from the DataBase");

        task = database.taskDao().loadTaskById(taskId);
    }

    public LiveData<TaskEntry> getTask() {
        return task;
    }

}
