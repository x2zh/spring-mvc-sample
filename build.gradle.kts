import org.apache.tools.ant.filters.ReplaceTokens

val buildProfile: String? by project

apply(from = "profile-${buildProfile ?: "dev"}.gradle.kts")


plugins {
    war
}


tasks {
    register("greeting") {
        val message: String by project.extra
        doLast {
            println(message)
            println(buildDir)
        }
    }


    processResources {
        filesMatching("application.properties") {
            filteringCharset = "UTF-8"
            filter(ReplaceTokens::class,
                    "tokens" to mapOf(
                            "username" to "zhangxiaoxiao",
                            "password" to "123456"
                    )
            )
        }
    }
}


repositories {
    mavenCentral()
}

dependencies {
    compile("org.mybatis", "mybatis", "3.5.0")
    compile("org.springframework", "spring-webmvc", "5.1.3.RELEASE")
    compile("org.springframework", "spring-jdbc", "5.1.4.RELEASE")
    compile("mysql", "mysql-connector-java", "8.0.14")
    compile("org.slf4j", "slf4j-api", "1.7.25")
    compile("org.mybatis.generator", "mybatis-generator-core", "1.3.7")
    compile("org.mybatis", "mybatis-spring", "2.0.0")
    compile("com.fasterxml.jackson.core", "jackson-databind", "2.9.8")
    compile("javax.validation", "validation-api", "2.0.1.Final")
    compile("org.hibernate.validator", "hibernate-validator", "6.0.14.Final")
    runtimeOnly("org.apache.logging.log4j", "log4j-slf4j-impl", "2.11.1")
    compileOnly("javax.servlet", "javax.servlet-api", "4.0.1")
}
