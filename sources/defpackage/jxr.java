package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jxr  reason: default package */
/* loaded from: classes.dex */
public final class jxr {
    public final String a;
    public final List b;
    public final Set c;
    public final jxn f;
    public boolean d = false;
    public mko e = mkk.a;
    private mko g = null;

    public jxr(String str, List list, Set set, jxn jxnVar) {
        this.a = str;
        this.b = list;
        this.c = set;
        this.f = jxnVar;
    }

    public final synchronized void a() {
        this.d = true;
        mko mkoVar = this.g;
        if (mkoVar != null) {
            mkoVar.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(jxr jxrVar) {
        mko mkoVar = jxrVar.g;
        if (mkoVar != null) {
            c(mkoVar);
        }
    }

    final synchronized void c(mko mkoVar) {
        this.e = mkoVar;
    }

    public final synchronized void d(mko mkoVar) {
        this.g = mkoVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
        r0 = ((defpackage.jvj) r24).a;
        r1 = new java.io.IOException("SqlitePendingPacks#add, SQL replace returned < 0, parentId: " + r8 + " rowId: " + r5);
        r0.a(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013b, code lost:
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [juh] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [juh] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [lls] */
    /* JADX WARN: Type inference failed for: r14v3, types: [lls] */
    /* JADX WARN: Type inference failed for: r14v4, types: [lls] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r17v2, types: [jwf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mko e(java.util.Collection r20, boolean r21, defpackage.jvr r22, defpackage.mkr r23, defpackage.jvc r24, defpackage.opu r25, defpackage.jwz r26) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxr.e(java.util.Collection, boolean, jvr, mkr, jvc, opu, jwz):mko");
    }
}
