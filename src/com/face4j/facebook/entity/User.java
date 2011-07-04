package com.face4j.facebook.entity;

import java.io.Serializable;

import org.apache.commons.httpclient.NameValuePair;

import com.face4j.facebook.Facebook;
import com.face4j.facebook.entity.connection.Accounts;
import com.face4j.facebook.entity.connection.Activities;
import com.face4j.facebook.entity.connection.Albums;
import com.face4j.facebook.entity.connection.Books;
import com.face4j.facebook.entity.connection.Checkins;
import com.face4j.facebook.entity.connection.Events;
import com.face4j.facebook.entity.connection.Feed;
import com.face4j.facebook.entity.connection.FriendLists;
import com.face4j.facebook.entity.connection.Friends;
import com.face4j.facebook.entity.connection.Groups;
import com.face4j.facebook.entity.connection.Home;
import com.face4j.facebook.entity.connection.Inbox;
import com.face4j.facebook.entity.connection.Interests;
import com.face4j.facebook.entity.connection.Likes;
import com.face4j.facebook.entity.connection.Links;
import com.face4j.facebook.entity.connection.Movies;
import com.face4j.facebook.entity.connection.Music;
import com.face4j.facebook.entity.connection.Notes;
import com.face4j.facebook.entity.connection.Outbox;
import com.face4j.facebook.entity.connection.Photos;
import com.face4j.facebook.entity.connection.Pokes;
import com.face4j.facebook.entity.connection.Posts;
import com.face4j.facebook.entity.connection.Statuses;
import com.face4j.facebook.entity.connection.Television;
import com.face4j.facebook.entity.connection.Updates;
import com.face4j.facebook.entity.connection.Videos;
import com.face4j.facebook.enums.ConnectionType;
import com.face4j.facebook.enums.PictureType;
import com.face4j.facebook.exception.FacebookException;
import com.face4j.facebook.util.Constants;
import com.face4j.facebook.util.URLMaker;

/**
 * A user profile as represented in the Graph API.
 * 
 * Real-Time Subscriptions The User object supports Real-Time Updates for all fields except the
 * verified property.
 * 
 * The User object supports Real-Time Updates for the following connections: feed, friends, activities,
 * interests, music, books, movies, television, likes, checkins.
 * 
 * @author nischal
 * 
 */
public class User implements Serializable {

	private static final long serialVersionUID = -7351804744720611823L;

	private String id;

	private String firstName;

	private String middleName;

	private String lastName;

	private String name;

	private String gender;

	private String locale;

	private Language[] languages;

	private String link;

	private String username;

	private String thirdPartyId;

	private Long timezone;

	private String updatedTime;

	private Boolean verified;

	private String bio;

	private String[] interestedIn;

	private Location location;

	private String political;

	private String quotes;

	private String relationshipStatus;

	private String religion;

	private GenericEntity SignificantOther;

	private VideoUploadLimit videoUploadLimits;

	private String birthday;

	private Work[] work;

	private Education[] education;

	private String email;

	private String website;

	private Hometown hometown;

	/**
	 * The user's Facebook ID
	 * 
	 * PERMISSION: No access_token required
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The user's first name PERMISSION: No access_token required
	 */
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * The user's last name PERMISSION: No access_token required
	 */
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * The user's full name PERMISSION: No access_token required
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The URL of the profile for the user on Facebook
	 * 
	 * PERMISSION: No access_token required
	 */
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * The user's birthday. Format is MM/dd/yyyy . Can also be MM/dd (facebook let's users decide
	 * whether they want to display the date or no). Users can also opt to keep their birthday
	 * private. In this case, even if you have access to a users birthday, you will not be able to
	 * access it.
	 * 
	 * PERMISSION: user_birthday or friends_birthday
	 */
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * The proxied or contact email address granted by the user
	 * 
	 * PERMISSION: email
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * A link to the user's personal website
	 * 
	 * PERMISSION: user_website or friends_website
	 */
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	/**
	 * The user's hometown
	 * 
	 * PERMISSION: user_hometown or friends_hometown
	 * 
	 * @return
	 */
	public Hometown getHometown() {
		return hometown;
	}

	public void setHometown(Hometown hometown) {
		this.hometown = hometown;
	}

	/**
	 * A list of the work history from the user's profile
	 * 
	 * PERMISSION: user_work_history or friends_work_history
	 */
	public Work[] getWork() {
		return work;
	}

	public void setWork(Work[] work) {
		this.work = work;
	}

	/**
	 * A list of the education history from the user's profile
	 * 
	 * PERMISSION: user_education_history or friends_education_history
	 */
	public Education[] getEducation() {
		return education;
	}

	public void setEducation(Education[] education) {
		this.education = education;
	}

	/**
	 * Returns the default image profile pic url of a user PERMISSION:
	 * 
	 * @return
	 */
	public String getPictureURL() {
		return URLMaker.getImageURL(this.id);
	}

	/**
	 * The user's middle name PERMISSION:
	 * 
	 * @return
	 */
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * The user's gender: female or male
	 * 
	 * PERMISSION: No access_token required
	 * 
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * The user's locale
	 * 
	 * PERMISSION: No access_token required
	 * 
	 * @return
	 */
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * The user's languages
	 * 
	 * PERMISSION: user_likes
	 * 
	 * @return
	 */
	public Language[] getLanguages() {
		return languages;
	}

	public void setLanguages(Language[] languages) {
		this.languages = languages;
	}

	/**
	 * The user's Facebook username
	 * 
	 * PERMISSION: No access_token required
	 * 
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * An anonymous, but unique identifier for the user; only returned if specifically requested via
	 * the fields URL parameter
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getThirdPartyId() {
		return thirdPartyId;
	}

	public void setThirdPartyId(String thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	/**
	 * The user's timezone offset from UTC
	 * 
	 * PERMISSION: Available only for the current user
	 * 
	 * @return
	 */
	public Long getTimezone() {
		return timezone;
	}

	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}

	/**
	 * The last time the user's profile was updated; changes to the languages, link, timezone,
	 * verified, interested_in, favorite_athletes, favorite_teams, and video_upload_limits are not not
	 * reflected in this value
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * The user's account verification status, either true or false (see below) A user is considered
	 * verified if she takes any of the following actions:
	 * <ul>
	 * <li>Registers for mobile</li>
	 * <li>Confirms her account via SMS</li>
	 * <li>Enters a valid credit card</li>
	 * </ul>
	 * 
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public Boolean getVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	/**
	 * The user's biography
	 * 
	 * PERMISSION: user_about_me or friends_about_me
	 * 
	 * @return
	 */
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * The genders the user is interested in
	 * 
	 * PERMISSION: user_relationship_details or friends_relationship_details
	 * 
	 * @return
	 */
	public String[] getInterestedIn() {
		return interestedIn;
	}

	public void setInterestedIn(String[] interestedIn) {
		this.interestedIn = interestedIn;
	}

	/**
	 * The user's current city
	 * 
	 * PERMISSION: user_location or friends_location
	 * 
	 * @return
	 */
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	/**
	 * The user's political view
	 * 
	 * PERMISSION: user_religion_politics or friends_religion_politics
	 * 
	 * @return
	 */
	public String getPolitical() {
		return political;
	}

	public void setPolitical(String political) {
		this.political = political;
	}

	/**
	 * The user's favorite quotes
	 * 
	 * PERMISSION: user_about_me or friends_about_me
	 * 
	 * @return
	 */
	public String getQuotes() {
		return quotes;
	}

	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}

	/**
	 * The user's relationship status: Single, In a relationship, Engaged, Married, It's complicated,
	 * In an open relationship, Widowed, Separated, Divorced, In a civil union, In a domestic
	 * partnership
	 * 
	 * PERMISSION: user_relationships or friends_relationships
	 * 
	 * @return
	 */
	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	/**
	 * The user's religion
	 * 
	 * PERMISSION: user_religion_politics or friends_religion_politics
	 * 
	 * @return
	 */
	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	/**
	 * The user's significant other
	 * 
	 * PERMISSION: user_relationship_details or friends_relationship_details
	 * 
	 * @return
	 */
	public GenericEntity getSignificantOther() {
		return SignificantOther;
	}

	public void setSignificantOther(GenericEntity significantOther) {
		SignificantOther = significantOther;
	}

	/**
	 * The size of the video file and the length of the video that a user can upload; only returned if
	 * specifically requested via the fields URL parameter
	 * PERMISSION: Requires access_token
	 * 
	 * @return
	 */
	public VideoUploadLimit getVideoUploadLimits() {
		return videoUploadLimits;
	}

	public void setVideoUploadLimits(VideoUploadLimit videoUploadLimits) {
		this.videoUploadLimits = videoUploadLimits;
	}

	/**
	 * The Facebook apps and pages owned by the current user
	 * 
	 * PERMISSION: If manage_pages permission has been granted, yields access_tokens that can be used
	 * to query the Graph API on behalf of the app/page; manage_pages required for all access to this
	 * field after September 22, 2011
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Accounts accounts(Facebook facebook) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.ACCOUNTS, Accounts.class, null);
	}

	/**
	 * The activities listed on the user's profile
	 * PERMISSION: user_activities or friends_activities
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Activities activities(Facebook facebook) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.ACTIVITIES, Activities.class, null);
	}

	/**
	 * The photo albums this user has created
	 * PERMISSION: user_photos or friends_photos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Albums albums(Facebook facebook) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.ALBUMS, Albums.class, null);
	}

	//TODO: Connections apprequests
	
	/**
	 * The books listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 *  
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Books books(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.BOOKS, Books.class, null);
	}
	
	/**
	 * The places that the user has checked-into
	 * PERMISSION: user_checkins or friends_checkins
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Checkins checkins(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.CHECKINS, Checkins.class, null);
	}

	/**
	 * The events this user is attending
	 * PERMISSION: user_events or friends_events
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Events events(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.EVENTS, Events.class, null);
	}
	
	/**
	 * The user's wall
	 * PERMISSION: Requires access_token or read_stream to see non-public posts
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Feed feed(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FEED, Feed.class, null);
	}
	
	/**
	 * The user's friend lists
	 * PERMISSION: read_friendlists
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public FriendLists friendLists(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FRIENDLISTS, FriendLists.class, null);
	}
	
	/**
	 * The user's friends
	 * PERMISSION: Requires access_token
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Friends friends(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.FRIENDS, Friends.class, null);
	}
	
	/**
	 * The Groups that the user belongs to
	 * PERMISSION: user_groups or friends_groups
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Groups groups(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.GROUPS, Groups.class, null);
	}
	
	/**
	 * The user's news feed
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Home home(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.HOME, Home.class, null);
	}
	
	/**
	 * The Threads in this user's inbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Inbox inbox(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.INBOX, Inbox.class, null);
	}
	
	/**
	 * The interests listed on the user's profile
	 * PERMISSION: user_interests or friends_interests
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Interests interests(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.INTERESTS, Interests.class, null);
	}
	
	/**
	 * All the pages this user has liked
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Likes likes(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.LIKES, Likes.class, null);
	}
	
	/**
	 * The user's posted links
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Links links(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.LINKS, Links.class, null);
	}
	
	/**
	 * The movies listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Movies movies(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.MOVIES, Movies.class, null);
	}
	
	/**
	 * The music listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Music music(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.MUSIC, Music.class, null);
	}
	
	/**
	 * The user's notes
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Notes notes(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.NOTES, Notes.class, null);
	}
	
	/**
	 * The messages in this user's outbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Outbox outbox(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.OUTBOX, Outbox.class, null);
	}
	
	/**
	 * Returns the permission of the user whose auth code is present in the "facebook" object
	 * PERMISSION: None 
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public PermissionCheck permissions(Facebook facebook) throws FacebookException {
		PermissionCheckData permissionCheckData = facebook.getConnections("me", ConnectionType.PERMISSIONS,
				PermissionCheckData.class, null);
		PermissionCheck permissionCheck = null;

		if (permissionCheckData != null && permissionCheckData.getPermissions() != null
				&& permissionCheckData.getPermissions().size() > 0) {
			permissionCheck = permissionCheckData.getPermissions().get(0);
		}

		return permissionCheck;
	}
	
	/**
	 * Photos the user (or friend) is tagged in
	 * PERMISSION: user_photo_video_tags or friends_photo_video_tags
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Photos photos(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.PHOTOS, Photos.class, null);
	}
	
	/**
	 * The user's profile picture
	 * PERMISSION: No access_token required
	 * 
	 * @param facebook
	 * @param pictureType
	 * @return string representing URL of the user's profile picture (use PictureType = square | small | normal | large to request a different photo)
	 * @throws FacebookException
	 */
	public String picture(Facebook facebook, PictureType pictureType) throws FacebookException{
		
			String url = Constants.FACEBOOK_GRAPH_URL + "/" + this.id + "/" + ConnectionType.PICTURE.getType();
			
			if(pictureType!=null){
				url += "?"+Constants.PARAM_PICTURE_TYPE+"="+pictureType.getType();
			}
		
			return url;
	}
	
	/**
	 * TODO: The user's pokes
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
/*	public Pokes pokes(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.POKES, Pokes.class, null);
	}*/
	
	/**
	 * The user's own posts
	 * PERMISSION: Any valid access_token or read_stream to see non-public posts
	 * 
	 * @param facebook
	 * @return Posts that contains list of Post objects along with pagination for obtaining next and previous posts
	 * @throws FacebookException
	 */
	public Posts posts(Facebook facebook) throws FacebookException {
		return facebook.getConnections(this.id, ConnectionType.POSTS, Posts.class, null);
	}
	
	/**
	 * The user's status updates
	 * PERMISSION: read_stream
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Statuses statuses(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.STATUSES, Statuses.class, null);
	}

	/**
	 * The television listed on the user's profile
	 * PERMISSION: user_likes or friends_likes
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Television television(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.TELEVISION, Television.class, null);
	}
	
	/**
	 * The updates in this user's inbox
	 * PERMISSION: read_mailbox
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Updates updates(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.UPDATES, Updates.class, null);
	}
	
	/**
	 * The videos this user has been tagged in
	 * PERMISSION: user_videos or friends_videos
	 * 
	 * @param facebook
	 * @return
	 * @throws FacebookException
	 */
	public Videos videos(Facebook facebook) throws FacebookException{
		return facebook.getConnections(this.id, ConnectionType.VIDEOS, Videos.class, null);
	}
	 
}