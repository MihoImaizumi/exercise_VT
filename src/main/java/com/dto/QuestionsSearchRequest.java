package com.dto;
import java.io.Serializable;

import lombok.Data;
/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class QuestionsSearchRequest  implements Serializable {
  /**
   * ID
   */
  private int id;
  /**
   * カリキュラム番号
   */
  private int curriculum_no;

  /**
   * カリキュラム名
   */
  private String curriculum_name;
  /**
   * 講座番号
   */
  private int corse_no;
  /**
   * 講座名
   */
  private String corse_name;
  /**
   * 問題文
   */
  private String question;
  /**
   * 解答
   */
  private String answer;
  /**
   * 解説
   */
  private String explanation;
}