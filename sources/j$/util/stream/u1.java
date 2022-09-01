package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements W0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j$.util.function.g b;

    public /* synthetic */ u1(j$.util.function.g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // j$.util.stream.W0, j$.util.stream.X0
    public final void accept(int i) {
        int i2 = this.a;
        j$.util.function.g gVar = this.b;
        switch (i2) {
            case 0:
                ((C0029g1) gVar).accept(i);
                return;
            default:
                gVar.accept(i);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                return Objects.requireNonNull(consumer);
            default:
                return Objects.requireNonNull(consumer);
        }
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void c(long j) {
    }

    @Override // j$.util.stream.W0
    public final /* synthetic */ void d(Integer num) {
        switch (this.a) {
            case 0:
                E.d(this, num);
                return;
            default:
                E.d(this, num);
                return;
        }
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.X0
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                d((Integer) obj);
                return;
            default:
                d((Integer) obj);
                return;
        }
    }
}
