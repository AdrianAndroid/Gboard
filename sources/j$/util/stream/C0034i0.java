package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.i0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0034i0 extends Q implements I {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0034i0(long j, IntFunction intFunction) {
        super(j, intFunction);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            this.b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.I
    /* renamed from: build */
    public final N mo62build() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        Object[] objArr = this.a;
        if (j == objArr.length) {
            this.b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final void j() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.Q
    public final String toString() {
        Object[] objArr = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }
}
