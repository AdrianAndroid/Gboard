package j$.util;

import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.io.Serializable;

/* renamed from: j$.util.d  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0004d implements java.util.Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0004d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ToDoubleFunction toDoubleFunction = (ToDoubleFunction) obj3;
                return Double.compare(toDoubleFunction.a(), toDoubleFunction.a());
            case 1:
                ToIntFunction toIntFunction = (ToIntFunction) obj3;
                int applyAsInt = toIntFunction.applyAsInt(obj);
                int applyAsInt2 = toIntFunction.applyAsInt(obj2);
                if (applyAsInt == applyAsInt2) {
                    return 0;
                }
                if (applyAsInt < applyAsInt2) {
                    return -1;
                }
                return 1;
            case 2:
                ToLongFunction toLongFunction = (ToLongFunction) obj3;
                return (toLongFunction.a() > toLongFunction.a() ? 1 : (toLongFunction.a() == toLongFunction.a() ? 0 : -1));
            default:
                Function function = (Function) obj3;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
        }
    }
}
