package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(akr akrVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) akrVar.t(remoteActionCompat.a);
        remoteActionCompat.b = akrVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = akrVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) akrVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = akrVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = akrVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, akr akrVar) {
        akrVar.u(remoteActionCompat.a);
        akrVar.g(remoteActionCompat.b, 2);
        akrVar.g(remoteActionCompat.c, 3);
        akrVar.i(remoteActionCompat.d, 4);
        akrVar.f(remoteActionCompat.e, 5);
        akrVar.f(remoteActionCompat.f, 6);
    }
}
