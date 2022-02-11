# 工程简介
背景介绍：
spring alibaba +spring gateway+dubbo 2.7+nacos 2.0.3
目前项目处于架构阶段，团队商量后续开发人员不需要在每个接口都写到controller层，
直接通过
类似
https://www.cnblogs.com/zlt2000/p/13201326.html
第二种方式去实现。
但是问题来了，在写了海量接口的情况下，如何利用swagger去管理这些文档呢？我做了以下调研
1.https://github.com/Sayi/swagger-dubbo
2.https://github.com/Sayi/swagger-dubbo/issues/44
1,2比较相似，通过编译生成controller，然后
3.https://github.com/apache/dubbo-spi-extensions/blob/2.7.x/dubbo-api-docs/README_ch.md
更像是微服务本地联调
4.
https://github.com/swagger-api/swagger-core/wiki/Swagger-Core-RESTEasy-2.X-Project-Setup-1.5
https://dubbo.apache.org/zh/blog/2019/07/26/%E5%9C%A8-dubbo-%E4%B8%AD%E4%BD%BF%E7%94%A8-rest/
这个方向没问题，目前没找到成熟的框架。