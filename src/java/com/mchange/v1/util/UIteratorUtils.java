/*
 * Distributed as part of mchange-commonslib v.0.2
 *
 * Copyright (C) 2010 Machinery For Change, Inc.
 *
 * Author: Steve Waldman <swaldman@mchange.com>
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 2.1, as 
 * published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this software; see the file LICENSE.  If not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307, USA.
 */


package com.mchange.v1.util;

import java.util.Collection;
import java.util.Iterator;

public class UIteratorUtils
{
    public static void addToCollection(Collection c, UIterator uii) throws Exception
    {
	while (uii.hasNext())
	    c.add( uii.next() );
    }

    public static UIterator uiteratorFromIterator(final Iterator ii)
    {
	return new UIterator()
	    {
		public boolean hasNext()
		{ return ii.hasNext(); }

		public Object  next()
		{ return ii.next(); }

		public void    remove()
		{ ii.remove(); }

		public void close()
		{}
	    };
    }
}
