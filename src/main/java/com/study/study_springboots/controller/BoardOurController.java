package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// * Cast 
// - use bootstrap
// - 항목 : title, content,userName, date
// - CRUD : 
//   + list.jsp(/board) -> view.jsp(/board_our/view) -> list.jsp(/board_our/list)
//   + list.jsp(/board) -> form.jsp(/board_our/form) -> list.jsp(/board_our/save) with Post
//   + view.jsp(/board_our/view) -> edit.jsp(/board_our/edit) -> list.jsp(/board_our/save)
@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController {
    @RequestMapping(value = "/edit", method = RequestMethod.POST)  
    public String edit() {
        return "board_our/edit";
    }
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)  
    public String list() {
        return "board_our/list";
    }
    @RequestMapping(value = "/view", method = RequestMethod.GET)  
    public String view() {
        return "board_our/view";
    }
    @RequestMapping(value = "/form", method = RequestMethod.GET)    
    public String form() {
        return "board_our/form";
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)    
    public String save() {
        // insert biz
        return "board_our/list";
    }
}
