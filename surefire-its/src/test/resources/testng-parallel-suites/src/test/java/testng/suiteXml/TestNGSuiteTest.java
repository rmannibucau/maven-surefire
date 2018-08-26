package testng.suiteXml;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.testng.annotations.Test;

import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author <a href="mailto:tibordigana@apache.org">Tibor Digana (tibor17)</a>
 * @since 2.19
 */
public class TestNGSuiteTest {
	private static final AtomicInteger counter = new AtomicInteger();

	@Test
	public void shouldRunAndPrintItself()
		throws Exception
	{

		synchronized ( System.out )
		{
			//System.out.println( "our test encoding = " + Charset.defaultCharset() );
			System.out.println( getClass().getSimpleName() + "#shouldRunAndPrintItself() "
                    + counter.incrementAndGet() + ".");
		}

		TimeUnit.SECONDS.sleep( 2 );
	}
}