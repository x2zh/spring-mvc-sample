
plugins {
    war
}

repositories {
    mavenCentral()
}

dependencies {
    /*dubbo依赖*/

    // 通过telnet调用dubbo提供的服务时需要此依赖
    compile("com.alibaba:fastjson:1.2.56")
    // dubbo依赖
    compile("org.apache.dubbo:dubbo:2.7.0") {
        // spring-mvc会引入spring context依赖
        exclude("org.springframework")
    }

    // zookeeper依赖，需要和注册中心的版本相同
    compile("org.apache.zookeeper:zookeeper:3.4.12")

    //zookeeper客户端，dubbo使用zookeeper作为注册中心时需要使用此依赖
    compile("org.apache.curator:curator-recipes:4.0.1") {
        // dubbo会引入netty依赖所以在这里排除
        exclude("io.netty", "netty")
        // 这里引入的版本可能和注册中心的版本不一致，所以排除，然后单独引入
        exclude("org.apache.zookeeper", "zookeeper")
    }

    compile("com.lmax:disruptor:3.4.2")
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
    compile("javax.inject:javax.inject:1")
    runtimeOnly("org.apache.logging.log4j", "log4j-slf4j-impl", "2.11.1")
    compileOnly("javax.servlet", "javax.servlet-api", "4.0.1")
}
