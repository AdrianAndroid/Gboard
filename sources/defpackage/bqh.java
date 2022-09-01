package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bqh  reason: default package */
/* loaded from: classes.dex */
public class bqh extends deb {
    private final bqi k;
    private final boolean l;
    private final inm m;
    private boolean n;

    public bqh(Context context, bqi bqiVar, boolean z) {
        super(context, bqiVar);
        btf btfVar = new btf(this, 1);
        this.m = btfVar;
        this.k = bqiVar;
        this.l = z;
        ino M = ino.M(context);
        c(M);
        M.Z(btfVar, R.string.f160420_resource_name_obfuscated_res_0x7f140647);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.deb
    public final int a(hln hlnVar, boolean z) {
        hlm hlmVar = hlm.RECOMMENDATION;
        int i = hlnVar.s;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 9) {
                if (z) {
                    return this.k.j;
                }
                return this.k.i;
            }
            switch (i2) {
                case 1:
                    return this.k.c;
                case 2:
                    return this.k.e;
                case 3:
                case 4:
                    return this.k.f;
                case 5:
                    return this.k.g;
                case 6:
                    return this.k.h;
                default:
                    int ordinal = hlnVar.e.ordinal();
                    if (ordinal == 6) {
                        return this.k.a;
                    }
                    if (ordinal == 7) {
                        return this.k.b;
                    }
                    return (!hlnVar.g || !this.l) ? super.a(hlnVar, z) : this.k.d;
            }
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.deb
    public void b(ico icoVar, iaj iajVar, int i, hln hlnVar, boolean z) {
        super.b(icoVar, iajVar, i, hlnVar, z);
        if (this.n) {
            iajVar.k();
            iajVar.b = iah.SLIDE_DOWN;
            iajVar.n(-10103, null, hlnVar);
            icoVar.s = icr.NORMAL;
            icoVar.p(iajVar.b());
        }
        if (hlnVar.e != hlm.APP_COMPLETION || !(hlnVar.k instanceof String)) {
            return;
        }
        iajVar.k();
        iajVar.b = iah.LONG_PRESS;
        iajVar.f = true;
        iajVar.n(-110000, null, hlnVar);
        icoVar.o = -1;
        icoVar.p(iajVar.b());
    }

    public final void c(ino inoVar) {
        this.n = inoVar.aj(R.string.f160420_resource_name_obfuscated_res_0x7f140647);
    }
}
