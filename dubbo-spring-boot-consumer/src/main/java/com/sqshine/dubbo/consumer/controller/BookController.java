package com.sqshine.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sqshine.dubbo.api.domain.Book;
import com.sqshine.dubbo.api.service.IBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sqshine
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}")
    private IBookService bookService;

    @GetMapping
    public Book sayHello(@RequestParam String name) {
        return bookService.findBook(name);
    }

}