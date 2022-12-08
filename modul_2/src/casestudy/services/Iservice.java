package casestudy.services;

import casestudy.model.people.Employee;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public interface Iservice {
    void addNew() throws IOException;

    void displayAll();
}
