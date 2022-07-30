package com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Questions;
import com.repository.ExerciseMapper;
/**
 * ユーザー情報 Service
 */
@Service
public class ExerciseService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private ExerciseMapper ExerciseMapper;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public List<Questions> searchAll() {
    	List<Questions> result = ExerciseMapper.searchAll();
    	
    	
    	System.out.println(result);
    	
    	return result;
    }
}