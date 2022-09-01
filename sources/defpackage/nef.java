package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: nef  reason: default package */
/* loaded from: classes2.dex */
public final class nef extends neg {
    final /* synthetic */ nem a;
    private int b = 0;
    private final int c;

    public nef(nem nemVar) {
        this.a = nemVar;
        this.c = nemVar.d();
    }

    @Override // defpackage.nei
    public final byte a() {
        int i = this.b;
        if (i >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return this.a.b(i);
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c;
    }
}
