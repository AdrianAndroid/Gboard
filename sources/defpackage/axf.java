package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: axf  reason: default package */
/* loaded from: classes.dex */
public final class axf {
    public final xx a;
    public final List b;
    public final String c;

    public axf(Class cls, Class cls2, Class cls3, List list, xx xxVar) {
        this.a = xxVar;
        ce.p(list);
        this.b = list;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        this.c = "Failed LoadPath{" + simpleName + "->" + simpleName2 + "->" + simpleName3 + "}";
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b.toArray());
        return "LoadPath{decodePaths=" + arrays + "}";
    }
}
