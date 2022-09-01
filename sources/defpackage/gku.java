package defpackage;

import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gku  reason: default package */
/* loaded from: classes.dex */
public final class gku implements leq {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gku(eac eacVar, int i) {
        this.b = i;
        this.a = eacVar;
    }

    public gku(gkv gkvVar, int i) {
        this.b = i;
        this.a = gkvVar;
    }

    @Override // defpackage.leq
    public final /* synthetic */ Object a(Object obj) {
        if (this.b == 0) {
            blj bljVar = (blj) obj;
            if (bljVar.c != 1) {
                ((gkv) this.a).a.a();
            }
            return bljVar;
        }
        Void r4 = (Void) obj;
        eac eacVar = (eac) this.a;
        eac.i(eacVar.i, 8);
        eac.i(eacVar.g, 0);
        eac.i(eacVar.j, 0);
        eac.i(eacVar.f, 4);
        eac.h(eacVar.h, eacVar.b.getString(R.string.f188240_resource_name_obfuscated_res_0x7f1411bc));
        bfc bfcVar = eacVar.k;
        if (bfcVar != null) {
            hjq.a(eacVar.b).h(Integer.valueOf((int) R.drawable.emoji_kitchen_zero_state)).s(bfcVar);
        }
        hjq.a(eacVar.b).l(eacVar.l);
        ((eac) this.a).c();
        return null;
    }
}
