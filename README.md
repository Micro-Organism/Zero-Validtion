# Zero-Validation
Zero-Validation

# 1. 概述
## 1.1. 背景
Bean Validation 是一个运行时的数据验证框架，在验证之后验证的错误信息会被马上返回。java 在2009年的 JAVAEE 6 中发布了JSR303以及javax下的validation包内容。<br />
这项工作的主要目标是为java应用程序开发人员提供 基于java对象的 约束（constraints）声明 和 对约束的验证工具（validator），以及约束元数据存储库和查询API。<br />
但是该内容并没有具体的实现， Hibernate-Validator框架 提供了 JSR 303 规范中所有内置 constraint 的实现，除此之外还有一些附加的 constraint。
# 2. 功能

# 3. 使用

# 4. 其他
## 4.1. 注意事项
1. 最高使用的版本如下：
   - Spring Boot 2.2.13.RELEASE
   - Spring Cloud Hoxton.SR12
2. 如果高于以上 spring 框架版本，则无法使用 validate 的验证
3. 后续更新看是否能升级到 spring boot 2.3 或者 3.x 以上版本

# 5. 参考
## 5.1. 基本参考
1. [(翻译) 在Spring Boot 使用Bean Validation完全指南](https://www.cnblogs.com/gocode/p/bean-validation-with-spring-boot.html)
2. [Spring Boot集成validation实现参数校验功能](http://www.liuhaihua.cn/archives/710602.html)