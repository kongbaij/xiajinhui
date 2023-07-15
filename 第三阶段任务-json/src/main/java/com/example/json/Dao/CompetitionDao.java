package com.example.json.Dao;


import com.example.json.pojo.Competition;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CompetitionDao {
    private static Map<Integer, Competition> Sportmen = null;

    static {
        Sportmen = new HashMap<>();
        Sportmen.put(1001, new Competition(1001, "kong", "软件工程", "100m跑步比赛"));
        Sportmen.put(1002, new Competition(1002, "bai", "计算机科学与技术", "400m"));
        Sportmen.put(1003, new Competition(1003, "ming", "网络工程", "1000m"));
        Sportmen.put(1004, new Competition(1004, "hong", "通信工程", "跳高"));
        Sportmen.put(1005, new Competition(1005, "wan", "电子信息工程", "1500m"));
    }

    private static Integer idinit = 1006;

    public Collection<Competition> FindALl() {
        return Sportmen.values();
    }

    public  void save(Competition sport) {
        if (sport.getId() == null) {
            sport.setId(idinit++);
        }
        Sportmen.put(sport.getId(), sport);
    }

    public void edit(Integer id,Competition sport) {
        Sportmen.put(id,sport);
    }

    public void delete(Integer id) {
        Sportmen.remove(id);
    }
}
