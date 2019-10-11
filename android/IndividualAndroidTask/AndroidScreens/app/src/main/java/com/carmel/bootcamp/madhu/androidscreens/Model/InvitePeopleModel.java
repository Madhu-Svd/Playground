package com.carmel.bootcamp.madhu.androidscreens.Model;

import java.io.Serializable;

public class InvitePeopleModel implements Serializable {
    String invtePeopleName;
    String invitePeopleDescription;

    public String getInvtePeopleName() {
        return invtePeopleName;
    }

    public void setInvtePeopleName(String invtePeopleName) {
        this.invtePeopleName = invtePeopleName;
    }

    public String getInvitePeopleDescription() {
        return invitePeopleDescription;
    }

    public void setInvitePeopleDescription(String invitePeopleDescription) {
        this.invitePeopleDescription = invitePeopleDescription;
    }
}
