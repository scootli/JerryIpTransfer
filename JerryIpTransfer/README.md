##JerryIpTransfer 

###描述

百词斩的程序员喜欢研究各种算法。百词斩的Jerry自己做了一个简单的IP变换算法，将一个IP地址转化为字符串。比如IP地址1.1.1.129：

第一步：转化为二进制：00000001000000010000000110000001

第二步：替换（0用a表示，1用b表示）：aaaaaaabaaaaaaabaaaaaaabbaaaaaab

第三步：将连续相同的字符合并：7a1b7a1b7a2b6a1b

第四步：减少长度，将数字1去掉：7ab7ab7a2b6ab。

现在给出一个Jerry的算法生成的字符串，请你来还原最初的IP地址。


输入：

1、输入为一行，含有a、b和数字的字符串

输出：

1、输出为一行，即最初的IP地址

Sample Input：

7ab7ab7a2b6ab

Sample Output：

1.1.1.129


###运行方式

项目是用maven进行管理的，如果你不关心项目管理方式，可以直接下载项目的bin目录中的JerryIpTransfer-1.0.jar文件，然后使用以下命令运行(需要提前安装jdk，最好使用linux平台,当然不是也没关系)
```
java -cp JerryIpTransfer-1.0.jar com.baicizhan.jerry.test.JerryIpTransfer
```
运行后输入要计算的字符串，然后回车即可
