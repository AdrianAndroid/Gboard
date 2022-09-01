package defpackage;

import j$.util.Objects;
import j$.util.function.Function;
import j$.util.function.UnaryOperator;

/* compiled from: PG */
/* renamed from: hrk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hrk implements UnaryOperator {
    public static final /* synthetic */ hrk a = new hrk();

    private /* synthetic */ hrk() {
    }

    @Override // j$.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo40andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        mld mldVar = (mld) obj;
        ltg ltgVar = hrx.a;
        return mldVar != null ? mldVar : mld.e();
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
