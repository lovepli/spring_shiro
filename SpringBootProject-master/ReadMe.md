github地址：https://github.com/firefoxer1992/SpringBootProject

一.收获        <br>
1.熟悉一下SpringBoot;    <br>
2.加强SSM的理解    <br>
3.加强单元测试的运用，断言,配合SpringBoot的注解    <br>
4.了解shiro、redis等框架     <br>
5.过滤器filter进行url过滤，设置访问权限     <br>
6.熟悉mysql的外键、join、union   <br>
7.Controller层最好不要写太多逻辑。业务逻辑全放在Service才比较规范  <br>
8.SpringBoot不太建议使用xml配置。尽可能在application.yml或者用java代码配置。 <br>


一.待添加功能：    <br>
1.Shiro框架,，MD5加密 (完成)    <br>
2.后端模板freemaker、Thymeleaf等 (完成 )   <br>
3.集成redis缓存。(完成)  ehcache缓存   <br>
4.添加mybatis的日志.(完成)   <br>
5.Druid数据库连接池    <br>
6.mybatis-plus。 <br>


二.遇到的障碍：    <br>
1.Mybatis找不到生成的Mapper对应的Class文件，需要配置Mybatis属性    <br>
2.Spring依赖注入，@Autowired和@Resource的细节 .@Autowired按类型注入，@Resource按名称注入   <br>
3.网址中Url的参数，取的值是等号后面的内容，包括引号在内。    <br>
比如，http://localhost:8080/user?name=admin    <br>
4.@Configuration和@Bean    <br>
通过注解配置注入Bean    <br>
5.html如何获取后台的数据?   <br>
可以通过模板引擎获取.比如ThymeLeaf、Freemaker、jsp。设置Model、Request等对象的attribute.在页面通过el表达式获取    <br>
6.注意@RestController和@Controller的区别，@RestController返回字符串时会直接显示文本，而不是跳转到对应的页面     <br>
7.UserRealm中注入service对象报空指针?    <br>
原因是在ShiroConfig中，没有注入realm  <br>
8.shiro过滤器filterChainDefinitionMap，具体如何配置？   <br>
ShiroConfiguration中注入过滤链。根据url过滤   <br>
9.shiro的注解@RequiresRoles("admin")不起作用，非管理员怎么也可以登陆？   <br>
需要在ShiroConfiguration中添加支持aop、代理的bean   <br>
10.Ehcache缓存注解不起作用.(折腾好久还是没解决。)  <br>
可能是缓存起作用了。只是忘了打log而已。问题定位不准确。 <br>
11.账号：admin   密码：123456  <br>