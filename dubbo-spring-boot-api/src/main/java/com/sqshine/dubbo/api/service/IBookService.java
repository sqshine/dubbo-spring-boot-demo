/*
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: IBookService
 * Author:   sqshine
 * Date:     2018/6/11 11:22
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sqshine.dubbo.api.service;

import com.sqshine.dubbo.api.domain.Book;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author sqshine
 * @create 2018/6/11
 * @since 1.0.0
 */
public interface IBookService {
    /**ØØ
     * 查询book
     */
    Book findBook(String name);
}
