package cn.sjtu.springwebjpa.controller;

import cn.sjtu.springwebjpa.service.BookService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuan
 * @date 2019-05-10 15:51.
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private Gson gson;

    @RequestMapping("/allbook")
    public String getAllBook(){
        return gson.toJson(bookService.list());
    }
}
