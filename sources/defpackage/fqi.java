package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqi  reason: default package */
/* loaded from: classes.dex */
public abstract class fqi extends fqk {
    public final int a;
    public final Bundle b;
    final /* synthetic */ fqq c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqi(fqq fqqVar, int i, Bundle bundle) {
        super(fqqVar, true);
        this.c = fqqVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(fmt fmtVar);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqk
    public final void b() {
    }

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fqk
    public final /* bridge */ /* synthetic */ void d() {
        PendingIntent pendingIntent = null;
        if (this.a == 0) {
            if (c()) {
                return;
            }
            this.c.z(1, null);
            a(new fmt(8, null));
            return;
        }
        this.c.z(1, null);
        Bundle bundle = this.b;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        a(new fmt(this.a, pendingIntent));
    }
}
