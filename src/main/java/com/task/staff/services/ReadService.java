package com.task.staff.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.task.staff.entity.Employee;


import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ReadService {

    public void readData(String path) {

        try {

            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(path));

            List<Employee> staffList = gson.fromJson(reader,
                    new TypeToken<List<Employee>>() {}.getType());

            AtomicInteger cnt = new AtomicInteger(0);

            staffList.forEach(staff -> System.out.println(cnt.incrementAndGet() + ") " +
                    staff.getName() + " " +
                    staff.getPosition() + " " +
                    "phone: " + staff.getPhone() + " " +
                    "salary: " + staff.getSalary())
            );

            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
