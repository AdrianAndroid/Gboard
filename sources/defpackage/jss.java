package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jss  reason: default package */
/* loaded from: classes.dex */
public abstract class jss {
    public static final lfy a = lfy.c(';').h().b();

    public static jss c(jsr jsrVar, int i) {
        return new jri(jsrVar, i);
    }

    public static String d(jss jssVar) {
        String jsrVar = jssVar.b().toString();
        int a2 = jssVar.a();
        return jsrVar + ";" + a2;
    }

    public static Set e(Collection collection) {
        if (collection.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        lta listIterator = ((llp) collection).listIterator();
        while (listIterator.hasNext()) {
            hashSet.add(((jss) listIterator.next()).b());
        }
        return hashSet;
    }

    public abstract int a();

    public abstract jsr b();

    public String toString() {
        lfa T = jdg.T("");
        T.b("name", b());
        T.f("version", a());
        return T.toString();
    }
}
