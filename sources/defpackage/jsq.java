package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jsq  reason: default package */
/* loaded from: classes.dex */
public final class jsq {
    public static final jsq a = g().b();
    public final llw b;

    public jsq() {
    }

    public jsq(llw llwVar) {
        this.b = llwVar;
    }

    public static jyu g() {
        return new jyu();
    }

    private static void h(String str, String str2, ClassCastException classCastException) {
        ((luc) ((luc) ((luc) jsh.a.d()).i(classCastException)).k("com/google/android/libraries/micore/superpacks/base/PropertyBag", "logTypeWarning", 127, "PropertyBag.java")).G("Failed to find a property for name %s with type %s, returning default value", str, str2);
    }

    public final Object a(String str) {
        return this.b.get(str);
    }

    public final String b(String str, String str2) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return str2;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            h(str, "String", e);
            return str2;
        }
    }

    public final List c(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return Collections.emptyList();
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            h(str, "List", e);
            return Collections.emptyList();
        }
    }

    public final Set d() {
        return this.b.keySet();
    }

    public final boolean e(String str, boolean z) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            h(str, "Boolean", e);
            return z;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jsq)) {
            return false;
        }
        return lre.z(this.b, ((jsq) obj).b);
    }

    public final int f(String str) {
        Object obj = this.b.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            h(str, "Integer", e);
            return 0;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return "PropertyBag{map=" + valueOf + "}";
    }
}
