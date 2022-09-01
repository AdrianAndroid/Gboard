package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jol  reason: default package */
/* loaded from: classes.dex */
public final class jol implements Closeable {
    public final joi a;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final mlu d;

    public jol(joi joiVar, mlu mluVar) {
        this.a = joiVar;
        this.d = mluVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.b(new ihi(this, 20));
    }
}
