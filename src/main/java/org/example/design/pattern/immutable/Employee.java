package org.example.design.pattern.immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Employee {

    private final List<String> list;

    private final Integer id;

    public Employee(List<String> list, Integer id){

        this.list = list == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList<>(list));
        this.id = id;
    }

    public List<String> getList() {
        return list;
    }
    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [list=" + list + ", id=" + id + "]";
    }

}
