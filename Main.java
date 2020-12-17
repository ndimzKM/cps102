public class Main{
	public static void main(String[] args){
		Book book1 = new Book();
		book1.setTitle("The Magic Calabash");
		book1.setNumberOfPages(290);

		String titleOfBook = book1.getTitle();
		int totalPages = book1.getNumberOfPages();

		System.out.println("Book title: " + titleOfBook + ". Total Pages: " + totalPages);

		TextBook text = new TextBook();
		text.setTitle("The Magic Calabash");
		text.setNumberOfPages(290);
		text.setGradeLevel(12);

		String titleOfTextBook = text.getTitle();
		int totalTextPages = text.getNumberOfPages();
		int gradeLevel = text.getGradeLevel();

		System.out.println("Text Book title: " + titleOfTextBook + ". Total Pages: " + totalTextPages +  "Grade level: " + gradeLevel);

	}
}