package defpackage;

/* compiled from: PG */
/* renamed from: hdl  reason: default package */
/* loaded from: classes.dex */
public final class hdl {
    public static final hdl a = new hdl();
    public static final hdl b = new hdl(Integer.MAX_VALUE, true);
    public final boolean c;
    private final Integer d;

    private hdl() {
        this.d = null;
        this.c = false;
    }

    public hdl(int i, boolean z) {
        if (i == 0) {
            this.d = null;
            this.c = false;
            return;
        }
        this.d = Integer.valueOf(i);
        this.c = z;
    }

    public final int a() {
        Integer num = this.d;
        if (num == null) {
            ((luc) hdn.a.a(hip.a).k("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager$CompatMetaData", "getMetaVersion", 139, "EmojiCompatManager.java")).t("meta version is not set but getMetaVersion() is called.");
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    public final boolean b() {
        return this.d != null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            hdl hdlVar = (hdl) obj;
            return jdg.W(this.d, hdlVar.d) && this.c == hdlVar.c;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.d;
        int i = Integer.MIN_VALUE;
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        int intValue = num.intValue();
        if (true != this.c) {
            i = 0;
        }
        return intValue ^ i;
    }

    public final String toString() {
        if (equals(a)) {
            return "Disabled";
        }
        lfa S = jdg.S(this);
        S.b("metaVersion", this.d);
        S.h("replaceAll", this.c);
        return S.toString();
    }
}
