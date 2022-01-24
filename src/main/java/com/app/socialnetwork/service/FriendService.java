package com.app.socialnetwork.service;



import java.util.List;



import com.app.socialnetwork.entity.Friend;
import com.app.socialnetwork.entity.Student;
import com.app.socialnetwork.error.NoSuchFriendException;



public interface FriendService {
public boolean addFriend(Friend friend);
public Friend findFriendByName(String friendName);
public boolean removeFriendById(int friendId)throws NoSuchFriendException ;
public List<Friend> findAllFriends();
public Friend saveStudent(Friend friend);
public List<Friend> findAllFriend();
public void deleteStudentById(Long friendId);
public Friend updateStudent(Long friendId, Friend friend)throws NoSuchFriendException;
public Friend findFriendById(Long friendId)throws NoSuchFriendException;
//Friend findFriendById(int friendId) throws NoSuchFriendException;
}