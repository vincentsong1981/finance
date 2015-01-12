/**
 * Copyright 2014 Welab, Inc. All rights reserved.
 * WELAB PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.wolaidai.ws.jrocket2.persistence.mapper;

import com.wolaidai.ws.jrocket2.persistence.Profile;

/**
 * @author <a href="mailto:spacewen@wolaidai.com">spacewen</a>
 */
public interface ProfileMapper
{
	Profile getProfileByUser(Integer id);
    void insertProfile(Profile profile);
    void updateProfile(Profile profile);
    void deleteProfile(Profile profile);
}
