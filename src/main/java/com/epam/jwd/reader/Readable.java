package com.epam.jwd.reader;

import com.epam.jwd.model.Triangle;

import java.util.List;

public interface Readable {

    public List create();
    public void read(String FileName);
    public void delete (List arrayList);
}
