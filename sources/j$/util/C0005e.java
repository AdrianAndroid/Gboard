package j$.util;

import j$.util.function.Function;
import java.io.Serializable;

/* renamed from: j$.util.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0005e implements java.util.Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.util.Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0005e(java.util.Comparator comparator, Object obj, int i) {
        this.a = i;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        java.util.Comparator comparator = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                java.util.Comparator comparator2 = (java.util.Comparator) obj3;
                int compare = comparator.compare(obj, obj2);
                if (compare == 0) {
                    return comparator2.compare(obj, obj2);
                }
                return compare;
            default:
                Function function = (Function) obj3;
                return comparator.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
