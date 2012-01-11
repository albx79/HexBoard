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

﻿package net.ridiculousx.hexboard;

public class CKeyboardView extends android.view.View
{
	android.graphics.Bitmap[] ColoredTextureList = new android.graphics.Bitmap[28];

	public final int VibrateDurationMS = 30;

	public final int EPortraitLayout_Proximity = 0;
	public final int EPortraitLayout_QWERTY = 1;

	public final int EColor_Navy = 0;
	public final int EColor_Pink = 1;
	public final int EColor_Red = 2;
	public final int EColor_Green = 3;
	public final int EColor_Blue = 4;
	public final int EColor_Gray = 5;

	public final int ETexture_NONE = 0;
	public final int ETexture_keyboard_portrait = 1;
	public final int ETexture_keyboard_landscape = 2;
	public final int ETexture_hl_bottom_left = 3;
	public final int ETexture_hl_bottom_left_in = 4;
	public final int ETexture_hl_bottom_right = 5;
	public final int ETexture_hl_bottom_right_in = 6;
	public final int ETexture_hl_left = 7;
	public final int ETexture_hl_left_out = 8;
	public final int ETexture_hl_normal = 9;
	public final int ETexture_hl_right = 10;
	public final int ETexture_hl_right_out = 11;
	public final int ETexture_hl_space = 12;
	public final int ETexture_hl_top_left = 13;
	public final int ETexture_hl_top_right = 14;
	public final int ETexture_gl_bottom_left = 15;
	public final int ETexture_gl_bottom_left_in = 16;
	public final int ETexture_gl_bottom_right = 17;
	public final int ETexture_gl_bottom_right_in = 18;
	public final int ETexture_gl_left = 19;
	public final int ETexture_gl_left_out = 20;
	public final int ETexture_gl_normal = 21;
	public final int ETexture_gl_right = 22;
	public final int ETexture_gl_right_out = 23;
	public final int ETexture_gl_space = 24;
	public final int ETexture_gl_top_left = 25;
	public final int ETexture_gl_top_right = 26;
	public final int ETexture_more = 27;
	public final int ETexture__count__ = 28;

	public final int EKeyCode_Navy = android.view.KeyEvent.getMaxKeyCode() + 1;
	public final int EKeyCode_Pink = android.view.KeyEvent.getMaxKeyCode() + 2;
	public final int EKeyCode_Red = android.view.KeyEvent.getMaxKeyCode() + 3;
	public final int EKeyCode_Green = android.view.KeyEvent.getMaxKeyCode() + 4;
	public final int EKeyCode_Blue = android.view.KeyEvent.getMaxKeyCode() + 5;
	public final int EKeyCode_Gray = android.view.KeyEvent.getMaxKeyCode() + 6;

	public final int EKeyCode_PortraitLayout_Proximity = android.view.KeyEvent.getMaxKeyCode() + 17;
	public final int EKeyCode_PortraitLayout_QWERTY = android.view.KeyEvent.getMaxKeyCode() + 18;

	public final int EKeyCode_Vibrate_Off = android.view.KeyEvent.getMaxKeyCode() + 24;
	public final int EKeyCode_Vibrate_On = android.view.KeyEvent.getMaxKeyCode() + 25;

	public final int EKeyCode_Beep_Off = android.view.KeyEvent.getMaxKeyCode() + 26;
	public final int EKeyCode_Beep_On = android.view.KeyEvent.getMaxKeyCode() + 27;

	public static final int EKeysetList_Alpha = 0;
	public static final int EKeysetList_Symbol = 1;
	public static final int EKeysetList_Number = 2;

	public int GetTextureResourceID( int ETexture, int EColor )
	{
		switch ( EColor )
		{
			case EColor_Navy:
				return GetTextureResourceID_Navy( ETexture );

			case EColor_Pink:
				return GetTextureResourceID_Pink( ETexture );

			case EColor_Red:
				return GetTextureResourceID_Red( ETexture );

			case EColor_Green:
				return GetTextureResourceID_Green( ETexture );

			case EColor_Blue:
				return GetTextureResourceID_Blue( ETexture );

			case EColor_Gray:
				return GetTextureResourceID_Gray( ETexture );
		}

		return 0;
	}

	private int GetTextureResourceID_Navy( int ETexture )
	{
		switch ( ETexture )
		{
			case ETexture_keyboard_portrait:
				return R.drawable.keyboard_portrait;
			case ETexture_keyboard_landscape:
				return R.drawable.keyboard_landscape;

			case ETexture_more:
				return R.drawable.more;

			case ETexture_hl_bottom_left:
				return R.drawable.hl_bottom_left;
			case ETexture_hl_bottom_left_in:
				return R.drawable.hl_bottom_left_in;
			case ETexture_hl_bottom_right:
				return R.drawable.hl_bottom_right;
			case ETexture_hl_bottom_right_in:
				return R.drawable.hl_bottom_right_in;
			case ETexture_hl_left:
				return R.drawable.hl_left;
			case ETexture_hl_left_out:
				return R.drawable.hl_left_out;
			case ETexture_hl_normal:
				return R.drawable.hl_normal;
			case ETexture_hl_right:
				return R.drawable.hl_right;
			case ETexture_hl_right_out:
				return R.drawable.hl_right_out;
			case ETexture_hl_space:
				return R.drawable.hl_space;
			case ETexture_hl_top_left:
				return R.drawable.hl_top_left;
			case ETexture_hl_top_right:
				return R.drawable.hl_top_right;

			case ETexture_gl_bottom_left:
				return R.drawable.gl_bottom_left;
			case ETexture_gl_bottom_left_in:
				return R.drawable.gl_bottom_left_in;
			case ETexture_gl_bottom_right:
				return R.drawable.gl_bottom_right;
			case ETexture_gl_bottom_right_in:
				return R.drawable.gl_bottom_right_in;
			case ETexture_gl_left:
				return R.drawable.gl_left;
			case ETexture_gl_left_out:
				return R.drawable.gl_left_out;
			case ETexture_gl_normal:
				return R.drawable.gl_normal;
			case ETexture_gl_right:
				return R.drawable.gl_right;
			case ETexture_gl_right_out:
				return R.drawable.gl_right_out;
			case ETexture_gl_space:
				return R.drawable.gl_space;
			case ETexture_gl_top_left:
				return R.drawable.gl_top_left;
			case ETexture_gl_top_right:
				return R.drawable.gl_top_right;
		}
		return 0;
	}

	private int GetTextureResourceID_Pink( int ETexture )
	{
		switch ( ETexture )
		{
			case ETexture_keyboard_portrait:
				return R.drawable.keyboard_portrait_pink;
			case ETexture_keyboard_landscape:
				return R.drawable.keyboard_landscape_pink;

			case ETexture_more:
				return R.drawable.more_pink;

			case ETexture_hl_bottom_left:
				return R.drawable.hl_bottom_left_pink;
			case ETexture_hl_bottom_left_in:
				return R.drawable.hl_bottom_left_in_pink;
			case ETexture_hl_bottom_right:
				return R.drawable.hl_bottom_right_pink;
			case ETexture_hl_bottom_right_in:
				return R.drawable.hl_bottom_right_in_pink;
			case ETexture_hl_left:
				return R.drawable.hl_left_pink;
			case ETexture_hl_left_out:
				return R.drawable.hl_left_out_pink;
			case ETexture_hl_normal:
				return R.drawable.hl_normal_pink;
			case ETexture_hl_right:
				return R.drawable.hl_right_pink;
			case ETexture_hl_right_out:
				return R.drawable.hl_right_out_pink;
			case ETexture_hl_space:
				return R.drawable.hl_space_pink;
			case ETexture_hl_top_left:
				return R.drawable.hl_top_left_pink;
			case ETexture_hl_top_right:
				return R.drawable.hl_top_right_pink;

			case ETexture_gl_bottom_left:
				return R.drawable.gl_bottom_left_pink;
			case ETexture_gl_bottom_left_in:
				return R.drawable.gl_bottom_left_in_pink;
			case ETexture_gl_bottom_right:
				return R.drawable.gl_bottom_right_pink;
			case ETexture_gl_bottom_right_in:
				return R.drawable.gl_bottom_right_in_pink;
			case ETexture_gl_left:
				return R.drawable.gl_left_pink;
			case ETexture_gl_left_out:
				return R.drawable.gl_left_out_pink;
			case ETexture_gl_normal:
				return R.drawable.gl_normal_pink;
			case ETexture_gl_right:
				return R.drawable.gl_right_pink;
			case ETexture_gl_right_out:
				return R.drawable.gl_right_out_pink;
			case ETexture_gl_space:
				return R.drawable.gl_space_pink;
			case ETexture_gl_top_left:
				return R.drawable.gl_top_left_pink;
			case ETexture_gl_top_right:
				return R.drawable.gl_top_right_pink;
		}
		return 0;
	}

	private int GetTextureResourceID_Red( int ETexture )
	{
		switch ( ETexture )
		{
			case ETexture_keyboard_portrait:
				return R.drawable.keyboard_portrait_red;
			case ETexture_keyboard_landscape:
				return R.drawable.keyboard_landscape_red;

			case ETexture_more:
				return R.drawable.more;

			case ETexture_hl_bottom_left:
				return R.drawable.hl_bottom_left;
			case ETexture_hl_bottom_left_in:
				return R.drawable.hl_bottom_left_in;
			case ETexture_hl_bottom_right:
				return R.drawable.hl_bottom_right;
			case ETexture_hl_bottom_right_in:
				return R.drawable.hl_bottom_right_in;
			case ETexture_hl_left:
				return R.drawable.hl_left;
			case ETexture_hl_left_out:
				return R.drawable.hl_left_out;
			case ETexture_hl_normal:
				return R.drawable.hl_normal;
			case ETexture_hl_right:
				return R.drawable.hl_right;
			case ETexture_hl_right_out:
				return R.drawable.hl_right_out;
			case ETexture_hl_space:
				return R.drawable.hl_space;
			case ETexture_hl_top_left:
				return R.drawable.hl_top_left;
			case ETexture_hl_top_right:
				return R.drawable.hl_top_right;

			case ETexture_gl_bottom_left:
				return R.drawable.gl_bottom_left;
			case ETexture_gl_bottom_left_in:
				return R.drawable.gl_bottom_left_in;
			case ETexture_gl_bottom_right:
				return R.drawable.gl_bottom_right;
			case ETexture_gl_bottom_right_in:
				return R.drawable.gl_bottom_right_in;
			case ETexture_gl_left:
				return R.drawable.gl_left;
			case ETexture_gl_left_out:
				return R.drawable.gl_left_out;
			case ETexture_gl_normal:
				return R.drawable.gl_normal;
			case ETexture_gl_right:
				return R.drawable.gl_right;
			case ETexture_gl_right_out:
				return R.drawable.gl_right_out;
			case ETexture_gl_space:
				return R.drawable.gl_space;
			case ETexture_gl_top_left:
				return R.drawable.gl_top_left;
			case ETexture_gl_top_right:
				return R.drawable.gl_top_right;
		}
		return 0;
	}

	private int GetTextureResourceID_Green( int ETexture )
	{
		switch ( ETexture )
		{
			case ETexture_keyboard_portrait:
				return R.drawable.keyboard_portrait_green;
			case ETexture_keyboard_landscape:
				return R.drawable.keyboard_landscape_green;

			case ETexture_more:
				return R.drawable.more;

			case ETexture_hl_bottom_left:
				return R.drawable.hl_bottom_left;
			case ETexture_hl_bottom_left_in:
				return R.drawable.hl_bottom_left_in;
			case ETexture_hl_bottom_right:
				return R.drawable.hl_bottom_right;
			case ETexture_hl_bottom_right_in:
				return R.drawable.hl_bottom_right_in;
			case ETexture_hl_left:
				return R.drawable.hl_left;
			case ETexture_hl_left_out:
				return R.drawable.hl_left_out;
			case ETexture_hl_normal:
				return R.drawable.hl_normal;
			case ETexture_hl_right:
				return R.drawable.hl_right;
			case ETexture_hl_right_out:
				return R.drawable.hl_right_out;
			case ETexture_hl_space:
				return R.drawable.hl_space;
			case ETexture_hl_top_left:
				return R.drawable.hl_top_left;
			case ETexture_hl_top_right:
				return R.drawable.hl_top_right;

			case ETexture_gl_bottom_left:
				return R.drawable.gl_bottom_left;
			case ETexture_gl_bottom_left_in:
				return R.drawable.gl_bottom_left_in;
			case ETexture_gl_bottom_right:
				return R.drawable.gl_bottom_right;
			case ETexture_gl_bottom_right_in:
				return R.drawable.gl_bottom_right_in;
			case ETexture_gl_left:
				return R.drawable.gl_left;
			case ETexture_gl_left_out:
				return R.drawable.gl_left_out;
			case ETexture_gl_normal:
				return R.drawable.gl_normal;
			case ETexture_gl_right:
				return R.drawable.gl_right;
			case ETexture_gl_right_out:
				return R.drawable.gl_right_out;
			case ETexture_gl_space:
				return R.drawable.gl_space;
			case ETexture_gl_top_left:
				return R.drawable.gl_top_left;
			case ETexture_gl_top_right:
				return R.drawable.gl_top_right;
		}
		return 0;
	}

	private int GetTextureResourceID_Blue( int ETexture )
	{
		switch ( ETexture )
		{
			case ETexture_keyboard_portrait:
				return R.drawable.keyboard_portrait_blue;
			case ETexture_keyboard_landscape:
				return R.drawable.keyboard_landscape_blue;

			case ETexture_more:
				return R.drawable.more;

			case ETexture_hl_bottom_left:
				return R.drawable.hl_bottom_left;
			case ETexture_hl_bottom_left_in:
				return R.drawable.hl_bottom_left_in;
			case ETexture_hl_bottom_right:
				return R.drawable.hl_bottom_right;
			case ETexture_hl_bottom_right_in:
				return R.drawable.hl_bottom_right_in;
			case ETexture_hl_left:
				return R.drawable.hl_left;
			case ETexture_hl_left_out:
				return R.drawable.hl_left_out;
			case ETexture_hl_normal:
				return R.drawable.hl_normal;
			case ETexture_hl_right:
				return R.drawable.hl_right;
			case ETexture_hl_right_out:
				return R.drawable.hl_right_out;
			case ETexture_hl_space:
				return R.drawable.hl_space;
			case ETexture_hl_top_left:
				return R.drawable.hl_top_left;
			case ETexture_hl_top_right:
				return R.drawable.hl_top_right;

			case ETexture_gl_bottom_left:
				return R.drawable.gl_bottom_left;
			case ETexture_gl_bottom_left_in:
				return R.drawable.gl_bottom_left_in;
			case ETexture_gl_bottom_right:
				return R.drawable.gl_bottom_right;
			case ETexture_gl_bottom_right_in:
				return R.drawable.gl_bottom_right_in;
			case ETexture_gl_left:
				return R.drawable.gl_left;
			case ETexture_gl_left_out:
				return R.drawable.gl_left_out;
			case ETexture_gl_normal:
				return R.drawable.gl_normal;
			case ETexture_gl_right:
				return R.drawable.gl_right;
			case ETexture_gl_right_out:
				return R.drawable.gl_right_out;
			case ETexture_gl_space:
				return R.drawable.gl_space;
			case ETexture_gl_top_left:
				return R.drawable.gl_top_left;
			case ETexture_gl_top_right:
				return R.drawable.gl_top_right;
		}
		return 0;
	}

	private int GetTextureResourceID_Gray( int ETexture )
	{
		switch ( ETexture )
		{
			case ETexture_keyboard_portrait:
				return R.drawable.keyboard_portrait_gray;
			case ETexture_keyboard_landscape:
				return R.drawable.keyboard_landscape_gray;

			case ETexture_more:
				return R.drawable.more;

			case ETexture_hl_bottom_left:
				return R.drawable.hl_bottom_left;
			case ETexture_hl_bottom_left_in:
				return R.drawable.hl_bottom_left_in;
			case ETexture_hl_bottom_right:
				return R.drawable.hl_bottom_right;
			case ETexture_hl_bottom_right_in:
				return R.drawable.hl_bottom_right_in;
			case ETexture_hl_left:
				return R.drawable.hl_left;
			case ETexture_hl_left_out:
				return R.drawable.hl_left_out;
			case ETexture_hl_normal:
				return R.drawable.hl_normal;
			case ETexture_hl_right:
				return R.drawable.hl_right;
			case ETexture_hl_right_out:
				return R.drawable.hl_right_out;
			case ETexture_hl_space:
				return R.drawable.hl_space;
			case ETexture_hl_top_left:
				return R.drawable.hl_top_left;
			case ETexture_hl_top_right:
				return R.drawable.hl_top_right;

			case ETexture_gl_bottom_left:
				return R.drawable.gl_bottom_left;
			case ETexture_gl_bottom_left_in:
				return R.drawable.gl_bottom_left_in;
			case ETexture_gl_bottom_right:
				return R.drawable.gl_bottom_right;
			case ETexture_gl_bottom_right_in:
				return R.drawable.gl_bottom_right_in;
			case ETexture_gl_left:
				return R.drawable.gl_left;
			case ETexture_gl_left_out:
				return R.drawable.gl_left_out;
			case ETexture_gl_normal:
				return R.drawable.gl_normal;
			case ETexture_gl_right:
				return R.drawable.gl_right;
			case ETexture_gl_right_out:
				return R.drawable.gl_right_out;
			case ETexture_gl_space:
				return R.drawable.gl_space;
			case ETexture_gl_top_left:
				return R.drawable.gl_top_left;
			case ETexture_gl_top_right:
				return R.drawable.gl_top_right;
		}
		return 0;
	}

	private android.graphics.Bitmap LoadTexture( int ETexture, int EColor )
	{
		return android.graphics.BitmapFactory.decodeResource( getResources(), GetTextureResourceID( ETexture, EColor ) );
	}

	private void LoadColoredTextures()
	{
		for ( int i = 1; i < ETexture__count__; i++ )
		{
			ColoredTextureList[i] = LoadTexture( i, ColorIndex );
		}
	}

	private void UnloadColoredTextures()
	{
		for ( int i = 1; i < ETexture__count__; i++ )
		{
			if ( ColoredTextureList[i] != null )
			{
				ColoredTextureList[i].recycle();
				ColoredTextureList[i] = null;
			}
		}
	}

	// a keyboard layout is like a physical keyboard that defines keys on a plane.
	// a keyboard layout can have different keysets applied to it.
	// a keyset is like the labels that appear on the keys, and define what the key does when it is pressed.
	public class CKeyboardLayout
	{
		// a key is an area on the keyboard that the user can press to generate a character or action.
		public class CKey
		{
			public int KeyIndex = 0; // index of this key on the keyboard. usually goes from left to right, top to bottom.

			public float Distance = 1.0f;
			public int HighlightAlpha = 0;
			public int MoreAlpha = 0;

			public int HighlightFlags = 0; // non-zero if highlighted.

			public int HighlightTextureIndex;
			public android.graphics.Bitmap HighlightTexture;

			public int GlowlightTextureIndex;
			public android.graphics.Bitmap GlowlightTexture;

			public android.graphics.PointF Local_HighlightPosition; // local space, top left of highlight on keyboard.
			public android.graphics.RectF Screen_HighlightArea = new android.graphics.RectF(); // screen space, area of highlight on keyboard.

			public android.graphics.PointF Local_IconPosition; // local space, top left of icon on keyboard.
			public android.graphics.RectF Screen_IconArea = new android.graphics.RectF(); // screen space, area of icon on keyboard.

			public android.graphics.PointF Local_HitOrigin; // local space, center of key on keyboard.
			public android.graphics.PointF Screen_HitOrigin = new android.graphics.PointF(); // screen space, center of key on keyboard.

			public android.graphics.RectF Local_HitBox; // local space, area of key on keyboard.
			public android.graphics.RectF Screen_HitBox = new android.graphics.RectF(); // screen space, area of key on keyboard.

			public CKey( int Index, android.graphics.PointF IconPosition, android.graphics.PointF HighlightPosition, int HighlightTextureIndex, int GlowlightTextureIndex, android.graphics.PointF HitOrigin, android.graphics.RectF HitBox )
			{
				this.KeyIndex = Index;
				this.HighlightTextureIndex = HighlightTextureIndex;
				this.GlowlightTextureIndex = GlowlightTextureIndex;
				this.Local_HighlightPosition = HighlightPosition;
				this.Local_IconPosition = IconPosition;
				this.Local_HitOrigin = HitOrigin;
				this.Local_HitBox = HitBox;
			}
		}

		// a keyset is like the set of labels that are drawn on the keys, and they control what key generates what character.
		public class CKeyset
		{
			public int KeyIndex; // index of this key on the keyboard. only required for sparse layouts, where there are less entries in the keyset array than there are keys on the keyboard.
			public int KeyCode; // key value, if non-zero, key will trigger this value when pressed.
			public int Character; // action for keys that perform actions, like shift or symbol.
			public android.graphics.Bitmap Icon; // a icon image representing the label on the key.
			boolean UseHighlightAreaAsIconArea = false;
			CKeyset[] KeysetListExploded; // when a user long presses this key, this exploded view will appear. it is a sparse keyset array.
			CKeyset[] KeysetListExplodedStatic; // when a user long presses this key, this exploded view will appear. it is a sparse keyset array.

			public CKeyset( int KeyIndex, int Keycode, int Character, android.graphics.Bitmap Icon )
			{
				this.KeyIndex = KeyIndex;
				this.KeyCode = Keycode;
				this.Character = Character;
				this.Icon = Icon;
				this.KeysetListExploded = null;
			}

			public CKeyset( int Keycode, int Character, android.graphics.Bitmap Icon )
			{
				this.KeyIndex = -1;
				this.KeyCode = Keycode;
				this.Character = Character;
				this.Icon = Icon;
				this.KeysetListExploded = null;
			}

			public CKeyset( int Keycode, int Character, android.graphics.Bitmap Icon, CKeyset[] KeysetListExploded, CKeyset[] KeysetListExplodedStatic )
			{
				this.KeyIndex = -1;
				this.KeyCode = Keycode;
				this.Character = Character;
				this.Icon = Icon;
				this.KeysetListExploded = KeysetListExploded;
				this.KeysetListExplodedStatic = KeysetListExplodedStatic;
			}
		}

		public int KeyboardTextureIndex;
		public android.graphics.Bitmap KeyboardTexture;// the base image of the keyboard. drawn first.
		public android.graphics.Rect Screen_LayoutArea = new android.graphics.Rect();
		public CKey[] KeyList; // list of all the keys in this keyboard layout.
		public CKeyset[] KeysetList; // active keyset for this keyboard layout.
		public CKeyset[] KeysetListExploded; // sparse keyset list for exploded view.
		public CKeyset[] KeysetListExplodedStatic; // sparse keyset list for shift keys, delete, comma, space bar, period, and enter. when KeysetListExploded is present, this is also used. 
		private long KeyPressedTime; // time that KeyPressed was pressed, used to time how long it was held.
		private CKey KeyPressed; // the highlighted key that is under the user's selection, or null.
		private CKey KeyPressedLast; // key that was pressed last frame, can be the same as KeyPressed, or null.
		private CKey KeyPressedPrevious; // last pressed key that is not KeyPressed, or null.

		public CKeyset[] KeysetList_AlphaLower;
		public CKeyset[] KeysetList_AlphaUpper;
		public CKeyset[] KeysetList_SymbolA;
		public CKeyset[] KeysetList_SymbolB;

		public CKeyboardLayout( int KeyboardTextureIndex )
		{
			this.KeyboardTextureIndex = KeyboardTextureIndex;
		}

		public void SetKeysetList( CKeyset[] KeysetList )
		{
			this.KeysetList = KeysetList;
			TransformIcons();
			UpdateLocklights();
			invalidate();
		}

		public void SetKeysetListExploded( CKeyset[] KeysetListExploded, CKeyset[] KeysetListExplodedStatic )
		{
			this.KeysetListExploded = KeysetListExploded;
			this.KeysetListExplodedStatic = KeysetListExplodedStatic;
			TransformIcons();
			UpdateLocklights();
			invalidate();
		}

		// aquires all the color schemed textures for this keyboard.
		private void AquireColoredTexturesKeyboardLayout()
		{
			KeyboardTexture = ColoredTextureList[KeyboardTextureIndex];

			for ( int iKey = 0; iKey < KeyList.length; iKey++ )
			{
				CKey Key = KeyList[iKey];

				if ( Key.HighlightTextureIndex != 0 )
				{
					Key.HighlightTexture = ColoredTextureList[Key.HighlightTextureIndex];
				}

				if ( Key.GlowlightTextureIndex != 0 )
				{
					Key.GlowlightTexture = ColoredTextureList[Key.GlowlightTextureIndex];
				}
			}
		}

		// builds screen coordinates from local coordinates.
		// call once when the screen orientation changes or layout area changes.
		private void Transform()
		{
			// transform image
			Screen_LayoutArea.left = 0;
			Screen_LayoutArea.top = 0;
			Screen_LayoutArea.right = (int)( (float)KeyboardTexture.getWidth() * LayoutScale );
			Screen_LayoutArea.bottom = (int)( (float)KeyboardTexture.getHeight() * LayoutScale );

			// transform keys
			for ( int iKey = 0; iKey < KeyList.length; iKey++ )
			{
				CKey Key = KeyList[iKey];
				Key.Screen_HighlightArea.left = Key.Local_HighlightPosition.x * LayoutScale;
				Key.Screen_HighlightArea.top = Key.Local_HighlightPosition.y * LayoutScale;
				Key.Screen_HighlightArea.right = ( Key.Local_HighlightPosition.x + Key.HighlightTexture.getWidth() ) * LayoutScale;
				Key.Screen_HighlightArea.bottom = ( Key.Local_HighlightPosition.y + Key.HighlightTexture.getHeight() ) * LayoutScale;
				Key.Screen_HitOrigin.x = Key.Local_HitOrigin.x * LayoutScale;
				Key.Screen_HitOrigin.y = Key.Local_HitOrigin.y * LayoutScale;
				Key.Screen_HitBox.left = Key.Local_HitBox.left * LayoutScale;
				Key.Screen_HitBox.top = Key.Local_HitBox.top * LayoutScale;
				Key.Screen_HitBox.right = Key.Local_HitBox.right * LayoutScale;
				Key.Screen_HitBox.bottom = Key.Local_HitBox.bottom * LayoutScale;
			}
		}

		// call whenever keyset list changes.
		private void TransformIcons()
		{
			// transform keys
			if ( KeysetListExploded != null )
			{
				for ( int iKeyset = 0; iKeyset < KeysetListExploded.length; iKeyset++ )
				{
					CKeyset Keyset = KeysetListExploded[iKeyset];
					CKey Key = KeyList[Keyset.KeyIndex];
					if ( Keyset.Icon != null )
					{
						if ( Keyset.UseHighlightAreaAsIconArea )
						{
							Key.Screen_IconArea.left = Key.Local_HighlightPosition.x * LayoutScale;
							Key.Screen_IconArea.top = Key.Local_HighlightPosition.y * LayoutScale;
						}
						else
						{
							Key.Screen_IconArea.left = Key.Local_IconPosition.x * LayoutScale;
							Key.Screen_IconArea.top = Key.Local_IconPosition.y * LayoutScale;
						}
						Key.Screen_IconArea.right = Key.Screen_IconArea.left + ( (float)Keyset.Icon.getWidth() * LayoutScale );
						Key.Screen_IconArea.bottom = Key.Screen_IconArea.top + ( (float)Keyset.Icon.getHeight() * LayoutScale );
					}
				}
				if ( KeysetListExplodedStatic != null )
				{
					for ( int iKeyset = 0; iKeyset < KeysetListExplodedStatic.length; iKeyset++ )
					{
						CKeyset Keyset = KeysetListExplodedStatic[iKeyset];
						CKey Key = KeyList[Keyset.KeyIndex];
						if ( Keyset.Icon != null )
						{
							if ( Keyset.UseHighlightAreaAsIconArea )
							{
								Key.Screen_IconArea.left = Key.Local_HighlightPosition.x * LayoutScale;
								Key.Screen_IconArea.top = Key.Local_HighlightPosition.y * LayoutScale;
							}
							else
							{
								Key.Screen_IconArea.left = Key.Local_IconPosition.x * LayoutScale;
								Key.Screen_IconArea.top = Key.Local_IconPosition.y * LayoutScale;
							}
							Key.Screen_IconArea.right = Key.Screen_IconArea.left + ( (float)Keyset.Icon.getWidth() * LayoutScale );
							Key.Screen_IconArea.bottom = Key.Screen_IconArea.top + ( (float)Keyset.Icon.getHeight() * LayoutScale );
						}
					}
				}
			}
			else if ( KeysetList != null )
			{
				for ( int iKey = 0; iKey < KeyList.length; iKey++ )
				{
					CKey Key = KeyList[iKey];
					CKeyset Keyset = KeysetList[iKey];
					if ( Keyset.Icon != null )
					{
						if ( Keyset.UseHighlightAreaAsIconArea )
						{
							Key.Screen_IconArea.left = Key.Local_HighlightPosition.x * LayoutScale;
							Key.Screen_IconArea.top = Key.Local_HighlightPosition.y * LayoutScale;
						}
						else
						{
							Key.Screen_IconArea.left = Key.Local_IconPosition.x * LayoutScale;
							Key.Screen_IconArea.top = Key.Local_IconPosition.y * LayoutScale;
						}
						Key.Screen_IconArea.right = Key.Screen_IconArea.left + ( (float)Keyset.Icon.getWidth() * LayoutScale );
						Key.Screen_IconArea.bottom = Key.Screen_IconArea.top + ( (float)Keyset.Icon.getHeight() * LayoutScale );
					}
				}
			}
		}

		// returns key that is hit by X and Y, if any.
		CKey GetHitKey( float ScreenX, float ScreenY )
		{
			int ClosestKeyIndex = -1;
			float ClosestKeyDistance = 1000000;

			// gather nearest keys
			// this can be optimized with some form of spatial partitioning so we don't have to check against every single key every time.
			for ( int iKey = 0; iKey < KeyList.length; iKey++ )
			{
				CKey Key = KeyList[iKey];

				float DeltaX = ScreenX - Key.Screen_HitOrigin.x;
				float DeltaY = ScreenY - Key.Screen_HitOrigin.y;
				float Distance = ( DeltaX * DeltaX ) + ( DeltaY * DeltaY );

				if ( Key.Screen_HitBox.contains( ScreenX, ScreenY ) )
				{
					if ( Distance < ClosestKeyDistance )
					{
						ClosestKeyIndex = iKey;
						ClosestKeyDistance = Distance;
					}
				}

				Distance = Distance * ( 1.0f - PressureNow ) * 0.0002f / LayoutScale;
				if ( Distance < Key.Distance )
				{
					Key.Distance = Distance;
				}
			}

			if ( ClosestKeyIndex >= 0 )
			{
				return KeyList[ClosestKeyIndex];
			}

			return null;
		}

		private long TouchDownStart;

		// call when a touch event occurs.
		public void TouchDown( int ScreenX, int ScreenY )
		{
			//PressureUp = false;

			TouchDownStart = System.currentTimeMillis();

			// chose a key to highlight
			KeyPressedLast = KeyPressed;
			KeyPressed = GetHitKey( ScreenX, ScreenY );

			// highlight hit key
			if ( KeyPressed != null )
			{
				KeyPressed.HighlightFlags |= 0x01;
				KeyPressed.HighlightAlpha = 255;
				if ( KeyPressedLast != KeyPressed )
				{
					KeyPressedPrevious = KeyPressedLast;
					KeyPressedTime = TouchDownStart;
				}

				//FlarePoint.x = KeyPressed.Screen_HitOrigin.x;
				//FlarePoint.y = KeyPressed.Screen_HitOrigin.y;
				//FlareOpacity = 1;
			}
		}

		boolean ExplodedDown = false; // set to true if explosion was triggered and user's finger is still in the down state.
		int Baleted = 0;

		// call when a touch event occurs.
		public void TouchMove( int ScreenX, int ScreenY )
		{
			// unhighlight currently highlighted key if any
			if ( KeyPressed != null )
			{
				KeyPressed.HighlightFlags &= 0xFE;
				if ( KeyPressed.HighlightFlags != 0 )
				{
					KeyPressed.HighlightAlpha = 255;
				}
				else
				{
					KeyPressed.HighlightAlpha = 0;
				}
			}

			//PressureUp = false;

			// chose a key to highlight
			KeyPressedLast = KeyPressed;
			KeyPressed = GetHitKey( ScreenX, ScreenY );

			// highlight hit key
			if ( KeyPressed != null )
			{
				long DeltaTime = System.currentTimeMillis() - KeyPressedTime;
				KeyPressed.HighlightFlags |= 0x01;
				KeyPressed.HighlightAlpha = 255;
				if ( KeyPressedLast != KeyPressed )
				{
					KeyPressedPrevious = KeyPressedLast;
					KeyPressedTime = System.currentTimeMillis();
				}
				else if ( ( ( KeyboardLayout == KeyboardLayout_Portrait ) && ( KeyPressed.KeyIndex == 30 ) ) || ( ( KeyboardLayout == KeyboardLayout_Landscape ) && ( KeyPressed.KeyIndex == 46 ) ) )
				{
					// handle delete key auto repeat
					if ( DeltaTime > 400 )
					{
						if ( Baleted == 0 )
						{
							if ( VibrateIndex != 0 )
							{
								Vibrator.vibrate( VibrateDurationMS );
							}
							if ( BeepIndex != 0 )
							{
								MediaPlayer.seekTo( 0 );
								MediaPlayer.start();
							}
							Baleted = 1;
						}
						HexBoardService.getCurrentInputConnection().sendKeyEvent( new android.view.KeyEvent( android.view.KeyEvent.ACTION_DOWN, android.view.KeyEvent.KEYCODE_DEL ) );
						HexBoardService.getCurrentInputConnection().sendKeyEvent( new android.view.KeyEvent( android.view.KeyEvent.ACTION_UP, android.view.KeyEvent.KEYCODE_DEL ) );
						if ( DeltaTime > 1200 )
						{
							if ( Baleted == 1 )
							{
								if ( VibrateIndex != 0 )
								{
									Vibrator.vibrate( VibrateDurationMS );
								}
								if ( BeepIndex != 0 )
								{
									MediaPlayer.seekTo( 0 );
									MediaPlayer.start();
								}
								Baleted = 2;
							}
							HexBoardService.getCurrentInputConnection().sendKeyEvent( new android.view.KeyEvent( android.view.KeyEvent.ACTION_DOWN, android.view.KeyEvent.KEYCODE_DEL ) );
							HexBoardService.getCurrentInputConnection().sendKeyEvent( new android.view.KeyEvent( android.view.KeyEvent.ACTION_UP, android.view.KeyEvent.KEYCODE_DEL ) );
						}
					}
				}
				else
				{
					// handle explosive keys
					if ( ( KeysetListExploded == null ) && ( KeysetList[KeyPressed.KeyIndex].KeysetListExploded != null ) && ( DeltaTime > 400 ) )
					{
						if ( VibrateIndex != 0 )
						{
							Vibrator.vibrate( VibrateDurationMS );
						}
						if ( BeepIndex != 0 )
						{
							MediaPlayer.seekTo( 0 );
							MediaPlayer.start();
						}
						SetKeysetListExploded( KeysetList[KeyPressed.KeyIndex].KeysetListExploded, KeysetList[KeyPressed.KeyIndex].KeysetListExplodedStatic );
						if ( ExplodedDown == false )
						{
							ExplodedDown = true;
							ExplodedKeyIndex = KeyPressed.KeyIndex;
							SpawnWave( KeyPressed.Screen_HitOrigin.x, KeyPressed.Screen_HitOrigin.y );
						}
					}
				}
			}
		}

		int ExplodedKeyIndex = -1;
		boolean LockSymbolView = false;
		boolean SymbolPageUsed = false; // if we go to symbol view page 1, and user inputs a character on that page, then the next time the user presses the symbol key then we should go back to the alpha view. 
		boolean ShiftUsed = false;

		// call when a touch event occurs.
		public void TouchUp( int ScreenX, int ScreenY )
		{
			Baleted = 0;

			if ( KeyPressed != null )
			{
				KeyPressed.HighlightFlags &= 0xFE;
				if ( KeyPressed.HighlightFlags != 0 )
				{
					KeyPressed.HighlightAlpha = 255;
				}
				else
				{
					KeyPressed.HighlightAlpha = 0;
				}
			}

			//PressureUp = true;
			//GetHitKey( ScreenX, ScreenY );
			/*
			for ( int iKey = 0; iKey < KeyList.length; iKey++ )
			{
				CKey Key = KeyList[iKey];
				if ( Key.Distance < 1.0f )
				{
					Key.Distance -= 1.0f;
					if ( Key.Distance < 0.0f )
					{
						Key.Distance = 0.0f;
					}
				}
			}
			*/

			// take last key if this key was pressed for a very short time, which is an assumption that the user's finger might have slipped and pressed the wrong key
			if ( KeyPressedPrevious != null )
			{
				long DeltaTime = System.currentTimeMillis() - KeyPressedTime;
				if ( DeltaTime < 50 && KeyPressedPrevious != null )
				{
					KeyPressed = KeyPressedPrevious;
				}
			}

			// turn off highlighted key and trigger input event
			if ( KeyPressed != null )
			{
				KeyPressed.HighlightAlpha = 255;

				if ( KeysetListExploded != null )
				{
					// exploded view
					// sparse keyset is in use
					boolean FromStatic = false;
					CKeyset Keyset = null;
					if ( KeysetListExplodedStatic != null )
					{
						for ( int iKeyset = 0; iKeyset < KeysetListExplodedStatic.length; iKeyset++ )
						{
							if ( KeysetListExplodedStatic[iKeyset].KeyIndex == KeyPressed.KeyIndex )
							{
								FromStatic = true;
								Keyset = KeysetListExplodedStatic[iKeyset];
								break;
							}
						}
					}
					if ( Keyset == null )
					{
						for ( int iKeyset = 0; iKeyset < KeysetListExploded.length; iKeyset++ )
						{
							if ( KeysetListExploded[iKeyset].KeyIndex == KeyPressed.KeyIndex )
							{
								Keyset = KeysetListExploded[iKeyset];
								break;
							}
						}
					}

					if ( ExplodedDown )
					{
						ExplodedDown = false;
					}
					else
					{
						if ( Keyset != null )
						{
							if ( VibrateIndex != 0 )
							{
								Vibrator.vibrate( VibrateDurationMS );
							}
							if ( BeepIndex != 0 )
							{
								MediaPlayer.seekTo( 0 );
								MediaPlayer.start();
							}
							if ( Keyset.KeyCode == android.view.KeyEvent.KEYCODE_DEL )
							{
								FromStatic = false;
							}
							else
							{
								InputKeyset( Keyset );
							}
						}
						if ( FromStatic == false )
						{
							// exit exploded view
							ExplodedKeyIndex = -1;
							SetKeysetListExploded( null, null );
						}
					}
				}
				else
				{
					CKeyset Keyset = KeysetList[KeyPressed.KeyIndex];
					if ( VibrateIndex != 0 )
					{
						Vibrator.vibrate( VibrateDurationMS );
					}
					if ( BeepIndex != 0 )
					{
						MediaPlayer.seekTo( 0 );
						MediaPlayer.start();
					}
					InputKeyset( Keyset );
				}
			}

			KeyPressed = null;
			KeyPressedLast = null;
			KeyPressedPrevious = null;
		}

		private void ResetToAlphaLower()
		{
			SymbolState = 0;
			ShiftState = 0;
			SetKeysetList( KeysetList_AlphaLower );
		}

		private void ResetToSymbol()
		{
			ShiftState = 0;
			SymbolState = 1;
			SetKeysetList( KeysetList_SymbolA );
		}

		private void InputKeyset( CKeyset Keyset )
		{
			if ( Keyset.KeyCode > android.view.KeyEvent.getMaxKeyCode() )
			{
				if ( Keyset.KeyCode == EKeyCode_PortraitLayout_Proximity )
				{
					SetPortraitLayoutIndex( EPortraitLayout_Proximity );
				}
				else if ( Keyset.KeyCode == EKeyCode_PortraitLayout_QWERTY )
				{
					SetPortraitLayoutIndex( EPortraitLayout_QWERTY );
				}
				else if ( Keyset.KeyCode == EKeyCode_Navy )
				{
					SetColorIndex( EColor_Navy );
				}
				else if ( Keyset.KeyCode == EKeyCode_Pink )
				{
					SetColorIndex( EColor_Pink );
				}
				else if ( Keyset.KeyCode == EKeyCode_Red )
				{
					SetColorIndex( EColor_Red );
				}
				else if ( Keyset.KeyCode == EKeyCode_Green )
				{
					SetColorIndex( EColor_Green );
				}
				else if ( Keyset.KeyCode == EKeyCode_Blue )
				{
					SetColorIndex( EColor_Blue );
				}
				else if ( Keyset.KeyCode == EKeyCode_Gray )
				{
					SetColorIndex( EColor_Gray );
				}
				else if ( Keyset.KeyCode == EKeyCode_Vibrate_Off )
				{
					SetVibrateIndex( 0 );
				}
				else if ( Keyset.KeyCode == EKeyCode_Vibrate_On )
				{
					SetVibrateIndex( 1 );
				}
				else if ( Keyset.KeyCode == EKeyCode_Beep_Off )
				{
					SetBeepIndex( 0 );
				}
				else if ( Keyset.KeyCode == EKeyCode_Beep_On )
				{
					SetBeepIndex( 1 );
				}

				return;
			}

			switch ( Keyset.KeyCode )
			{
				case android.view.KeyEvent.KEYCODE_SYM:
					if ( SymbolState == 0 && ( KeysetList_SymbolA != null ) )
					{
						// go to symbols page 1
						SymbolState = 1;
						UpdateLocklights();
						SetKeysetList( KeysetList_SymbolA );
						LockSymbolView = false;
						SymbolPageUsed = false;
						SpawnWave( getWidth() / 2, getHeight() * 2 );
					}
					else if ( ( SymbolState == 1 ) && ( !SymbolPageUsed ) && ( KeysetList_SymbolB != null ) )
					{
						// go to symbols page 2
						SymbolState = 2;
						SetKeysetList( KeysetList_SymbolB );
						UpdateLocklights();
						LockSymbolView = false;
						SymbolPageUsed = false;
						SpawnWave( getWidth() / 2, getHeight() * 2 );
					}
					else
					{
						// go to alpha page
						SymbolState = 0;
						UpdateLocklights();
						if ( ShiftState == 0 )
						{
							SetKeysetList( KeysetList_AlphaLower );
						}
						else
						{
							SetKeysetList( KeysetList_AlphaUpper );
						}
						LockSymbolView = false;
						SymbolPageUsed = false;
						SpawnWave( getWidth() / 2, -getHeight() );
					}
					break;

				case android.view.KeyEvent.KEYCODE_SHIFT_LEFT:
				case android.view.KeyEvent.KEYCODE_SHIFT_RIGHT:
					if ( ShiftState == 0 )
					{
						ShiftState = 1;
						UpdateLocklights();
						SetKeysetList( KeysetList_AlphaUpper );
						SpawnWave( getWidth() / 2, getHeight() * 2 );
					}
					else if ( ( ShiftState == 1 ) && ( ShiftUsed == false ) )
					{
						ShiftState = 2;
						UpdateLocklights();
						SetKeysetList( KeysetList_AlphaUpper );
						SpawnWave( getWidth() / 2, getHeight() * 2 );
					}
					else
					{
						ShiftUsed = false;
						ShiftState = 0;
						UpdateLocklights();
						SetKeysetList( KeysetList_AlphaLower );
						SpawnWave( getWidth() / 2, -getHeight() );
					}
					if ( ( KeysetListExploded != null ) && ( ExplodedKeyIndex >= 0 ) )
					{
						if ( KeysetList[ExplodedKeyIndex].KeysetListExploded != null )
						{
							SetKeysetListExploded( KeysetList[ExplodedKeyIndex].KeysetListExploded, KeysetList[ExplodedKeyIndex].KeysetListExplodedStatic );
						}
					}
					break;

				case android.view.KeyEvent.KEYCODE_DEL:
				case android.view.KeyEvent.KEYCODE_ENTER:
					HexBoardService.getCurrentInputConnection().sendKeyEvent( new android.view.KeyEvent( android.view.KeyEvent.ACTION_DOWN, Keyset.KeyCode ) );
					HexBoardService.getCurrentInputConnection().sendKeyEvent( new android.view.KeyEvent( android.view.KeyEvent.ACTION_UP, Keyset.KeyCode ) );
					break;

				default:
					if ( Keyset.Character > 0 )
					{
						HexBoardService.getCurrentInputConnection().commitText( String.valueOf( (char)Keyset.Character ), 1 );
						if ( ShiftState == 1 )
						{
							// exit shift state
							ShiftUsed = true;
							if ( Character.isLetter( Keyset.Character ) )
							{
								ShiftUsed = false;
								ShiftState = 0;
								UpdateLocklights();
								SetKeysetList( KeysetList_AlphaLower );
							}
						}
						if ( SymbolState == 1 && !LockSymbolView && ( Keyset.Character != ' ' && Keyset.Character != ',' && Keyset.Character != '.' ) )
						{
							SymbolPageUsed = true;
							if ( Character.isDigit( Keyset.Character ) )
							{
								LockSymbolView = true;
							}
							else
							{
								// exit symbol state
								SymbolState = 0;
								UpdateLocklights();
								if ( ShiftState == 0 )
								{
									SetKeysetList( KeysetList_AlphaLower );
								}
								else
								{
									SetKeysetList( KeysetList_AlphaUpper );
								}
							}
						}
					}
					break;
			}
		}

		private CKeyset GetKeyset( int KeyIndex )
		{
			if ( KeysetListExploded == null )
			{
				return KeysetList[KeyIndex];
			}
			else
			{
				for ( int i = 0; i < KeysetListExploded.length; i++ )
				{
					if ( KeysetListExploded[i].KeyIndex == KeyIndex )
					{
						return KeysetListExploded[i];
					}
				}
				if ( KeysetListExplodedStatic != null )
				{
					for ( int i = 0; i < KeysetListExplodedStatic.length; i++ )
					{
						if ( KeysetListExplodedStatic[i].KeyIndex == KeyIndex )
						{
							return KeysetListExplodedStatic[i];
						}
					}
				}
			}

			return null;
		}

		// draws this keyboard to the canvas.
		android.graphics.RectF MoreArea = new android.graphics.RectF();

		int ShiftGlow = 0;

		public void Draw( android.graphics.Canvas canvas )
		{
			canvas.drawBitmap( KeyboardTexture, null, Screen_LayoutArea, Paint_Base );

			boolean NeedsInvalidate = false;

			// update wave
			if ( WaveRadius > 1000000.0f )
			{
				WaveRadius = -1.0f;
			}
			else if ( WaveRadius >= 0.0f )
			{
				WaveRadius += WaveRadius;
			}

			// update shift glow
			if ( ( SymbolState == 0 ) && ( ShiftState == 2 ) )
			{
				ShiftGlow += 4;
				if ( ShiftGlow > 48 )
				{
					ShiftGlow = 48;
				}
			}
			else
			{
				ShiftGlow -= 12;
				if ( ShiftGlow < 0 )
				{
					ShiftGlow = 0;
				}
			}

			if ( KeysetList != null )
			{
				for ( int iKey = 0; iKey < KeysetList.length; iKey++ )
				{
					CKey Key = KeyList[iKey];
					CKeyset Keyset = GetKeyset( iKey );

					// glow from wave
					if ( WaveRadius >= 0.0f )
					{
						float WaveDeltaX = WaveOriginX - Key.Screen_HitOrigin.x;
						float WaveDeltaY = WaveOriginY - Key.Screen_HitOrigin.y;
						float WaveDistance = ( ( WaveDeltaX * WaveDeltaX ) + ( WaveDeltaY * WaveDeltaY ) - WaveRadius ) / WaveRadius;
						if ( WaveDistance < 0.0f )
						{
							WaveDistance *= -1.0f;
						}
						if ( WaveDistance > 1.0f )
						{
							WaveDistance = 1.0f;
						}
						if ( WaveDistance < Key.Distance )
						{
							Key.Distance = WaveDistance;
						}
					}

					// update proximity glow
					if ( Key.Distance > 1.0f )
					{
						Key.Distance = 1.0f;
					}
					int GlowAlpha = (int)( ( 1.0f - Key.Distance ) * 0.3f * 255.0f );
					if ( GlowAlpha > 255 )
					{
						GlowAlpha = 255;
					}
					Key.Distance += 0.1f;
					if ( Key.KeyIndex == ExplodedKeyIndex )
					{
						GlowAlpha = 255;
					}

					// update shift glow
					if ( ( Keyset != null ) && Character.isLetter( Keyset.Character ) )
					{
						GlowAlpha += ShiftGlow;
						if ( GlowAlpha > 255 )
						{
							GlowAlpha = 255;
						}
					}

					// update more indicator icon alpha
					if ( ( KeysetListExploded == null ) && ( KeyPressed != null ) && ( Keyset != null ) && ( Keyset.KeysetListExploded != null ) )
					{
						if ( ( System.currentTimeMillis() - TouchDownStart ) > 400 )
						{
							Key.MoreAlpha += 12;
							if ( Key.MoreAlpha > 255 )
							{
								Key.MoreAlpha = 255;
							}
						}
					}
					else
					{
						Key.MoreAlpha -= 48;
						if ( Key.MoreAlpha < 0 )
						{
							Key.MoreAlpha = 0;
						}
					}

					// draw proximity glow
					if ( GlowAlpha > 0 )
					{
						Paint_Base.setAlpha( GlowAlpha );
						if ( Key.GlowlightTexture != null )
						{
							canvas.drawBitmap( Key.GlowlightTexture, null, Key.Screen_HighlightArea, Paint_Base );
						}
						NeedsInvalidate = true;
					}

					// draw glowlight
					if ( ( Key.HighlightFlags & 0x01 ) != 0 )
					{
						Paint_Base.setAlpha( 0xFF );
						if ( Key.GlowlightTexture != null )
						{
							canvas.drawBitmap( Key.GlowlightTexture, null, Key.Screen_HighlightArea, Paint_Base );
						}
						//NeedsInvalidate = true;
					}
					// draw highlight
					else if ( Key.HighlightFlags != 0 )
					{
						Paint_Base.setAlpha( 0xFF );
						if ( Key.HighlightTexture != null )
						{
							canvas.drawBitmap( Key.HighlightTexture, null, Key.Screen_HighlightArea, Paint_Base );
						}
						//NeedsInvalidate = true;
					}
					// draw highlight fadeout
					else if ( Key.HighlightAlpha > 0 )
					{
						// draw key highlight
						Paint_Base.setAlpha( Key.HighlightAlpha );
						if ( Key.HighlightTexture != null )
						{
							canvas.drawBitmap( Key.HighlightTexture, null, Key.Screen_HighlightArea, Paint_Base );
						}
						Key.HighlightAlpha -= 25;
						if ( Key.HighlightAlpha < 0 )
						{
							Key.HighlightAlpha = 0;
						}
						NeedsInvalidate = true;
					}

					// draw more icon
					if ( Key.MoreAlpha > 0 )
					{
						Paint_Base.setAlpha( Key.MoreAlpha );
						MoreArea.left = Key.Screen_IconArea.left;
						MoreArea.top = Key.Screen_IconArea.top;
						MoreArea.right = MoreArea.left + ( MoreTexture.getWidth() * LayoutScale );
						MoreArea.bottom = MoreArea.top + ( MoreTexture.getHeight() * LayoutScale );
						canvas.drawBitmap( MoreTexture, null, MoreArea, Paint_Base );
					}

					// draw icon from keyset
					if ( ( Keyset != null ) && ( Keyset.Icon != null ) )
					{
						Paint_Base.setAlpha( 255 );
						canvas.drawBitmap( Keyset.Icon, null, Key.Screen_IconArea, Paint_Base );
					}
				}
			}

			// if we are animating we need to draw again for the next frame
			if ( NeedsInvalidate )
			{
				invalidate();
			}
		}
	}

	//private android.inputmethodservice.InputMethodService mInputMethodService; // the input method service that we belong to and providing input for.
	private HexBoardService HexBoardService;

	private int ColorIndex = 0;

	public int GetColorIndex()
	{
		return ColorIndex;
	}

	private int PortraitLayoutIndex = 0;

	public int GetPortraitLayoutIndex()
	{
		return PortraitLayoutIndex;
	}

	private int VibrateIndex = 0;

	public int GetVibrateIndex()
	{
		return VibrateIndex;
	}

	private int BeepIndex = 1;

	public int GetBeepIndex()
	{
		return BeepIndex;
	}

	private android.graphics.Paint Paint_Base = new android.graphics.Paint();// used for drawing background.

	private android.os.Vibrator Vibrator;

	private android.media.MediaPlayer MediaPlayer;

	private android.graphics.Bitmap MoreTexture;

	private CKeyboardLayout KeyboardLayout;

	private CKeyboardLayout KeyboardLayout_Portrait;

	private CKeyboardLayout KeyboardLayout_Landscape;

	private int ShiftState = 0; // 0: off, 1: on, 2: caps lock.
	private int SymbolState = 0; // 0: off, 1: primary set, 2: secondary set.

	private float LayoutScale = 1.0f;

	public int KeysetListID = EKeysetList_Alpha;

	public CKeyboardView( android.content.Context context, int ColorIndex, int PortraitLayoutIndex, int VibrateIndex, int BeepIndex )
	{
		super( context );

		HexBoardService = (HexBoardService)context;

		// load beep
		MediaPlayer = android.media.MediaPlayer.create( context, R.raw.beep );
		MediaPlayer.setLooping( false );

		// load color setting
		this.ColorIndex = ColorIndex;
		this.PortraitLayoutIndex = PortraitLayoutIndex;
		this.VibrateIndex = VibrateIndex;
		this.BeepIndex = BeepIndex;

		// load textures
		LoadColoredTextures();

		// aquire vibrator
		Vibrator = (android.os.Vibrator)context.getSystemService( android.content.Context.VIBRATOR_SERVICE );
	}

	private void SetColorIndex( int ColorIndex )
	{
		if ( this.ColorIndex != ColorIndex )
		{
			this.ColorIndex = ColorIndex;
			UnloadColoredTextures();
			LoadColoredTextures();
			AquireColoredTextures();
			invalidate();
			HexBoardService.SavePreferences();
		}
	}

	private void SetPortraitLayoutIndex( int PortraitLayoutIndex )
	{
		if ( this.PortraitLayoutIndex != PortraitLayoutIndex )
		{
			this.PortraitLayoutIndex = PortraitLayoutIndex;
			if ( !Landscape )
			{
				InitializeKeyboardLayout();
				AquireColoredTextures();
				FindLayoutScale();
				KeyboardLayout.Transform();
				SelectKeysetList();
				HexBoardService.setInputView( this );
			}
			HexBoardService.SavePreferences();
		}
	}

	private void SetVibrateIndex( int VibrateIndex )
	{
		if ( this.VibrateIndex != VibrateIndex )
		{
			this.VibrateIndex = VibrateIndex;
			HexBoardService.SavePreferences();
		}
	}

	private void SetBeepIndex( int BeepIndex )
	{
		if ( this.BeepIndex != BeepIndex )
		{
			this.BeepIndex = BeepIndex;
			HexBoardService.SavePreferences();
		}
	}

	private void AquireColoredTextures()
	{
		MoreTexture = ColoredTextureList[ETexture_more];
		KeyboardLayout.AquireColoredTexturesKeyboardLayout();
	}

	CKeyboardLayout.CKeyset[] KeysetList_AlphaLower;
	CKeyboardLayout.CKeyset[] KeysetList_AlphaUpper;
	CKeyboardLayout.CKeyset[] KeysetList_SymbolA;
	CKeyboardLayout.CKeyset[] KeysetList_SymbolB;

	CKeyboardLayout.CKeyset[] KeysetList_Explode_Options;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_StaticAlpha;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_StaticSymbol;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_a;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_A;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_c;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_C;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_e;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_E;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_i;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_I;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_n;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_N;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_o;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_O;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_s;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_S;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_u;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_U;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_y;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_Y;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_money;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_group;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_math_operators;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_math_comparison;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_punctuation;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_copyright;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_heart;
	CKeyboardLayout.CKeyset[] KeysetList_Explode_pi;

	private void InitializePortrait_Part2_BecauseOfSuckingArbitraryMethodSizeLimitationsThatThrowRunTimeErrors()
	{
		// options page
		KeysetList_Explode_Options = new CKeyboardLayout.CKeyset[15];
		KeysetList_Explode_Options[0] = this.KeyboardLayout_Portrait.new CKeyset( 0, 0, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.label_portrait_layout ) );
		KeysetList_Explode_Options[0].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[1] = this.KeyboardLayout_Portrait.new CKeyset( 1, EKeyCode_PortraitLayout_Proximity, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.lo_proximity ) );
		KeysetList_Explode_Options[1].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[2] = this.KeyboardLayout_Portrait.new CKeyset( 2, EKeyCode_PortraitLayout_Proximity, 0, null );
		KeysetList_Explode_Options[3] = this.KeyboardLayout_Portrait.new CKeyset( 3, EKeyCode_PortraitLayout_Proximity, 0, null );
		KeysetList_Explode_Options[4] = this.KeyboardLayout_Portrait.new CKeyset( 9, EKeyCode_PortraitLayout_QWERTY, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.lo_qwerty ) );
		KeysetList_Explode_Options[4].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[5] = this.KeyboardLayout_Portrait.new CKeyset( 10, EKeyCode_PortraitLayout_QWERTY, 0, null );
		KeysetList_Explode_Options[6] = this.KeyboardLayout_Portrait.new CKeyset( 15, 0, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.label_color ) );
		KeysetList_Explode_Options[6].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[7] = this.KeyboardLayout_Portrait.new CKeyset( 16, EKeyCode_Red, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_red ) );
		KeysetList_Explode_Options[7].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[8] = this.KeyboardLayout_Portrait.new CKeyset( 17, EKeyCode_Green, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_green ) );
		KeysetList_Explode_Options[8].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[9] = this.KeyboardLayout_Portrait.new CKeyset( 18, EKeyCode_Navy, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_navy ) );
		KeysetList_Explode_Options[9].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[10] = this.KeyboardLayout_Portrait.new CKeyset( 24, EKeyCode_Pink, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_pink ) );
		KeysetList_Explode_Options[10].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[11] = this.KeyboardLayout_Portrait.new CKeyset( 25, EKeyCode_Gray, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_gray ) );
		KeysetList_Explode_Options[11].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[12] = this.KeyboardLayout_Portrait.new CKeyset( 4, 0, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.label_vibrate ) );
		KeysetList_Explode_Options[12].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[13] = this.KeyboardLayout_Portrait.new CKeyset( 5, EKeyCode_Vibrate_Off, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.vb_off ) );
		KeysetList_Explode_Options[13].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[14] = this.KeyboardLayout_Portrait.new CKeyset( 13, EKeyCode_Vibrate_On, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.vb_on ) );
		KeysetList_Explode_Options[14].UseHighlightAreaAsIconArea = true;

		// static alpha
		KeysetList_Explode_StaticAlpha = new CKeyboardLayout.CKeyset[7];
		KeysetList_Explode_StaticAlpha[0] = this.KeyboardLayout_Portrait.new CKeyset( 22, android.view.KeyEvent.KEYCODE_SHIFT_LEFT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_Explode_StaticAlpha[1] = this.KeyboardLayout_Portrait.new CKeyset( 29, android.view.KeyEvent.KEYCODE_SHIFT_RIGHT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_Explode_StaticAlpha[2] = this.KeyboardLayout_Portrait.new CKeyset( 30, android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_Explode_StaticAlpha[3] = this.KeyboardLayout_Portrait.new CKeyset( 31, android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_Explode_StaticAlpha[4] = this.KeyboardLayout_Portrait.new CKeyset( 32, android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_Explode_StaticAlpha[5] = this.KeyboardLayout_Portrait.new CKeyset( 33, android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_Explode_StaticAlpha[6] = this.KeyboardLayout_Portrait.new CKeyset( 34, android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// static symbol
		KeysetList_Explode_StaticSymbol = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_StaticSymbol[0] = this.KeyboardLayout_Portrait.new CKeyset( 30, android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_Explode_StaticSymbol[1] = this.KeyboardLayout_Portrait.new CKeyset( 31, android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_Explode_StaticSymbol[2] = this.KeyboardLayout_Portrait.new CKeyset( 32, android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_Explode_StaticSymbol[3] = this.KeyboardLayout_Portrait.new CKeyset( 33, android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_Explode_StaticSymbol[4] = this.KeyboardLayout_Portrait.new CKeyset( 34, android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// a explode
		KeysetList_Explode_a = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_a[0] = this.KeyboardLayout_Portrait.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, 'a', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a ) );
		KeysetList_Explode_a[1] = this.KeyboardLayout_Portrait.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'à', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_grave ) );
		KeysetList_Explode_a[2] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'á', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_acute ) );
		KeysetList_Explode_a[3] = this.KeyboardLayout_Portrait.new CKeyset( 15, android.view.KeyEvent.KEYCODE_UNKNOWN, 'â', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_circumflex ) );
		KeysetList_Explode_a[4] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ä', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_diaeresis ) );
		KeysetList_Explode_a[5] = this.KeyboardLayout_Portrait.new CKeyset( 23, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ã', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_tilde ) );
		KeysetList_Explode_a[6] = this.KeyboardLayout_Portrait.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, 'å', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_ring_above ) );
		KeysetList_Explode_a[7] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'æ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_ae ) );

		// A explode
		KeysetList_Explode_A = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_A[0] = this.KeyboardLayout_Portrait.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, 'A', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a ) );
		KeysetList_Explode_A[1] = this.KeyboardLayout_Portrait.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'À', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_grave ) );
		KeysetList_Explode_A[2] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Á', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_acute ) );
		KeysetList_Explode_A[3] = this.KeyboardLayout_Portrait.new CKeyset( 15, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Â', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_circumflex ) );
		KeysetList_Explode_A[4] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ä', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_diaeresis ) );
		KeysetList_Explode_A[5] = this.KeyboardLayout_Portrait.new CKeyset( 23, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ã', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_tilde ) );
		KeysetList_Explode_A[6] = this.KeyboardLayout_Portrait.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Å', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_ring_above ) );
		KeysetList_Explode_A[7] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Æ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_ae ) );

		// c explode
		KeysetList_Explode_c = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_c[0] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'c', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_c ) );
		KeysetList_Explode_c[1] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ç', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_c_cedella ) );

		// C explode
		KeysetList_Explode_C = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_C[0] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'C', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_c ) );
		KeysetList_Explode_C[1] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ç', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_c_cedella ) );

		// e explode
		KeysetList_Explode_e = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_e[0] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'e', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e ) );
		KeysetList_Explode_e[1] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'è', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_grave ) );
		KeysetList_Explode_e[2] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, 'é', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_acute ) );
		KeysetList_Explode_e[3] = this.KeyboardLayout_Portrait.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ê', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_circumflex ) );
		KeysetList_Explode_e[4] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ë', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_diaeresis ) );

		// E explode
		KeysetList_Explode_E = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_E[0] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'E', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e ) );
		KeysetList_Explode_E[1] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'È', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_grave ) );
		KeysetList_Explode_E[2] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, 'É', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_acute ) );
		KeysetList_Explode_E[3] = this.KeyboardLayout_Portrait.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ê', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_circumflex ) );
		KeysetList_Explode_E[4] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ë', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_diaeresis ) );

		// i explode
		KeysetList_Explode_i = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_i[0] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'i', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i ) );
		KeysetList_Explode_i[1] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ì', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_grave ) );
		KeysetList_Explode_i[2] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, 'í', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_acute ) );
		KeysetList_Explode_i[3] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'î', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_circumflex ) );
		KeysetList_Explode_i[4] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ï', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_diaeresis ) );

		// I explode
		KeysetList_Explode_I = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_I[0] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'I', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i ) );
		KeysetList_Explode_I[1] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ì', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_grave ) );
		KeysetList_Explode_I[2] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Í', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_acute ) );
		KeysetList_Explode_I[3] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Î', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_circumflex ) );
		KeysetList_Explode_I[4] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ï', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_diaeresis ) );

		// n explode
		KeysetList_Explode_n = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_n[0] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, 'n', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_n ) );
		KeysetList_Explode_n[1] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ñ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_n_tilde ) );

		// N explode
		KeysetList_Explode_N = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_N[0] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, 'N', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_n ) );
		KeysetList_Explode_N[1] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ñ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_n_tilde ) );

		// o explode
		KeysetList_Explode_o = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_o[0] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'o', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o ) );
		KeysetList_Explode_o[1] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ò', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_grave ) );
		KeysetList_Explode_o[2] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ó', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_acute ) );
		KeysetList_Explode_o[3] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ô', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_circumflex ) );
		KeysetList_Explode_o[4] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ö', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_diaeresis ) );
		KeysetList_Explode_o[5] = this.KeyboardLayout_Portrait.new CKeyset( 26, android.view.KeyEvent.KEYCODE_UNKNOWN, 'õ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_tilde ) );
		KeysetList_Explode_o[6] = this.KeyboardLayout_Portrait.new CKeyset( 27, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ø', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_stroke ) );
		KeysetList_Explode_o[7] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'œ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_oe ) );

		// O explode
		KeysetList_Explode_O = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_O[0] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'O', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o ) );
		KeysetList_Explode_O[1] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ò', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_grave ) );
		KeysetList_Explode_O[2] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ó', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_acute ) );
		KeysetList_Explode_O[3] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ô', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_circumflex ) );
		KeysetList_Explode_O[4] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ö', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_diaeresis ) );
		KeysetList_Explode_O[5] = this.KeyboardLayout_Portrait.new CKeyset( 26, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Õ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_tilde ) );
		KeysetList_Explode_O[6] = this.KeyboardLayout_Portrait.new CKeyset( 27, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ø', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_stroke ) );
		KeysetList_Explode_O[7] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Œ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_oe ) );

		// s explode
		KeysetList_Explode_s = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_s[0] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, 's', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_s ) );
		KeysetList_Explode_s[1] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, '§', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_section ) );
		KeysetList_Explode_s[2] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ß', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_sharp ) );

		// S explode
		KeysetList_Explode_S = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_S[0] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, 'S', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_s ) );
		KeysetList_Explode_S[1] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, '§', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_section ) );
		KeysetList_Explode_S[2] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ß', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_sharp ) );

		// u explode
		KeysetList_Explode_u = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_u[0] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'u', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u ) );
		KeysetList_Explode_u[1] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ù', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_grave ) );
		KeysetList_Explode_u[2] = this.KeyboardLayout_Portrait.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ú', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_acute ) );
		KeysetList_Explode_u[3] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'û', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_circumflex ) );
		KeysetList_Explode_u[4] = this.KeyboardLayout_Portrait.new CKeyset( 21, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ü', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_diaeresis ) );

		// U explode
		KeysetList_Explode_U = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_U[0] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'U', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u ) );
		KeysetList_Explode_U[1] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ù', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_grave ) );
		KeysetList_Explode_U[2] = this.KeyboardLayout_Portrait.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ú', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_acute ) );
		KeysetList_Explode_U[3] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Û', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_circumflex ) );
		KeysetList_Explode_U[4] = this.KeyboardLayout_Portrait.new CKeyset( 21, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ü', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_diaeresis ) );

		// y explode
		KeysetList_Explode_y = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_y[0] = this.KeyboardLayout_Portrait.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y ) );
		KeysetList_Explode_y[1] = this.KeyboardLayout_Portrait.new CKeyset( 1, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ý', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y_acute ) );
		KeysetList_Explode_y[2] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ÿ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y_diaeresis ) );

		// Y explode
		KeysetList_Explode_Y = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_Y[0] = this.KeyboardLayout_Portrait.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y ) );
		KeysetList_Explode_Y[1] = this.KeyboardLayout_Portrait.new CKeyset( 1, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ý', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y_acute ) );
		KeysetList_Explode_Y[2] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ÿ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y_diaeresis ) );

		// money explode
		KeysetList_Explode_money = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_money[0] = this.KeyboardLayout_Portrait.new CKeyset( 2, android.view.KeyEvent.KEYCODE_UNKNOWN, '$', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_dollar ) );
		KeysetList_Explode_money[1] = this.KeyboardLayout_Portrait.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, '¢', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_cent ) );
		KeysetList_Explode_money[2] = this.KeyboardLayout_Portrait.new CKeyset( 1, android.view.KeyEvent.KEYCODE_UNKNOWN, '£', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pound ) );
		KeysetList_Explode_money[3] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, '€', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_euro ) );
		KeysetList_Explode_money[4] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, '¥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_yen ) );

		// group explode
		KeysetList_Explode_group = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_group[0] = this.KeyboardLayout_Portrait.new CKeyset( 4, android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_left_parenthesis ) );
		KeysetList_Explode_group[1] = this.KeyboardLayout_Portrait.new CKeyset( 5, android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_parenthesis ) );
		KeysetList_Explode_group[2] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, '[', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_left_square_bracket ) );
		KeysetList_Explode_group[3] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, ']', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_square_bracket ) );
		KeysetList_Explode_group[4] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, '{', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_left_curly_bracket ) );
		KeysetList_Explode_group[5] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, '}', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_curly_bracket ) );
		KeysetList_Explode_group[6] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, '<', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_less_than ) );
		KeysetList_Explode_group[7] = this.KeyboardLayout_Portrait.new CKeyset( 26, android.view.KeyEvent.KEYCODE_UNKNOWN, '>', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_greater_than ) );

		// math operators explode
		KeysetList_Explode_math_operators = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_math_operators[0] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, '+', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_plus ) );
		KeysetList_Explode_math_operators[1] = this.KeyboardLayout_Portrait.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ) );
		KeysetList_Explode_math_operators[2] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, '*', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_asterisk ) );
		KeysetList_Explode_math_operators[3] = this.KeyboardLayout_Portrait.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_Explode_math_operators[4] = this.KeyboardLayout_Portrait.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, '±', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_plus_minus ) );
		KeysetList_Explode_math_operators[5] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, '×', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_multiplication ) );
		KeysetList_Explode_math_operators[6] = this.KeyboardLayout_Portrait.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, '÷', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_division ) );
		KeysetList_Explode_math_operators[7] = this.KeyboardLayout_Portrait.new CKeyset( 23, android.view.KeyEvent.KEYCODE_UNKNOWN, '\\', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_backslash ) );

		// math comparison explode
		KeysetList_Explode_math_comparison = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_math_comparison[0] = this.KeyboardLayout_Portrait.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, '=', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_equals ) );
		KeysetList_Explode_math_comparison[1] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, '≠', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_not_equal_to ) );
		KeysetList_Explode_math_comparison[2] = this.KeyboardLayout_Portrait.new CKeyset( 5, android.view.KeyEvent.KEYCODE_UNKNOWN, '≈', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_almost_equal_to ) );
		KeysetList_Explode_math_comparison[3] = this.KeyboardLayout_Portrait.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, '≡', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_identical_to ) );
		KeysetList_Explode_math_comparison[4] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, '≤', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_less_than_or_equal_to ) );
		KeysetList_Explode_math_comparison[5] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, '≥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_greater_than_or_equal_to ) );
		KeysetList_Explode_math_comparison[6] = this.KeyboardLayout_Portrait.new CKeyset( 26, android.view.KeyEvent.KEYCODE_UNKNOWN, '<', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_less_than ) );
		KeysetList_Explode_math_comparison[7] = this.KeyboardLayout_Portrait.new CKeyset( 27, android.view.KeyEvent.KEYCODE_UNKNOWN, '>', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_greater_than ) );

		// punctuation explode
		KeysetList_Explode_punctuation = new CKeyboardLayout.CKeyset[4];
		KeysetList_Explode_punctuation[0] = this.KeyboardLayout_Portrait.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ) );
		KeysetList_Explode_punctuation[1] = this.KeyboardLayout_Portrait.new CKeyset( 21, android.view.KeyEvent.KEYCODE_UNKNOWN, '?', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_question_mark ) );
		KeysetList_Explode_punctuation[2] = this.KeyboardLayout_Portrait.new CKeyset( 5, android.view.KeyEvent.KEYCODE_UNKNOWN, '¡', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_inverted_exclamation_mark ) );
		KeysetList_Explode_punctuation[3] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, '¿', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_inverted_question_mark ) );

		// copyright explode
		KeysetList_Explode_copyright = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_copyright[0] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, '©', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_copyright ) );
		KeysetList_Explode_copyright[1] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, '®', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_registered ) );
		KeysetList_Explode_copyright[2] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, '™', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_trade_mark ) );

		// heart explode ♥♣♠♦♪♫♀♂
		KeysetList_Explode_heart = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_heart[0] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, '♥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_heart ) );
		KeysetList_Explode_heart[1] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, '♦', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_diamond ) );
		KeysetList_Explode_heart[2] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, '♠', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_spade ) );
		KeysetList_Explode_heart[3] = this.KeyboardLayout_Portrait.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, '♣', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_club ) );
		KeysetList_Explode_heart[4] = this.KeyboardLayout_Portrait.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, '♪', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_eighth_note ) );
		//Keyset_Portrait_Explode_heart[5] = this.KeyboardLayout_Portrait.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, '♫', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_beamed_eighth_notes ) );

		// pi explode
		KeysetList_Explode_pi = new CKeyboardLayout.CKeyset[9];
		KeysetList_Explode_pi[0] = this.KeyboardLayout_Portrait.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, 'π', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pi ) );
		KeysetList_Explode_pi[1] = this.KeyboardLayout_Portrait.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, '∏', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_n_ary_product ) );
		KeysetList_Explode_pi[2] = this.KeyboardLayout_Portrait.new CKeyset( 11, android.view.KeyEvent.KEYCODE_UNKNOWN, '∑', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_n_ary_summation ) );
		KeysetList_Explode_pi[3] = this.KeyboardLayout_Portrait.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, '∞', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_infinity ) );
		KeysetList_Explode_pi[4] = this.KeyboardLayout_Portrait.new CKeyset( 2, android.view.KeyEvent.KEYCODE_UNKNOWN, '∆', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_increment ) );
		KeysetList_Explode_pi[5] = this.KeyboardLayout_Portrait.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, '√', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_square_root ) );
		KeysetList_Explode_pi[6] = this.KeyboardLayout_Portrait.new CKeyset( 4, android.view.KeyEvent.KEYCODE_UNKNOWN, '∟', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_angle ) );
		KeysetList_Explode_pi[7] = this.KeyboardLayout_Portrait.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, '∩', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_intersection ) );
		KeysetList_Explode_pi[8] = this.KeyboardLayout_Portrait.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, '∫', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_integral ) );

	}

	private void InitializePortrait()
	{
		//
		//
		// portrait
		//
		//

		if ( KeyboardLayout_Portrait != null )
			return;

		// layout
		KeyboardLayout_Portrait = new CKeyboardLayout( ETexture_keyboard_portrait );

		KeyboardLayout_Portrait.KeyList = new CKeyboardLayout.CKey[35];

		KeyboardLayout_Portrait.KeyList[0] = this.KeyboardLayout_Portrait.new CKey( 0, new android.graphics.PointF( 18, 16 ), new android.graphics.PointF( 0, 4 ), ETexture_hl_top_left, ETexture_gl_top_left, new android.graphics.PointF( 28, 26 ), new android.graphics.RectF( 0, 4, 50, 48 ) );
		KeyboardLayout_Portrait.KeyList[1] = this.KeyboardLayout_Portrait.new CKey( 1, new android.graphics.PointF( 62, 16 ), new android.graphics.PointF( 51, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 72, 26 ), new android.graphics.RectF( 50, 4, 94, 48 ) );
		KeyboardLayout_Portrait.KeyList[2] = this.KeyboardLayout_Portrait.new CKey( 2, new android.graphics.PointF( 106, 16 ), new android.graphics.PointF( 95, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 116, 26 ), new android.graphics.RectF( 94, 4, 138, 48 ) );
		KeyboardLayout_Portrait.KeyList[3] = this.KeyboardLayout_Portrait.new CKey( 3, new android.graphics.PointF( 150, 16 ), new android.graphics.PointF( 139, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 160, 26 ), new android.graphics.RectF( 138, 4, 182, 48 ) );
		KeyboardLayout_Portrait.KeyList[4] = this.KeyboardLayout_Portrait.new CKey( 4, new android.graphics.PointF( 194, 16 ), new android.graphics.PointF( 183, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 204, 26 ), new android.graphics.RectF( 182, 4, 226, 48 ) );
		KeyboardLayout_Portrait.KeyList[5] = this.KeyboardLayout_Portrait.new CKey( 5, new android.graphics.PointF( 238, 16 ), new android.graphics.PointF( 227, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 248, 26 ), new android.graphics.RectF( 226, 4, 270, 48 ) );
		KeyboardLayout_Portrait.KeyList[6] = this.KeyboardLayout_Portrait.new CKey( 6, new android.graphics.PointF( 282, 16 ), new android.graphics.PointF( 271, 4 ), ETexture_hl_top_right, ETexture_gl_top_right, new android.graphics.PointF( 292, 26 ), new android.graphics.RectF( 270, 4, 320, 48 ) );

		KeyboardLayout_Portrait.KeyList[7] = this.KeyboardLayout_Portrait.new CKey( 7, new android.graphics.PointF( 3, 52 ), new android.graphics.PointF( 0, 40 ), ETexture_hl_left_out, ETexture_gl_left_out, new android.graphics.PointF( 2, 62 ), new android.graphics.RectF( 0, 39, 28, 85 ) );
		KeyboardLayout_Portrait.KeyList[8] = this.KeyboardLayout_Portrait.new CKey( 8, new android.graphics.PointF( 40, 53 ), new android.graphics.PointF( 29, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 50, 62 ), new android.graphics.RectF( 28, 40, 72, 84 ) );
		KeyboardLayout_Portrait.KeyList[9] = this.KeyboardLayout_Portrait.new CKey( 9, new android.graphics.PointF( 84, 53 ), new android.graphics.PointF( 73, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 94, 62 ), new android.graphics.RectF( 72, 40, 116, 84 ) );
		KeyboardLayout_Portrait.KeyList[10] = this.KeyboardLayout_Portrait.new CKey( 10, new android.graphics.PointF( 127, 53 ), new android.graphics.PointF( 117, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 138, 62 ), new android.graphics.RectF( 116, 40, 160, 84 ) );
		KeyboardLayout_Portrait.KeyList[11] = this.KeyboardLayout_Portrait.new CKey( 11, new android.graphics.PointF( 172, 53 ), new android.graphics.PointF( 161, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 182, 62 ), new android.graphics.RectF( 160, 40, 204, 84 ) );
		KeyboardLayout_Portrait.KeyList[12] = this.KeyboardLayout_Portrait.new CKey( 12, new android.graphics.PointF( 216, 53 ), new android.graphics.PointF( 205, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 226, 62 ), new android.graphics.RectF( 204, 40, 248, 84 ) );
		KeyboardLayout_Portrait.KeyList[13] = this.KeyboardLayout_Portrait.new CKey( 13, new android.graphics.PointF( 260, 53 ), new android.graphics.PointF( 249, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 270, 62 ), new android.graphics.RectF( 248, 40, 292, 84 ) );
		KeyboardLayout_Portrait.KeyList[14] = this.KeyboardLayout_Portrait.new CKey( 14, new android.graphics.PointF( 297, 52 ), new android.graphics.PointF( 293, 40 ), ETexture_hl_right_out, ETexture_gl_right_out, new android.graphics.PointF( 318, 62 ), new android.graphics.RectF( 292, 39, 320, 85 ) );

		KeyboardLayout_Portrait.KeyList[15] = this.KeyboardLayout_Portrait.new CKey( 15, new android.graphics.PointF( 18, 88 ), new android.graphics.PointF( 0, 77 ), ETexture_hl_left, ETexture_gl_left, new android.graphics.PointF( 28, 98 ), new android.graphics.RectF( 0, 76, 50, 120 ) );
		KeyboardLayout_Portrait.KeyList[16] = this.KeyboardLayout_Portrait.new CKey( 16, new android.graphics.PointF( 62, 88 ), new android.graphics.PointF( 51, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 72, 98 ), new android.graphics.RectF( 50, 76, 94, 120 ) );
		KeyboardLayout_Portrait.KeyList[17] = this.KeyboardLayout_Portrait.new CKey( 17, new android.graphics.PointF( 106, 88 ), new android.graphics.PointF( 95, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 116, 98 ), new android.graphics.RectF( 94, 76, 138, 120 ) );
		KeyboardLayout_Portrait.KeyList[18] = this.KeyboardLayout_Portrait.new CKey( 18, new android.graphics.PointF( 150, 88 ), new android.graphics.PointF( 139, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 160, 98 ), new android.graphics.RectF( 138, 76, 182, 120 ) );
		KeyboardLayout_Portrait.KeyList[19] = this.KeyboardLayout_Portrait.new CKey( 19, new android.graphics.PointF( 194, 88 ), new android.graphics.PointF( 183, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 204, 98 ), new android.graphics.RectF( 182, 76, 226, 120 ) );
		KeyboardLayout_Portrait.KeyList[20] = this.KeyboardLayout_Portrait.new CKey( 20, new android.graphics.PointF( 238, 88 ), new android.graphics.PointF( 227, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 248, 98 ), new android.graphics.RectF( 226, 76, 270, 120 ) );
		KeyboardLayout_Portrait.KeyList[21] = this.KeyboardLayout_Portrait.new CKey( 21, new android.graphics.PointF( 282, 88 ), new android.graphics.PointF( 271, 77 ), ETexture_hl_right, ETexture_gl_right, new android.graphics.PointF( 292, 98 ), new android.graphics.RectF( 270, 76, 320, 120 ) );

		KeyboardLayout_Portrait.KeyList[22] = this.KeyboardLayout_Portrait.new CKey( 22, new android.graphics.PointF( 3, 124 ), new android.graphics.PointF( 0, 112 ), ETexture_hl_left_out, ETexture_gl_left_out, new android.graphics.PointF( 2, 134 ), new android.graphics.RectF( 0, 111, 28, 157 ) );
		KeyboardLayout_Portrait.KeyList[23] = this.KeyboardLayout_Portrait.new CKey( 23, new android.graphics.PointF( 40, 124 ), new android.graphics.PointF( 29, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 50, 134 ), new android.graphics.RectF( 28, 112, 72, 156 ) );
		KeyboardLayout_Portrait.KeyList[24] = this.KeyboardLayout_Portrait.new CKey( 24, new android.graphics.PointF( 84, 124 ), new android.graphics.PointF( 73, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 94, 134 ), new android.graphics.RectF( 72, 112, 116, 156 ) );
		KeyboardLayout_Portrait.KeyList[25] = this.KeyboardLayout_Portrait.new CKey( 25, new android.graphics.PointF( 127, 124 ), new android.graphics.PointF( 117, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 138, 134 ), new android.graphics.RectF( 116, 112, 160, 156 ) );
		KeyboardLayout_Portrait.KeyList[26] = this.KeyboardLayout_Portrait.new CKey( 26, new android.graphics.PointF( 172, 124 ), new android.graphics.PointF( 161, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 182, 134 ), new android.graphics.RectF( 160, 112, 204, 156 ) );
		KeyboardLayout_Portrait.KeyList[27] = this.KeyboardLayout_Portrait.new CKey( 27, new android.graphics.PointF( 216, 124 ), new android.graphics.PointF( 205, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 226, 134 ), new android.graphics.RectF( 204, 112, 248, 156 ) );
		KeyboardLayout_Portrait.KeyList[28] = this.KeyboardLayout_Portrait.new CKey( 28, new android.graphics.PointF( 260, 124 ), new android.graphics.PointF( 249, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 270, 134 ), new android.graphics.RectF( 248, 112, 292, 156 ) );
		KeyboardLayout_Portrait.KeyList[29] = this.KeyboardLayout_Portrait.new CKey( 29, new android.graphics.PointF( 297, 124 ), new android.graphics.PointF( 293, 112 ), ETexture_hl_right_out, ETexture_gl_right_out, new android.graphics.PointF( 318, 134 ), new android.graphics.RectF( 292, 111, 320, 157 ) );

		KeyboardLayout_Portrait.KeyList[30] = this.KeyboardLayout_Portrait.new CKey( 30, new android.graphics.PointF( 18, 160 ), new android.graphics.PointF( 0, 148 ), ETexture_hl_bottom_left, ETexture_gl_bottom_left, new android.graphics.PointF( 28, 178 ), new android.graphics.RectF( 0, 156, 50, 186 ) );
		KeyboardLayout_Portrait.KeyList[31] = this.KeyboardLayout_Portrait.new CKey( 31, new android.graphics.PointF( 62, 160 ), new android.graphics.PointF( 48, 148 ), ETexture_hl_bottom_left_in, ETexture_gl_bottom_left_in, new android.graphics.PointF( 72, 178 ), new android.graphics.RectF( 50, 156, 94, 186 ) );
		KeyboardLayout_Portrait.KeyList[32] = this.KeyboardLayout_Portrait.new CKey( 32, new android.graphics.PointF( 150, 160 ), new android.graphics.PointF( 92, 148 ), ETexture_hl_space, ETexture_gl_space, new android.graphics.PointF( 160, 178 ), new android.graphics.RectF( 94, 156, 226, 186 ) );
		KeyboardLayout_Portrait.KeyList[33] = this.KeyboardLayout_Portrait.new CKey( 33, new android.graphics.PointF( 238, 160 ), new android.graphics.PointF( 227, 148 ), ETexture_hl_bottom_right_in, ETexture_gl_bottom_right_in, new android.graphics.PointF( 248, 178 ), new android.graphics.RectF( 226, 156, 270, 186 ) );
		KeyboardLayout_Portrait.KeyList[34] = this.KeyboardLayout_Portrait.new CKey( 34, new android.graphics.PointF( 282, 160 ), new android.graphics.PointF( 271, 148 ), ETexture_hl_bottom_right, ETexture_gl_bottom_right, new android.graphics.PointF( 292, 178 ), new android.graphics.RectF( 270, 156, 320, 186 ) );

		//
		InitializePortrait_Part2_BecauseOfSuckingArbitraryMethodSizeLimitationsThatThrowRunTimeErrors();

		// alpha lower
		KeysetList_AlphaLower = new CKeyboardLayout.CKeyset[35];
		KeysetList_AlphaLower[0] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_M, 'm', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_m ) );
		KeysetList_AlphaLower[1] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_L, 'l', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_l ) );
		KeysetList_AlphaLower[2] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_D, 'd', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_d ) );
		KeysetList_AlphaLower[3] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_V, 'v', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_v ) );
		KeysetList_AlphaLower[4] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_B, 'b', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_b ) );
		KeysetList_AlphaLower[5] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_J, 'j', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_j ) );
		KeysetList_AlphaLower[6] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_Z, 'z', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_z ) );

		KeysetList_AlphaLower[7] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_AlphaLower[8] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_Y, 'y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y ), KeysetList_Explode_y, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[9] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_R, 'r', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_r ) );
		KeysetList_AlphaLower[10] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_S, 's', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_s ), KeysetList_Explode_s, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[11] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_N, 'n', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_n ), KeysetList_Explode_n, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[12] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_G, 'g', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_g ) );
		KeysetList_AlphaLower[13] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_X, 'x', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_x ) );
		KeysetList_AlphaLower[14] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_AlphaLower[15] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_W, 'w', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_w ) );
		KeysetList_AlphaLower[16] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_A, 'a', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a ), KeysetList_Explode_a, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[17] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_E, 'e', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e ), KeysetList_Explode_e, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[18] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_I, 'i', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i ), KeysetList_Explode_i, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[19] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_O, 'o', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o ), KeysetList_Explode_o, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[20] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_U, 'u', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u ), KeysetList_Explode_u, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[21] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_Q, 'q', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_q ) );

		KeysetList_AlphaLower[22] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_LEFT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_AlphaLower[23] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_T, 't', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_t ) );
		KeysetList_AlphaLower[24] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_H, 'h', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_h ) );
		KeysetList_AlphaLower[25] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_C, 'c', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_c ), KeysetList_Explode_c, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[26] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_K, 'k', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_k ) );
		KeysetList_AlphaLower[27] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_F, 'f', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_f ) );
		KeysetList_AlphaLower[28] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_P, 'p', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_p ) );
		KeysetList_AlphaLower[29] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_RIGHT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );

		KeysetList_AlphaLower[30] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_AlphaLower[31] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_AlphaLower[32] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_AlphaLower[33] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_AlphaLower[34] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// alpha upper
		KeysetList_AlphaUpper = new CKeyboardLayout.CKeyset[35];
		KeysetList_AlphaUpper[0] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_M, 'M', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_m ) );
		KeysetList_AlphaUpper[1] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_L, 'L', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_l ) );
		KeysetList_AlphaUpper[2] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_D, 'D', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_d ) );
		KeysetList_AlphaUpper[3] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_V, 'V', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_v ) );
		KeysetList_AlphaUpper[4] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_B, 'B', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_b ) );
		KeysetList_AlphaUpper[5] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_J, 'J', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_j ) );
		KeysetList_AlphaUpper[6] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_Z, 'Z', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_z ) );

		KeysetList_AlphaUpper[7] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_AlphaUpper[8] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_Y, 'Y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y ), KeysetList_Explode_Y, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[9] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_R, 'R', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_r ) );
		KeysetList_AlphaUpper[10] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_S, 'S', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_s ), KeysetList_Explode_S, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[11] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_N, 'N', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_n ), KeysetList_Explode_N, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[12] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_G, 'G', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_g ) );
		KeysetList_AlphaUpper[13] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_X, 'X', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_x ) );
		KeysetList_AlphaUpper[14] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_AlphaUpper[15] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_W, 'W', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_w ) );
		KeysetList_AlphaUpper[16] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_A, 'A', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a ), KeysetList_Explode_A, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[17] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_E, 'E', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e ), KeysetList_Explode_E, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[18] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_I, 'I', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i ), KeysetList_Explode_I, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[19] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_O, 'O', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o ), KeysetList_Explode_O, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[20] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_U, 'U', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u ), KeysetList_Explode_U, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[21] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_Q, 'Q', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_q ) );

		KeysetList_AlphaUpper[22] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_LEFT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_AlphaUpper[23] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_T, 'T', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_t ) );
		KeysetList_AlphaUpper[24] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_H, 'H', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_h ) );
		KeysetList_AlphaUpper[25] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_C, 'C', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_c ), KeysetList_Explode_C, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[26] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_L, 'K', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_k ) );
		KeysetList_AlphaUpper[27] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_F, 'F', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_f ) );
		KeysetList_AlphaUpper[28] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_P, 'P', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_p ) );
		KeysetList_AlphaUpper[29] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_RIGHT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );

		KeysetList_AlphaUpper[30] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_AlphaUpper[31] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_AlphaUpper[32] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_AlphaUpper[33] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_AlphaUpper[34] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// symbol a
		KeysetList_SymbolA = new CKeyboardLayout.CKeyset[35];
		KeysetList_SymbolA[0] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_AT, '@', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_at ) );
		KeysetList_SymbolA[1] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_POUND, '#', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_number_sign ) );
		KeysetList_SymbolA[2] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '$', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_dollar ), KeysetList_Explode_money, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[3] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '%', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_percent ) );
		KeysetList_SymbolA[4] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[5] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[6] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ), KeysetList_Explode_punctuation, KeysetList_Explode_StaticSymbol );

		KeysetList_SymbolA[7] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_SymbolA[8] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '&', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_amperstand ) );
		KeysetList_SymbolA[9] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_PLUS, '+', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_plus ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[10] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_7, '7', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_7 ) );
		KeysetList_SymbolA[11] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_8, '8', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_8 ) );
		KeysetList_SymbolA[12] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_9, '9', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_9 ) );
		KeysetList_SymbolA[13] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_EQUALS, '=', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_equals ), KeysetList_Explode_math_comparison, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[14] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_SymbolA[15] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_APOSTROPHE, '\'', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_apostrophe ) );
		KeysetList_SymbolA[16] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_MINUS, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[17] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '*', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_asterisk ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[18] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_4, '4', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_4 ) );
		KeysetList_SymbolA[19] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_5, '5', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_5 ) );
		KeysetList_SymbolA[20] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_6, '6', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_6 ) );
		KeysetList_SymbolA[21] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '?', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_question_mark ), KeysetList_Explode_punctuation, KeysetList_Explode_StaticSymbol );

		KeysetList_SymbolA[22] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ';', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_semi_colon ) );
		KeysetList_SymbolA[23] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '"', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_quotation_mark ) );
		KeysetList_SymbolA[24] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SLASH, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[25] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_0, '0', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_0 ) );
		KeysetList_SymbolA[26] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_1, '1', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_1 ) );
		KeysetList_SymbolA[27] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_2, '2', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_2 ) );
		KeysetList_SymbolA[28] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_3, '3', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_3 ) );
		KeysetList_SymbolA[29] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ':', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_colon ) );

		KeysetList_SymbolA[30] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_SymbolA[31] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_SymbolA[32] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_SymbolA[33] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_SymbolA[34] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// symbol b
		KeysetList_SymbolB = new CKeyboardLayout.CKeyset[35];
		KeysetList_SymbolB[0] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[1] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[2] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[3] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 'π', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pi ), KeysetList_Explode_pi, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolB[4] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '_', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_underscore ) );
		KeysetList_SymbolB[5] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[6] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );

		KeysetList_SymbolB[7] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_SymbolB[8] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[9] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[10] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '`', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_grave ) );
		KeysetList_SymbolB[11] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '´', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_acute ) );
		KeysetList_SymbolB[12] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '|', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_vertical_line ) );
		KeysetList_SymbolB[13] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[14] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_SymbolB[15] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[16] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ) );
		KeysetList_SymbolB[17] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '^', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_circumflex ) );
		KeysetList_SymbolB[18] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '♥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_heart ), KeysetList_Explode_heart, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolB[19] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '¨', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_diaeresis ) );
		KeysetList_SymbolB[20] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '©', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_copyright ), KeysetList_Explode_copyright, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolB[21] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );

		KeysetList_SymbolB[22] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolB[23] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '\\', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_backslash ) );
		KeysetList_SymbolB[24] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_SymbolB[25] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '~', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_tilde ) );
		KeysetList_SymbolB[26] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '°', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_degree ) );
		KeysetList_SymbolB[27] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '¶', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pilcrow ) );
		KeysetList_SymbolB[28] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '•', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_bullet ) );
		KeysetList_SymbolB[29] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );

		KeysetList_SymbolB[30] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_SymbolB[31] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '„', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_double_comma ) );
		KeysetList_SymbolB[32] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_SymbolB[33] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '…', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_elipsis ) );
		KeysetList_SymbolB[34] = this.KeyboardLayout_Portrait.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		//
		KeyboardLayout_Portrait.KeysetList_AlphaLower = KeysetList_AlphaLower;
		KeyboardLayout_Portrait.KeysetList_AlphaUpper = KeysetList_AlphaUpper;
		KeyboardLayout_Portrait.KeysetList_SymbolA = KeysetList_SymbolA;
		KeyboardLayout_Portrait.KeysetList_SymbolB = KeysetList_SymbolB;
	}

	private void InitializeLandscape_Part2_BecauseOfSuckingArbitraryMethodSizeLimitationsThatThrowRunTimeErrors()
	{
		// color selector
		KeysetList_Explode_Options = new CKeyboardLayout.CKeyset[15];
		KeysetList_Explode_Options[0] = this.KeyboardLayout_Landscape.new CKeyset( 0, 0, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.label_portrait_layout ) );
		KeysetList_Explode_Options[0].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[1] = this.KeyboardLayout_Landscape.new CKeyset( 1, EKeyCode_PortraitLayout_Proximity, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.lo_proximity ) );
		KeysetList_Explode_Options[1].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[2] = this.KeyboardLayout_Landscape.new CKeyset( 2, EKeyCode_PortraitLayout_Proximity, 0, null );
		KeysetList_Explode_Options[3] = this.KeyboardLayout_Landscape.new CKeyset( 3, EKeyCode_PortraitLayout_Proximity, 0, null );
		KeysetList_Explode_Options[4] = this.KeyboardLayout_Landscape.new CKeyset( 13, EKeyCode_PortraitLayout_QWERTY, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.lo_qwerty ) );
		KeysetList_Explode_Options[4].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[5] = this.KeyboardLayout_Landscape.new CKeyset( 14, EKeyCode_PortraitLayout_QWERTY, 0, null );
		KeysetList_Explode_Options[6] = this.KeyboardLayout_Landscape.new CKeyset( 23, 0, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.label_color ) );
		KeysetList_Explode_Options[6].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[7] = this.KeyboardLayout_Landscape.new CKeyset( 24, EKeyCode_Red, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_red ) );
		KeysetList_Explode_Options[7].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[8] = this.KeyboardLayout_Landscape.new CKeyset( 25, EKeyCode_Green, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_green ) );
		KeysetList_Explode_Options[8].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[9] = this.KeyboardLayout_Landscape.new CKeyset( 26, EKeyCode_Navy, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_navy ) );
		KeysetList_Explode_Options[9].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[10] = this.KeyboardLayout_Landscape.new CKeyset( 36, EKeyCode_Pink, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_pink ) );
		KeysetList_Explode_Options[10].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[11] = this.KeyboardLayout_Landscape.new CKeyset( 37, EKeyCode_Gray, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.col_gray ) );
		KeysetList_Explode_Options[11].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[12] = this.KeyboardLayout_Landscape.new CKeyset( 4, 0, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.label_vibrate ) );
		KeysetList_Explode_Options[12].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[13] = this.KeyboardLayout_Landscape.new CKeyset( 5, EKeyCode_Vibrate_Off, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.vb_off ) );
		KeysetList_Explode_Options[13].UseHighlightAreaAsIconArea = true;
		KeysetList_Explode_Options[14] = this.KeyboardLayout_Landscape.new CKeyset( 17, EKeyCode_Vibrate_On, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.vb_on ) );
		KeysetList_Explode_Options[14].UseHighlightAreaAsIconArea = true;

		// static alpha
		KeysetList_Explode_StaticAlpha = new CKeyboardLayout.CKeyset[7];
		KeysetList_Explode_StaticAlpha[0] = this.KeyboardLayout_Landscape.new CKeyset( 34, android.view.KeyEvent.KEYCODE_SHIFT_LEFT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_Explode_StaticAlpha[1] = this.KeyboardLayout_Landscape.new CKeyset( 45, android.view.KeyEvent.KEYCODE_SHIFT_RIGHT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_Explode_StaticAlpha[2] = this.KeyboardLayout_Landscape.new CKeyset( 46, android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_Explode_StaticAlpha[3] = this.KeyboardLayout_Landscape.new CKeyset( 49, android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_Explode_StaticAlpha[4] = this.KeyboardLayout_Landscape.new CKeyset( 50, android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_Explode_StaticAlpha[5] = this.KeyboardLayout_Landscape.new CKeyset( 51, android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_Explode_StaticAlpha[6] = this.KeyboardLayout_Landscape.new CKeyset( 54, android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// static symbol
		KeysetList_Explode_StaticSymbol = new CKeyboardLayout.CKeyset[9];
		KeysetList_Explode_StaticSymbol[0] = this.KeyboardLayout_Landscape.new CKeyset( 46, android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_Explode_StaticSymbol[1] = this.KeyboardLayout_Landscape.new CKeyset( 47, android.view.KeyEvent.KEYCODE_UNKNOWN, '@', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_at ) );
		KeysetList_Explode_StaticSymbol[2] = this.KeyboardLayout_Landscape.new CKeyset( 48, android.view.KeyEvent.KEYCODE_UNKNOWN, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_Explode_StaticSymbol[3] = this.KeyboardLayout_Landscape.new CKeyset( 49, android.view.KeyEvent.KEYCODE_UNKNOWN, '„', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_double_comma ) );
		KeysetList_Explode_StaticSymbol[4] = this.KeyboardLayout_Landscape.new CKeyset( 50, android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_Explode_StaticSymbol[5] = this.KeyboardLayout_Landscape.new CKeyset( 51, android.view.KeyEvent.KEYCODE_UNKNOWN, '…', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_elipsis ) );
		KeysetList_Explode_StaticSymbol[6] = this.KeyboardLayout_Landscape.new CKeyset( 52, android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ) );
		KeysetList_Explode_StaticSymbol[7] = this.KeyboardLayout_Landscape.new CKeyset( 53, android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ) );
		KeysetList_Explode_StaticSymbol[8] = this.KeyboardLayout_Landscape.new CKeyset( 54, android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// a explode
		KeysetList_Explode_a = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_a[0] = this.KeyboardLayout_Landscape.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, 'a', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a ) );
		KeysetList_Explode_a[1] = this.KeyboardLayout_Landscape.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, 'à', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_grave ) );
		KeysetList_Explode_a[2] = this.KeyboardLayout_Landscape.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, 'á', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_acute ) );
		KeysetList_Explode_a[3] = this.KeyboardLayout_Landscape.new CKeyset( 23, android.view.KeyEvent.KEYCODE_UNKNOWN, 'â', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_circumflex ) );
		KeysetList_Explode_a[4] = this.KeyboardLayout_Landscape.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ä', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_diaeresis ) );
		KeysetList_Explode_a[5] = this.KeyboardLayout_Landscape.new CKeyset( 35, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ã', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_tilde ) );
		KeysetList_Explode_a[6] = this.KeyboardLayout_Landscape.new CKeyset( 36, android.view.KeyEvent.KEYCODE_UNKNOWN, 'å', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a_ring_above ) );
		KeysetList_Explode_a[7] = this.KeyboardLayout_Landscape.new CKeyset( 37, android.view.KeyEvent.KEYCODE_UNKNOWN, 'æ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_ae ) );

		// A explode
		KeysetList_Explode_A = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_A[0] = this.KeyboardLayout_Landscape.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, 'A', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a ) );
		KeysetList_Explode_A[1] = this.KeyboardLayout_Landscape.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, 'À', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_grave ) );
		KeysetList_Explode_A[2] = this.KeyboardLayout_Landscape.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Á', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_acute ) );
		KeysetList_Explode_A[3] = this.KeyboardLayout_Landscape.new CKeyset( 23, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Â', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_circumflex ) );
		KeysetList_Explode_A[4] = this.KeyboardLayout_Landscape.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ä', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_diaeresis ) );
		KeysetList_Explode_A[5] = this.KeyboardLayout_Landscape.new CKeyset( 35, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ã', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_tilde ) );
		KeysetList_Explode_A[6] = this.KeyboardLayout_Landscape.new CKeyset( 36, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Å', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a_ring_above ) );
		KeysetList_Explode_A[7] = this.KeyboardLayout_Landscape.new CKeyset( 37, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Æ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_ae ) );

		// c explode
		KeysetList_Explode_c = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_c[0] = this.KeyboardLayout_Landscape.new CKeyset( 38, android.view.KeyEvent.KEYCODE_UNKNOWN, 'c', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_c ) );
		KeysetList_Explode_c[1] = this.KeyboardLayout_Landscape.new CKeyset( 27, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ç', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_c_cedella ) );

		// C explode
		KeysetList_Explode_C = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_C[0] = this.KeyboardLayout_Landscape.new CKeyset( 38, android.view.KeyEvent.KEYCODE_UNKNOWN, 'C', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_c ) );
		KeysetList_Explode_C[1] = this.KeyboardLayout_Landscape.new CKeyset( 27, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ç', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_c_cedella ) );

		// e explode
		KeysetList_Explode_e = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_e[0] = this.KeyboardLayout_Landscape.new CKeyset( 14, android.view.KeyEvent.KEYCODE_UNKNOWN, 'e', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e ) );
		KeysetList_Explode_e[1] = this.KeyboardLayout_Landscape.new CKeyset( 2, android.view.KeyEvent.KEYCODE_UNKNOWN, 'è', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_grave ) );
		KeysetList_Explode_e[2] = this.KeyboardLayout_Landscape.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, 'é', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_acute ) );
		KeysetList_Explode_e[3] = this.KeyboardLayout_Landscape.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ê', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_circumflex ) );
		KeysetList_Explode_e[4] = this.KeyboardLayout_Landscape.new CKeyset( 15, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ë', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e_diaeresis ) );

		// E explode
		KeysetList_Explode_E = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_E[0] = this.KeyboardLayout_Landscape.new CKeyset( 14, android.view.KeyEvent.KEYCODE_UNKNOWN, 'E', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e ) );
		KeysetList_Explode_E[1] = this.KeyboardLayout_Landscape.new CKeyset( 2, android.view.KeyEvent.KEYCODE_UNKNOWN, 'È', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_grave ) );
		KeysetList_Explode_E[2] = this.KeyboardLayout_Landscape.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, 'É', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_acute ) );
		KeysetList_Explode_E[3] = this.KeyboardLayout_Landscape.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ê', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_circumflex ) );
		KeysetList_Explode_E[4] = this.KeyboardLayout_Landscape.new CKeyset( 15, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ë', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e_diaeresis ) );

		// i explode
		KeysetList_Explode_i = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_i[0] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'i', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i ) );
		KeysetList_Explode_i[1] = this.KeyboardLayout_Landscape.new CKeyset( 7, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ì', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_grave ) );
		KeysetList_Explode_i[2] = this.KeyboardLayout_Landscape.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'í', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_acute ) );
		KeysetList_Explode_i[3] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'î', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_circumflex ) );
		KeysetList_Explode_i[4] = this.KeyboardLayout_Landscape.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ï', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i_diaeresis ) );

		// I explode
		KeysetList_Explode_I = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_I[0] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'I', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i ) );
		KeysetList_Explode_I[1] = this.KeyboardLayout_Landscape.new CKeyset( 7, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ì', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_grave ) );
		KeysetList_Explode_I[2] = this.KeyboardLayout_Landscape.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Í', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_acute ) );
		KeysetList_Explode_I[3] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Î', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_circumflex ) );
		KeysetList_Explode_I[4] = this.KeyboardLayout_Landscape.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ï', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i_diaeresis ) );

		// n explode
		KeysetList_Explode_n = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_n[0] = this.KeyboardLayout_Landscape.new CKeyset( 41, android.view.KeyEvent.KEYCODE_UNKNOWN, 'n', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_n ) );
		KeysetList_Explode_n[1] = this.KeyboardLayout_Landscape.new CKeyset( 29, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ñ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_n_tilde ) );

		// N explode
		KeysetList_Explode_N = new CKeyboardLayout.CKeyset[2];
		KeysetList_Explode_N[0] = this.KeyboardLayout_Landscape.new CKeyset( 41, android.view.KeyEvent.KEYCODE_UNKNOWN, 'N', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_n ) );
		KeysetList_Explode_N[1] = this.KeyboardLayout_Landscape.new CKeyset( 29, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ñ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_n_tilde ) );

		// o explode
		KeysetList_Explode_o = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_o[0] = this.KeyboardLayout_Landscape.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'o', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o ) );
		KeysetList_Explode_o[1] = this.KeyboardLayout_Landscape.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ò', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_grave ) );
		KeysetList_Explode_o[2] = this.KeyboardLayout_Landscape.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ó', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_acute ) );
		KeysetList_Explode_o[3] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ô', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_circumflex ) );
		KeysetList_Explode_o[4] = this.KeyboardLayout_Landscape.new CKeyset( 21, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ö', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_diaeresis ) );
		KeysetList_Explode_o[5] = this.KeyboardLayout_Landscape.new CKeyset( 31, android.view.KeyEvent.KEYCODE_UNKNOWN, 'õ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_tilde ) );
		KeysetList_Explode_o[6] = this.KeyboardLayout_Landscape.new CKeyset( 32, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ø', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o_stroke ) );
		KeysetList_Explode_o[7] = this.KeyboardLayout_Landscape.new CKeyset( 30, android.view.KeyEvent.KEYCODE_UNKNOWN, 'œ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_oe ) );

		// O explode
		KeysetList_Explode_O = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_O[0] = this.KeyboardLayout_Landscape.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, 'O', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o ) );
		KeysetList_Explode_O[1] = this.KeyboardLayout_Landscape.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ò', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_grave ) );
		KeysetList_Explode_O[2] = this.KeyboardLayout_Landscape.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ó', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_acute ) );
		KeysetList_Explode_O[3] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ô', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_circumflex ) );
		KeysetList_Explode_O[4] = this.KeyboardLayout_Landscape.new CKeyset( 21, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ö', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_diaeresis ) );
		KeysetList_Explode_O[5] = this.KeyboardLayout_Landscape.new CKeyset( 31, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Õ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_tilde ) );
		KeysetList_Explode_O[6] = this.KeyboardLayout_Landscape.new CKeyset( 32, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ø', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o_stroke ) );
		KeysetList_Explode_O[7] = this.KeyboardLayout_Landscape.new CKeyset( 30, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Œ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_oe ) );

		// s explode
		KeysetList_Explode_s = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_s[0] = this.KeyboardLayout_Landscape.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 's', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_s ) );
		KeysetList_Explode_s[1] = this.KeyboardLayout_Landscape.new CKeyset( 36, android.view.KeyEvent.KEYCODE_UNKNOWN, '§', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_section ) );
		KeysetList_Explode_s[2] = this.KeyboardLayout_Landscape.new CKeyset( 37, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ß', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_sharp ) );

		// S explode
		KeysetList_Explode_S = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_S[0] = this.KeyboardLayout_Landscape.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, 'S', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_s ) );
		KeysetList_Explode_S[1] = this.KeyboardLayout_Landscape.new CKeyset( 36, android.view.KeyEvent.KEYCODE_UNKNOWN, '§', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_section ) );
		KeysetList_Explode_S[2] = this.KeyboardLayout_Landscape.new CKeyset( 37, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ß', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_sharp ) );

		// u explode
		KeysetList_Explode_u = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_u[0] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'u', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u ) );
		KeysetList_Explode_u[1] = this.KeyboardLayout_Landscape.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ù', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_grave ) );
		KeysetList_Explode_u[2] = this.KeyboardLayout_Landscape.new CKeyset( 7, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ú', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_acute ) );
		KeysetList_Explode_u[3] = this.KeyboardLayout_Landscape.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'û', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_circumflex ) );
		KeysetList_Explode_u[4] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ü', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u_diaeresis ) );

		// U explode
		KeysetList_Explode_U = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_U[0] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'U', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u ) );
		KeysetList_Explode_U[1] = this.KeyboardLayout_Landscape.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ù', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_grave ) );
		KeysetList_Explode_U[2] = this.KeyboardLayout_Landscape.new CKeyset( 7, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ú', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_acute ) );
		KeysetList_Explode_U[3] = this.KeyboardLayout_Landscape.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Û', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_circumflex ) );
		KeysetList_Explode_U[4] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ü', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u_diaeresis ) );

		// y explode
		KeysetList_Explode_y = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_y[0] = this.KeyboardLayout_Landscape.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y ) );
		KeysetList_Explode_y[1] = this.KeyboardLayout_Landscape.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ý', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y_acute ) );
		KeysetList_Explode_y[2] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'ÿ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y_diaeresis ) );

		// Y explode
		KeysetList_Explode_Y = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_Y[0] = this.KeyboardLayout_Landscape.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, 'y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y ) );
		KeysetList_Explode_Y[1] = this.KeyboardLayout_Landscape.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ý', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y_acute ) );
		KeysetList_Explode_Y[2] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, 'Ÿ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y_diaeresis ) );

		// money explode
		KeysetList_Explode_money = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_money[0] = this.KeyboardLayout_Landscape.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, '$', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_dollar ) );
		KeysetList_Explode_money[1] = this.KeyboardLayout_Landscape.new CKeyset( 2, android.view.KeyEvent.KEYCODE_UNKNOWN, '£', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pound ) );
		KeysetList_Explode_money[2] = this.KeyboardLayout_Landscape.new CKeyset( 4, android.view.KeyEvent.KEYCODE_UNKNOWN, '¢', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_cent ) );
		KeysetList_Explode_money[3] = this.KeyboardLayout_Landscape.new CKeyset( 14, android.view.KeyEvent.KEYCODE_UNKNOWN, '€', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_euro ) );
		KeysetList_Explode_money[4] = this.KeyboardLayout_Landscape.new CKeyset( 15, android.view.KeyEvent.KEYCODE_UNKNOWN, '¥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_yen ) );

		// group explode
		KeysetList_Explode_group = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_group[0] = this.KeyboardLayout_Landscape.new CKeyset( 8, android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ) );
		KeysetList_Explode_group[1] = this.KeyboardLayout_Landscape.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ) );
		KeysetList_Explode_group[2] = this.KeyboardLayout_Landscape.new CKeyset( 19, android.view.KeyEvent.KEYCODE_UNKNOWN, '[', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_left_square_bracket ) );
		KeysetList_Explode_group[3] = this.KeyboardLayout_Landscape.new CKeyset( 20, android.view.KeyEvent.KEYCODE_UNKNOWN, ']', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_square_bracket ) );
		KeysetList_Explode_group[4] = this.KeyboardLayout_Landscape.new CKeyset( 30, android.view.KeyEvent.KEYCODE_UNKNOWN, '{', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_left_curly_bracket ) );
		KeysetList_Explode_group[5] = this.KeyboardLayout_Landscape.new CKeyset( 31, android.view.KeyEvent.KEYCODE_UNKNOWN, '}', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_curly_bracket ) );
		KeysetList_Explode_group[6] = this.KeyboardLayout_Landscape.new CKeyset( 41, android.view.KeyEvent.KEYCODE_UNKNOWN, '<', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_less_than ) );
		KeysetList_Explode_group[7] = this.KeyboardLayout_Landscape.new CKeyset( 42, android.view.KeyEvent.KEYCODE_UNKNOWN, '>', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_greater_than ) );

		// math operators explode
		KeysetList_Explode_math_operators = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_math_operators[0] = this.KeyboardLayout_Landscape.new CKeyset( 12, android.view.KeyEvent.KEYCODE_UNKNOWN, '±', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_plus_minus ) );
		KeysetList_Explode_math_operators[1] = this.KeyboardLayout_Landscape.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, '+', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_plus ) );
		KeysetList_Explode_math_operators[2] = this.KeyboardLayout_Landscape.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ) );
		KeysetList_Explode_math_operators[3] = this.KeyboardLayout_Landscape.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, '*', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_asterisk ) );
		KeysetList_Explode_math_operators[4] = this.KeyboardLayout_Landscape.new CKeyset( 26, android.view.KeyEvent.KEYCODE_UNKNOWN, '×', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_multiplication ) );
		KeysetList_Explode_math_operators[5] = this.KeyboardLayout_Landscape.new CKeyset( 35, android.view.KeyEvent.KEYCODE_UNKNOWN, '\\', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_backslash ) );
		KeysetList_Explode_math_operators[6] = this.KeyboardLayout_Landscape.new CKeyset( 36, android.view.KeyEvent.KEYCODE_UNKNOWN, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_Explode_math_operators[7] = this.KeyboardLayout_Landscape.new CKeyset( 37, android.view.KeyEvent.KEYCODE_UNKNOWN, '÷', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_division ) );

		// math comparison explode
		KeysetList_Explode_math_comparison = new CKeyboardLayout.CKeyset[8];
		KeysetList_Explode_math_comparison[0] = this.KeyboardLayout_Landscape.new CKeyset( 2, android.view.KeyEvent.KEYCODE_UNKNOWN, '≈', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_almost_equal_to ) );
		KeysetList_Explode_math_comparison[1] = this.KeyboardLayout_Landscape.new CKeyset( 3, android.view.KeyEvent.KEYCODE_UNKNOWN, '≡', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_identical_to ) );
		KeysetList_Explode_math_comparison[2] = this.KeyboardLayout_Landscape.new CKeyset( 13, android.view.KeyEvent.KEYCODE_UNKNOWN, '≠', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_not_equal_to ) );
		KeysetList_Explode_math_comparison[3] = this.KeyboardLayout_Landscape.new CKeyset( 14, android.view.KeyEvent.KEYCODE_UNKNOWN, '=', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_equals ) );
		KeysetList_Explode_math_comparison[4] = this.KeyboardLayout_Landscape.new CKeyset( 24, android.view.KeyEvent.KEYCODE_UNKNOWN, '≤', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_less_than_or_equal_to ) );
		KeysetList_Explode_math_comparison[5] = this.KeyboardLayout_Landscape.new CKeyset( 25, android.view.KeyEvent.KEYCODE_UNKNOWN, '≥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_greater_than_or_equal_to ) );
		KeysetList_Explode_math_comparison[6] = this.KeyboardLayout_Landscape.new CKeyset( 35, android.view.KeyEvent.KEYCODE_UNKNOWN, '<', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_less_than ) );
		KeysetList_Explode_math_comparison[7] = this.KeyboardLayout_Landscape.new CKeyset( 36, android.view.KeyEvent.KEYCODE_UNKNOWN, '>', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_greater_than ) );

		// punctuation explode
		KeysetList_Explode_punctuation = new CKeyboardLayout.CKeyset[4];
		KeysetList_Explode_punctuation[0] = this.KeyboardLayout_Landscape.new CKeyset( 9, android.view.KeyEvent.KEYCODE_UNKNOWN, '¡', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_inverted_exclamation_mark ) );
		KeysetList_Explode_punctuation[1] = this.KeyboardLayout_Landscape.new CKeyset( 10, android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ) );
		KeysetList_Explode_punctuation[2] = this.KeyboardLayout_Landscape.new CKeyset( 32, android.view.KeyEvent.KEYCODE_UNKNOWN, '¿', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_inverted_question_mark ) );
		KeysetList_Explode_punctuation[3] = this.KeyboardLayout_Landscape.new CKeyset( 33, android.view.KeyEvent.KEYCODE_UNKNOWN, '?', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_question_mark ) );

		// copyright explode
		KeysetList_Explode_copyright = new CKeyboardLayout.CKeyset[3];
		KeysetList_Explode_copyright[0] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, '™', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_trade_mark ) );
		KeysetList_Explode_copyright[1] = this.KeyboardLayout_Landscape.new CKeyset( 29, android.view.KeyEvent.KEYCODE_UNKNOWN, '®', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_registered ) );
		KeysetList_Explode_copyright[2] = this.KeyboardLayout_Landscape.new CKeyset( 30, android.view.KeyEvent.KEYCODE_UNKNOWN, '©', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_copyright ) );

		// heart explode
		KeysetList_Explode_heart = new CKeyboardLayout.CKeyset[5];
		KeysetList_Explode_heart[0] = this.KeyboardLayout_Landscape.new CKeyset( 5, android.view.KeyEvent.KEYCODE_UNKNOWN, '♣', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_club ) );
		KeysetList_Explode_heart[1] = this.KeyboardLayout_Landscape.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, '♠', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_spade ) );
		KeysetList_Explode_heart[2] = this.KeyboardLayout_Landscape.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, '♦', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_diamond ) );
		KeysetList_Explode_heart[3] = this.KeyboardLayout_Landscape.new CKeyset( 27, android.view.KeyEvent.KEYCODE_UNKNOWN, '♪', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_eighth_note ) );
		KeysetList_Explode_heart[4] = this.KeyboardLayout_Landscape.new CKeyset( 28, android.view.KeyEvent.KEYCODE_UNKNOWN, '♥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_heart ) );

		// pi explode
		KeysetList_Explode_pi = new CKeyboardLayout.CKeyset[9];
		KeysetList_Explode_pi[0] = this.KeyboardLayout_Landscape.new CKeyset( 5, android.view.KeyEvent.KEYCODE_UNKNOWN, 'π', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pi ) );
		KeysetList_Explode_pi[1] = this.KeyboardLayout_Landscape.new CKeyset( 4, android.view.KeyEvent.KEYCODE_UNKNOWN, '∆', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_increment ) );
		KeysetList_Explode_pi[2] = this.KeyboardLayout_Landscape.new CKeyset( 15, android.view.KeyEvent.KEYCODE_UNKNOWN, '√', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_square_root ) );
		KeysetList_Explode_pi[3] = this.KeyboardLayout_Landscape.new CKeyset( 16, android.view.KeyEvent.KEYCODE_UNKNOWN, '∏', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_n_ary_product ) );
		KeysetList_Explode_pi[4] = this.KeyboardLayout_Landscape.new CKeyset( 17, android.view.KeyEvent.KEYCODE_UNKNOWN, '∑', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_n_ary_summation ) );
		KeysetList_Explode_pi[5] = this.KeyboardLayout_Landscape.new CKeyset( 28, android.view.KeyEvent.KEYCODE_UNKNOWN, '∞', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_infinity ) );
		KeysetList_Explode_pi[6] = this.KeyboardLayout_Landscape.new CKeyset( 6, android.view.KeyEvent.KEYCODE_UNKNOWN, '∟', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_right_angle ) );
		KeysetList_Explode_pi[7] = this.KeyboardLayout_Landscape.new CKeyset( 18, android.view.KeyEvent.KEYCODE_UNKNOWN, '∩', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_intersection ) );
		KeysetList_Explode_pi[8] = this.KeyboardLayout_Landscape.new CKeyset( 30, android.view.KeyEvent.KEYCODE_UNKNOWN, '∫', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_integral ) );

	}

	private void InitializeLandscape()
	{
		//
		//
		// landscape
		//
		//

		if ( KeyboardLayout_Landscape != null )
			return;

		// layout
		KeyboardLayout_Landscape = new CKeyboardLayout( ETexture_keyboard_landscape );

		KeyboardLayout_Landscape.KeyList = new CKeyboardLayout.CKey[55];

		KeyboardLayout_Landscape.KeyList[0] = this.KeyboardLayout_Landscape.new CKey( 0, new android.graphics.PointF( 11, 16 ), new android.graphics.PointF( -7, 4 ), ETexture_hl_top_left, ETexture_gl_top_left, new android.graphics.PointF( 21, 26 ), new android.graphics.RectF( 0, 4, 43, 48 ) );
		KeyboardLayout_Landscape.KeyList[1] = this.KeyboardLayout_Landscape.new CKey( 1, new android.graphics.PointF( 55, 16 ), new android.graphics.PointF( 44, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 65, 26 ), new android.graphics.RectF( 43, 4, 87, 48 ) );
		KeyboardLayout_Landscape.KeyList[2] = this.KeyboardLayout_Landscape.new CKey( 2, new android.graphics.PointF( 99, 16 ), new android.graphics.PointF( 88, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 109, 26 ), new android.graphics.RectF( 87, 4, 131, 48 ) );
		KeyboardLayout_Landscape.KeyList[3] = this.KeyboardLayout_Landscape.new CKey( 3, new android.graphics.PointF( 143, 16 ), new android.graphics.PointF( 132, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 153, 26 ), new android.graphics.RectF( 131, 4, 175, 48 ) );
		KeyboardLayout_Landscape.KeyList[4] = this.KeyboardLayout_Landscape.new CKey( 4, new android.graphics.PointF( 187, 16 ), new android.graphics.PointF( 176, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 197, 26 ), new android.graphics.RectF( 175, 4, 219, 48 ) );
		KeyboardLayout_Landscape.KeyList[5] = this.KeyboardLayout_Landscape.new CKey( 5, new android.graphics.PointF( 231, 16 ), new android.graphics.PointF( 220, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 241, 26 ), new android.graphics.RectF( 219, 4, 263, 48 ) );
		KeyboardLayout_Landscape.KeyList[6] = this.KeyboardLayout_Landscape.new CKey( 6, new android.graphics.PointF( 275, 16 ), new android.graphics.PointF( 264, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 285, 26 ), new android.graphics.RectF( 263, 4, 307, 48 ) );
		KeyboardLayout_Landscape.KeyList[7] = this.KeyboardLayout_Landscape.new CKey( 7, new android.graphics.PointF( 319, 16 ), new android.graphics.PointF( 308, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 329, 26 ), new android.graphics.RectF( 307, 4, 351, 48 ) );
		KeyboardLayout_Landscape.KeyList[8] = this.KeyboardLayout_Landscape.new CKey( 8, new android.graphics.PointF( 363, 16 ), new android.graphics.PointF( 352, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 373, 26 ), new android.graphics.RectF( 351, 4, 395, 48 ) );
		KeyboardLayout_Landscape.KeyList[9] = this.KeyboardLayout_Landscape.new CKey( 9, new android.graphics.PointF( 407, 16 ), new android.graphics.PointF( 396, 5 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 417, 26 ), new android.graphics.RectF( 395, 4, 439, 48 ) );
		KeyboardLayout_Landscape.KeyList[10] = this.KeyboardLayout_Landscape.new CKey( 10, new android.graphics.PointF( 451, 16 ), new android.graphics.PointF( 440, 4 ), ETexture_hl_top_right, ETexture_gl_top_right, new android.graphics.PointF( 461, 26 ), new android.graphics.RectF( 439, 4, 480, 48 ) );

		KeyboardLayout_Landscape.KeyList[11] = this.KeyboardLayout_Landscape.new CKey( 11, new android.graphics.PointF( 1, 52 ), new android.graphics.PointF( -7, 40 ), ETexture_hl_left_out, ETexture_gl_left_out, new android.graphics.PointF( 2, 62 ), new android.graphics.RectF( 0, 40, 21, 84 ) );
		KeyboardLayout_Landscape.KeyList[12] = this.KeyboardLayout_Landscape.new CKey( 12, new android.graphics.PointF( 33, 52 ), new android.graphics.PointF( 22, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 43, 62 ), new android.graphics.RectF( 21, 40, 65, 84 ) );
		KeyboardLayout_Landscape.KeyList[13] = this.KeyboardLayout_Landscape.new CKey( 13, new android.graphics.PointF( 77, 52 ), new android.graphics.PointF( 66, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 87, 62 ), new android.graphics.RectF( 65, 40, 109, 84 ) );
		KeyboardLayout_Landscape.KeyList[14] = this.KeyboardLayout_Landscape.new CKey( 14, new android.graphics.PointF( 120, 52 ), new android.graphics.PointF( 110, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 130, 62 ), new android.graphics.RectF( 109, 40, 153, 84 ) );
		KeyboardLayout_Landscape.KeyList[15] = this.KeyboardLayout_Landscape.new CKey( 15, new android.graphics.PointF( 165, 52 ), new android.graphics.PointF( 154, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 175, 62 ), new android.graphics.RectF( 153, 40, 197, 84 ) );
		KeyboardLayout_Landscape.KeyList[16] = this.KeyboardLayout_Landscape.new CKey( 16, new android.graphics.PointF( 208, 52 ), new android.graphics.PointF( 198, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 218, 62 ), new android.graphics.RectF( 197, 40, 241, 84 ) );
		KeyboardLayout_Landscape.KeyList[17] = this.KeyboardLayout_Landscape.new CKey( 17, new android.graphics.PointF( 253, 52 ), new android.graphics.PointF( 242, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 263, 62 ), new android.graphics.RectF( 241, 40, 285, 84 ) );
		KeyboardLayout_Landscape.KeyList[18] = this.KeyboardLayout_Landscape.new CKey( 18, new android.graphics.PointF( 296, 52 ), new android.graphics.PointF( 286, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 306, 62 ), new android.graphics.RectF( 285, 40, 329, 84 ) );
		KeyboardLayout_Landscape.KeyList[19] = this.KeyboardLayout_Landscape.new CKey( 19, new android.graphics.PointF( 341, 52 ), new android.graphics.PointF( 330, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 351, 62 ), new android.graphics.RectF( 329, 40, 373, 84 ) );
		KeyboardLayout_Landscape.KeyList[20] = this.KeyboardLayout_Landscape.new CKey( 20, new android.graphics.PointF( 384, 52 ), new android.graphics.PointF( 374, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 394, 62 ), new android.graphics.RectF( 373, 40, 417, 84 ) );
		KeyboardLayout_Landscape.KeyList[21] = this.KeyboardLayout_Landscape.new CKey( 21, new android.graphics.PointF( 429, 52 ), new android.graphics.PointF( 418, 41 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 439, 62 ), new android.graphics.RectF( 417, 40, 461, 84 ) );
		KeyboardLayout_Landscape.KeyList[22] = this.KeyboardLayout_Landscape.new CKey( 22, new android.graphics.PointF( 462, 52 ), new android.graphics.PointF( 462, 40 ), ETexture_hl_right_out, ETexture_gl_right_out, new android.graphics.PointF( 478, 62 ), new android.graphics.RectF( 461, 40, 480, 84 ) );

		KeyboardLayout_Landscape.KeyList[23] = this.KeyboardLayout_Landscape.new CKey( 23, new android.graphics.PointF( 11, 88 ), new android.graphics.PointF( -7, 77 ), ETexture_hl_left, ETexture_gl_left, new android.graphics.PointF( 21, 98 ), new android.graphics.RectF( 0, 76, 43, 120 ) );
		KeyboardLayout_Landscape.KeyList[24] = this.KeyboardLayout_Landscape.new CKey( 24, new android.graphics.PointF( 55, 88 ), new android.graphics.PointF( 44, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 65, 98 ), new android.graphics.RectF( 43, 76, 87, 120 ) );
		KeyboardLayout_Landscape.KeyList[25] = this.KeyboardLayout_Landscape.new CKey( 25, new android.graphics.PointF( 99, 88 ), new android.graphics.PointF( 88, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 109, 98 ), new android.graphics.RectF( 87, 76, 131, 120 ) );
		KeyboardLayout_Landscape.KeyList[26] = this.KeyboardLayout_Landscape.new CKey( 26, new android.graphics.PointF( 143, 88 ), new android.graphics.PointF( 132, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 153, 98 ), new android.graphics.RectF( 131, 76, 175, 120 ) );
		KeyboardLayout_Landscape.KeyList[27] = this.KeyboardLayout_Landscape.new CKey( 27, new android.graphics.PointF( 187, 88 ), new android.graphics.PointF( 176, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 197, 98 ), new android.graphics.RectF( 175, 76, 219, 120 ) );
		KeyboardLayout_Landscape.KeyList[28] = this.KeyboardLayout_Landscape.new CKey( 28, new android.graphics.PointF( 231, 88 ), new android.graphics.PointF( 220, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 241, 98 ), new android.graphics.RectF( 219, 76, 263, 120 ) );
		KeyboardLayout_Landscape.KeyList[29] = this.KeyboardLayout_Landscape.new CKey( 29, new android.graphics.PointF( 275, 88 ), new android.graphics.PointF( 264, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 285, 98 ), new android.graphics.RectF( 263, 76, 307, 120 ) );
		KeyboardLayout_Landscape.KeyList[30] = this.KeyboardLayout_Landscape.new CKey( 30, new android.graphics.PointF( 319, 88 ), new android.graphics.PointF( 308, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 329, 98 ), new android.graphics.RectF( 307, 76, 351, 120 ) );
		KeyboardLayout_Landscape.KeyList[31] = this.KeyboardLayout_Landscape.new CKey( 31, new android.graphics.PointF( 363, 88 ), new android.graphics.PointF( 352, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 373, 98 ), new android.graphics.RectF( 351, 76, 395, 120 ) );
		KeyboardLayout_Landscape.KeyList[32] = this.KeyboardLayout_Landscape.new CKey( 32, new android.graphics.PointF( 407, 88 ), new android.graphics.PointF( 396, 77 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 417, 98 ), new android.graphics.RectF( 395, 76, 439, 120 ) );
		KeyboardLayout_Landscape.KeyList[33] = this.KeyboardLayout_Landscape.new CKey( 33, new android.graphics.PointF( 451, 88 ), new android.graphics.PointF( 440, 77 ), ETexture_hl_right, ETexture_gl_right, new android.graphics.PointF( 461, 98 ), new android.graphics.RectF( 439, 76, 480, 120 ) );

		KeyboardLayout_Landscape.KeyList[34] = this.KeyboardLayout_Landscape.new CKey( 34, new android.graphics.PointF( 1, 125 ), new android.graphics.PointF( -7, 112 ), ETexture_hl_left_out, ETexture_gl_left_out, new android.graphics.PointF( 2, 134 ), new android.graphics.RectF( 0, 112, 21, 156 ) );
		KeyboardLayout_Landscape.KeyList[35] = this.KeyboardLayout_Landscape.new CKey( 35, new android.graphics.PointF( 33, 125 ), new android.graphics.PointF( 22, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 43, 134 ), new android.graphics.RectF( 21, 112, 65, 156 ) );
		KeyboardLayout_Landscape.KeyList[36] = this.KeyboardLayout_Landscape.new CKey( 36, new android.graphics.PointF( 77, 125 ), new android.graphics.PointF( 66, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 87, 134 ), new android.graphics.RectF( 65, 112, 109, 156 ) );
		KeyboardLayout_Landscape.KeyList[37] = this.KeyboardLayout_Landscape.new CKey( 37, new android.graphics.PointF( 120, 125 ), new android.graphics.PointF( 110, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 130, 134 ), new android.graphics.RectF( 109, 112, 153, 156 ) );
		KeyboardLayout_Landscape.KeyList[38] = this.KeyboardLayout_Landscape.new CKey( 38, new android.graphics.PointF( 165, 125 ), new android.graphics.PointF( 154, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 175, 134 ), new android.graphics.RectF( 153, 112, 197, 156 ) );
		KeyboardLayout_Landscape.KeyList[39] = this.KeyboardLayout_Landscape.new CKey( 39, new android.graphics.PointF( 208, 125 ), new android.graphics.PointF( 198, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 218, 134 ), new android.graphics.RectF( 197, 112, 241, 156 ) );
		KeyboardLayout_Landscape.KeyList[40] = this.KeyboardLayout_Landscape.new CKey( 40, new android.graphics.PointF( 253, 125 ), new android.graphics.PointF( 242, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 263, 134 ), new android.graphics.RectF( 241, 112, 285, 156 ) );
		KeyboardLayout_Landscape.KeyList[41] = this.KeyboardLayout_Landscape.new CKey( 41, new android.graphics.PointF( 296, 125 ), new android.graphics.PointF( 286, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 306, 134 ), new android.graphics.RectF( 285, 112, 329, 156 ) );
		KeyboardLayout_Landscape.KeyList[42] = this.KeyboardLayout_Landscape.new CKey( 42, new android.graphics.PointF( 341, 125 ), new android.graphics.PointF( 330, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 351, 134 ), new android.graphics.RectF( 329, 112, 373, 156 ) );
		KeyboardLayout_Landscape.KeyList[43] = this.KeyboardLayout_Landscape.new CKey( 43, new android.graphics.PointF( 384, 125 ), new android.graphics.PointF( 374, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 394, 134 ), new android.graphics.RectF( 373, 112, 417, 156 ) );
		KeyboardLayout_Landscape.KeyList[44] = this.KeyboardLayout_Landscape.new CKey( 44, new android.graphics.PointF( 429, 125 ), new android.graphics.PointF( 418, 113 ), ETexture_hl_normal, ETexture_gl_normal, new android.graphics.PointF( 439, 134 ), new android.graphics.RectF( 417, 112, 461, 156 ) );
		KeyboardLayout_Landscape.KeyList[45] = this.KeyboardLayout_Landscape.new CKey( 45, new android.graphics.PointF( 464, 125 ), new android.graphics.PointF( 462, 112 ), ETexture_hl_right_out, ETexture_gl_right_out, new android.graphics.PointF( 478, 134 ), new android.graphics.RectF( 461, 112, 480, 156 ) );

		KeyboardLayout_Landscape.KeyList[46] = this.KeyboardLayout_Landscape.new CKey( 46, new android.graphics.PointF( 11, 160 ), new android.graphics.PointF( -7, 148 ), ETexture_hl_bottom_left, ETexture_gl_bottom_left, new android.graphics.PointF( 21, 178 ), new android.graphics.RectF( 0, 156, 43, 186 ) );
		KeyboardLayout_Landscape.KeyList[47] = this.KeyboardLayout_Landscape.new CKey( 47, new android.graphics.PointF( 55, 160 ), new android.graphics.PointF( 41, 148 ), ETexture_hl_bottom_left_in, ETexture_gl_bottom_left_in, new android.graphics.PointF( 65, 178 ), new android.graphics.RectF( 43, 156, 87, 186 ) );
		KeyboardLayout_Landscape.KeyList[48] = this.KeyboardLayout_Landscape.new CKey( 48, new android.graphics.PointF( 99, 160 ), new android.graphics.PointF( 85, 148 ), ETexture_hl_bottom_left_in, ETexture_gl_bottom_left_in, new android.graphics.PointF( 109, 178 ), new android.graphics.RectF( 87, 156, 131, 186 ) );
		KeyboardLayout_Landscape.KeyList[49] = this.KeyboardLayout_Landscape.new CKey( 49, new android.graphics.PointF( 143, 160 ), new android.graphics.PointF( 129, 148 ), ETexture_hl_bottom_left_in, ETexture_gl_bottom_left_in, new android.graphics.PointF( 153, 178 ), new android.graphics.RectF( 131, 156, 175, 186 ) );
		KeyboardLayout_Landscape.KeyList[50] = this.KeyboardLayout_Landscape.new CKey( 50, new android.graphics.PointF( 231, 160 ), new android.graphics.PointF( 173, 148 ), ETexture_hl_space, ETexture_gl_space, new android.graphics.PointF( 241, 178 ), new android.graphics.RectF( 175, 156, 307, 186 ) );
		KeyboardLayout_Landscape.KeyList[51] = this.KeyboardLayout_Landscape.new CKey( 51, new android.graphics.PointF( 319, 160 ), new android.graphics.PointF( 308, 148 ), ETexture_hl_bottom_right_in, ETexture_gl_bottom_right_in, new android.graphics.PointF( 329, 178 ), new android.graphics.RectF( 307, 156, 351, 186 ) );
		KeyboardLayout_Landscape.KeyList[52] = this.KeyboardLayout_Landscape.new CKey( 52, new android.graphics.PointF( 363, 160 ), new android.graphics.PointF( 352, 148 ), ETexture_hl_bottom_right_in, ETexture_gl_bottom_right_in, new android.graphics.PointF( 373, 178 ), new android.graphics.RectF( 351, 156, 395, 186 ) );
		KeyboardLayout_Landscape.KeyList[53] = this.KeyboardLayout_Landscape.new CKey( 53, new android.graphics.PointF( 407, 160 ), new android.graphics.PointF( 396, 148 ), ETexture_hl_bottom_right_in, ETexture_gl_bottom_right_in, new android.graphics.PointF( 417, 178 ), new android.graphics.RectF( 395, 156, 439, 186 ) );
		KeyboardLayout_Landscape.KeyList[54] = this.KeyboardLayout_Landscape.new CKey( 54, new android.graphics.PointF( 451, 160 ), new android.graphics.PointF( 440, 148 ), ETexture_hl_bottom_right, ETexture_gl_bottom_right, new android.graphics.PointF( 461, 178 ), new android.graphics.RectF( 439, 156, 480, 186 ) );

		//
		InitializeLandscape_Part2_BecauseOfSuckingArbitraryMethodSizeLimitationsThatThrowRunTimeErrors();

		// alpha lower
		KeysetList_AlphaLower = new CKeyboardLayout.CKeyset[55];

		KeysetList_AlphaLower[0] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_1, '1', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_1 ) );
		KeysetList_AlphaLower[1] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_2, '2', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_2 ) );
		KeysetList_AlphaLower[2] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_3, '3', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_3 ) );
		KeysetList_AlphaLower[3] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_4, '4', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_4 ) );
		KeysetList_AlphaLower[4] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_5, '5', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_5 ) );
		KeysetList_AlphaLower[5] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_6, '6', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_6 ) );
		KeysetList_AlphaLower[6] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_7, '7', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_7 ) );
		KeysetList_AlphaLower[7] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_8, '8', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_8 ) );
		KeysetList_AlphaLower[8] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_9, '9', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_9 ) );
		KeysetList_AlphaLower[9] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_0, '0', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.n_0 ) );
		KeysetList_AlphaLower[10] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ), KeysetList_Explode_punctuation, KeysetList_Explode_StaticSymbol );

		KeysetList_AlphaLower[11] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_AlphaLower[12] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_Q, 'q', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_q ) );
		KeysetList_AlphaLower[13] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_W, 'w', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_w ) );
		KeysetList_AlphaLower[14] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_E, 'e', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_e ), KeysetList_Explode_e, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[15] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_R, 'r', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_r ) );
		KeysetList_AlphaLower[16] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_T, 't', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_t ) );
		KeysetList_AlphaLower[17] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_Y, 'y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_y ), KeysetList_Explode_y, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[18] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_U, 'u', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_u ), KeysetList_Explode_u, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[19] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_I, 'i', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_i ), KeysetList_Explode_i, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[20] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_O, 'o', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_o ), KeysetList_Explode_o, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[21] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_P, 'p', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_p ) );
		KeysetList_AlphaLower[22] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_AlphaLower[23] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_APOSTROPHE, '\'', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_apostrophe ) );
		KeysetList_AlphaLower[24] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_A, 'a', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_a ), KeysetList_Explode_a, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[25] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_S, 's', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_s ), KeysetList_Explode_s, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[26] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_D, 'd', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_d ) );
		KeysetList_AlphaLower[27] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_F, 'f', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_f ) );
		KeysetList_AlphaLower[28] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_G, 'g', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_g ) );
		KeysetList_AlphaLower[29] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_H, 'h', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_h ) );
		KeysetList_AlphaLower[30] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_J, 'j', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_j ) );
		KeysetList_AlphaLower[31] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_K, 'k', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_k ) );
		KeysetList_AlphaLower[32] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_L, 'l', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_l ) );
		KeysetList_AlphaLower[33] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '?', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_question_mark ), KeysetList_Explode_punctuation, KeysetList_Explode_StaticSymbol );

		KeysetList_AlphaLower[34] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_LEFT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_AlphaLower[35] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '"', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_quotation_mark ) );
		KeysetList_AlphaLower[36] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_Z, 'z', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_z ) );
		KeysetList_AlphaLower[37] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_X, 'x', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_x ) );
		KeysetList_AlphaLower[38] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_C, 'c', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_c ), KeysetList_Explode_c, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[39] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_V, 'v', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_v ) );
		KeysetList_AlphaLower[40] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_B, 'b', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_b ) );
		KeysetList_AlphaLower[41] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_N, 'n', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_n ), KeysetList_Explode_n, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaLower[42] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_M, 'm', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.l_m ) );
		KeysetList_AlphaLower[43] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ) );
		KeysetList_AlphaLower[44] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '&', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_amperstand ) );
		KeysetList_AlphaLower[45] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_RIGHT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );

		KeysetList_AlphaLower[46] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_AlphaLower[47] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_AT, '@', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_at ) );
		KeysetList_AlphaLower[48] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SLASH, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_AlphaLower[49] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_AlphaLower[50] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_AlphaLower[51] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_AlphaLower[52] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaLower[53] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaLower[54] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// alpha upper
		KeysetList_AlphaUpper = new CKeyboardLayout.CKeyset[55];

		KeysetList_AlphaUpper[0] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ) );
		KeysetList_AlphaUpper[1] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '@', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_at ) );
		KeysetList_AlphaUpper[2] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '#', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_number_sign ) );
		KeysetList_AlphaUpper[3] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '$', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_dollar ), KeysetList_Explode_money, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaUpper[4] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '%', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_percent ) );
		KeysetList_AlphaUpper[5] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '^', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_circumflex ) );
		KeysetList_AlphaUpper[6] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '&', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_amperstand ) );
		KeysetList_AlphaUpper[7] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '*', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_asterisk ) );
		KeysetList_AlphaUpper[8] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaUpper[9] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaUpper[10] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ), KeysetList_Explode_punctuation, KeysetList_Explode_StaticSymbol );

		KeysetList_AlphaUpper[11] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_AlphaUpper[12] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_Q, 'Q', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_q ) );
		KeysetList_AlphaUpper[13] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_W, 'W', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_w ) );
		KeysetList_AlphaUpper[14] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_E, 'E', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_e ), KeysetList_Explode_E, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[15] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_R, 'R', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_r ) );
		KeysetList_AlphaUpper[16] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_T, 'T', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_t ) );
		KeysetList_AlphaUpper[17] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_Y, 'Y', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_y ), KeysetList_Explode_Y, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[18] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_U, 'U', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_u ), KeysetList_Explode_U, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[19] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_I, 'I', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_i ), KeysetList_Explode_I, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[20] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_O, 'O', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_o ), KeysetList_Explode_O, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[21] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_P, 'P', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_p ) );
		KeysetList_AlphaUpper[22] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_AlphaUpper[23] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_APOSTROPHE, '\'', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_apostrophe ) );
		KeysetList_AlphaUpper[24] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_A, 'A', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_a ), KeysetList_Explode_A, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[25] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_S, 'S', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_s ), KeysetList_Explode_S, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[26] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_D, 'D', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_d ) );
		KeysetList_AlphaUpper[27] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_F, 'F', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_f ) );
		KeysetList_AlphaUpper[28] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_G, 'G', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_g ) );
		KeysetList_AlphaUpper[29] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_H, 'H', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_h ) );
		KeysetList_AlphaUpper[30] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_J, 'J', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_j ) );
		KeysetList_AlphaUpper[31] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_K, 'K', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_k ) );
		KeysetList_AlphaUpper[32] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_L, 'L', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_l ) );
		KeysetList_AlphaUpper[33] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '?', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_question_mark ), KeysetList_Explode_punctuation, KeysetList_Explode_StaticSymbol );

		KeysetList_AlphaUpper[34] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_LEFT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );
		KeysetList_AlphaUpper[35] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '"', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_quotation_mark ) );
		KeysetList_AlphaUpper[36] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_Z, 'Z', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_z ) );
		KeysetList_AlphaUpper[37] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_X, 'X', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_x ) );
		KeysetList_AlphaUpper[38] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_C, 'C', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_c ), KeysetList_Explode_C, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[39] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_V, 'V', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_v ) );
		KeysetList_AlphaUpper[40] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_B, 'B', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_b ) );
		KeysetList_AlphaUpper[41] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_N, 'N', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_n ), KeysetList_Explode_N, KeysetList_Explode_StaticAlpha );
		KeysetList_AlphaUpper[42] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_M, 'M', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.u_m ) );
		KeysetList_AlphaUpper[43] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ) );
		KeysetList_AlphaUpper[44] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '&', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_amperstand ) );
		KeysetList_AlphaUpper[45] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SHIFT_RIGHT, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.shift ) );

		KeysetList_AlphaUpper[46] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_AlphaUpper[47] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_AT, '@', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_at ) );
		KeysetList_AlphaUpper[48] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SLASH, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_AlphaUpper[49] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_COMMA, ',', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.comma ) );
		KeysetList_AlphaUpper[50] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_AlphaUpper[51] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_PERIOD, '.', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.period ) );
		KeysetList_AlphaUpper[52] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaUpper[53] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ), KeysetList_Explode_group, KeysetList_Explode_StaticSymbol );
		KeysetList_AlphaUpper[54] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		// symbol a
		KeysetList_SymbolA = new CKeyboardLayout.CKeyset[55];

		KeysetList_SymbolA[0] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[1] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[2] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '#', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_number_sign ) );
		KeysetList_SymbolA[3] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '$', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_dollar ), KeysetList_Explode_money, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[4] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '%', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_percent ) );
		KeysetList_SymbolA[5] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 'π', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pi ), KeysetList_Explode_pi, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[6] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '_', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_underscore ) );
		KeysetList_SymbolA[7] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[8] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[9] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '¡', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_inverted_exclamation_mark ) );
		KeysetList_SymbolA[10] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '!', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_exclamation_mark ) );

		KeysetList_SymbolA[11] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ) );
		KeysetList_SymbolA[12] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '&', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_amperstand ) );
		KeysetList_SymbolA[13] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '+', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_plus ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[14] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '=', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_equals ), KeysetList_Explode_math_comparison, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[15] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[16] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '`', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_grave ) );
		KeysetList_SymbolA[17] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '´', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_acute ) );
		KeysetList_SymbolA[18] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '|', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_vertical_line ) );
		KeysetList_SymbolA[19] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[20] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[21] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[22] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SYM, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.symbol ), KeysetList_Explode_Options, null );

		KeysetList_SymbolA[23] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '\'', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_apostrophe ) );
		KeysetList_SymbolA[24] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '-', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_minus ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[25] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '*', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_asterisk ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[26] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[27] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '^', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_circumflex ) );
		KeysetList_SymbolA[28] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '♥', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_heart ), KeysetList_Explode_heart, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[29] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '¨', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_diaeresis ) );
		KeysetList_SymbolA[30] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '©', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_copyright ), KeysetList_Explode_copyright, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[31] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[32] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '¿', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_inverted_question_mark ) );
		KeysetList_SymbolA[33] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '?', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_question_mark ) );

		KeysetList_SymbolA[34] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ';', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_semi_colon ) );
		KeysetList_SymbolA[35] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '"', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_quotation_mark ) );
		KeysetList_SymbolA[36] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ), KeysetList_Explode_math_operators, KeysetList_Explode_StaticSymbol );
		KeysetList_SymbolA[37] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '\\', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_backslash ) );
		KeysetList_SymbolA[38] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[39] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '~', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_tilde ) );
		KeysetList_SymbolA[40] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '°', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_degree ) );
		KeysetList_SymbolA[41] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '¶', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_pilcrow ) );
		KeysetList_SymbolA[42] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '•', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_bullet ) );
		KeysetList_SymbolA[43] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[44] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, 0, null );
		KeysetList_SymbolA[45] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ':', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_colon ) );

		KeysetList_SymbolA[46] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_DEL, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.backspace ) );
		KeysetList_SymbolA[47] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '@', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_at ) );
		KeysetList_SymbolA[48] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '/', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_slash ) );
		KeysetList_SymbolA[49] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '„', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_double_comma ) );
		KeysetList_SymbolA[50] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_SPACE, ' ', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.space ) );
		KeysetList_SymbolA[51] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '…', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_elipsis ) );
		KeysetList_SymbolA[52] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, '(', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_open ) );
		KeysetList_SymbolA[53] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_UNKNOWN, ')', android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.s_parentheses_close ) );
		KeysetList_SymbolA[54] = this.KeyboardLayout_Landscape.new CKeyset( android.view.KeyEvent.KEYCODE_ENTER, 0, android.graphics.BitmapFactory.decodeResource( getResources(), R.drawable.enter ) );

		//
		KeyboardLayout_Landscape.KeysetList_AlphaLower = KeysetList_AlphaLower;
		KeyboardLayout_Landscape.KeysetList_AlphaUpper = KeysetList_AlphaUpper;
		KeyboardLayout_Landscape.KeysetList_SymbolA = KeysetList_SymbolA;
		KeyboardLayout_Landscape.KeysetList_SymbolB = null;
	}

	private void UpdateLocklights()
	{
		int SymbolFlags = 0x00;
		int ShiftFlags = 0x00;

		boolean Symbols = SymbolState == 0;
		if ( Symbols )
		{
			if ( ( KeyboardLayout.KeysetListExploded != null ) && ( KeyboardLayout.KeysetListExplodedStatic != null ) )
			{
				if ( ( KeyboardLayout.KeysetList == KeyboardLayout.KeysetList_SymbolA ) || ( KeyboardLayout.KeysetList == KeyboardLayout.KeysetList_SymbolB ) )
				{
					Symbols = false;
				}
			}
		}
		if ( Symbols )
		{
			if ( ShiftState == 1 )
			{
				ShiftFlags = 0x02;
			}
			else if ( ShiftState == 2 )
			{
				ShiftFlags = 0x04;
			}
		}
		else
		{
			if ( KeyboardLayout.KeysetListExploded == null )
			{
				SymbolFlags = 0x02;
			}
		}

		if ( KeyboardLayout_Portrait != null )
		{
			KeyboardLayout_Portrait.KeyList[7].HighlightFlags = SymbolFlags;
			KeyboardLayout_Portrait.KeyList[14].HighlightFlags = SymbolFlags;

			KeyboardLayout_Portrait.KeyList[22].HighlightFlags = ShiftFlags;
			KeyboardLayout_Portrait.KeyList[29].HighlightFlags = ShiftFlags;
		}
		if ( KeyboardLayout_Landscape != null )
		{
			KeyboardLayout_Landscape.KeyList[11].HighlightFlags = SymbolFlags;
			KeyboardLayout_Landscape.KeyList[22].HighlightFlags = SymbolFlags;

			KeyboardLayout_Landscape.KeyList[34].HighlightFlags = ShiftFlags;
			KeyboardLayout_Landscape.KeyList[45].HighlightFlags = ShiftFlags;
		}
	}

	boolean Landscape;

	private void InitializeKeyboardLayout()
	{
		KeyboardLayout = null;
		KeyboardLayout_Portrait = null;
		KeyboardLayout_Landscape = null;

		if ( Landscape )
		{
			InitializeLandscape();
			KeyboardLayout = KeyboardLayout_Landscape;
		}
		else
		{
			if ( PortraitLayoutIndex == EPortraitLayout_Proximity )
			{
				InitializePortrait();
				KeyboardLayout = KeyboardLayout_Portrait;
			}
			else
			{
				InitializeLandscape();
				KeyboardLayout = KeyboardLayout_Landscape;
			}
		}
	}

	private void SelectKeysetList()
	{
		switch ( KeysetListID )
		{
			case EKeysetList_Alpha:
				ShiftState = 0;
				SymbolState = 0;
				UpdateLocklights();
				KeyboardLayout.ResetToAlphaLower();
				break;

			case EKeysetList_Number:
				ShiftState = 0;
				SymbolState = 0;
				UpdateLocklights();
				KeyboardLayout.ResetToAlphaLower();
				break;

			case EKeysetList_Symbol:
				ShiftState = 1;
				SymbolState = 0;
				UpdateLocklights();
				KeyboardLayout.ResetToSymbol();
				break;
		}
	}

	private void FindLayoutScale()
	{
		if ( KeyboardLayout_Landscape != null )
		{
			// landscape
			LayoutScale = (float)LayoutWidth / 480.0f;
		}
		else
		{
			// portrait
			LayoutScale = (float)LayoutWidth / 320.0f;
		}

		if ( LayoutScale == 1.0 )
		{
			Paint_Base.setFilterBitmap( false );
		}
		else
		{
			Paint_Base.setFilterBitmap( true );
		}
	}

	int LayoutWidth = 0;
	int LayoutHeight = 0;

	@Override
	protected void onMeasure( int widthMeasureSpec, int heightMeasureSpec )
	{
		android.util.Log.i( "HexBoard", "onMeasure()" );

		Landscape = MeasureSpec.getSize( widthMeasureSpec ) > MeasureSpec.getSize( heightMeasureSpec );

		// choose layout
		InitializeKeyboardLayout();

		// width
		int specMode = MeasureSpec.getMode( widthMeasureSpec );
		int specSize = MeasureSpec.getSize( widthMeasureSpec );
		if ( specMode == MeasureSpec.EXACTLY )
		{
			LayoutWidth = specSize;
		}
		else
		{
			LayoutHeight = specSize;
		}

		//
		FindLayoutScale();

		// height
		specMode = MeasureSpec.getMode( heightMeasureSpec );
		specSize = MeasureSpec.getSize( heightMeasureSpec );
		if ( specMode == MeasureSpec.EXACTLY )
		{
			LayoutHeight = specSize;
		}
		else
		{
			LayoutHeight = (int)( 186.0f * LayoutScale + 0.5f );
		}

		// set
		setMeasuredDimension( LayoutWidth, LayoutHeight );

		// wave stuff
		WaveRadius = -1.0f;

		// aquire colored texture
		AquireColoredTextures();

		// transform layout
		KeyboardLayout.Transform();

		// select keyset list
		SelectKeysetList();
	}

	@Override
	protected void onDraw( android.graphics.Canvas canvas )
	{
		//if ( canvas != null )
		//{
		//	super.onDraw( canvas );
		//}

		Paint_Base.setColor( 0xFFFFFF );
		Paint_Base.setAlpha( 255 );
		KeyboardLayout.Draw( canvas );
	}

	private float PressureNow = 0.0f;
	//private float PressureLast = 0.0f;
	//private float PressureDelta = 0.0f;
	//private boolean PressureUp = false;

	private float WaveOriginX;
	private float WaveOriginY;
	private float WaveRadius;

	private void SpawnWave( float X, float Y )
	{
		WaveOriginX = X;
		WaveOriginY = Y;
		WaveRadius = 4096;
	}

	@Override
	public boolean onTouchEvent( android.view.MotionEvent event )
	{
		invalidate();

		// find pressure for animations
		//PressureLast = PressureNow;
		PressureNow = event.getPressure();

		switch ( event.getAction() )
		{
			case android.view.MotionEvent.ACTION_DOWN:
				KeyboardLayout.TouchDown( (int)event.getX(), (int)event.getY() );
				return true;

			case android.view.MotionEvent.ACTION_MOVE:
				KeyboardLayout.TouchMove( (int)event.getX(), (int)event.getY() );
				return true;

			case android.view.MotionEvent.ACTION_UP:
				KeyboardLayout.TouchUp( (int)event.getX(), (int)event.getY() );
				return true;
		}
		return false;
	}

	/*
	private float HueShift = 0.78f;

	private void ToRGB( int ARGB, float[] RGB )
	{
		RGB[0] = (float)( ( ARGB >> 16 ) & 0xFF ) / 255.0f;
		RGB[1] = (float)( ( ARGB >> 8 ) & 0xFF ) / 255.0f;
		RGB[2] = (float)( ARGB & 0xFF ) / 255.0f;
	}

	private void ToYIQ( float[] RGB, float[] YIQ )
	{
		YIQ[0] = ( 0.299f * RGB[0] ) + ( 0.587f * RGB[1] ) + ( 0.114f * RGB[2] );
		YIQ[1] = ( 0.596f * RGB[0] ) + ( -0.274f * RGB[1] ) + ( -0.321f * RGB[2] );
		YIQ[2] = ( 0.211f * RGB[0] ) + ( -0.523f * RGB[1] ) + ( 0.311f * RGB[2] );
	}

	private void CalculateYIQHueShiftParameters( float HueShift, float[] UW )
	{
		UW[0] = android.util.FloatMath.cos( HueShift * 3.14159265f );
		UW[1] = android.util.FloatMath.sin( HueShift * 3.14159265f );
	}

	private void PerformYIQHueShift( float[] YIQ, float[] UW )
	{
		float Y = YIQ[0];
		float I = ( UW[0] * YIQ[1] ) + ( -UW[1] * YIQ[2] );
		float Q = ( UW[1] * YIQ[1] ) + ( UW[0] * YIQ[2] );
		YIQ[0] = Y;
		YIQ[1] = I;
		YIQ[2] = Q;
	}

	private void ToRGB( float[] YIQ, float[] RGB )
	{
		RGB[0] = YIQ[0] + ( 0.956f * YIQ[1] ) + ( 0.621f * YIQ[2] );
		RGB[1] = YIQ[0] + ( -0.272f * YIQ[1] ) + ( -0.647f * YIQ[2] );
		RGB[2] = YIQ[0] + ( -1.107f * YIQ[1] ) + ( 1.705f * YIQ[2] );
	}

	private int ToARGB( int A, float[] RGB )
	{
		int ARGB = A & 0xFF000000; //= A << 24;
		ARGB |= (int)( RGB[0] * 255.0f ) << 16;
		ARGB |= (int)( RGB[1] * 255.0f ) << 8;
		ARGB |= (int)( RGB[2] * 255.0f );
		return ARGB;
	}

	private android.graphics.Bitmap LoadBitmap( int ResourceID )
	{
		// i have a suspicion that the reason for mutable vs immutable bitmaps lies with mutable bitmaps being stored in CPU memory and immutable bitmaps being stored in GPU memory.
		// so immutable bitmaps probably perform better when drawing.

		android.graphics.Bitmap Result = android.graphics.BitmapFactory.decodeResource( getResources(), ResourceID );

		int A;
		int R;
		int G;
		int B;

		float[] HSV = new float[3];

		float[] RGB = new float[3];
		float[] YIQ = new float[3];
		float[] UW = new float[2];

		CalculateYIQHueShiftParameters( HueShift, UW );

		if ( HueShift != 0.0f )
		{
			// perform a hue shift on the loaded bitmap
			// this might take a while
			android.graphics.Bitmap ResultShifted = Result.copy( Config.ARGB_8888, true );
			Result.recycle();
			Result = ResultShifted;
			int Width = Result.getWidth();
			int Height = Result.getHeight();
			for ( int y = 0; y < Height; y++ )
			{
				for ( int x = 0; x < Width; x++ )
				{
					int ARGB = Result.getPixel( x, y );

					// native implementation
					//A = Color.alpha( ARGB );
					//R = Color.red( ARGB );
					//G = Color.green( ARGB );
					//B = Color.blue( ARGB );
					//Color.RGBToHSV( R, G, B, HSV );
					//HSV[0] = HSV[0] + HueShift;
					//ARGB = Color.HSVToColor( A, HSV );

					ToRGB( ARGB, RGB );
					ToYIQ( RGB, YIQ );
					PerformYIQHueShift( YIQ, UW );
					ToRGB( YIQ, RGB );
					ARGB = ToARGB( ARGB, RGB );

					Result.setPixel( x, y, ARGB );
				}
			}
		}

		return Result;
	}
	*/
}
