dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"//"com.mysql.jdbc.Driver"
	 //dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
    username = "sa"
    password = ""
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

// environment specific settings
/*environments {
	development {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost/sec_treasurer?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "pato"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:mysql://localhost/sec_treasurer_prod?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "pato"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:mysql://localhost/sec_treasurer_prod?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "pato"
		}
	}
}*/
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
          "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:prodDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
            pooled = true
            properties {
               maxActive = -1
               minEvictableIdleTimeMillis=1800000
               timeBetweenEvictionRunsMillis=1800000
               numTestsPerEvictionRun=3
               testOnBorrow=true
               testWhileIdle=true
               testOnReturn=true
               validationQuery="SELECT 1"
            }
        }
    }
}
