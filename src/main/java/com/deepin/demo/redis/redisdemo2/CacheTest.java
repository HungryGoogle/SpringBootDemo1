package com.deepin.demo.redis.redisdemo2;


import com.deepin.demo.redis.redisdemo2.support.BookQry;
import com.deepin.demo.util.log.logUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=CacheApplication.class)
public class CacheTest {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookService2 bookService2;

    @Test
    public void queryBookCacheable(){
        logUtil.info("leeTest------> 1 queryBookCacheable : " + bookService.queryBookCacheable("1"));
    }

    @Test
    public void updateBook(){
        String id = "1";
        String name = "name_lee";

//        // 清空缓存
//        bookService.clearBook1All();
//
//        // 执行查询，并缓存数据
//        logUtil.info(bookService.queryBookCacheable(id));
//        // 从缓存中获取数据
//        logUtil.info(bookService.queryBookCacheable(id));
        // 从缓存中清空刚刚存储的值

        logUtil.info("leeTest------> 1 updateBook : " + bookService.queryBookCacheable(id));
        bookService.updateBook(id, name);

        // 现在缓存没有值，执行方法获取值，并缓存数据
        logUtil.info("leeTest------> 2 updateBook : " + bookService.queryBookCacheable(id));
    }

    @Test
    public void queryBookCacheableByBookQry(){
        BookQry qry = new BookQry();
        qry.setId("1");
        logUtil.info("leeTest------> 2 queryBookCacheableByBookQry : " + bookService.queryBookCacheableByBookQry(qry));
    }


//
//    @Test
//    public void queryBookCacheable_2(){
//        logUtil.info(bookService.queryBookCacheable_2("2"));
//    }
//
//    @Test
//    public void queryBookCacheableUseMyKeyGenerator(){
//        logUtil.info(bookService.queryBookCacheableUseMyKeyGenerator("3"));
//    }
//
//    @Test
//    public void clearBook1All(){
//        bookService.clearBook1All();
//    }
//
//    @Test
//    public void updateBook(){
//        String id = "2";
//        String name = "name_" + Calendar.getInstance().getTimeInMillis();
//        // 清空缓存
//        bookService.clearBook1All();
//        // 执行查询，并缓存数据
//        logUtil.info(bookService.queryBookCacheable(id));
//        // 从缓存中获取数据
//        logUtil.info(bookService.queryBookCacheable(id));
//        // 从缓存中清空刚刚存储的值
//        bookService.updateBook(id, name);
//        // 现在缓存没有值，执行方法获取值，并缓存数据
//        logUtil.info(bookService.queryBookCacheable(id));
//    }
//
//    @Test
//    public void queryBookCachePut(){
//        // 清空缓存
//        bookService.clearBook1All();
//        // 执行@CachePut注解方法，每次执行都不从缓存中获取，执行成功后会使用新的返回的替换缓存中的值
//        logUtil.info(bookService.queryBookCachePut("1"));
//        logUtil.info(bookService.queryBookCachePut("1"));
//        // 执行@Cacheable注解方法，此时从缓存中获取值
//        logUtil.info(bookService.queryBookCacheable("1"));
//    }
//


//
//    @Test
//    public void queryBookCacheableWithCondition(){
//        logUtil.info(bookService.queryBookCacheableWithCondition("3"));
//        logUtil.info(bookService.queryBookCacheableWithCondition("3"));
//        logUtil.info(bookService.queryBookCacheableWithCondition("2"));
//        logUtil.info(bookService.queryBookCacheableWithCondition("2"));
//    }
//
//    @Test
//    public void queryBookCacheableWithUnless(){
//        logUtil.info(bookService.queryBookCacheableWithUnless("3"));
//        logUtil.info(bookService.queryBookCacheableWithUnless("3"));
////        logUtil.info(bookService.queryBookCacheableWithUnless("2"));
////        logUtil.info(bookService.queryBookCacheableWithUnless("2"));
//    }
//
//    @Test
//    public void bookService2_queryBookCacheable(){
//        logUtil.info(bookService2.queryBookCacheable("1"));
//    }
//
//    @Test
//    public void bookService2_queryBookCacheable2(){
//        logUtil.info(bookService2.queryBookCacheable2("2"));
//    }
}