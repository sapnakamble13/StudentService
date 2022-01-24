package com.app.socialnetwork.service;



import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.app.socialnetwork.entity.Friend;
import com.app.socialnetwork.entity.Student;
import com.app.socialnetwork.error.NoSuchFriendException;
import com.app.socialnetwork.error.StudentNotFoundException;

import java.util.List;



import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.app.socialnetwork.repository.FriendRepository;



@Service
public class FriendServiceImpl implements FriendService{
	
	
@Autowired
private FriendRepository repository;



@Override
public boolean addFriend(Friend friend) {
boolean result = false;
friend = repository.save(friend);
if(friend.getFriendId() > 0)
result = true;
return result;
}


/*
 * @Override public Friend findFriendById(int friendId)throws
 * NoSuchFriendException { if(repository.existsById(friendId)) {
 * 
 * } return repository.findById(friendId).get(); }
 */



@Override
public Friend findFriendByName(String friendName) {
return repository.readByFriendName(friendName);
}



/*
 * @Override public boolean removeFriendById(int friendId) {
 * if(repository.existsById(friendId)) { repository.deleteById(friendId);
 * 
 * } return true; }
 */
/*
 * @Transactional
 * 
 * @Override public boolean updateFriend(Friend friend) {
 * repository.updateFriend(friend.getFriendName(), friend.getFriendId()); return
 * true; }
 */



@Override
public List<Friend> findAllFriends() {
return repository.findAll();
}



@Override
public Friend saveStudent(Friend friend) {
	return repository.save(friend);
}



@Override
public List<Friend> findAllFriend() {
	return repository.findAll();
}



@Override
public void deleteStudentById(Long friendId) {
	// TODO Auto-generated method stub
	 repository.deleteById(friendId);;
}


/*
 * @Override public Friend updateStudent(int friendId, Friend friend) throws
 * NoSuchFriendException { Optional<Friend> fri1=repository.findById(friendId);
 * if(!fri1.isPresent()) { throw new NoSuchFriendException("Friend not found");
 * } Friend depDB = repository.findById(friendId).get();
 * 
 * if (Objects.nonNull(friend.getFriendName()) &&
 * !"".equalsIgnoreCase(friend.getFriendName())) {
 * depDB.setFriendName(friend.getFriendName()); }
 * 
 * if (Objects.nonNull(friend.getFriendEmail()) &&
 * !"".equalsIgnoreCase(friend.getFriendEmail())) {
 * depDB.setFriendEmail(friend.getFriendEmail()); }
 * 
 * if (Objects.nonNull(friend.getFriendAddress()) &&
 * !"".equalsIgnoreCase(friend.getFriendAddress())) {
 * depDB.setFriendAddress(friend.getFriendAddress()); }
 * 
 * if (Objects.nonNull(friend.getFriendPhone()) &&
 * !(null==friend.getFriendPhone())) {
 * depDB.setFriendPhone(friend.getFriendPhone()); }
 * 
 * if (Objects.nonNull(friend.getFriendUserName()) &&
 * !"".equalsIgnoreCase(friend.getFriendUserName())) {
 * depDB.setFriendUserName(friend.getFriendUserName()); }
 * 
 * if (Objects.nonNull(friend.getFriendPassword()) &&
 * !"".equalsIgnoreCase(friend.getFriendPassword()) ){
 * depDB.setFriendPassword(friend.getFriendPassword()); } return
 * repository.save(depDB); }
 */


@Override
public Friend findFriendById(Long friendId) throws NoSuchFriendException {
		
		
		//Student student =  studentRepository.findById(studentId).orElse(null);
//return repository.findById(friendId);

		Optional<Friend> friend=repository.findById(friendId);
		if(!friend.isPresent())
		{
			throw new NoSuchFriendException("friend not found");
		}
			return friend.get();
		}




@Override
public Friend updateStudent(Long friendId, Friend friend) throws NoSuchFriendException {
	Optional<Friend> fri1=repository.findById(friendId);
	if(!fri1.isPresent())
	{
		throw new NoSuchFriendException("Friend not found");
	}  
	     Friend depDB = repository.findByFriendId(friendId);

	        if (Objects.nonNull(friend.getFriendName())
	                && !"".equalsIgnoreCase(friend.getFriendName())) {
	            depDB.setFriendName(friend.getFriendName());
	        }

	        if (Objects.nonNull(friend.getFriendEmail())
	                && !"".equalsIgnoreCase(friend.getFriendEmail())) {
	            depDB.setFriendEmail(friend.getFriendEmail());
	        }

	        if (Objects.nonNull(friend.getFriendAddress())
	                && !"".equalsIgnoreCase(friend.getFriendAddress())) {
	            depDB.setFriendAddress(friend.getFriendAddress());
	        }
	        
	        if (Objects.nonNull(friend.getFriendPhone())
	        		 && !(null==friend.getFriendPhone())) {
	            depDB.setFriendPhone(friend.getFriendPhone());
	        }

	        if (Objects.nonNull(friend.getFriendUserName())
	                && !"".equalsIgnoreCase(friend.getFriendUserName())) {
	            depDB.setFriendUserName(friend.getFriendUserName());
	        }

	        if (Objects.nonNull(friend.getFriendPassword())
	                && !"".equalsIgnoreCase(friend.getFriendPassword()) ){
	            depDB.setFriendPassword(friend.getFriendPassword());
	        }
	        return repository.save(depDB);
}


@Override
public boolean removeFriendById(int friendId) throws NoSuchFriendException {
	// TODO Auto-generated method stub
	return false;
}





}