package com.repository;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.entity.Questions;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface ExerciseMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */	
	List<Questions> searchAll();

    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */	
	List<Questions> getAllAnswers();
}

