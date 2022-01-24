package com.app.socialnetwork.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.app.socialnetwork.entity.Friend;
@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> { @Modifying
	/*
	 * @Query(
	 * value="Update Friend s set s.friendName = :name where s.friendId = :id")
	 * public int updateFriend(@Param("name") String friendName, @Param("id") Long
	 * friendId);
	 */
@Query(value="Select s from Friend s where s.friendName = :name")
public Friend readByFriendName(@Param("name") String friendName);
@Query(value="Select s from Friend s where s.friendId = :id")
public Friend findByFriendId(@Param("id")Long friendId);
}
