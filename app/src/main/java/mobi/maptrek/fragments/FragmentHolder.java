/*
 * Copyright 2018 Andrey Novikov
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package mobi.maptrek.fragments;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;

public interface FragmentHolder {
    FloatingActionButton enableActionButton();

    void disableActionButton();

    FloatingActionButton enableListActionButton();

    void disableListActionButton();

    void addBackClickListener(OnBackPressedListener listener);

    void removeBackClickListener(OnBackPressedListener listener);

    void popCurrent();

    void popAll();

    CoordinatorLayout getCoordinatorLayout();

    String getStatsString();
}
