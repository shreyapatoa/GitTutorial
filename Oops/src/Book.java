import com.lti.emp.Member;

public class Book {
	public String title;
	 public int mbr;

	public Book() {

	}

	public Book(String title, int mbr) {
		
		this.title = title;
		
	}

public void status()
{
if(mbr==null){
System.out.println(title+"is book is not issued");
}
else
	System.out.println(title+"book is issued to "+ mbr.getName());
}

public String getTitle()
{
	return title;
	}
public void issueBook(Member mbr)
{
	this.mbr=mbr;
	mbr.setBook(this);
	}
public void returnBook(Member mbr)
{
	this.mbr=mbr;
	mbr.setBook(NULL);
	}
}
}
