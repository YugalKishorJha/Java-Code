package sorting;

import java.util.*;
import java.util.Collections;

import model.Song;
import model.SongComparator;

public class SoritngUsingComparator {

	public static void main(String[] args) {

		List<Song> als1 = new ArrayList<>();

		als1.add(new Song("AllStarsCloser", 2018, "SZA,Kendrik Lamar"));
		als1.add(new Song("CountingStars", 2013, "one Republic"));
		als1.add(new Song("FeelGood", 2017, "Felix Jahen"));
		als1.add(new Song("Jag ghoomaya", 2017, "Rahet Fateh Ali Khan"));
		
		
		Collections.sort(als1,new SongComparator());
		System.out.println(als1);
	}

}
