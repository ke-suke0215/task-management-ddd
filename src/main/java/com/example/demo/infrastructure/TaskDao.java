package com.example.demo.infrastructure;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.demo.domain.TaskStatus;

public class TaskDao {
	/* id */
	private Integer id;
	/* タスク名 */
	private String name;
	/* 状態 */
	private TaskStatus taskStatus;
	/* 期日 */
	private LocalDate deadline;
	/* 期日の変更回数 */
	private Integer updateDeadLineCount;
	/* 作成日時 */
	private LocalDateTime createdDateTime;

	public TaskDao(Integer id, String name, TaskStatus taskStatus, LocalDate deadline, Integer updateDeadLineCount,
			LocalDateTime createdDateTime) {
		super();
		this.id = id;
		this.name = name;
		this.taskStatus = taskStatus;
		this.deadline = deadline;
		this.updateDeadLineCount = updateDeadLineCount;
		this.createdDateTime = createdDateTime;
	}

	public Integer id() {
		return id;
	}

	public String name() {
		return name;
	}

	public TaskStatus taskStatus() {
		return taskStatus;
	}

	public LocalDate deadline() {
		return deadline;
	}

	public Integer updateDeadLineCount() {
		return updateDeadLineCount;
	}
	
	public LocalDateTime createdDateTime() {
		return createdDateTime;
	}
}
