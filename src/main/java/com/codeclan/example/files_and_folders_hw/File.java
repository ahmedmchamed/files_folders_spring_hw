package com.codeclan.example.files_and_folders_hw;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="files")
public class File {

    private Long id;
    private String name;
    private String extension;
    private int size;
    private Folder folder;


    public File() {}

    public File(String name, String extension, int size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getExtension() {
        return this.extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }


    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Folder getFolder() {
        return this.folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
