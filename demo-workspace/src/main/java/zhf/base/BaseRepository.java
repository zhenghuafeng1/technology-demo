package zhf.base;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Autor zhenghf
 * @Date 2022/10/18
 * @ClassName BaseRepository
 * @Description
 * @Version 1.0
 **/
public class BaseRepository<T> {
    private CommonMapper<T>  commonMapper;

    public BaseRepository(CommonMapper<T> commonMapper) {
        this.commonMapper = commonMapper;
    }
    public List<T> select(T entity) {
        return this.commonMapper.select(entity);
    }

    public List<T> selectByExample(Object o) {
        return this.commonMapper.selectByExample(o);
    }

    public T selectOne(T entity) {
        return this.commonMapper.selectOne(entity);
    }

    public T selectOneByExample(Object o) {
        return this.commonMapper.selectOneByExample(o);
    }

    public List<T> selectAll() {
        return this.commonMapper.selectAll();
    }

    public int selectCountByExample(Object o) {
        return this.commonMapper.selectCountByExample(o);
    }

    public T selectByPrimaryKey(Object key) {
        return this.commonMapper.selectByPrimaryKey(key);
    }

    public int updateByPrimaryKey(T entity) {
        return this.commonMapper.updateByPrimaryKey(entity);
    }

    public int updateByPrimaryKeySelective(T entity) {
        return this.commonMapper.updateByPrimaryKeySelective(entity);
    }

    public int insert(T entity) {
        return this.commonMapper.insert(entity);
    }

    public int insertSelective(T entity) {
        return this.commonMapper.insertSelective(entity);
    }

    public int insertList(List<T> list) {
        return this.commonMapper.insertList(list);
    }

    public int updateByExample(T entity, Example example) {
        return this.commonMapper.updateByExample(entity, example);
    }

    public int updateByExampleSelective(T entity, Example example) {
        return this.commonMapper.updateByExampleSelective(entity, example);
    }

    public List<T> select(Example example) {
        return this.commonMapper.selectByExample(example);
    }

    public int deleteByExample(Example example) {
        return this.commonMapper.deleteByExample(example);
    }

    public int delete(T entity) {
        return this.commonMapper.delete(entity);
    }

    public int deleteByPrimaryKey(Object entity) {
        return this.commonMapper.deleteByPrimaryKey(entity);
    }
}
