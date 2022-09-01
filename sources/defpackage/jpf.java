package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jpf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jpf implements Comparator {
    private final /* synthetic */ int j;
    public static final /* synthetic */ jpf i = new jpf(10);
    public static final /* synthetic */ jpf h = new jpf(7);
    public static final /* synthetic */ jpf g = new jpf(6);
    public static final /* synthetic */ jpf f = new jpf(5);
    public static final /* synthetic */ jpf e = new jpf(4);
    public static final /* synthetic */ jpf d = new jpf(3);
    public static final /* synthetic */ jpf c = new jpf(2);
    public static final /* synthetic */ jpf b = new jpf(1);
    public static final /* synthetic */ jpf a = new jpf(0);

    public /* synthetic */ jpf(int i2) {
        this.j = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                int i2 = jph.c;
                return -(((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
            case 1:
                return jez.u((jit) obj).compareTo(jez.u((jit) obj2));
            case 2:
                int i3 = jph.c;
                return mhq.c(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 3:
                return ((juc) obj).o().compareTo(((juc) obj2).o());
            case 4:
                return ((juc) obj).o().compareTo(((juc) obj2).o());
            case 5:
                int i4 = jvr.o;
                return ((jvw) obj).e().compareTo(((jvw) obj2).e());
            case 6:
                jvw jvwVar = (jvw) obj;
                jvw jvwVar2 = (jvw) obj2;
                int i5 = jvr.o;
                long b2 = jvwVar.b();
                long b3 = jvwVar2.b();
                int i6 = (b2 > b3 ? 1 : (b2 == b3 ? 0 : -1));
                if (b2 != b3) {
                    return i6;
                }
                long f2 = jvwVar.f();
                long f3 = jvwVar2.f();
                return f2 == f3 ? (jvwVar.c() > jvwVar2.c() ? 1 : (jvwVar.c() == jvwVar2.c() ? 0 : -1)) : (f2 > f3 ? 1 : (f2 == f3 ? 0 : -1));
            case 7:
                kij kijVar = (kij) obj;
                kij kijVar2 = (kij) obj2;
                kijVar.a();
                kijVar.a();
                kijVar2.a();
                kijVar2.a();
                return 0;
            case 8:
                lws a2 = lws.a(obj);
                lws a3 = lws.a(obj2);
                if (a2 == a3) {
                    int ordinal = a2.ordinal();
                    if (ordinal == 0) {
                        return ((Boolean) obj).compareTo((Boolean) obj2);
                    }
                    if (ordinal == 1) {
                        return ((String) obj).compareTo((String) obj2);
                    }
                    if (ordinal == 2) {
                        return ((Long) obj).compareTo((Long) obj2);
                    }
                    if (ordinal == 3) {
                        return ((Double) obj).compareTo((Double) obj2);
                    }
                    throw null;
                }
                return a2.compareTo(a3);
            case 9:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                int i7 = oul.e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 != null) {
                    return str.compareToIgnoreCase(str2);
                }
                return 1;
        }
    }
}
