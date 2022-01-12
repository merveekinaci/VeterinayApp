        ## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
        spring.datasource.url = jdbc:mysql://localhost:3306/followup?useSSL=false
        spring.datasource.username = root
        spring.datasource.password = password

        ## Hibernate Properties
        # The SQL dialect makes Hibernate generate better SQL for the chosen database
        spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

        # Hibernate ddl auto (create, create-drop, validate, update)
        spring.jpa.hibernate.ddl-auto = update

                spring.thymeleaf.cache = false

