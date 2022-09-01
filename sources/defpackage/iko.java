package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: iko  reason: default package */
/* loaded from: classes.dex */
public final class iko {
    public static final /* synthetic */ int a = 0;
    private static final lug b = hin.a;
    private static final lfy c = lfy.c('\t');

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(java.io.InputStream r19, defpackage.ikh r20) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iko.a(java.io.InputStream, ikh):int");
    }

    private static boolean b(String str) {
        return lfd.e(str) || !str.contains("\t");
    }

    private static final boolean c(String str, jav javVar, ikh ikhVar) {
        if (b(str)) {
            return false;
        }
        List k = c.k(str);
        if (k.size() < 2) {
            return false;
        }
        ikhVar.a(new ika(-1L, (String) k.get(1), (String) k.get(0), javVar));
        return true;
    }
}
