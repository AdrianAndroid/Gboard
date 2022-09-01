package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kze  reason: default package */
/* loaded from: classes.dex */
public abstract class kze {
    public final jlt b;
    private final IntentFilter c;
    private final Context d;
    protected final Set a = new HashSet();
    private kzd e = null;
    private volatile boolean f = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public kze(jlt jltVar, IntentFilter intentFilter, Context context, byte[] bArr, byte[] bArr2) {
        this.b = jltVar;
        this.c = intentFilter;
        this.d = lby.d(context);
    }

    private final void f() {
        kzd kzdVar;
        if ((this.f || !this.a.isEmpty()) && this.e == null) {
            this.e = new kzd(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.d.registerReceiver(this.e, this.c, 2);
            }
            this.d.registerReceiver(this.e, this.c);
        }
        if (this.f || !this.a.isEmpty() || (kzdVar = this.e) == null) {
            return;
        }
        this.d.unregisterReceiver(kzdVar);
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(kzf kzfVar) {
        this.b.g("registerListener", new Object[0]);
        lby.b(kzfVar, "Registered Play Core listener should not be null.");
        this.a.add(kzfVar);
        f();
    }

    public final synchronized void c(kzf kzfVar) {
        this.b.g("unregisterListener", new Object[0]);
        lby.b(kzfVar, "Unregistered Play Core listener should not be null.");
        this.a.remove(kzfVar);
        f();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((kzf) it.next()).a(obj);
        }
    }

    public final synchronized void e() {
        this.f = true;
        f();
    }
}
