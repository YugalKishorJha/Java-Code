package model;

public class Song implements Comparable<Song> {

	private String name;
	private int releaseYear;
	private String artist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public int compareTo(Song s) {
		return this.artist.compareTo(s.artist);
	}
	
	/*
	 * to reverse sorting we have two options 
	 * 
	 * multiply by -1    ||   return -(this.artist.compareTo(s.artist));
	 * 
	 * reverse the comparision
	 * 
	 * @Override
	public int compareTo(Song s) {
		return s.artist.compareTo(this.artist);
	}
	 *  
	 * */

	public Song(String name, int releaseYear, String artist) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", releaseYear=" + releaseYear + ", artist=" + artist + "]";
	}

}
