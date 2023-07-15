package com.example.json.Controller;


import com.example.json.Dao.CompetitionDao;
import com.example.json.pojo.Competition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ComController {

    @Autowired
    CompetitionDao dao;

    @GetMapping("/task")
    public Collection<Competition> All()
    {
        return dao.FindALl();
    }
    @PostMapping("/task")
    public Competition add(Competition competition)
    {
        dao.save(competition);
        return competition;
    }

    @PutMapping("/task/{id}")
    public Competition edit(@PathVariable("id")Integer id,Competition competition)
    {
        dao.edit(id,competition);
        return competition;
    }

    @DeleteMapping("/task/{id}")
    public Competition delete(@PathVariable("id")Integer id,Competition competition)
    {
        dao.delete(id);
        return competition;
    }


}
