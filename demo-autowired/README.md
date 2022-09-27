##demo-autowired 项目说明
测试@Autowired注解用在List上的作用

结论：当@Autowired用于List<interface>，自动注入时会将该接口的实现类全部注入，如果只有一个实现类则会报错。