package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: mzk  reason: default package */
/* loaded from: classes2.dex */
public abstract class mzk extends mzv {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final void d(mzv mzvVar, ome omeVar) {
        oll.e(mzvVar, "<this>");
        oll.e(omeVar, "property");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void e(nab nabVar, ome omeVar) {
        oll.e(nabVar, "<this>");
        oll.e(omeVar, "property");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void f(mzv mzvVar, mzk mzkVar, ome omeVar) {
        oll.e(mzvVar, "<this>");
        oll.e(mzkVar, "thisRef");
        oll.e(omeVar, "property");
        mzvVar.b = omeVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void g(nab nabVar, mzk mzkVar, ome omeVar) {
        oll.e(mzkVar, "thisRef");
        oll.e(omeVar, "property");
        nabVar.b = omeVar.c();
    }

    @Override // defpackage.mzv
    public final List a() {
        return c().a();
    }

    @Override // defpackage.mzv
    public final ndb b(String str, mzz mzzVar) {
        oll.e(str, "input");
        oll.e(mzzVar, "pos");
        return c().b(str, mzzVar);
    }

    public abstract mzv c();
}
