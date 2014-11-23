package ch.broosha.android.laenderderwelt.utilities;

import org.apache.http.StatusLine;

public interface NetworkUtilityMessageHandler {

	public void onException( Throwable exception );
	public void onError(StatusLine statusLine);
	
	
}
