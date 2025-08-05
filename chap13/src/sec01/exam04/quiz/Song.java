package sec01.exam04.quiz;

import java.util.Objects;

public class Song {
	 private String name;
	 private String singer;
	

	public Song() {
		
	}
	
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}
	
	
		public String getName() {
		return name;
	}

	public String getSinger() {
		return singer;
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Song)) return false;
	        Song song = (Song) o;
	        return Objects.equals(name, song.name) &&
	               Objects.equals(singer, song.singer);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(name, singer);
	    }

	    @Override
	    public String toString() {
	        return "{제목=" + name + ", 가수=" + singer + "}";
	    }
	}
	

