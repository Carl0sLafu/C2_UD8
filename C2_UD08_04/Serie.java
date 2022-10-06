package C2_UD08_04;

public class Serie {
	
	private String title;
	private int seasons;
	private boolean isGived;
	private String gender;
	private String creator;
	
	public Serie() {
		
		setSeasons();
		setGived();
		setGender();
		
	}
	
	public Serie (String title, String creator) {
		
		this.title = title;
		setSeasons();
		setGived();
		setGender();
		this.creator = creator;
		
	}

	public Serie(String title, int seasons, boolean isGived, String gender, String creator) {
		
		this.title = title;
		this.seasons = seasons;
		this.isGived = isGived;
		this.gender = gender;
		this.creator = creator;
		
	}

	public void setSeasons() {
		
		this.seasons = 3;
		
	}

	public void setGived() {
		
		this.isGived = false;
		
	}

	public void setGender() {
		
		this.gender = "Comedia";
		
	}

	@Override
	public String toString() {
		return "Serie [title=" + title + ", seasons=" + seasons + ", isGived=" + isGived + ", gender=" + gender
				+ ", creator=" + creator + "]";
	}

}
