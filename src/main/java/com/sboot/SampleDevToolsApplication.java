/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.sboot.user.mapper*")
@SpringBootApplication
public class SampleDevToolsApplication {

	public static void main(String[] args) {
//		 System.setProperty("spring.devtools.restart.enabled", "false");
//		ApplicationArguments.properties里面也可以设置 ，设置完毕后，项目不会重启
		SpringApplication.run(SampleDevToolsApplication.class, args);
	}

}
