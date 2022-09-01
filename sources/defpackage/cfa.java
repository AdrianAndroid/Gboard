package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cfa  reason: default package */
/* loaded from: classes.dex */
public final class cfa extends gxu {
    final /* synthetic */ Set a;
    final /* synthetic */ bya b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfa(bya byaVar, Set set, byte[] bArr) {
        super("FlagUpdate-SetupDelightSuperpacksTask");
        this.b = byaVar;
        this.a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        hhl hhlVar = cfd.a;
        boolean z = true;
        boolean z2 = false;
        if (this.a.contains(cfd.a) || this.a.contains(cfd.b)) {
            ((cfd) this.b.a).k(false);
            z2 = true;
        }
        if (this.a.contains(cfd.c) || this.a.contains(cfd.d)) {
            ((cfd) this.b.a).l();
        } else {
            z = z2;
        }
        if (this.a.contains(cfd.e) || this.a.contains(cfd.f)) {
            ((cfd) this.b.a).k.b();
        } else if (!z) {
            return;
        }
        Delight5Facilitator g = Delight5Facilitator.g();
        if (g != null) {
            synchronized (g.o) {
                arrayList = new ArrayList(g.o);
            }
            g.C(arrayList);
        }
    }
}
