
package com.smilo.bullpen;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class ContentsService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return (new ContentsFactory(this.getApplicationContext(),
                intent));
    }

}