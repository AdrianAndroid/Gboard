package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: dwf  reason: default package */
/* loaded from: classes.dex */
public final class dwf {
    dwk a;
    private final dwh b;

    public dwf(dwh dwhVar) {
        this.b = dwhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        dwk dwkVar = this.a;
        if (dwkVar != null) {
            dwkVar.j();
            this.a = null;
        }
    }

    public final void b(int i) {
        if (i != 2) {
            this.b.n(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(dwk dwkVar, bkr bkrVar, int i, int i2) {
        d(dwkVar, bkrVar, i, i2, R.layout.f143930_resource_name_obfuscated_res_0x7f0e0499);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(dwk dwkVar, bkr bkrVar, int i, int i2, int i3) {
        a();
        this.a = dwkVar;
        dwkVar.k(new dwe(this, i3, bkrVar, i, i2), null);
    }
}
