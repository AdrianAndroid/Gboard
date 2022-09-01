package com.google.android.enterprise.connectedapps;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CrossProfileConnector_Service extends Service {
    private fjt a = new fjt(this);

    @Override // android.app.Service
    public final /* synthetic */ IBinder onBind(Intent intent) {
        return this.a;
    }
}
