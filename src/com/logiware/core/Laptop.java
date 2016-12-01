package com.logiware.core;

/**
 *
 * @author omi
 */
public class Laptop {
    
  private String name;
  private Double size;
  private String hardDisk;
  private String processor;
  private String ram;
  private String dvdWriter;

  
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDvdWriter() {
        return dvdWriter;
    }

    public void setDvdWriter(String dvdWriter) {
        this.dvdWriter = dvdWriter;
    }
   
}
