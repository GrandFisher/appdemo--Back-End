package cn.sjtu.springwebjpa.service.impl;

import cn.sjtu.springwebjpa.dao.BookRepo;
import cn.sjtu.springwebjpa.dto.Book;
import cn.sjtu.springwebjpa.entity.BookEntity;
import cn.sjtu.springwebjpa.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuan
 * @date 2019-05-10 14:51.
 */
@Service
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private BookRepo repo;


    public List<Book> list() {
        List<BookEntity> bookEntities= repo.findAll();
        List<Book> res= new ArrayList<>();
        for (BookEntity e : bookEntities){
            res.add(mapper.map(e,Book.class));
        }
        return res;
    }
}
