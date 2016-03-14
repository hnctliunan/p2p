package com.common.datasource;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSourceSet {
	DataSourceServer value() default DataSourceServer.Master;
}