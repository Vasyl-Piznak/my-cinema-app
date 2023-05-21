package cinema.config;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.service.UserService;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleDao roleDao;
    private final UserService userService;

    public DataInitializer(RoleDao roleDao, UserService userService) {
        this.roleDao = roleDao;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleDao.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleDao.add(userRole);
    }
}
