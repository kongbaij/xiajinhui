package com.example.task.Controller;

import com.example.task.Dao.SportDao;
import com.example.task.pojo.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class sportnan {

    @Autowired
    SportDao sport;

    @GetMapping("/task")
    public String task(Model model) {
        Collection<Sport> sports = sport.FindALl();
        model.addAttribute("sps", sports);
        return "task";
    }

    @GetMapping("/add1")
    public String toAdd(Model model) {
        Collection<Sport> sports = sport.FindALl();
        model.addAttribute("sps", sports);
        return "add";
    }

    @PostMapping("/add1")
    public String Add(Sport sport1) {
        SportDao.save(sport1);
        return "redirect:/task";
    }

    @GetMapping("/edit1/{id}")
    public String toEdit(@PathVariable("id") Integer id, Model model) {
        Sport sport1 = sport.getById(id);
        model.addAttribute("sps", sport1);
        return "edit";
    }

    @PutMapping("/edit2")
    public String edit(Sport sport2) {
        sport.edit(sport2);
        return "redirect:/task";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        sport.delete(id);
        return "redirect:/task";
    }
}
