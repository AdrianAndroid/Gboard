package defpackage;

import android.content.Intent;
import android.os.IBinder;
import com.google.frameworks.client.data.android.binder.AndroidServiceServerBuilder$InternalServerLifecycle;

/* compiled from: PG */
/* renamed from: dul  reason: default package */
/* loaded from: classes.dex */
public class dul extends afy {
    private lgb a;

    @Override // defpackage.afy, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return ((AndroidServiceServerBuilder$InternalServerLifecycle) this.a).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0262 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025b  */
    @Override // defpackage.afy, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dul.onCreate():void");
    }
}
