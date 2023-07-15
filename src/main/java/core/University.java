package core;

import com.google.gson.annotations.SerializedName;
import core.enums.StudyProfile;

import java.util.UUID;

public class University {
    @SerializedName("ID")
    private String id;
    @SerializedName("Full Name")
    private String fullName;
    @SerializedName("Short Name")
    private String shortName;
    @SerializedName("Year of Foundation")
    private int yearOfFoundation;
    @SerializedName("Study Profile")
    private StudyProfile mainProfile;

    public University() {
        this("UnNamed", "UNMD", 2023, StudyProfile.MULTIDISCIPLINARY);
    }

    public University(String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = UUID.randomUUID().toString();
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString() {
        return String.format("\nId university = %s\n" +
                "FullName of university : %s\n" +
                "ShortName of university : %s\n" +
                "Year of foundation : %d\n" +
                "Main study profile is %s", id, fullName, shortName, yearOfFoundation, mainProfile);
    }
}
