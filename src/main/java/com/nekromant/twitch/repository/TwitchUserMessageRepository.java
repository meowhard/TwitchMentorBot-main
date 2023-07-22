package com.nekromant.twitch.repository;

import com.nekromant.twitch.model.TwitchUser;
import com.nekromant.twitch.model.TwitchUserMessage;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface TwitchUserMessageRepository extends CrudRepository<TwitchUserMessage, Long> {
    @Transactional
    void deleteAllByTwitchUser(TwitchUser twitchUser);

    List<TwitchUserMessage> findAllByTwitchUser(TwitchUser twitchUser);
}
