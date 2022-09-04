package pojo;

public class Education {

	public String _id;
	public String school;
	public String degree;
	public String fieldofstudy;
	public String from;
	public String current;
	public String to;
	public String description;

	public Education(String _id, String school, String degree, String fieldofstudy, String from, String current,
			String to, String description) {

		this._id = _id;
		this.school = school;
		this.degree = degree;
		this.fieldofstudy = fieldofstudy;
		this.from = from;
		this.current = current;
		this.to = to;
		this.description = description;
	}
}
