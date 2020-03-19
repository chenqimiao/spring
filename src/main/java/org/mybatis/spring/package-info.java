/**
 * Copyright 2010-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Contains core classes to build the MyBatis integration with Spring3.X.
 *
 *
 * \@MapperScan -> @Import(MapperScannerRegistrar.class) -> MapperScannerRegistrar#registerBeanDefinitions
 * -> Register MapperScannerConfigurer -> MapperScannerConfigurer#postProcessBeanDefinitionRegistry
 * -> ClassPathMapperScanner scanner = new ClassPathMapperScanner(registry) -> 为scanner注册自定义filter
 * -> scanner.scan -> ClassPathMapperScanner#doScan(java.lang.String...)
 * -> ClassPathMapperScanner$processBeanDefinitions(beanDefinitions);
 * -> definition.setBeanClass(this.mapperFactoryBeanClass);
 * -> MapperFactoryBean#getObject()
 * -> SqlSession.getMapper
 * -> 拿到Mapper接口的实现
 * -> mybatis自有流程..
 */
package org.mybatis.spring;
