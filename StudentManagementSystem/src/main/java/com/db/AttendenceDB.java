package com.db;

public interface AttendenceDB {
    void add(String attendence,String date,int sid);
    void read();
    void update(int sid, String date);
    void delete(int sid, String date);
    void highest();
    void lowest();
    void getSingleData(int sid);
}
