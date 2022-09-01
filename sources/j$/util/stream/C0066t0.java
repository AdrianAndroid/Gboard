package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0066t0 extends AbstractC0063s0 implements H {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0066t0(long j) {
        super(j);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.i
    public final void accept(long j) {
        int i = this.b;
        long[] jArr = this.a;
        if (i < jArr.length) {
            this.b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.H, j$.util.stream.I
    /* renamed from: build */
    public final L mo62build() {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.H, j$.util.stream.I
    /* renamed from: build  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo62build() {
        mo62build();
        return this;
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        long[] jArr = this.a;
        if (j == jArr.length) {
            this.b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final void j() {
        int i = this.b;
        long[] jArr = this.a;
        if (i >= jArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(jArr.length)));
    }

    @Override // j$.util.function.Consumer
    /* renamed from: o */
    public final void accept(Long l) {
        if (!S1.a) {
            accept(l.longValue());
        } else {
            S1.a(C0066t0.class, "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    public final String toString() {
        long[] jArr = this.a;
        return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }
}
