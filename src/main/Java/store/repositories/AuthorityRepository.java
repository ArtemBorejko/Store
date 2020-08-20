package store.repositories;

import store.entities.Authority;
import store.entities.enums.AuthorityType;

public interface AuthorityRepository {
    Authority findByName(AuthorityType type);
}
