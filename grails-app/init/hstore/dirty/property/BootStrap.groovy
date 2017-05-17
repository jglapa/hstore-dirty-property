package hstore.dirty.property

class BootStrap {

    def init = { servletContext ->
        new TestDomain(prop1: 'notEmpty', testAttributes: [zz: 1, xx: 2]).save()
        new TestDomain(prop1: 'empty').save()
    }
    def destroy = {
    }
}
