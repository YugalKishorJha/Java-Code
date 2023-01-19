package model;

import java.util.Comparator;

public class SongComparator implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
