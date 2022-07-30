package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 問題 Entity
 */
@Entity
@Data
@Table(name = "questions")
public class Questions {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * カリキュラム番号
     */
    @Column(name = "curriculum_no")
    private int curriculum_no;

    /**
     * カリキュラム名
     */
    @Column(name = "curriculum_name")
    private String curriculum_name;
    /**
     * 講座番号
     */
    @Column(name = "corse_no")
    private int corse_no;
    /**
     * 講座名
     */
    @Column(name = "corse_name")
    private String corse_name;
    /**
     * 問題文
     */
    @Column(name = "question")
    private String question;
    /**
     * 解答
     */
    @Column(name = "answer")
    private String answer;
    /**
     * 解説文
     */
    @Column(name = "explanation")
    private String explanation;   
}