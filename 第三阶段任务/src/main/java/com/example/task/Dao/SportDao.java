package com.example.task.Dao;

import com.example.task.pojo.Sport;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class SportDao {

    private static Map<Integer, Sport> Sportmen = null;

    static {
        Sportmen = new HashMap<>();
        Sportmen.put(1001, new Sport(1001, "kong", "软件工程", "100m跑步比赛"));
        Sportmen.put(1002, new Sport(1002, "bai", "计算机科学与技术", "400m"));
        Sportmen.put(1003, new Sport(1003, "ming", "网络工程", "1000m"));
        Sportmen.put(1004, new Sport(1004, "hong", "通信工程", "跳高"));
        Sportmen.put(1005, new Sport(1005, "wan", "电子信息工程", "1500m"));
    }

    private static Integer idinit = 1006;

    public Collection<Sport> FindALl() {
        return Sportmen.values();
    }

    public static void save(Sport sport) {
        if (sport.getId() == null) {
            sport.setId(idinit++);
        }
        Sportmen.put(sport.getId(), sport);
    }

    public Sport getById(Integer id) {
        return Sportmen.get(id);
    }

    public void edit(Sport sport) {
        Sportmen.put(sport.getId(), sport);
    }

    public void delete(Integer id) {
        Sportmen.remove(id);
    }
}
