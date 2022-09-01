package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: egx  reason: default package */
/* loaded from: classes.dex */
public final class egx implements oiy {
    private final csh a;
    private final /* synthetic */ int b;

    public egx(csh cshVar, int i) {
        this.b = i;
        this.a = cshVar;
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return b();
            }
            return i != 2 ? b() : b();
        }
        return b();
    }

    public final Context b() {
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
            Context context3 = ((csg) this.a).b;
            nxp.W(context3);
            return context3;
        } else {
            Context context4 = ((csg) this.a).a;
            nxp.W(context4);
            return context4;
        }
    }
}
