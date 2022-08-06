package com.task.staff;

import com.task.staff.services.ReadService;
import com.task.staff.utils.Constants;

// reading json file with gson library

public class Main {
    public static void main(String[] args) {
        String path = Constants.BASE_PATH + "staff.json";
        ReadService reader = new ReadService();
        reader.readData(path);
    }
}
