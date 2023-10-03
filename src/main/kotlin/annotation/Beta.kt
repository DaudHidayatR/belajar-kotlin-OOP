package annotation
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.FIELD,

)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Beta()

class Example(@field:Beta val firstName:String, @get:Beta val lastName:String)