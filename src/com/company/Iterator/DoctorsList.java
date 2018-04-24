package com.company.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoctorsList implements Iterable<Doctor> {
    private Doctor[] doctors;
    private int position = 0;

    public DoctorsList() {
        doctors = new Doctor[1];
    }

    public void add(Doctor doctor){
        if(position < doctors.length) {
            doctors[position++] = doctor;
            return;
        }
        doctors = Arrays.copyOf(doctors, doctors.length+5);
        doctors[position++] = doctor;
    }

    @Override
    public Iterator<Doctor> iterator() {
        return new DoctorListIterator();
    }


    private class DoctorListIterator implements Iterator<Doctor> {
       private int position = 0;

        public DoctorListIterator() {
        }

        @Override
        public boolean hasNext() {
            return doctors[position] != null;
        }

        @Override
        public Doctor next() {
            if (doctors[position] == null)
                throw new NoSuchElementException();
            return doctors[position++];
        }
    }
}
