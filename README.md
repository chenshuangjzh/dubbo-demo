# dubbo-demo
dubbo官方最简单示例程序
##运行方式：
###第一种：
  1. 启动service_provider模块中DemoServiceImpl的main方法，即启动服务提供端
  2. 启动service-consumber模块中Consumer的main方法，即启动服务消费端，看到控制台打印出“Helloword”表示运行成功
###第二种：
  1. 分别将服务提供段和服务消费段通过Eclipse打包成jar
  2. 在cmd环境中依次运行命令java -jar dubbo-demo-provider.jar和java -jar dubbo-demo-consumer.jar即可执行成功
