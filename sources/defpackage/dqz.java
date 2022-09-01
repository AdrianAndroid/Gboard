package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: dqz  reason: default package */
/* loaded from: classes.dex */
public final class dqz {
    public final ieh a;
    public final dqy b;
    public final dqx c;
    public final boolean d;
    public final gjz i;
    public long h = 0;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public dqz(Context context, ieh iehVar, hls hlsVar, boolean z, boolean z2, gjz gjzVar, byte[] bArr) {
        this.a = iehVar;
        this.b = new dqy(hlsVar, iehVar);
        this.c = new dqx(context, hlsVar, z, gqa.a(context));
        this.d = z2;
        this.i = gjzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(ggh gghVar, gfv gfvVar) {
        int h;
        if ((gfvVar == null || (gfvVar.a & 1) == 0) && gghVar != null && (h = gqn.h(gghVar.b)) != 0 && h == 4 && (gghVar.a & 4) != 0) {
            ggl gglVar = gghVar.d;
            if (gglVar == null) {
                gglVar = ggl.h;
            }
            if ((gglVar.a & 4) != 0) {
                ggl gglVar2 = gghVar.d;
                if (gglVar2 == null) {
                    gglVar2 = ggl.h;
                }
                ggk b = ggk.b(gglVar2.c);
                if (b == null) {
                    b = ggk.NO_SPECIALKEY;
                }
                return b == ggk.BACKSPACE || b == ggk.DEL;
            }
            ggl gglVar3 = gghVar.d;
            if (((gglVar3 == null ? ggl.h : gglVar3).a & 1) != 0) {
                int i = (gglVar3 == null ? ggl.h : gglVar3).b;
                if (i == 103 || i == 104) {
                    if (gglVar3 == null) {
                        gglVar3 = ggl.h;
                    }
                    if (new nfu(gglVar3.d, ggl.e).contains(ggi.CTRL)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ggc r16, java.lang.String r17, defpackage.gfv r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqz.a(ggc, java.lang.String, gfv, java.lang.String, java.lang.String, boolean, boolean):void");
    }
}
