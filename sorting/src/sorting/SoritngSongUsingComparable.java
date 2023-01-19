package sorting;

import java.util.ArrayList;
import java.util.Collections;

import model.Song;

public class SoritngSongUsingComparable {

	  

	public static void main(String[] args) {
		
		ArrayList<Song> als= new ArrayList<>();
		
		als.add(new Song("AllStarsCloser",2018,"SZA,Kendrik Lamar" ));
		als.add(new Song("CountingStars",2013,"one Republic" ));
		als.add(new Song("FeelGood",2017,"Felix Jahen" ));
		als.add(new Song("Jag ghoomaya",2017,"Rahet Fateh Ali Khan" ));
		
		
		System.out.println("Before Sorting");
		System.out.println(als);
		
		System.out.println("After Sorting");
		Collections.sort(als);
		System.out.println(als);

	}

}
