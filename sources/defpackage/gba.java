package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: gba  reason: default package */
/* loaded from: classes.dex */
public interface gba extends IInterface {
    void addHttpUrlConnectionFactory(String str, gal galVar);

    IBinder onBind(Intent intent);

    void onCreate(ftm ftmVar);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);

    @Deprecated
    void setPRFSdkImpl();
}
