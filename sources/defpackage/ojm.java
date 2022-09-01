package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ojm  reason: default package */
/* loaded from: classes2.dex */
final class ojm extends ojn implements RandomAccess {
    private final ojn a;
    private final int b;
    private int c;

    public ojm(ojn ojnVar, int i, int i2) {
        this.a = ojnVar;
        this.b = i;
        int a = ojnVar.a();
        if (i < 0 || i2 > a) {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + a);
        } else if (i <= i2) {
            this.c = i2 - i;
        } else {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
    }

    @Override // defpackage.ojj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ojn, java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        return this.a.get(this.b + i);
    }
}
