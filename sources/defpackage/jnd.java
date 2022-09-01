package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jnd  reason: default package */
/* loaded from: classes.dex */
public final class jnd extends mjy {
    private jnd(mko mkoVar) {
        super(mkoVar);
    }

    public static jnd c(mko mkoVar) {
        if (mkoVar instanceof jnd) {
            return (jnd) mkoVar;
        }
        return new jnd(mkoVar);
    }

    public final jnd a(Class cls, leq leqVar, Executor executor) {
        return new jnd(jco.g(this.c, cls, leqVar, executor));
    }

    public final jnd b(Class cls, miy miyVar, Executor executor) {
        return new jnd(jco.h(this.c, cls, miyVar, executor));
    }

    public final jnd e(leq leqVar, Executor executor) {
        return new jnd(jco.i(this.c, leqVar, executor));
    }

    public final jnd g(miy miyVar, Executor executor) {
        return new jnd(jco.j(this.c, miyVar, executor));
    }
}
