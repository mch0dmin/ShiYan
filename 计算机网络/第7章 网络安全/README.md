网络安全
========
##概述
###四类威胁
计算机网络上的通信面临以下的四种威胁（两大类：被动，和主动）：
- [x] 被动攻击
- 截获
- [x] 主动攻击
- 中断
- 篡改
- 伪造

>篡改和伪造的区别在于，伪造是在网络上传送不存在的伪造信息，而篡改是将已有信息进行篡改再传送。

####被动攻击
发生截获的时候，终点仍能收到正确的信息。而主动攻击则不然。
####主动攻击
主动攻击是上述几种方法的组合：
* 更改报文流
* 拒绝服务
* 伪造连接初始化

此外，还有一种主动攻击是**恶意程序**：
* 计算机病毒
* 计算机蠕虫
* 特洛伊木马
* 逻辑炸弹

###计算机安全的内容
1. 保密性
2. 安全协议的设计
3. 访问控制

##数字签名
数字签名必须保证实现三点功能：
* 报文鉴别
* 报文的完整性
* 不可否认

##安全协议
- [x] 网络层安全协议
* IPsec协议族
  * AH（鉴别首部）协议
  * ESP（封装安全有效载荷）协议
- [x] 运输层安全协议
* SSL（安全套接层）
* SET（安全电子交易）
- [x] 应用层安全协议
* PGP协议
* PEM协议

##链路加密和端到端加密
从网络传输的角度看，通常有两种不同的加密策略：
- 链路加密
- 端到端加密

##防火墙
防火墙位于因特网与内部网络之间。防火墙的目的是实施**访问控制策略**。