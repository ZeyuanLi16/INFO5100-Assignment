package assignment.solution4;



/* 2.
 * Implement Class MusicAlbum which encapsulated a music Album, each album has a 
 * string variable albumTitle and a String variable singer representing the name of
 * singer, double variable price representing the price of album, objects of this 
 * class are Initialized using all of its instance variables.
 * The class has accessor methods for all its Variables and a mutator method for price.
 */
public class MusicAlbum {

	class Album{
		String albumTitle;
		String singer;
		double price;
		
		Album(String albumTitle,String singer,double price){
			this.albumTitle=albumTitle;
			this.singer=singer;
			this.price=price;
		}
		
		public String getAlbumTitle(){
			return this.albumTitle;
		}
		public String getSinger(){
			return this.singer;
		}
		public double getPrice(){
			return this.price;
		}		
		public void setPrice(double price){
			this.price=price;
		}
	}
	
	

}
