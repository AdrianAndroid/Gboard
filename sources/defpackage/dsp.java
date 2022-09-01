package defpackage;

import android.util.Pair;
import android.view.textservice.TextInfo;
import j$.util.Objects;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dsp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dsp implements Predicate {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dsp(TextInfo textInfo, String str, int i) {
        this.c = i;
        this.a = textInfo;
        this.b = str;
    }

    public /* synthetic */ dsp(Set set, Function function, int i) {
        this.c = i;
        this.b = set;
        this.a = function;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.util.function.Function, java.lang.Object] */
    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        if (this.c == 0) {
            Object obj2 = this.a;
            Object obj3 = this.b;
            Map.Entry entry = (Map.Entry) obj;
            LinkedHashMap linkedHashMap = dss.a;
            int intValue = ((Integer) ((Pair) entry.getKey()).first).intValue();
            int intValue2 = ((Integer) ((Pair) entry.getKey()).second).intValue();
            String str = (String) entry.getValue();
            boolean z = false;
            if (intValue == ((TextInfo) obj2).getCookie() && intValue2 >= 0) {
                String str2 = (String) obj3;
                if (str.length() + intValue2 <= str2.length() && str2.substring(intValue2, str.length() + intValue2).equals(str)) {
                    String d = dss.d(str2, str, intValue2, str.length() + intValue2);
                    z = true;
                    if (d != null) {
                        synchronized (dss.class) {
                            dss.a.put(d, true);
                        }
                    }
                }
            }
            return z;
        }
        return this.b.add(this.a.apply(obj));
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return this.c != 0 ? Objects.requireNonNull(predicate) : Objects.requireNonNull(predicate);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        return this.c != 0 ? Predicate.CC.$default$negate(this) : Predicate.CC.$default$negate(this);
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        return this.c != 0 ? Objects.requireNonNull(predicate) : Objects.requireNonNull(predicate);
    }
}
