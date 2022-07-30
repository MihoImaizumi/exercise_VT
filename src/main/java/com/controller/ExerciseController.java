package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dto.QuestionsSearchRequest;
import com.entity.Questions;
import com.service.ExerciseService;

/**
 * 問題 Controller
 */
@Controller
public class ExerciseController {
	
  /**
   * 問題 Service
   */
  @Autowired
  ExerciseService ExerciseService;
//  /**
//   * ユーザー情報一覧画面を表示
//   * @param model Model
//   * @return ユーザー情報一覧画面のHTML
//   */
//  @RequestMapping(value = "/user/list", method = RequestMethod.GET)
//  public String displayList(Model model) {
//	List<Questions> userlist = QuestionsService.searchAll();
//    model.addAttribute("userlist", userlist);
//    return "user/list";
//  }


  /**
   * ユーザー情報検索
   * @param userSearchRequest リクエストデータ
   * @param model Model
   * @return ユーザー情報一覧画面
   */
  @RequestMapping(value = "/exercise", method = RequestMethod.GET)
//  public String search(@ModelAttribute QuestionsSearchRequest QuestionsSearchRequest, Model model) {
//	Questions questions = QuestionsService.search(QuestionsSearchRequest);
//	
//	questions.setCurriculumNo(1);
//	questions.setCurriculumName("カリキュラム名（仮）");
//	questions.setCorseNo(1);
//	questions.setCorseName("講座名（仮）");
//	
//	
//	model.addAttribute("questions", questions);
//    return "common";
//  }
  public String exercise(@ModelAttribute QuestionsSearchRequest uestionsSearchRequestt, Model model) {
	List<Questions> questions = ExerciseService.searchAll();
	
//	questions.setCurriculumNo(1);
//	questions.setCurriculumName("カリキュラム名（仮）");
//	questions.setCorseNo(1);
//	questions.setCorseName("講座名（仮）");
	
	System.out.println(questions.toArray().length);
	
	
	model.addAttribute("questions", questions);
	
    return "common";
  }
}