package defpackage;

import j$.util.Objects;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function;
import j$.util.function.UnaryOperator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hic  reason: default package */
/* loaded from: classes.dex */
public final class hic implements hhl {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/flag/ProtoBytesFlag");
    public final hhr b;
    public final ngz c;
    private final AtomicReference d;
    private final hib e;

    public hic(hhr hhrVar, ngz ngzVar) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.d = atomicReference;
        hib hibVar = new hib(atomicReference);
        this.e = hibVar;
        this.b = hhrVar;
        this.c = ngzVar;
        hhrVar.f(hibVar, mjl.a);
    }

    @Override // defpackage.hhl
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    @Override // defpackage.hhl
    public final /* bridge */ /* synthetic */ Object b(hie hieVar) {
        return (byte[]) this.b.c();
    }

    @Override // defpackage.hhl
    public final /* bridge */ /* synthetic */ Object c() {
        return (byte[]) this.b.c();
    }

    @Override // defpackage.hhl
    public final String d() {
        return this.b.a;
    }

    @Override // defpackage.hhl
    public final void e(hhk hhkVar) {
        this.b.e(hhkVar);
    }

    @Override // defpackage.hhl
    public final void f(hhk hhkVar, Executor executor) {
        this.b.f(hhkVar, executor);
    }

    @Override // defpackage.hhl
    public final void g(hhk hhkVar) {
        this.b.g(hhkVar);
    }

    @Override // defpackage.hhl
    public final void h() {
        throw null;
    }

    @Override // defpackage.hhl
    public final void i() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ngz, java.lang.Object] */
    public final ngz j() {
        return ((ijk) DesugarAtomicReference.updateAndGet(this.d, new UnaryOperator() { // from class: hia
            @Override // j$.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo40andThen(Function function) {
                return Objects.requireNonNull(function);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v6, types: [ngz, java.lang.Object] */
            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                hic hicVar = hic.this;
                ijk ijkVar = (ijk) obj;
                byte[] bArr = (byte[]) hicVar.b.c();
                if (ijkVar == null || ijkVar.a != bArr) {
                    String str = hicVar.b.a;
                    ngz ngzVar = hicVar.c;
                    try {
                        return new ijk(bArr, (ngz) ngzVar.I().d(bArr));
                    } catch (ngd e) {
                        ((ltd) ((ltd) ((ltd) hic.a.c()).i(e)).k("com/google/android/libraries/inputmethod/flag/ProtoBytesFlag", "parse", 163, "ProtoBytesFlag.java")).w("Failed to parse proto from byte flag [%s]", str);
                        return new ijk(bArr, ngzVar);
                    }
                }
                return ijkVar;
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Objects.requireNonNull(function);
            }
        })).b;
    }

    public final String toString() {
        return this.b.toString();
    }
}
