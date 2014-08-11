/**
 * Copyright (C) 2010-2014 Leon Blakey <lord.quackstar at gmail.com>
 *
 * This file is part of PircBotX.
 *
 * PircBotX is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * PircBotX is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * PircBotX. If not, see <http://www.gnu.org/licenses/>.
 */
package org.pircbotx.hooks.types;

import org.pircbotx.PircBotX;
import org.pircbotx.UserHostmask;
import org.pircbotx.User;

/**
 *
 * @author Leon
 */
public interface GenericUserEvent<T extends PircBotX> extends GenericEvent<T> {
	/**
	 * The source user hostmask of the event.
	 *
	 * @return The hostmask of the user
	 */
	public UserHostmask getUserHostmask();

	/**
	 * The source user of the event.
	 *
	 * @return The user or null if the hostmask doesn't match a user
	 */
	public User getUser();
}
