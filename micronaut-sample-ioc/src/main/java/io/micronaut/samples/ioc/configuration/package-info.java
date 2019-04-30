/**
 * 顾名思义，当存在某个条件后才加载本
 *
 */
@Configuration
@Requires(beans = Configuration.class)
package io.micronaut.samples.ioc.configuration;

import io.micronaut.context.annotation.Configuration;
import io.micronaut.context.annotation.Requires;