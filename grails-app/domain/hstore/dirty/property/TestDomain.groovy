package hstore.dirty.property

import net.kaleidos.hibernate.usertype.HstoreMapType

class TestDomain {

    String prop1
    Map testAttributes

    static mapping = {
        testAttributes type: HstoreMapType
    }

    static constraints = {
    }
}
