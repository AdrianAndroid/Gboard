package j$.util.stream;

import j$.util.Objects;
import j$.util.function.BooleanSupplier;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.List;

/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0009a implements Supplier, j$.util.function.j, BooleanSupplier, Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0009a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        ((List) this.b).add(obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Objects.requireNonNull(consumer);
    }

    @Override // j$.util.function.j
    public final Object apply(long j) {
        int i = T.k;
        return E.w(j, (IntFunction) this.b);
    }

    @Override // j$.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (j$.util.r) obj;
            default:
                return ((AbstractC0015c) obj).U();
        }
    }

    @Override // j$.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 3:
                v1 v1Var = (v1) obj;
                return v1Var.d.f(v1Var.e);
            default:
                J1 j1 = (J1) obj;
                return j1.d.f(j1.e);
        }
    }
}
