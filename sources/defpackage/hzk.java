package defpackage;

import j$.util.Objects;
import j$.util.function.BiFunction;
import j$.util.function.Function;

/* compiled from: PG */
/* renamed from: hzk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hzk implements BiFunction {
    private final /* synthetic */ int c;
    public static final /* synthetic */ hzk b = new hzk(1);
    public static final /* synthetic */ hzk a = new hzk(0);

    private /* synthetic */ hzk(int i) {
        this.c = i;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return this.c != 0 ? Objects.requireNonNull(function) : Objects.requireNonNull(function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        if (this.c != 0) {
            juc jucVar = (juc) obj;
            return jucVar.n().b("tpu_revisions", null) == null ? (juc) obj2 : jucVar;
        }
        String str = (String) obj;
        Integer num = (Integer) obj2;
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        return Integer.valueOf(i);
    }
}
