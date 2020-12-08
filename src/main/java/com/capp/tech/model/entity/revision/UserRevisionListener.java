package com.capp.tech.model.entity.revision;

import org.hibernate.envers.RevisionListener;


public class UserRevisionListener implements RevisionListener {


    @Override
    public void newRevision(Object revisionEntity) {
        MyRevisionEntity myRevisionEntity = (MyRevisionEntity) revisionEntity;
        myRevisionEntity.setUserName("currentUser");
    }
}
