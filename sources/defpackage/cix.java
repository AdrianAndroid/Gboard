package defpackage;

/* compiled from: PG */
/* renamed from: cix  reason: default package */
/* loaded from: classes.dex */
public final class cix implements npe {
    private final oiy a;
    private final /* synthetic */ int b;

    public cix(oiy oiyVar, int i) {
        this.b = i;
        this.a = oiyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (defpackage.cuz.a.b(r0) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean b() {
        /*
            r4 = this;
            int r0 = r4.b
            if (r0 == 0) goto L47
            r1 = 1
            if (r0 == r1) goto L19
            oiy r0 = r4.a
            csb r0 = (defpackage.csb) r0
            r0.a()
            hhl r0 = defpackage.cit.F
            boolean r0 = defpackage.iqi.p(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L19:
            oiy r0 = r4.a
            npf r0 = (defpackage.npf) r0
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            hhl r2 = defpackage.cit.g
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L41
            cuz r2 = defpackage.cuz.a
            boolean r2 = defpackage.jam.H(r0)
            if (r2 == 0) goto L41
            cuz r2 = defpackage.cuz.a
            boolean r0 = r2.b(r0)
            if (r0 != 0) goto L41
            goto L42
        L41:
            r1 = 0
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L47:
            oiy r0 = r4.a
            csb r0 = (defpackage.csb) r0
            r0.a()
            hhl r0 = defpackage.czu.a
            boolean r0 = defpackage.iqi.p(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cix.b():java.lang.Boolean");
    }

    @Override // defpackage.oiy
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? b() : b();
        }
        return b();
    }
}
