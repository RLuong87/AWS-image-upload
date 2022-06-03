package com.richluong.awsimageupload.datastore;

import com.richluong.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("22dc4102-872d-45fb-8b71-cf8801394e97"), "alyluong", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("261e4c14-54ba-4923-9364-e6a394bc736f"), "carolc", null));

    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
