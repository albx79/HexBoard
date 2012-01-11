/*
   Copyright (C) 2012 Matthew Trullinger

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public License
    as published by the Free Software Foundation; either version
    3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package net.ridiculousx.hexboard;

public class HexBoardActivity extends android.app.Activity
{
	@Override
	public void onCreate( android.os.Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		android.widget.TextView tv = new android.widget.TextView( this );
		tv.setText( "To enable HexBoard:\n\n1. go to \"Language & keyboard\" settings and enable \"HexBoard\". if it's not there, you have to restart your device and repeat this step.\n\n2. go to a text input box, long press it, choose \"Input method\", choose \"HexBoard\".\n\n3. type away :)\n\n\nTo change options like color or key layout, long press the RIGHT \"A/@\" key." );
		setContentView( tv );
	}
}
