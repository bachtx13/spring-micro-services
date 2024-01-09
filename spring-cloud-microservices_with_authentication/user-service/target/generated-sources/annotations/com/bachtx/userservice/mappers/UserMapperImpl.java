package com.bachtx.userservice.mappers;

import com.bachtx.userservice.dto.response.UserResponse;
import com.bachtx.userservice.entities.User;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-08T11:15:55+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.9 (JetBrains s.r.o.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UUID id = null;
        String username = null;
        String password = null;

        id = user.getId();
        username = user.getUsername();
        password = user.getPassword();

        UserResponse userResponse = new UserResponse( id, username, password );

        return userResponse;
    }

    @Override
    public List<UserResponse> userListToUserResponseList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResponse> list = new ArrayList<UserResponse>( userList.size() );
        for ( User user : userList ) {
            list.add( userToUserResponse( user ) );
        }

        return list;
    }
}
