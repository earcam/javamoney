/*
 * Copyright (c) 2012-2013, Credit Suisse
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * Neither the name of JSR-354 nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package javax.money.provider.impl;

import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.provider.CurrencyUnitProvider;

/**
 * Empty pseudo implementation for testing only.
 * @author Anatole Tresch
 *
 */
public class TestCurrencyUnitProvider implements CurrencyUnitProvider {
// TODO try mocking, could use mock framework for test code
	@Override
	public CurrencyUnit get(String namespace, String code) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit get(String namespace, String code, Long timestamp) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit[] getAll() {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit[] getAll(Long timstamp) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit[] getAll(String namespace, Long timestamp) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit[] getAll(String namespace) {
		// empty implementation
		return null;
	}

	@Override
	public boolean isAvailable(String namespace, String code) {
		// empty implementation
		return false;
	}

	@Override
	public boolean isAvailable(String namespace, String code, Long timestamp) {
		// empty implementation
		return false;
	}

	@Override
	public boolean isAvailable(String namespace, String code, Long start,
			Long end) {
		// empty implementation
		return false;
	}

	@Override
	public boolean isNamespaceAvailable(String namespace) {
		// empty impplementation
		return false;
	}

	@Override
	public String[] getNamespaces() {
		return new String[]{"Test only"};
	}

	@Override
	public CurrencyUnit[] getAll(Locale locale) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit[] getAll(Locale locale, Long timestamp) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit map(CurrencyUnit unit, String targetNamespace) {
		// empty implementation
		return null;
	}

	@Override
	public CurrencyUnit[] mapAll(CurrencyUnit[] units, String targetNamespace) {
		// empty implementation
		return null;
	}

	@Override
	public String getDefaultNamespace() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrencyUnit get(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrencyUnit get(String code, Long timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAvailable(String code) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvailable(String code, Long timestamp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAvailable(String code, Long start, Long end) {
		// TODO Auto-generated method stub
		return false;
	}

}
