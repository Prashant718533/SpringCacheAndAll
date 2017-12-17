package springBootMAin.Hello;

public class topicssss {

	private Long id;
	private String task;
	private boolean completed;

	public topicssss(Long id, String task, boolean completed) {
		this.id = id;
		this.task = task;
		this.completed = completed;
	}

	public topicssss(String task, boolean completed) {
		this(null, task, completed);
	}

	public topicssss() {
	}

	public Long getId() {
		return id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
