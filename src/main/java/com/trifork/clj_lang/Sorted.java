/**
 *   Copyright (c) Rich Hickey. All rights reserved.
 *   The use and distribution terms for this software are covered by the
 *   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 *   which can be found in the file epl-v10.html at the root of this distribution.
 *   By using this software in any fashion, you are agreeing to be bound by
 * 	 the terms of this license.
 *   You must not remove this notice, or any other, from this software.
 **/

/* rich Apr 15, 2008 */

package com.trifork.clj_lang;

import java.util.Comparator;

public interface Sorted<K>{
Comparator<K> comparator();

Object entryKey(Object entry);

ISeq<K> seq(boolean ascending);

ISeq<K> seqFrom(K key, boolean ascending);
}
