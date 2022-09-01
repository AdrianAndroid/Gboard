package defpackage;

import android.os.Build;
import java.text.BreakIterator;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hdz  reason: default package */
/* loaded from: classes.dex */
public final class hdz {
    static final llp a = llp.C();
    private static volatile hdz b;
    private final lgb c;
    private final lgb d = new hdv();

    private hdz(lgb lgbVar) {
        this.c = lgbVar;
        hdn.instance.i(new hdw());
    }

    public static hdz a() {
        hdz hdzVar = b;
        if (hdzVar == null) {
            synchronized (hdz.class) {
                hdzVar = b;
                if (hdzVar == null) {
                    hdzVar = new hdz(new hdy());
                    b = hdzVar;
                }
            }
        }
        return hdzVar;
    }

    public final llp b(llp llpVar, hdl hdlVar) {
        llk e = llp.e();
        int size = llpVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) llpVar.get(i);
            if (g(str, hdlVar)) {
                e.h(str);
            }
        }
        return e.g();
    }

    public final String c(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            String replace = str.replace("️", "");
            if (d(replace)) {
                return replace;
            }
        } else if (d(str)) {
            return str;
        } else {
            if (a.contains(str)) {
                String replace2 = str.replace("️", "");
                if (d(replace2)) {
                    return replace2;
                }
            }
        }
        return null;
    }

    public final boolean d(String str) {
        int length = str.length();
        ArrayList<String> arrayList = null;
        if (length != 1 && ((length != 2 || str.codePointCount(0, str.length()) != 1) && !hdq.b().a().contains(str))) {
            ArrayList arrayList2 = new ArrayList(str.length());
            BreakIterator a2 = ((hdv) this.d).a();
            a2.setText(str);
            int first = a2.first();
            int next = a2.next();
            while (true) {
                int i = next;
                int i2 = first;
                first = i;
                if (first == -1 || first > str.length()) {
                    break;
                }
                arrayList2.add(str.substring(i2, first));
                next = a2.next();
            }
            if (arrayList2.size() != 1) {
                arrayList = arrayList2;
            }
        }
        if (arrayList == null) {
            return e(str);
        }
        for (String str2 : arrayList) {
            if (!e(str2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean e(String str) {
        return ((hdy) this.c).a().a(str);
    }

    public final boolean f(String str, hdl hdlVar) {
        adr adrVar;
        if (!hdlVar.b()) {
            return e(str);
        }
        hdt a2 = ((hdy) this.c).a();
        adq b2 = hdn.instance.b();
        if (b2 == null) {
            return a2.a(str);
        }
        int a3 = hdlVar.a();
        nq.d(b2.e(), "Not initialized yet");
        nq.h(str, "sequence cannot be null");
        cmt cmtVar = new cmt((adx) ((bhc) ((adl) b2.g).b.a).b);
        int length = str.length();
        int i = 0;
        while (true) {
            adrVar = null;
            if (i < length) {
                int codePointAt = Character.codePointAt(str, i);
                if (cmtVar.f(codePointAt) != 2) {
                    break;
                }
                i += Character.charCount(codePointAt);
            } else if (cmtVar.i()) {
                adrVar = cmtVar.g();
            }
        }
        if (adrVar != null) {
            ajj e = adrVar.e();
            int a4 = e.a(10);
            if ((a4 != 0 ? e.b.getShort(a4 + e.a) : (short) 0) <= a3) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(String str, hdl hdlVar) {
        if (hdlVar.b()) {
            return f(str, hdlVar);
        }
        String c = c(str);
        if (c != null) {
            return e(c);
        }
        return false;
    }
}
