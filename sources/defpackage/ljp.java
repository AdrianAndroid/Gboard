package defpackage;

import j$.util.Objects;
import j$.util.function.BiFunction;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;

/* compiled from: PG */
/* renamed from: ljp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ljp implements BinaryOperator {
    private final /* synthetic */ int e;
    public static final /* synthetic */ ljp d = new ljp(3);
    public static final /* synthetic */ ljp c = new ljp(2);
    public static final /* synthetic */ ljp b = new ljp(1);
    public static final /* synthetic */ ljp a = new ljp(0);

    private /* synthetic */ ljp(int i) {
        this.e = i;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            llk llkVar = (llk) obj;
            llk llkVar2 = (llk) obj2;
            llkVar.b(llkVar2.a, llkVar2.b);
            return llkVar;
        } else if (i == 1) {
            kcl kclVar = (kcl) obj;
            for (lrh lrhVar : ((kcl) obj2).a) {
                kclVar.f(lrhVar);
            }
            return kclVar;
        } else if (i == 2) {
            lmx lmxVar = (lmx) obj;
            lmxVar.k((lmx) obj2);
            return lmxVar;
        } else {
            lls llsVar = (lls) obj;
            llsVar.h((lls) obj2);
            return llsVar;
        }
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                return Objects.requireNonNull(function);
            }
            return i != 2 ? Objects.requireNonNull(function) : Objects.requireNonNull(function);
        }
        return Objects.requireNonNull(function);
    }
}
