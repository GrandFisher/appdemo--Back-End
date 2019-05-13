package cn.sjtu.springwebjpa.dao;

import cn.sjtu.springwebjpa.dto.Book;
import cn.sjtu.springwebjpa.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xuan
 * @date 2019-05-09 20:54.
 */

public interface BookRepo extends JpaRepository<BookEntity, Integer>{

    List<BookEntity> findAll();

}
