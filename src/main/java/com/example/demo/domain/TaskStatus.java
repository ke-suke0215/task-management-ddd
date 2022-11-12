package com.example.demo.domain;

/**
 * タスクの状態の定義.
 * @author isodakeisuke
 *
 */
public enum TaskStatus {
	NOT_STARTED(0),	// 未着手
	PROGRESS(0),	// 作業中
	FINISHED(0);	// 完了
	
	private Integer id;
	
	/**
	 * コンストラクタ.
	 */
	private TaskStatus(Integer id) {
		this.id = id;
	}
	
	/**
	 * 対応する値の取得.
	 * @return タスクID
	 */
	public Integer id() {
		return id;
	}
}
