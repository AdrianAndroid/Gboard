package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dm  reason: default package */
/* loaded from: classes.dex */
public abstract class dm {
    private BroadcastReceiver a;
    final /* synthetic */ dr c;

    public dm(dr drVar) {
        this.c = drVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        c();
        IntentFilter a = a();
        if (a.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new dl(this);
        }
        this.c.l.registerReceiver(this.a, a);
    }
}
