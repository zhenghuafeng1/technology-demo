package zhf.adapterPattern.service;

/**
 * @Autor zhenghf
 * @Date 2022/11/16
 * @ClassName BaseService
 * @Description
 * @Version 1.0
 **/
public abstract class BaseService {

//    @Autowired
//    protected DataSaveHandler dataSaveHandler;

    public abstract void init();

    public abstract String getNickName();

    public abstract void processor();

    public void register() {
//        String nickName = getNickName();
//        if (dataSaveHandler.getService(nickName) == null) {
//            dataSaveHandler.addService(nickName, this);
//        }
    }
}
