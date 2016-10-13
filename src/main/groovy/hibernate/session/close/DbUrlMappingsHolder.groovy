package hibernate.session.close

import grails.web.mapping.UrlMappingInfo
import org.grails.web.mapping.DefaultUrlMappingsHolder

class DbUrlMappingsHolder extends DefaultUrlMappingsHolder {

    DbUrlMappingsHolder() {
        super([])
    }

    @Override
    public UrlMappingInfo[] matchAll(String uri, String httpMethod, String version) {
        DbUrlMapping dbUrlMapping = DbUrlMapping.createCriteria().get{
            eq 'uri', uri
        }

        return super.matchAll(uri, httpMethod, version)
    }
}
