package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lnx  reason: default package */
/* loaded from: classes.dex */
public final class lnx extends lsz {
    int a = 0;
    final /* synthetic */ Iterator[] b;

    public lnx(Iterator[] itArr) {
        this.b = itArr;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.a < 2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = (Iterator) Objects.requireNonNull(this.b[this.a]);
        Iterator[] itArr = this.b;
        int i = this.a;
        itArr[i] = null;
        this.a = i + 1;
        return it;
    }
}
