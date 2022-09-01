package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: omp  reason: default package */
/* loaded from: classes2.dex */
public final class omp implements Iterator, j$.util.Iterator {
    final /* synthetic */ omh a;
    private int b = -1;
    private int c;
    private int d;
    private olw e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, java.lang.Object] */
    public omp(omh omhVar, byte[] bArr) {
        this.a = omhVar;
        int length = omhVar.a.length();
        if (length >= 0) {
            this.c = 0;
            this.d = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [oku, java.lang.Object] */
    private final void a() {
        int i = this.d;
        int i2 = 0;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        if (i > this.a.a.length()) {
            this.e = new olw(this.c, ols.h(this.a.a));
            this.d = -1;
        } else {
            omh omhVar = this.a;
            Object a = omhVar.b.a(omhVar.a, Integer.valueOf(this.d));
            if (a != null) {
                ojc ojcVar = (ojc) a;
                int intValue = ((Number) ojcVar.a).intValue();
                int intValue2 = ((Number) ojcVar.b).intValue();
                this.e = intValue <= Integer.MIN_VALUE ? olw.d : new olw(this.c, intValue - 1);
                int i3 = intValue + intValue2;
                this.c = i3;
                if (intValue2 == 0) {
                    i2 = 1;
                }
                this.d = i3 + i2;
            } else {
                this.e = new olw(this.c, ols.h(this.a.a));
                this.d = -1;
            }
        }
        this.b = 1;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b != 0) {
            olw olwVar = this.e;
            oll.c(olwVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.e = null;
            this.b = -1;
            return olwVar;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
