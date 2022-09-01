package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* renamed from: fzx  reason: default package */
/* loaded from: classes.dex */
public interface fzx extends IInterface {
    void init(ftm ftmVar, fzu fzuVar);

    IBinder onBind(Intent intent);

    void onDestroy();

    void onRebind(Intent intent);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);
}
