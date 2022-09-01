package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kfu  reason: default package */
/* loaded from: classes.dex */
public final class kfu implements kci {
    final /* synthetic */ mks a;
    public final /* synthetic */ kfw b;

    public kfu(kfw kfwVar, mks mksVar) {
        this.b = kfwVar;
        this.a = mksVar;
    }

    @Override // defpackage.kci
    public final void b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(4, simpleName);
        this.b.a();
        this.b.b = this.a.a(new kht(this, simpleName, 1), 10L, TimeUnit.SECONDS);
    }
}
