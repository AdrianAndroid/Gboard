package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: aoz  reason: default package */
/* loaded from: classes.dex */
public final class aoz {
    public static final aoz a = new aoz("COMPOSITION");
    public apa b;
    private final List c;

    private aoz(aoz aozVar) {
        this.c = new ArrayList(aozVar.c);
        this.b = aozVar.b;
    }

    private final boolean g() {
        List list = this.c;
        return ((String) list.get(list.size() - 1)).equals("**");
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i) {
        if (h(str)) {
            return 0;
        }
        if (!((String) this.c.get(i)).equals("**")) {
            return 1;
        }
        return (i != this.c.size() + (-1) && ((String) this.c.get(i + 1)).equals(str)) ? 2 : 0;
    }

    public final aoz b(String str) {
        aoz aozVar = new aoz(this);
        aozVar.c.add(str);
        return aozVar;
    }

    public final aoz c(apa apaVar) {
        aoz aozVar = new aoz(this);
        aozVar.b = apaVar;
        return aozVar;
    }

    public final boolean d(String str, int i) {
        if (i >= this.c.size()) {
            return false;
        }
        int size = this.c.size() - 1;
        String str2 = (String) this.c.get(i);
        if (!str2.equals("**")) {
            return (i == size || (i == this.c.size() + (-2) && g())) && (str2.equals(str) || str2.equals("*"));
        } else if (i == size) {
            return true;
        } else {
            int i2 = i + 1;
            if (((String) this.c.get(i2)).equals(str)) {
                return i == this.c.size() + (-2) || (i == this.c.size() + (-3) && g());
            } else if (i2 >= this.c.size() - 1) {
                return ((String) this.c.get(i2)).equals(str);
            } else {
                return false;
            }
        }
    }

    public final boolean e(String str, int i) {
        if (h(str)) {
            return true;
        }
        if (i >= this.c.size()) {
            return false;
        }
        return ((String) this.c.get(i)).equals(str) || ((String) this.c.get(i)).equals("**") || ((String) this.c.get(i)).equals("*");
    }

    public final boolean f(String str, int i) {
        return "__container".equals(str) || i < this.c.size() + (-1) || ((String) this.c.get(i)).equals("**");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        boolean z = this.b != null;
        return "KeyPath{keys=" + valueOf + ",resolved=" + z + "}";
    }

    public aoz(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
