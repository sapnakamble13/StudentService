package com.app.socialnetwork.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component("friend")
@Scope("prototype")
@Entity
@Table(name = "FRIEND_MASTER")
public class Friend {
@Id
@Column(name = "FRIEND_ID")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long friendId;

@Column(name = "FRIEND_NAME", length = 50)
@NotEmpty(message = "Please Enter friend Name")
private String friendName;

@Column(name = "EMAIL", length = 70)
private String friendEmail;



@Column(name = "FRIEND_USERNAME", length = 50)
@NotEmpty(message = "Please Enter Name")
private String friendUserName;

@Column(name = "FRIEND_PASSWORD", length = 20)
private String friendPassword;



@Column(name = "STUDENT_PHONE", length = 20)
private Long friendPhone;



@Column(name = "FRIEND_ADDRESS", length = 50)
@NotEmpty(message = "Please Enter ADDRESS")
private String friendAddress;



public Long getFriendId() {
return friendId;
}



public void setFriendId(Long friendId) {
this.friendId = friendId;
}



public String getFriendName() {
return friendName;
}



public void setFriendName(String friendName) {
this.friendName = friendName;
}



public String getFriendEmail() {
return friendEmail;
}



public void setFriendEmail(String friendEmail) {
this.friendEmail = friendEmail;
}



public String getFriendUserName() {
return friendUserName;
}



public void setFriendUserName(String friendUserName) {
this.friendUserName = friendUserName;
}



public String getFriendPassword() {
return friendPassword;
}



public void setFriendPassword(String friendPassword) {
this.friendPassword = friendPassword;
}



public Long getFriendPhone() {
return friendPhone;
}



public void setFriendPhone(Long friendPhone) {
this.friendPhone = friendPhone;
}



public String getFriendAddress() {
return friendAddress;
}



public void setFriendAddress(String friendAddress) {
this.friendAddress = friendAddress;
}



@Override
public String toString() {
return "Friend [friendId=" + friendId + ", friendName=" + friendName + ", friendEmail=" + friendEmail
+ ", friendUserName=" + friendUserName + ", friendPassword=" + friendPassword + ", friendPhone="
+ friendPhone + ", friendAddress=" + friendAddress + "]";
}





}