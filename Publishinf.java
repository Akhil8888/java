
public class Publishinf {


	  public static void main(String args[]){
	 
	  Literature ob=new Literature();
	  Fiction f=new Fiction();
	  ob.publisher();
	  ob.book();
	  f.fiction();
	  ob.literature();
	  System.out.println("---BOOK DETAILS---");

	  System.out.println("Name of Publisher    :"+ob.name);
	  System.out.println("Book Id              :"+ob.bookid);
	  System.out.println("Name of Book         :"+ob.book);
	  System.out.println("Fiction or Nonfiction:"+f.Fic);
	  System.out.println("Literature Type      :"+ob.lit);

	 
	 
	  }
}
