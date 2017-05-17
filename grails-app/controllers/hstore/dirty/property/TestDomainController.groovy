package hstore.dirty.property

class TestDomainController {

    def index() {
        TestDomain.all.each{
            println "id=${it.id} hstore=${it.testAttributes} isDirty=${it.isDirty()} dirtyPropertyNames=${it.dirtyPropertyNames}"
        }

        render 'see the console'
    }
}
