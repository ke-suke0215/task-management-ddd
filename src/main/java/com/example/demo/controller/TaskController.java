package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Task;

@RestController
@RequestMapping("/api/task")
public class TaskController {

	/**
	 * タスクを全件取得する.
	 * 
	 * @return タスクの一覧
	 */
	@GetMapping("/getAll")
	public Task getAll() {
		System.out.println("全てのタスクを取得");
		return null;
	}

	/**
	 * タスクを新規作成する.
	 * 
	 * @param name     タスク名
	 * @param deadline タスクの期日
	 */
	@PostMapping("/create")
	public void create(@RequestParam("name") String name,
			@RequestParam("deadline") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate deadline) {

	}

}
