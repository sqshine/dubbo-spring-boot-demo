/*
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BookService
 * Author:   sqshine
 * Date:     2018/6/11 11:41
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sqshine.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sqshine.dubbo.api.domain.Book;
import com.sqshine.dubbo.api.service.IBookService;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author sqshine
 * @create 2018/6/11
 * @since 1.0.0
 */
@Service(
        version = "1.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class BookService implements IBookService {
    @Override
    public Book findBook(String name) {
        return new Book(1, name);
    }
}
