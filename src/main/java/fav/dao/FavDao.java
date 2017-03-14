package fav.dao;

import java.util.List;

import fav.model.Fav;
import note.model.Note;
import user.model.User;
import videos.model.Videos;




public interface FavDao {
	
	void insert(Fav fav);
	
	void delete(Fav fav);
	
	List<User> findbyVideo();
	
	List<Videos> findbyUser();
	

}
