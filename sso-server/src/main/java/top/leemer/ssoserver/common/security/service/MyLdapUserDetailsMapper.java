package top.leemer.ssoserver.common.security.service;

import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.ldap.userdetails.LdapUserDetailsMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 用户授权
 *
 * @author LEEMER
 * Create Date: 2019-09-20
 */
@Component
public class MyLdapUserDetailsMapper extends LdapUserDetailsMapper {

    @Override
    public UserDetails mapUserFromContext(DirContextOperations ctx, String username, Collection<? extends GrantedAuthority> authorities) {
        // 给用户自动创建角色并赋予权限（多个权限时以,分隔）
        return super.mapUserFromContext(ctx, username,
                AuthorityUtils.commaSeparatedStringToAuthorityList(
                        "ADMIN,USER,ORDER"
                ));
    }
}
