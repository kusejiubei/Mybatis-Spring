package com.isea533.mybatis.mapper;

import com.isea533.mybatis.model.Country;
import com.isea533.mybatis.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CountryMapper extends MyMapper<Country> {

    public List<Country> getPageSizeZeroelectbyId(@Param("var1") Country country, String id);
    List<Country> selectByCountryQueryModel(@Param("countryname")String countryname,@Param("countrycode")String countrycode,@Param("id") String id );
    List<Country> selectById(String id );

}