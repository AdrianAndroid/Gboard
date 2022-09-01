package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0013b0 extends AbstractC0010a0 implements F {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0013b0(long j) {
        super(j);
    }

    @Override // j$.util.function.c
    public final void accept(double d) {
        int i = this.b;
        double[] dArr = this.a;
        if (i < dArr.length) {
            this.b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void accept(int i) {
        E.c();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.F, j$.util.stream.I
    /* renamed from: build */
    public final J mo62build() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.F, j$.util.stream.I
    /* renamed from: build  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo62build() {
        mo62build();
        return this;
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        double[] dArr = this.a;
        if (j == dArr.length) {
            this.b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final void j() {
        int i = this.b;
        double[] dArr = this.a;
        if (i >= dArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.function.Consumer
    /* renamed from: o */
    public final void accept(Double d) {
        if (!S1.a) {
            accept(d.doubleValue());
        } else {
            S1.a(C0013b0.class, "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    public final String toString() {
        double[] dArr = this.a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }
}
