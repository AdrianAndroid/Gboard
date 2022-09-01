package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cnj  reason: default package */
/* loaded from: classes.dex */
public final class cnj implements oiy {
    private final csh a;
    private final /* synthetic */ int b;

    public cnj(csh cshVar, int i) {
        this.b = i;
        this.a = cshVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            Context context = ((csg) this.a).a;
            nxp.W(context);
            return context;
        } else if (i == 1) {
            Context context2 = ((csg) this.a).b;
            nxp.W(context2);
            return context2;
        } else if (i == 2) {
            llw llwVar = ((csg) this.a).f;
            nxp.W(llwVar);
            return llwVar;
        } else if (i == 3) {
            llw llwVar2 = ((csg) this.a).f;
            nxp.W(llwVar2);
            return llwVar2;
        } else if (i == 4) {
            llw llwVar3 = ((csg) this.a).f;
            nxp.W(llwVar3);
            return llwVar3;
        } else {
            llw llwVar4 = ((csg) this.a).f;
            nxp.W(llwVar4);
            return llwVar4;
        }
    }
}
