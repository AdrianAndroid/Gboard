package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jut  reason: default package */
/* loaded from: classes.dex */
public final class jut {
    public static final lfy a = lfy.c(',').h().b();
    public static final lfy b = lfy.c('#').h();

    public static String a(Collection collection) {
        StringBuilder sb = new StringBuilder("1#");
        Iterator it = collection.iterator();
        boolean z = true;
        while (it.hasNext()) {
            jss jssVar = (jss) it.next();
            if (!z) {
                sb.append(',');
            }
            sb.append(jss.d(jssVar));
            z = false;
        }
        return sb.toString();
    }
}
