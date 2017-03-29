package receiver;

import service.AutoUpdateService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Intent i = new Intent(arg0, AutoUpdateService.class);
		arg0.startService(i);
	}

}
