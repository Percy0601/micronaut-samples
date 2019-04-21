/**
 * @Singleton
 *
 * Singleton scope indicates only one instance of the bean should exist
 *
 * @Context
 *
 * Context scope indicates that the bean should be created at the same time as the ApplicationContext (eager initialization)
 *
 * @Prototype
 *
 * Prototype scope indicates that a new instance of the bean is created each time it is injected
 *
 * @Infrastructure
 *
 * Infrastructure is a @Context scope stereotype that indicates the bean cannot be replaced
 *
 * @ThreadLocal
 *
 * @ThreadLocal scope is a custom scope that associates a bean per thread via a ThreadLocal
 *
 * @Refreshable
 *
 * @Refreshable scope is a custom scope that allows a bean’s state to be refreshed via the /refresh endpoint.
 *
 *
 *
 */
package io.micronaut.samples.ioc.scope;
