package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.k0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0040k0 extends C0037j0 implements G {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C0040k0(long j) {
        super(j);
    }

    @Override // j$.util.stream.X0
    public final void accept(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 < iArr.length) {
            this.b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        d((Integer) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.stream.G, j$.util.stream.I
    /* renamed from: build */
    public final K mo62build() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.G, j$.util.stream.I
    /* renamed from: build  reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ N mo62build() {
        mo62build();
        return this;
    }

    @Override // j$.util.stream.X0
    public final void c(long j) {
        int[] iArr = this.a;
        if (j == iArr.length) {
            this.b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.W0
    public final /* synthetic */ void d(Integer num) {
        E.d(this, num);
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final void j() {
        int i = this.b;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.b), Integer.valueOf(iArr.length)));
    }

    @Override // j$.util.stream.C0037j0
    public final String toString() {
        int[] iArr = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }
}
