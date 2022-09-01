package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: iev  reason: default package */
/* loaded from: classes.dex */
public final class iev implements ies {
    public final /* synthetic */ iew a;
    private final inm b;
    private final ino c;
    private final int d = R.string.f161080_resource_name_obfuscated_res_0x7f14068c;
    private boolean e;

    public iev(iew iewVar, ino inoVar) {
        this.a = iewVar;
        fdo fdoVar = new fdo(this, 14);
        this.b = fdoVar;
        this.c = inoVar;
        inoVar.X(fdoVar, R.string.f161080_resource_name_obfuscated_res_0x7f14068c);
    }

    @Override // defpackage.ies
    public final void a() {
        this.e = this.c.aj(this.d);
    }

    @Override // defpackage.ies
    public final boolean b() {
        return this.e;
    }
}
