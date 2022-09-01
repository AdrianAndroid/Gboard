package defpackage;

/* compiled from: PG */
/* renamed from: doo  reason: default package */
/* loaded from: classes.dex */
public final class doo {
    private static final lfy b = lfy.c(',');
    public final llw a;

    public doo() {
        lls h = llw.h();
        for (String str : b.i((String) doa.cZ.c())) {
            int indexOf = str.indexOf(":");
            if (indexOf > 0 && indexOf < str.length() - 1) {
                h.a(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        this.a = h.l();
    }
}
