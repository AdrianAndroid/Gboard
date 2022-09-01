package defpackage;

import j$.util.Objects;
import j$.util.function.BiConsumer;
import j$.util.function.Function;
import j$.util.stream.Collector;

/* compiled from: PG */
/* renamed from: ljr  reason: default package */
/* loaded from: classes.dex */
public final class ljr {
    public static final Collector a = Collector.CC.of(cag.j, dxc.c, ljp.a, eoe.n, new Collector.Characteristics[0]);

    static {
        Collector.CC.of(cag.k, dxc.d, ljp.c, eoe.o, new Collector.Characteristics[0]);
        Collector.CC.of(cag.l, dxc.e, ljp.b, eoe.m, new Collector.Characteristics[0]);
    }

    public static Collector a(final Function function, final Function function2) {
        jdg.u(function);
        jdg.u(function2);
        return Collector.CC.of(cag.m, new BiConsumer() { // from class: ljq
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function function3 = Function.this;
                Function function4 = function2;
                Collector collector = ljr.a;
                ((lls) obj).a(function3.apply(obj2), function4.apply(obj2));
            }

            @Override // j$.util.function.BiConsumer
            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return Objects.requireNonNull(biConsumer);
            }
        }, ljp.d, eoe.p, new Collector.Characteristics[0]);
    }
}
