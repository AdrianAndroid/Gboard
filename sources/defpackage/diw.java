package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.BitSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: diw  reason: default package */
/* loaded from: classes.dex */
public final class diw implements Iterator, j$.util.Iterator {
    private int a;
    private final int b;
    private final BitSet c;
    private final dji d;
    private final hlk e = hln.a();
    private final HmmEngineInterfaceImpl f;

    public diw(HmmEngineInterfaceImpl hmmEngineInterfaceImpl, BitSet bitSet, dji djiVar) {
        this.f = hmmEngineInterfaceImpl;
        this.c = bitSet;
        this.d = djiVar;
        this.b = hmmEngineInterfaceImpl.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.hln next() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.diw.next():hln");
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < this.f.b();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
