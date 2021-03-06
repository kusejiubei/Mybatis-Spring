package com.isea533.mybatis.service.impl;

import com.github.pagehelper.PageHelper;
import com.isea533.mybatis.mapper.CountryMapper;
import com.isea533.mybatis.model.Country;
import com.isea533.mybatis.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;

/**
 * @author liuzh_3nofxnp
 * @since 2015-09-19 17:17
 */
@Service("countryService")
public class CountryServiceImpl extends BaseService<Country> implements CountryService {
    @Autowired
    protected CountryMapper countryMapper;



    @Override
    public List<Country> selectByCountry(Country country, int page, int rows) {
        Example example = new Example(Country.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtil.isNotEmpty(country.getCountryname())) {
            criteria.andLike("countryname", "%" + country.getCountryname() + "%");
        }
        if (StringUtil.isNotEmpty(country.getCountrycode())) {
            criteria.andLike("countrycode", "%" + country.getCountrycode() + "%");
        }
        if (country.getId() != null) {
            criteria.andEqualTo("id", country.getId());
        }
        //分页查询
        PageHelper.startPage(page, rows);
        return selectByExample(example);
    }

    @Override
    public List<Country> selectByCountryQueryModel(String countryname, String countrycode, String id) {
        return countryMapper.selectByCountryQueryModel(countryname,countrycode,id);
    }

    @Override
    public List<Country> selectById(String id) {
        return countryMapper.selectById(id);
    }

    @Override
    public Country saveCountry(String countryname, String countrycode) {
        Country country = new Country();
        country.setCountrycode(countrycode);
        country.setCountryname(countryname);
        countryMapper.saveCountry(country);
        return country;
    }

    @Override
    public Integer updateCountry(Country country) {
        return countryMapper.updateCountry(country);
    }


}
