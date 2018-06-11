/*
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Book
 * Author:   sqshine
 * Date:     2018/6/11 11:17
 * Description: ${DESCRIPTION}
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sqshine.dubbo.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author sqshine
 * @create 2018/6/11
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
public class Book implements Serializable {
    private static final long serialVersionUID = -5724156443645146494L;
    private Integer id;
    private String name;

}
