fun stately(
    module: String,
    version: String = "1.1.7-a1"
): String = "co.touchlab:stately-$module:$version"

fun kable(
    artifact: String = "core",
    version: String = "0.6.0"
): String = "com.juul.kable:$artifact:$version"

fun exercise(
    artifact: String,
    version: String = "0.7.0"
): String = "com.juul.exercise:$artifact:$version"

fun material(
    version: String = "1.1.0"
) = "com.google.android.material:material:$version"

fun tuulbox(
    artifactId: String,
    version: String = "4.1.0"
) = "com.juul.tuulbox:$artifactId:$version"

object androidx {

    fun appcompat(
        version: String = "1.1.0"
    ) = "androidx.appcompat:appcompat:$version"

    fun activity(
        artifact: String,
        version: String = "1.1.0"
    ) = "androidx.activity:$artifact:$version"

    fun lifecycle(
        module: String,
        version: String = "2.2.0"
    ) = "androidx.lifecycle:lifecycle-$module:$version"

    fun recyclerview(
        version: String = "1.1.0"
    ) = "androidx.recyclerview:recyclerview:$version"
}
