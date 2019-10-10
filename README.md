"# spring-security-oauth2-ad-sso" 

基于Spring Boot2、Active Directory域认证、Spring Security OAuth2 实现的单点登录（SSO）系统

demo包含了一个SSO服务端（sso-server）和两个客户端（client-user、client-order）

我的环境是IDEA、Maven、jdk1.8

一些理论知识：

Spring Security：基于 Spring实现的 Web系统的认证和权限模块

OAuth2：一个关于授权（authorization）的开放网络标准

单点登录 (SSO)：在多个应用系统中，用户只需要登录一次就可以访问所有相互信任的应用系统

JWT：在网络应用间传递信息的一种基于 JSON的开放标准（(RFC 7519)，用于作为JSON对象在不同系统之间进行安全地信息传输。主要使用场景一般是用来在 身份提供者和服务提供者间传递被认证的用户身份信息

Spring Security OAuth2实现单点登录SSO参考 https://www.cnblogs.com/cjsblog/p/10548022.html

AD域服务器搭建参考 https://www.jczhijia.com/CourseChaptersList/1721.html 的第一个视频（6分钟，可在线观看）

Spring Security使用AD域做登录认证参考 https://blog.csdn.net/zhuyongru/article/details/83143177
