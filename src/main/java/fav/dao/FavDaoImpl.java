package fav.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import fav.model.Fav;
import user.model.User;

@Repository("FavDao")
public class FavDaoImpl implements FavDao{

	@Override
	public void insert(Fav fav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Fav fav) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findbyVideo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Videos> findbyUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
