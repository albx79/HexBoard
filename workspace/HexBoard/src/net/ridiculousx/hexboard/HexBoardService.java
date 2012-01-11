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

public class HexBoardService extends android.inputmethodservice.InputMethodService implements android.view.View.OnTouchListener
{
	private CKeyboardView mView; // the keyboard.

	//private android.media.AudioTrack mAudioTrack;
	
	/**
	 * Main initialization of the input method component. Be sure to call
	 * to super class.
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		android.util.Log.i( "HexBoard", "onCreate()" );

		// create shared preferences
		android.content.SharedPreferences SharedPreferences = getSharedPreferences( "HexBoard", 0 );
		android.content.SharedPreferences.Editor SharedPreferencesEditor = SharedPreferences.edit();
		if ( !SharedPreferences.contains( "Color" ) )
		{
			SharedPreferencesEditor.putInt( "Color", 0 );
		}
		if ( !SharedPreferences.contains( "PortraitLayout" ) )
		{
			SharedPreferencesEditor.putInt( "PortraitLayout", 0 );
		}
		if ( !SharedPreferences.contains( "Vibrate" ) )
		{
			SharedPreferencesEditor.putInt( "Vibrate", 0 );
		}
		if ( !SharedPreferences.contains( "Beep" ) )
		{
			SharedPreferencesEditor.putInt( "Beep", 0 );
		}
		SharedPreferencesEditor.commit();
	}

	@Override
	public void onDestroy()
	{
		super.onDestroy();

		android.util.Log.i( "HexBoard", "onDestroy()" );

		SavePreferences();
	}

	public void SavePreferences()
	{
		if ( mView != null )
		{
			android.content.SharedPreferences SharedPreferences = getSharedPreferences( "HexBoard", 0 );
			android.content.SharedPreferences.Editor SharedPreferencesEditor = SharedPreferences.edit();
			SharedPreferencesEditor.putInt( "Color", mView.GetColorIndex() );
			SharedPreferencesEditor.putInt( "PortraitLayout", mView.GetPortraitLayoutIndex() );
			SharedPreferencesEditor.putInt( "Vibrate", mView.GetVibrateIndex() );
			SharedPreferencesEditor.putInt( "Beep", mView.GetBeepIndex() );
			SharedPreferencesEditor.commit();
		}
	}

	/**
	 * This is the point where you can do all of your UI initialization. It
	 * is called after creation and any configuration change.
	 */
	@Override
	public void onInitializeInterface()
	{
		android.util.Log.i( "HexBoard", "onInitializeInterface()" );
		// load shared preferences
		android.content.SharedPreferences SharedPreferences = getSharedPreferences( "HexBoard", 0 );
		int Color = SharedPreferences.getInt( "Color", 0 );
		int PortraitLayout = SharedPreferences.getInt( "PortraitLayout", 0 );
		int Vibrate = SharedPreferences.getInt( "Vibrate", 0 );
		int Beep = SharedPreferences.getInt( "Beep", 1 );
		// initialize
		mView = new CKeyboardView( this, Color, PortraitLayout, Vibrate, 1 );
		mView.setOnTouchListener( this );
		//
		//mAudioTrack = new android.media.AudioTrack( android.media.AudioManager.STREAM_SYSTEM, 22050, android.media.AudioFormat.CHANNEL_CONFIGURATION_MONO, android.media.AudioFormat.ENCODING_PCM_8BIT, 512, android.media.AudioTrack.MODE_STATIC );
	}

	/**
	 * Called by the framework when your view for creating input needs to
	 * be generated. This will be called the first time your input method
	 * is displayed, and every time it needs to be re-created such as due to
	 * a configuration change.
	 */
	@Override
	public android.view.View onCreateInputView()
	{
		android.util.Log.i( "HexBoard", "onCreateInputView()" );

		return mView;
	}

	/**
	 * Called by the framework when your view for showing candidates needs to
	 * be generated, like {@link #onCreateInputView}.
	 */
	@Override
	public android.view.View onCreateCandidatesView()
	{
		return null;
	}

	@Override
	public void onBindInput()
	{
		android.util.Log.i( "HexBoard", "onBindInput()" );

		super.onBindInput();
	}

	/**
	 * This is the main point where we do our initialization of the input method
	 * to begin operating on an application. At this point we have been
	 * bound to the client, and are now receiving all of the detailed
	 * information
	 * about the target of our edits.
	 */
	@Override
	public void onStartInput( android.view.inputmethod.EditorInfo attribute, boolean restarting )
	{
		android.util.Log.i( "HexBoard", "onStartInput()" );

		super.onStartInput( attribute, restarting );

		// Reset our state.  We want to do this even if restarting, because
		// the underlying state of the text editor could have changed in any way.
		//mComposing.setLength( 0 );

		if ( restarting )
		{
		}
		else
		{
		}

		switch ( attribute.inputType & android.view.inputmethod.EditorInfo.TYPE_MASK_CLASS )
		{
			case android.view.inputmethod.EditorInfo.TYPE_CLASS_NUMBER:
			case android.view.inputmethod.EditorInfo.TYPE_CLASS_DATETIME:
				// symbols
				mView.KeysetListID = CKeyboardView.EKeysetList_Number;
				break;

			case android.view.inputmethod.EditorInfo.TYPE_CLASS_PHONE:
				// symbols
				mView.KeysetListID = CKeyboardView.EKeysetList_Number;
				break;

			case android.view.inputmethod.EditorInfo.TYPE_CLASS_TEXT:
				// alpha
				mView.KeysetListID = CKeyboardView.EKeysetList_Alpha;

				// We now look for a few special variations of text that will
				// modify our behavior.
				int variation = attribute.inputType & android.view.inputmethod.EditorInfo.TYPE_MASK_VARIATION;
				if ( variation == android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_PASSWORD || variation == android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD )
				{
					// turn off prediction for passwords
				}

				if ( variation == android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_EMAIL_ADDRESS || variation == android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_URI || variation == android.view.inputmethod.EditorInfo.TYPE_TEXT_VARIATION_FILTER )
				{
					// turn off prediction for URLs
				}

				if ( ( attribute.inputType & android.view.inputmethod.EditorInfo.TYPE_TEXT_FLAG_AUTO_COMPLETE ) != 0 )
				{
					// turn of prediction and completion because input field already handles it
				}
				break;

			default:
				// alpha
				mView.KeysetListID = CKeyboardView.EKeysetList_Alpha;
				break;

		}

		// ime options
	}

	@Override
	public void onStartInputView( android.view.inputmethod.EditorInfo attribute, boolean restarting )
	{
		android.util.Log.i( "HexBoard", "onStartInputView()" );

		super.onStartInputView( attribute, restarting );
	}

	/**
	 * This is called when the user is done editing a field. We can use
	 * this to reset our state.
	 */
	@Override
	public void onFinishInput()
	{
		super.onFinishInput();
	}

	@Override
	public boolean onTouch( android.view.View v, android.view.MotionEvent event )
	{
		return false;
	}
}
