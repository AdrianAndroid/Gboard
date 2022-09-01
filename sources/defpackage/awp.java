package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: awp  reason: default package */
/* loaded from: classes.dex */
public final class awp {
    public final bcv a;
    public final xx b;
    private final Class c;
    private final List d;
    private final String e;

    public awp(Class cls, Class cls2, Class cls3, List list, bcv bcvVar, xx xxVar) {
        this.c = cls;
        this.d = list;
        this.a = bcvVar;
        this.b = xxVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        this.e = "Failed DecodePath{" + simpleName + "->" + simpleName2 + "->" + simpleName3 + "}";
    }

    public final axh a(avl avlVar, int i, int i2, ava avaVar, List list) {
        int size = this.d.size();
        axh axhVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            avc avcVar = (avc) this.d.get(i3);
            try {
                if (avcVar.b(avlVar.a(), avaVar)) {
                    axhVar = avcVar.a(avlVar.a(), i, i2, avaVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (axhVar != null) {
                break;
            }
        }
        if (axhVar != null) {
            return axhVar;
        }
        throw new axd(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        return "DecodePath{ dataClass=" + valueOf + ", decoders=" + valueOf2 + ", transcoder=" + valueOf3 + "}";
    }
}
