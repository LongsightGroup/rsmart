package com.rsmart.oauth.hibernate;

import com.rsmart.oauth.api.BaseOAuthProvider;
import com.rsmart.oauth.api.OAuthProvider;

/**
 * User: duffy
 * Date: Jan 21, 2010
 * Time: 9:16:05 AM
 */
public class OAuthProviderHibernateImpl
    extends BaseOAuthProvider
    implements OAuthProvider
{
    private String authUrl;
    private String tokenUrl;

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public boolean equals(Object o)
    {
        if (!OAuthProviderHibernateImpl.class.isAssignableFrom(o.getClass()))
            return false;

        final OAuthProviderHibernateImpl
            that = (OAuthProviderHibernateImpl)o;

        return (this == that || (uuid == null && that.uuid == null) || uuid.equals(that.uuid));
    }

    public int hashCode()
    {
        if (uuid == null)
            return super.hashCode();

        return uuid.hashCode();
    }
}