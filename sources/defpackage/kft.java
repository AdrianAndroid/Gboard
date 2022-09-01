package defpackage;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: kft  reason: default package */
/* loaded from: classes.dex */
public final class kft implements kch {
    final /* synthetic */ mks a;
    public final /* synthetic */ kfw b;

    public kft(kfw kfwVar, mks mksVar) {
        this.b = kfwVar;
        this.a = mksVar;
    }

    @Override // defpackage.kch
    public final void c(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(3, simpleName);
        this.b.a();
        this.b.c = this.a.a(new idx(this, simpleName, 20), 10L, TimeUnit.SECONDS);
    }
}
