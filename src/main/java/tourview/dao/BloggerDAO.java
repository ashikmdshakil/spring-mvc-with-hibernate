package tourview.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tourview.entity.Blogger;

@Service
public class BloggerDAO {
	@Autowired
	private SessionFactory hSession;
	@Transactional
	public void saveBloggers(Blogger blogger) {
		Session session = hSession.getCurrentSession();
		session.save(blogger);
	}

}
