package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: fts  reason: default package */
/* loaded from: classes.dex */
final class fts implements ftx {
    private final /* synthetic */ int a;

    public fts(int i) {
        this.a = i;
    }

    @Override // defpackage.ftx
    public final ftw a(Context context, String str, ftv ftvVar) {
        int b;
        if (this.a != 0) {
            ftw ftwVar = new ftw();
            int b2 = ftvVar.b(context, str, true);
            ftwVar.b = b2;
            if (b2 != 0) {
                ftwVar.c = 1;
            } else {
                int a = ftvVar.a(context, str);
                ftwVar.a = a;
                if (a != 0) {
                    ftwVar.c = -1;
                }
            }
            return ftwVar;
        }
        ftw ftwVar2 = new ftw();
        int a2 = ftvVar.a(context, str);
        ftwVar2.a = a2;
        int i = 0;
        if (a2 != 0) {
            b = ftvVar.b(context, str, false);
            ftwVar2.b = b;
        } else {
            b = ftvVar.b(context, str, true);
            ftwVar2.b = b;
        }
        int i2 = ftwVar2.a;
        if (i2 != 0) {
            i = i2;
        } else if (b == 0) {
            ftwVar2.c = 0;
            return ftwVar2;
        }
        if (i >= b) {
            ftwVar2.c = -1;
        } else {
            ftwVar2.c = 1;
        }
        return ftwVar2;
    }
}
