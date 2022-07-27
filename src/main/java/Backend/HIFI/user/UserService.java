package Backend.HIFI.user;


import Backend.HIFI.user.follow.FollowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final FollowRepository followRepository;

    public void userFollow(User follower, User following) {
        followRepository.save(follower, following);
    }
}
