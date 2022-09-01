package defpackage;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lrf  reason: default package */
/* loaded from: classes.dex */
public final class lrf implements leq {
    static final lrf a = new lrf(0);
    private final /* synthetic */ int b;

    public lrf(int i) {
        this.b = i;
    }

    @Override // defpackage.leq
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return ((aqq) obj).a;
            }
            return Boolean.valueOf(Arrays.asList(((Constructor) obj).getParameterTypes()).contains(String.class));
        }
        return ((lrh) obj).b;
    }
}
