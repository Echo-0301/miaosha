package com.example.demo.pojo;

public class CtripHotelComment {
    private Integer id;

    private String hotelId;

    private String hotelName;

    private String hotelEnName;

    private String city;

    private String commentHotelLevel;

    private String commentScore;

    private String commentItemScore;

    private String commentRecommend;

    private String userImpress;

    private String commentTotal;

    private String recommentNum;

    private String noRecomentNum;

    private String userName;

    private String userCommentScore;

    private String checkInType;

    private String checkInDate;

    private String roomName;

    private String commentTxt;

    private String commentTime;

    private String scrapeUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId == null ? null : hotelId.trim();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getHotelEnName() {
        return hotelEnName;
    }

    public void setHotelEnName(String hotelEnName) {
        this.hotelEnName = hotelEnName == null ? null : hotelEnName.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCommentHotelLevel() {
        return commentHotelLevel;
    }

    public void setCommentHotelLevel(String commentHotelLevel) {
        this.commentHotelLevel = commentHotelLevel == null ? null : commentHotelLevel.trim();
    }

    public String getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(String commentScore) {
        this.commentScore = commentScore == null ? null : commentScore.trim();
    }

    public String getCommentItemScore() {
        return commentItemScore;
    }

    public void setCommentItemScore(String commentItemScore) {
        this.commentItemScore = commentItemScore == null ? null : commentItemScore.trim();
    }

    public String getCommentRecommend() {
        return commentRecommend;
    }

    public void setCommentRecommend(String commentRecommend) {
        this.commentRecommend = commentRecommend == null ? null : commentRecommend.trim();
    }

    public String getUserImpress() {
        return userImpress;
    }

    public void setUserImpress(String userImpress) {
        this.userImpress = userImpress == null ? null : userImpress.trim();
    }

    public String getCommentTotal() {
        return commentTotal;
    }

    public void setCommentTotal(String commentTotal) {
        this.commentTotal = commentTotal == null ? null : commentTotal.trim();
    }

    public String getRecommentNum() {
        return recommentNum;
    }

    public void setRecommentNum(String recommentNum) {
        this.recommentNum = recommentNum == null ? null : recommentNum.trim();
    }

    public String getNoRecomentNum() {
        return noRecomentNum;
    }

    public void setNoRecomentNum(String noRecomentNum) {
        this.noRecomentNum = noRecomentNum == null ? null : noRecomentNum.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCommentScore() {
        return userCommentScore;
    }

    public void setUserCommentScore(String userCommentScore) {
        this.userCommentScore = userCommentScore == null ? null : userCommentScore.trim();
    }

    public String getCheckInType() {
        return checkInType;
    }

    public void setCheckInType(String checkInType) {
        this.checkInType = checkInType == null ? null : checkInType.trim();
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate == null ? null : checkInDate.trim();
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getCommentTxt() {
        return commentTxt;
    }

    public void setCommentTxt(String commentTxt) {
        this.commentTxt = commentTxt == null ? null : commentTxt.trim();
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime == null ? null : commentTime.trim();
    }

    public String getScrapeUrl() {
        return scrapeUrl;
    }

    public void setScrapeUrl(String scrapeUrl) {
        this.scrapeUrl = scrapeUrl == null ? null : scrapeUrl.trim();
    }
}