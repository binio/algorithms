package com.binio.algo.equal;

import java.util.Objects;

public class Student {

    String fname;
    String lname;

    public Student(final String fname, final String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(final String fname) {
        this.fname = fname;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        final Student student = (Student) o;
        return Objects.equals(getFname(), student.getFname()) &&
                Objects.equals(lname, student.lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFname(), lname);
    }
}
